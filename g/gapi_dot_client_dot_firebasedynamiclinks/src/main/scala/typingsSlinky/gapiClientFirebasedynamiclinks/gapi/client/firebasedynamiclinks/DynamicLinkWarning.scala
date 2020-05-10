package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicLinkWarning extends js.Object {
  /** The warning code. */
  var warningCode: js.UndefOr[String] = js.native
  /** The document describing the warning, and helps resolve. */
  var warningDocumentLink: js.UndefOr[String] = js.native
  /** The warning message to help developers improve their requests. */
  var warningMessage: js.UndefOr[String] = js.native
}

object DynamicLinkWarning {
  @scala.inline
  def apply(): DynamicLinkWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicLinkWarning]
  }
  @scala.inline
  implicit class DynamicLinkWarningOps[Self <: DynamicLinkWarning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWarningCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningCode")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningDocumentLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningDocumentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningDocumentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningDocumentLink")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningMessage")(js.undefined)
        ret
    }
  }
  
}

