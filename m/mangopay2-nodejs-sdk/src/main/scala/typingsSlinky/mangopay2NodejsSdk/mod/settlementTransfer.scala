package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT
import typingsSlinky.mangopay2NodejsSdk.mod.refund.RefundReason
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionData
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settlementTransfer {
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.settlementTransfer.SettlementTransferData, 'Tag', 'AuthorId' | 'DebitedFunds' | 'Fees'> */
  @js.native
  trait CreateSettlementTransfer extends StObject {
    
    var AuthorId: String = js.native
    
    var DebitedFunds: MoneyData = js.native
    
    var Fees: MoneyData = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object CreateSettlementTransfer {
    
    @scala.inline
    def apply(AuthorId: String, DebitedFunds: MoneyData, Fees: MoneyData): CreateSettlementTransfer = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateSettlementTransfer]
    }
    
    @scala.inline
    implicit class CreateSettlementTransferMutableBuilder[Self <: CreateSettlementTransfer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  @js.native
  trait SettlementTransferData extends TransactionData {
    
    /**
      * The initial transaction ID
      */
    var InitialTransactionId: String = js.native
    
    /**
      * The initial transaction type
      */
    var InitialTransactionType: TransactionType = js.native
    
    /**
      * The nature of the transaction
      */
    @JSName("Nature")
    var Nature_SettlementTransferData: SETTLEMENT = js.native
    
    /**
      * Contains info about the reason for refund
      */
    var RefundReason: typingsSlinky.mangopay2NodejsSdk.mod.refund.RefundReason = js.native
    
    /**
      * The ID of the associated repudiation transaction
      */
    var RepudiationId: String = js.native
  }
  object SettlementTransferData {
    
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
      InitialTransactionId: String,
      InitialTransactionType: TransactionType,
      Nature: SETTLEMENT,
      RefundReason: RefundReason,
      RepudiationId: String,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType
    ): SettlementTransferData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InitialTransactionId = InitialTransactionId.asInstanceOf[js.Any], InitialTransactionType = InitialTransactionType.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], RefundReason = RefundReason.asInstanceOf[js.Any], RepudiationId = RepudiationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettlementTransferData]
    }
    
    @scala.inline
    implicit class SettlementTransferDataMutableBuilder[Self <: SettlementTransferData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialTransactionId(value: String): Self = StObject.set(x, "InitialTransactionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialTransactionType(value: TransactionType): Self = StObject.set(x, "InitialTransactionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNature(value: SETTLEMENT): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefundReason(value: RefundReason): Self = StObject.set(x, "RefundReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepudiationId(value: String): Self = StObject.set(x, "RepudiationId", value.asInstanceOf[js.Any])
    }
  }
}
