package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SanitizationWarning extends js.Object {
  /**
    * The name of the XML attribute that has been sanitized.
    */
  var AttributeName: js.UndefOr[string] = js.native
  /**
    * The name of the XML element that has been sanitized.
    */
  var ElementName: js.UndefOr[string] = js.native
  /**
    * Required. The reason for which the XML elements or attributes were sanitized.
    */
  var Reason: js.UndefOr[SanitizationWarningReason] = js.native
}

object SanitizationWarning {
  @scala.inline
  def apply(): SanitizationWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SanitizationWarning]
  }
  @scala.inline
  implicit class SanitizationWarningOps[Self <: SanitizationWarning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withElementName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElementName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElementName")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: SanitizationWarningReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(js.undefined)
        ret
    }
  }
  
}

