package typingsSlinky.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleAddHeaderAction extends js.Object {
  /**
    * The name of the header to add
    */
  var headerName: String = js.native
  /**
    * The value of the header to add
    */
  var headerValue: String = js.native
  /**
    * The position of the action in the receipt rule
    */
  var position: Double = js.native
}

object ReceiptRuleAddHeaderAction {
  @scala.inline
  def apply(headerName: String, headerValue: String, position: Double): ReceiptRuleAddHeaderAction = {
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
    def withHeaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

