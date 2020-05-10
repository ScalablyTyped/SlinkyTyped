package typingsSlinky.mangopay2NodejsSdk.mod.payIn

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import typingsSlinky.mangopay2NodejsSdk.mod.SecureMode
import typingsSlinky.mangopay2NodejsSdk.mod.card.CardType
import typingsSlinky.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCardWebPayIn extends js.Object {
  /**
    * A user's ID
    */
  var AuthorId: String = js.native
  /**
    * The type of card
    */
  var CardType: typingsSlinky.mangopay2NodejsSdk.mod.card.CardType = js.native
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: js.UndefOr[String] = js.native
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String = js.native
  /**
    * The language to use for the payment page - needs to be the ISO code of the language
    */
  var Culture: CountryISO = js.native
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData = js.native
  var ExecutionType: WEB = js.native
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData = js.native
  var PaymentType: CARD = js.native
  /**
    * The URL to redirect to after payment (whether successful or not)
    */
  var ReturnURL: String = js.native
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually.
    * The field lets you activate it automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects
    * there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.SecureMode] = js.native
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and
    * can only include alphanumeric characters or spaces. See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: js.UndefOr[String] = js.native
  /**
    * A URL to an SSL page to allow you to customise the payment page. Must be in the format: array("PAYLINE"=>"https://...") and meet all the
    * specifications listed here. Note that only a template for Payline is currently available
    */
  var TemplateURLOptions: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.payIn.TemplateURLOptions] = js.native
}

object CreateCardWebPayIn {
  @scala.inline
  def apply(
    AuthorId: String,
    CardType: CardType,
    CreditedWalletId: String,
    Culture: CountryISO,
    DebitedFunds: MoneyData,
    ExecutionType: WEB,
    Fees: MoneyData,
    PaymentType: CARD,
    ReturnURL: String
  ): CreateCardWebPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardWebPayIn]
  }
  @scala.inline
  implicit class CreateCardWebPayInOps[Self <: CreateCardWebPayIn] (val x: Self) extends AnyVal {
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
    def withCardType(value: CardType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreditedWalletId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedWalletId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCulture(value: CountryISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebitedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionType(value: WEB): Self = {
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
    def withReturnURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnURL")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTemplateURLOptions(value: TemplateURLOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateURLOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateURLOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateURLOptions")(js.undefined)
        ret
    }
  }
  
}

