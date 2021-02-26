package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transaction {
  
  @js.native
  trait TransactionData extends EntityBaseData {
    
    /**
      * A user's ID
      */
    var AuthorId: String = js.native
    
    /**
      * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
      */
    var CreditedFunds: MoneyData = js.native
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: String = js.native
    
    /**
      * The ID of the wallet where money will be credited
      */
    var CreditedWalletId: String = js.native
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData = js.native
    
    /**
      * The ID of the wallet that was debited
      */
    var DebitedWalletId: String = js.native
    
    /**
      * When the transaction happened
      */
    var ExecutionDate: Timestamp = js.native
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData = js.native
    
    /**
      * The nature of the transaction
      */
    var Nature: TransactionNature = js.native
    
    /**
      * The result code
      */
    var ResultCode: String = js.native
    
    /**
      * A verbal explanation of the ResultCode
      */
    var ResultMessage: String = js.native
    
    /**
      * The status of the transaction
      */
    var Status: TransactionStatus = js.native
    
    /**
      * The type of the transaction
      */
    var Type: TransactionType = js.native
  }
  object TransactionData {
    
    @scala.inline
    def apply(
      AuthorId: String,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      ExecutionDate: Timestamp,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType
    ): TransactionData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionData]
    }
    
    @scala.inline
    implicit class TransactionDataMutableBuilder[Self <: TransactionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedFunds(value: MoneyData): Self = StObject.set(x, "CreditedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionDate(value: Timestamp): Self = StObject.set(x, "ExecutionDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNature(value: TransactionNature): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: TransactionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TransactionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT
  */
  trait TransactionNature extends StObject
  object TransactionNature {
    
    @scala.inline
    def REFUND: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND = "REFUND".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND]
    
    @scala.inline
    def REGULAR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR = "REGULAR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR]
    
    @scala.inline
    def REPUDIATION: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION = "REPUDIATION".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION]
    
    @scala.inline
    def SETTLEMENT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT = "SETTLEMENT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
  */
  trait TransactionStatus extends StObject
  object TransactionStatus {
    
    @scala.inline
    def CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
    
    @scala.inline
    def FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED]
    
    @scala.inline
    def SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT
  */
  trait TransactionType extends StObject
  object TransactionType {
    
    @scala.inline
    def PAYIN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN = "PAYIN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN]
    
    @scala.inline
    def PAYOUT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT = "PAYOUT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT]
    
    @scala.inline
    def TRANSFER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER = "TRANSFER".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER]
  }
}
