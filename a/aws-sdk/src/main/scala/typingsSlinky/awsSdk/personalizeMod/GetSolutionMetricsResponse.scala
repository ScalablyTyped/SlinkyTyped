package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSolutionMetricsResponse extends js.Object {
  /**
    * The metrics for the solution version.
    */
  var metrics: js.UndefOr[Metrics] = js.native
  /**
    * The same solution version ARN as specified in the request.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
}

object GetSolutionMetricsResponse {
  @scala.inline
  def apply(): GetSolutionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolutionMetricsResponse]
  }
  @scala.inline
  implicit class GetSolutionMetricsResponseOps[Self <: GetSolutionMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetrics(value: Metrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionVersionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(js.undefined)
        ret
    }
  }
  
}

