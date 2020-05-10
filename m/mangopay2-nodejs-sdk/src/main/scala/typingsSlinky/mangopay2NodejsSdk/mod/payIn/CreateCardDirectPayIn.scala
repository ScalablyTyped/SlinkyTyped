package typingsSlinky.mangopay2NodejsSdk.mod.payIn

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typingsSlinky.mangopay2NodejsSdk.mod.BillingData
import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import typingsSlinky.mangopay2NodejsSdk.mod.SecureMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCardDirectPayIn extends js.Object {
  /**
    * A user's ID
    */
  var AuthorId: String = js.native
  /**
    * Contains useful information related to the user billing
    */
  var Billing: js.UndefOr[BillingData] = js.native
  /**
    * The ID of a card
    */
  var CardId: String = js.native
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: js.UndefOr[String] = js.native
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String = js.native
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData = js.native
  var ExecutionType: DIRECT = js.native
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData = js.native
  var PaymentType: CARD = js.native
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it automatically
    *  with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.SecureMode] = js.native
  /**
    * This is the URL where users are automatically redirected after 3D secure validation (if activated)
    */
  var SecureModeReturnURL: String = js.native
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
    * See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: js.UndefOr[String] = js.native
}

object CreateCardDirectPayIn {
  @scala.inline
  def apply(
    AuthorId: String,
    CardId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    ExecutionType: DIRECT,
    Fees: MoneyData,
    PaymentType: CARD,
    SecureModeReturnURL: String
  ): CreateCardDirectPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardDirectPayIn]
  }
  @scala.inline
  implicit class CreateCardDirectPayInOps[Self <: CreateCardDirectPayIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreditedWalletId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedWalletId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebitedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionType(value: DIRECT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFees(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentType(value: CARD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecureModeReturnURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureModeReturnURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling(value: BillingData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Billing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Billing")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditedUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditedUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureMode(value: SecureMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStatementDescriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatementDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatementDescriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatementDescriptor")(js.undefined)
        ret
    }
  }
  
}

