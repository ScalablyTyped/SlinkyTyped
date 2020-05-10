package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLConfig extends js.Object {
  /**
    * The metric to optimize.
    */
  var metricName: js.UndefOr[MetricName] = js.native
  /**
    * The list of candidate recipes.
    */
  var recipeList: js.UndefOr[ArnList] = js.native
}

object AutoMLConfig {
  @scala.inline
  def apply(): AutoMLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLConfig]
  }
  @scala.inline
  implicit class AutoMLConfigOps[Self <: AutoMLConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipeList(value: ArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipeList")(js.undefined)
        ret
    }
  }
  
}

