package typingsSlinky.pulumiAws.inputMod.ses

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleAddHeaderAction extends js.Object {
  /**
    * The name of the header to add
    */
  var headerName: Input[String] = js.native
  /**
    * The value of the header to add
    */
  var headerValue: Input[String] = js.native
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double] = js.native
}

object ReceiptRuleAddHeaderAction {
  @scala.inline
  def apply(headerName: Input[String], headerValue: Input[String], position: Input[Double]): ReceiptRuleAddHeaderAction = {
    val __obj = js.Dynamic.literal(headerName = headerName.asInstanceOf[js.Any], headerValue = headerValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleAddHeaderAction]
  }
  @scala.inline
  implicit class ReceiptRuleAddHeaderActionOps[Self <: ReceiptRuleAddHeaderAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

