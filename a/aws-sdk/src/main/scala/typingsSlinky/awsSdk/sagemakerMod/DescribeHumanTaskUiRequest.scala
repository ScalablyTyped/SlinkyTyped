package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHumanTaskUiRequest extends js.Object {
  /**
    * The name of the human task user interface you want information about.
    */
  var HumanTaskUiName: typingsSlinky.awsSdk.sagemakerMod.HumanTaskUiName = js.native
}

object DescribeHumanTaskUiRequest {
  @scala.inline
  def apply(HumanTaskUiName: HumanTaskUiName): DescribeHumanTaskUiRequest = {
    val __obj = js.Dynamic.literal(HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanTaskUiRequest]
  }
  @scala.inline
  implicit class DescribeHumanTaskUiRequestOps[Self <: DescribeHumanTaskUiRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanTaskUiName(value: HumanTaskUiName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanTaskUiName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

