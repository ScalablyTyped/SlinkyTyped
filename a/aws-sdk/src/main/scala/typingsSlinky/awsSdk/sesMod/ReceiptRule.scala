package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRule extends js.Object {
  /**
    * An ordered list of actions to perform on messages that match at least one of the recipient email addresses or domains specified in the receipt rule.
    */
  var Actions: js.UndefOr[ReceiptActionsList] = js.native
  /**
    * If true, the receipt rule is active. The default value is false.
    */
  var Enabled: js.UndefOr[typingsSlinky.awsSdk.sesMod.Enabled] = js.native
  /**
    * The name of the receipt rule. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var Name: ReceiptRuleName = js.native
  /**
    * The recipient domains and email addresses that the receipt rule applies to. If this field is not specified, this rule will match all recipients under all verified domains.
    */
  var Recipients: js.UndefOr[RecipientsList] = js.native
  /**
    * If true, then messages that this receipt rule applies to are scanned for spam and viruses. The default value is false.
    */
  var ScanEnabled: js.UndefOr[Enabled] = js.native
  /**
    * Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted with Transport Layer Security (TLS). If this parameter is set to Require, Amazon SES will bounce emails that are not received over TLS. The default is Optional.
    */
  var TlsPolicy: js.UndefOr[typingsSlinky.awsSdk.sesMod.TlsPolicy] = js.native
}

object ReceiptRule {
  @scala.inline
  def apply(Name: ReceiptRuleName): ReceiptRule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRule]
  }
  @scala.inline
  implicit class ReceiptRuleOps[Self <: ReceiptRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ReceiptRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: ReceiptActionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipients(value: RecipientsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recipients")(js.undefined)
        ret
    }
    @scala.inline
    def withScanEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScanEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScanEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsPolicy(value: TlsPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TlsPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TlsPolicy")(js.undefined)
        ret
    }
  }
  
}

