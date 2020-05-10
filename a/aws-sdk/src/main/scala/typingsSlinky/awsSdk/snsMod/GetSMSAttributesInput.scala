package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSMSAttributesInput extends js.Object {
  /**
    * A list of the individual attribute names, such as MonthlySpendLimit, for which you want values. For all attribute names, see SetSMSAttributes. If you don't use this parameter, Amazon SNS returns all SMS attributes.
    */
  var attributes: js.UndefOr[ListString] = js.native
}

object GetSMSAttributesInput {
  @scala.inline
  def apply(): GetSMSAttributesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSMSAttributesInput]
  }
  @scala.inline
  implicit class GetSMSAttributesInputOps[Self <: GetSMSAttributesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: ListString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
  }
  
}

