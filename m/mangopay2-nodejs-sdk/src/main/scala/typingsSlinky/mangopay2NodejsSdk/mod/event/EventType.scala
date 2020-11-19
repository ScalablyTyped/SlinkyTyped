package typingsSlinky.mangopay2NodejsSdk.mod.event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_SUCCEEDED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_FAILED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_SUCCEEDED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_FAILED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_SUCCEEDED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_FAILED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_SUCCEEDED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_FAILED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_SUCCEEDED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_FAILED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_SUCCEEDED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_FAILED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_VALIDATION_ASKED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_SUCCEEDED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_FAILED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_SUCCEEDED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_FAILED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_VALIDATION_ASKED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_SUCCEEDED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_FAILED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SUBMITTED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_ACTION_REQUIRED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_FURTHER_ACTION_REQUIRED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CLOSED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SENT_TO_BANK
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_SUCCEEDED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_FAILED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_FAILED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_ACTIVATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_SUBMITTED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_WAITING
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_EXPIRED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_CANCELED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_VALIDATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATION_ASKED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_REFUSED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATED
*/
trait EventType extends js.Object
object EventType {
  
  @scala.inline
  def DISPUTE_ACTION_REQUIRED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_ACTION_REQUIRED = "DISPUTE_ACTION_REQUIRED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_ACTION_REQUIRED]
  
  @scala.inline
  def DISPUTE_CLOSED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CLOSED = "DISPUTE_CLOSED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CLOSED]
  
  @scala.inline
  def DISPUTE_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CREATED = "DISPUTE_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CREATED]
  
  @scala.inline
  def DISPUTE_DOCUMENT_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_CREATED = "DISPUTE_DOCUMENT_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_CREATED]
  
  @scala.inline
  def DISPUTE_DOCUMENT_FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_FAILED = "DISPUTE_DOCUMENT_FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_FAILED]
  
  @scala.inline
  def DISPUTE_DOCUMENT_SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_SUCCEEDED = "DISPUTE_DOCUMENT_SUCCEEDED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_SUCCEEDED]
  
  @scala.inline
  def DISPUTE_DOCUMENT_VALIDATION_ASKED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_VALIDATION_ASKED = "DISPUTE_DOCUMENT_VALIDATION_ASKED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_VALIDATION_ASKED]
  
  @scala.inline
  def DISPUTE_FURTHER_ACTION_REQUIRED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_FURTHER_ACTION_REQUIRED = "DISPUTE_FURTHER_ACTION_REQUIRED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_FURTHER_ACTION_REQUIRED]
  
  @scala.inline
  def DISPUTE_SENT_TO_BANK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SENT_TO_BANK = "DISPUTE_SENT_TO_BANK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SENT_TO_BANK]
  
  @scala.inline
  def DISPUTE_SUBMITTED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SUBMITTED = "DISPUTE_SUBMITTED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SUBMITTED]
  
  @scala.inline
  def KYC_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_CREATED = "KYC_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_CREATED]
  
  @scala.inline
  def KYC_FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_FAILED = "KYC_FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_FAILED]
  
  @scala.inline
  def KYC_SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_SUCCEEDED = "KYC_SUCCEEDED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_SUCCEEDED]
  
  @scala.inline
  def KYC_VALIDATION_ASKED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_VALIDATION_ASKED = "KYC_VALIDATION_ASKED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_VALIDATION_ASKED]
  
  @scala.inline
  def MANDATE_ACTIVATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_ACTIVATED = "MANDATE_ACTIVATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_ACTIVATED]
  
  @scala.inline
  def MANDATE_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_CREATED = "MANDATE_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_CREATED]
  
  @scala.inline
  def MANDATE_FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_FAILED = "MANDATE_FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_FAILED]
  
  @scala.inline
  def MANDATE_SUBMITTED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_SUBMITTED = "MANDATE_SUBMITTED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_SUBMITTED]
  
  @scala.inline
  def PAYIN_NORMAL_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_CREATED = "PAYIN_NORMAL_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_CREATED]
  
  @scala.inline
  def PAYIN_NORMAL_FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_FAILED = "PAYIN_NORMAL_FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_FAILED]
  
  @scala.inline
  def PAYIN_NORMAL_SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_SUCCEEDED = "PAYIN_NORMAL_SUCCEEDED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_SUCCEEDED]
  
  @scala.inline
  def PAYIN_REFUND_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_CREATED = "PAYIN_REFUND_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_CREATED]
  
  @scala.inline
  def PAYIN_REFUND_FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_FAILED = "PAYIN_REFUND_FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_FAILED]
  
  @scala.inline
  def PAYIN_REFUND_SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_SUCCEEDED = "PAYIN_REFUND_SUCCEEDED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_SUCCEEDED]
  
  @scala.inline
  def PAYIN_REPUDIATION_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_CREATED = "PAYIN_REPUDIATION_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_CREATED]
  
  @scala.inline
  def PAYIN_REPUDIATION_FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_FAILED = "PAYIN_REPUDIATION_FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_FAILED]
  
  @scala.inline
  def PAYIN_REPUDIATION_SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_SUCCEEDED = "PAYIN_REPUDIATION_SUCCEEDED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_SUCCEEDED]
  
  @scala.inline
  def PAYOUT_NORMAL_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_CREATED = "PAYOUT_NORMAL_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_CREATED]
  
  @scala.inline
  def PAYOUT_NORMAL_FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_FAILED = "PAYOUT_NORMAL_FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_FAILED]
  
  @scala.inline
  def PAYOUT_NORMAL_SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_SUCCEEDED = "PAYOUT_NORMAL_SUCCEEDED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_SUCCEEDED]
  
  @scala.inline
  def PAYOUT_REFUND_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_CREATED = "PAYOUT_REFUND_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_CREATED]
  
  @scala.inline
  def PAYOUT_REFUND_FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_FAILED = "PAYOUT_REFUND_FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_FAILED]
  
  @scala.inline
  def PAYOUT_REFUND_SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_SUCCEEDED = "PAYOUT_REFUND_SUCCEEDED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_SUCCEEDED]
  
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_CANCELED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_CANCELED = "PREAUTHORIZATION_PAYMENT_CANCELED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_CANCELED]
  
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_EXPIRED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_EXPIRED = "PREAUTHORIZATION_PAYMENT_EXPIRED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_EXPIRED]
  
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_VALIDATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_VALIDATED = "PREAUTHORIZATION_PAYMENT_VALIDATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_VALIDATED]
  
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_WAITING: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_WAITING = "PREAUTHORIZATION_PAYMENT_WAITING".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_WAITING]
  
  @scala.inline
  def TRANSFER_NORMAL_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_CREATED = "TRANSFER_NORMAL_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_CREATED]
  
  @scala.inline
  def TRANSFER_NORMAL_FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_FAILED = "TRANSFER_NORMAL_FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_FAILED]
  
  @scala.inline
  def TRANSFER_NORMAL_SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_SUCCEEDED = "TRANSFER_NORMAL_SUCCEEDED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_SUCCEEDED]
  
  @scala.inline
  def TRANSFER_REFUND_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_CREATED = "TRANSFER_REFUND_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_CREATED]
  
  @scala.inline
  def TRANSFER_REFUND_FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_FAILED = "TRANSFER_REFUND_FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_FAILED]
  
  @scala.inline
  def TRANSFER_REFUND_SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_SUCCEEDED = "TRANSFER_REFUND_SUCCEEDED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_SUCCEEDED]
  
  @scala.inline
  def TRANSFER_SETTLEMENT_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_CREATED = "TRANSFER_SETTLEMENT_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_CREATED]
  
  @scala.inline
  def TRANSFER_SETTLEMENT_FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_FAILED = "TRANSFER_SETTLEMENT_FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_FAILED]
  
  @scala.inline
  def TRANSFER_SETTLEMENT_SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_SUCCEEDED = "TRANSFER_SETTLEMENT_SUCCEEDED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_SUCCEEDED]
  
  @scala.inline
  def UBO_DECLARATION_CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_CREATED = "UBO_DECLARATION_CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_CREATED]
  
  @scala.inline
  def UBO_DECLARATION_REFUSED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_REFUSED = "UBO_DECLARATION_REFUSED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_REFUSED]
  
  @scala.inline
  def UBO_DECLARATION_VALIDATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATED = "UBO_DECLARATION_VALIDATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATED]
  
  @scala.inline
  def UBO_DECLARATION_VALIDATION_ASKED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATION_ASKED = "UBO_DECLARATION_VALIDATION_ASKED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATION_ASKED]
}
