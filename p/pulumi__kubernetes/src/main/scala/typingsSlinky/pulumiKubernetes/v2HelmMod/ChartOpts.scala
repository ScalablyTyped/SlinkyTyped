package typingsSlinky.pulumiKubernetes.v2HelmMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartOpts extends BaseChartOpts {
  /**
    * The name of the chart to deploy.  If [repo] is provided, this chart name will be prefixed by the repo name.
    * Example: repo: "stable", chart: "nginx-ingress" -> "stable/nginx-ingress"
    * Example: chart: "stable/nginx-ingress" -> "stable/nginx-ingress"
    */
  var chart: Input[String] = js.native
  /**
    * Additional options to customize the fetching of the Helm chart.
    */
  var fetchOpts: js.UndefOr[Input[FetchOpts]] = js.native
  /**
    * The repository name of the chart to deploy.
    * Example: "stable"
    */
  var repo: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the chart to deploy. If not provided, the latest version will be deployed.
    */
  var version: js.UndefOr[Input[String]] = js.native
}

object ChartOpts {
  @scala.inline
  def apply(chart: Input[String]): ChartOpts = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOpts]
  }
  @scala.inline
  implicit class ChartOptsOps[Self <: ChartOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchOpts(value: Input[FetchOpts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withRepo(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

