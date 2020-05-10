package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComponentConfigurationRecommendationResponse extends js.Object {
  /**
    * The recommended configuration settings of the component. The value is the escaped JSON of the configuration.
    */
  var ComponentConfiguration: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ComponentConfiguration] = js.native
}

object DescribeComponentConfigurationRecommendationResponse {
  @scala.inline
  def apply(): DescribeComponentConfigurationRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentConfigurationRecommendationResponse]
  }
  @scala.inline
  implicit class DescribeComponentConfigurationRecommendationResponseOps[Self <: DescribeComponentConfigurationRecommendationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentConfiguration(value: ComponentConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComponentConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComponentConfiguration")(js.undefined)
        ret
    }
  }
  
}

