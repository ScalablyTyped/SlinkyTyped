package typingsSlinky.mangopay2NodejsSdk.mod.cardPreAuthorization

import typingsSlinky.mangopay2NodejsSdk.mod.BillingData
import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import typingsSlinky.mangopay2NodejsSdk.mod.PaymentStatus
import typingsSlinky.mangopay2NodejsSdk.mod.PreAuthorizationExecutionType
import typingsSlinky.mangopay2NodejsSdk.mod.PreAuthorizationStatus
import typingsSlinky.mangopay2NodejsSdk.mod.SecureMode
import typingsSlinky.mangopay2NodejsSdk.mod.SecurityInfoData
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardPreAuthorizationData extends EntityBaseData {
  /**
    * A user's ID
    */
  var AuthorId: String = js.native
  /**
    * Contains useful information related to the user billing
    */
  var Billing: BillingData = js.native
  /**
    * The ID of a card
    */
  var CardId: String = js.native
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData = js.native
  /**
    * How the PreAuthorization has been executed
    */
  var ExecutionType: PreAuthorizationExecutionType = js.native
  /**
    * The date when the payment is to be processed by
    */
  var ExpirationDate: Timestamp = js.native
  /**
    * The Id of the associated PayIn
    */
  var PayInId: String = js.native
  /**
    * The status of the payment after the PreAuthorization. You can pass the PaymentStatus from "WAITING" to "CANCELED" should you need/want to
    */
  var PaymentStatus: typingsSlinky.mangopay2NodejsSdk.mod.PaymentStatus = js.native
  /**
    * The result code
    */
  var ResultCode: String = js.native
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String = js.native
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually.
    * The field lets you activate it automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ),
    * "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: typingsSlinky.mangopay2NodejsSdk.mod.SecureMode = js.native
  /**
    * The value is 'true' if the SecureMode was used
    */
  var SecureModeNeeded: Boolean = js.native
  /**
    * This is the URL where to redirect users to proceed to 3D secure validation
    */
  var SecureModeRedirectURL: String = js.native
  /**
    * This is the URL where users are automatically redirected after 3D secure validation (if activated)
    */
  var SecureModeReturnURL: String = js.native
  /**
    * Contains useful information related to security and fraud
    */
  var SecurityInfo: SecurityInfoData = js.native
  /**
    * Status of the PreAuthorization
    */
  var Status: PreAuthorizationStatus = js.native
}

object CardPreAuthorizationData {
  @scala.inline
  def apply(
    AuthorId: String,
    Billing: BillingData,
    CardId: String,
    CreationDate: Double,
    DebitedFunds: MoneyData,
    ExecutionType: PreAuthorizationExecutionType,
    ExpirationDate: Timestamp,
    Id: String,
    PayInId: String,
    PaymentStatus: PaymentStatus,
    ResultCode: String,
    ResultMessage: String,
    SecureMode: SecureMode,
    SecureModeNeeded: Boolean,
    SecureModeRedirectURL: String,
    SecureModeReturnURL: String,
    SecurityInfo: SecurityInfoData,
    Status: PreAuthorizationStatus,
    Tag: String
  ): CardPreAuthorizationData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], PayInId = PayInId.asInstanceOf[js.Any], PaymentStatus = PaymentStatus.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], SecurityInfo = SecurityInfo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardPreAuthorizationData]
  }
  @scala.inline
  implicit class CardPreAuthorizationDataOps[Self <: CardPreAuthorizationData] (val x: Self) extends AnyVal {
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
    def withBilling(value: BillingData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Billing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebitedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionType(value: PreAuthorizationExecutionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayInId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PayInId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentStatus(value: PaymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecureMode(value: SecureMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecureModeNeeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureModeNeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecureModeRedirectURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureModeRedirectURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecureModeReturnURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureModeReturnURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityInfo(value: SecurityInfoData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: PreAuthorizationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

