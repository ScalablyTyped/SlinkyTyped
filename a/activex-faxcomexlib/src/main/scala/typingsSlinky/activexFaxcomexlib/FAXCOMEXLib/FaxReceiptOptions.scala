package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxReceiptOptions Class */
@js.native
trait FaxReceiptOptions extends js.Object {
  /** Allowed receipt types, a bit-wise combination of FAX_RECEIPT_TYPE values */
  var AllowedReceipts: FAX_RECEIPT_TYPE_ENUM = js.native
  /** Authentication type used by server */
  var AuthenticationType: FAX_SMTP_AUTHENTICATION_TYPE_ENUM = js.native
  @JSName("FAXCOMEXLib.FaxReceiptOptions_typekey")
  var FAXCOMEXLibDotFaxReceiptOptions_typekey: FaxReceiptOptions = js.native
  /** SMTP password */
  var SMTPPassword: String = js.native
  /** SMTP port number */
  var SMTPPort: Double = js.native
  /** SMTP sender e-mail address */
  var SMTPSender: String = js.native
  /** Name of the SMTP server */
  var SMTPServer: String = js.native
  /** SMTP user name */
  var SMTPUser: String = js.native
  /** Whether to use the IFaxReceiptOptions settings for MS routing extension */
  var UseForInboundRouting: Boolean = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

object FaxReceiptOptions {
  @scala.inline
  def apply(
    AllowedReceipts: FAX_RECEIPT_TYPE_ENUM,
    AuthenticationType: FAX_SMTP_AUTHENTICATION_TYPE_ENUM,
    FAXCOMEXLibDotFaxReceiptOptions_typekey: FaxReceiptOptions,
    Refresh: () => Unit,
    SMTPPassword: String,
    SMTPPort: Double,
    SMTPSender: String,
    SMTPServer: String,
    SMTPUser: String,
    Save: () => Unit,
    UseForInboundRouting: Boolean
  ): FaxReceiptOptions = {
    val __obj = js.Dynamic.literal(AllowedReceipts = AllowedReceipts.asInstanceOf[js.Any], AuthenticationType = AuthenticationType.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), SMTPPassword = SMTPPassword.asInstanceOf[js.Any], SMTPPort = SMTPPort.asInstanceOf[js.Any], SMTPSender = SMTPSender.asInstanceOf[js.Any], SMTPServer = SMTPServer.asInstanceOf[js.Any], SMTPUser = SMTPUser.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), UseForInboundRouting = UseForInboundRouting.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxReceiptOptions_typekey")(FAXCOMEXLibDotFaxReceiptOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxReceiptOptions]
  }
  @scala.inline
  implicit class FaxReceiptOptionsOps[Self <: FaxReceiptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedReceipts(value: FAX_RECEIPT_TYPE_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedReceipts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationType(value: FAX_SMTP_AUTHENTICATION_TYPE_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxReceiptOptions_typekey(value: FaxReceiptOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxReceiptOptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSMTPPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMTPPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSMTPPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMTPPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSMTPSender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMTPSender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSMTPServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMTPServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSMTPUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMTPUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUseForInboundRouting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseForInboundRouting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

