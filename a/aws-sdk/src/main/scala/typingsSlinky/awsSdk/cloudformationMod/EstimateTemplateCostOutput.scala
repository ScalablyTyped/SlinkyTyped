package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EstimateTemplateCostOutput extends js.Object {
  /**
    * An AWS Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
    */
  var Url: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Url] = js.native
}

object EstimateTemplateCostOutput {
  @scala.inline
  def apply(): EstimateTemplateCostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimateTemplateCostOutput]
  }
  @scala.inline
  implicit class EstimateTemplateCostOutputOps[Self <: EstimateTemplateCostOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}

