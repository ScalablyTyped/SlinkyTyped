package typingsSlinky.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectAbstractProvider.mod.Block
import typingsSlinky.ethersprojectAbstractProvider.mod.TransactionReceipt
import typingsSlinky.ethersprojectAbstractProvider.mod.TransactionResponse
import typingsSlinky.ethersprojectBignumber.mod.BigNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  @JSImport("@ethersproject/providers/lib/formatter", "Formatter")
  @js.native
  class Formatter () extends StObject {
    
    def _block(value: js.Any, format: js.Any): Block = js.native
    
    def address(value: js.Any): String = js.native
    
    def bigNumber(value: js.Any): BigNumber = js.native
    
    def block(value: js.Any): Block = js.native
    
    def blockTag(blockTag: js.Any): String = js.native
    
    def blockWithTransactions(value: js.Any): Block = js.native
    
    def boolean(value: js.Any): Boolean = js.native
    
    def callAddress(value: js.Any): String = js.native
    
    def contractAddress(value: js.Any): String = js.native
    
    def data(value: js.Any): String = js.native
    def data(value: js.Any, strict: Boolean): String = js.native
    
    def difficulty(value: js.Any): Double = js.native
    
    def filter(value: js.Any): js.Any = js.native
    
    def filterLog(value: js.Any): js.Any = js.native
    
    val formats: Formats = js.native
    
    def getDefaultFormats(): Formats = js.native
    
    def hash(value: js.Any): String = js.native
    def hash(value: js.Any, strict: Boolean): String = js.native
    
    def hex(value: js.Any): String = js.native
    def hex(value: js.Any, strict: Boolean): String = js.native
    
    def number(number: js.Any): Double = js.native
    
    def receipt(value: js.Any): TransactionReceipt = js.native
    
    def receiptLog(value: js.Any): js.Any = js.native
    
    def topics(value: js.Any): js.Any = js.native
    
    def transaction(value: js.Any): js.Any = js.native
    
    def transactionRequest(value: js.Any): js.Any = js.native
    
    def transactionResponse(transaction: js.Any): TransactionResponse = js.native
    
    def uint256(value: js.Any): String = js.native
  }
  /* static members */
  object Formatter {
    
    @JSImport("@ethersproject/providers/lib/formatter", "Formatter.allowFalsish")
    @js.native
    def allowFalsish(format: FormatFunc, replaceValue: js.Any): FormatFunc = js.native
    
    @JSImport("@ethersproject/providers/lib/formatter", "Formatter.allowNull")
    @js.native
    def allowNull(format: FormatFunc): FormatFunc = js.native
    @JSImport("@ethersproject/providers/lib/formatter", "Formatter.allowNull")
    @js.native
    def allowNull(format: FormatFunc, nullValue: js.Any): FormatFunc = js.native
    
    @JSImport("@ethersproject/providers/lib/formatter", "Formatter.arrayOf")
    @js.native
    def arrayOf(format: FormatFunc): FormatFunc = js.native
    
    @JSImport("@ethersproject/providers/lib/formatter", "Formatter.check")
    @js.native
    def check(format: StringDictionary[FormatFunc], `object`: js.Any): js.Any = js.native
  }
  
  @JSImport("@ethersproject/providers/lib/formatter", "isCommunityResourcable")
  @js.native
  def isCommunityResourcable(value: js.Any): /* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean = js.native
  
  @JSImport("@ethersproject/providers/lib/formatter", "isCommunityResource")
  @js.native
  def isCommunityResource(value: js.Any): Boolean = js.native
  
  @JSImport("@ethersproject/providers/lib/formatter", "showThrottleMessage")
  @js.native
  def showThrottleMessage(): Unit = js.native
  
  @js.native
  trait CommunityResourcable extends StObject {
    
    def isCommunityResource(): Boolean = js.native
  }
  object CommunityResourcable {
    
    @scala.inline
    def apply(isCommunityResource: () => Boolean): CommunityResourcable = {
      val __obj = js.Dynamic.literal(isCommunityResource = js.Any.fromFunction0(isCommunityResource))
      __obj.asInstanceOf[CommunityResourcable]
    }
    
    @scala.inline
    implicit class CommunityResourcableMutableBuilder[Self <: CommunityResourcable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCommunityResource(value: () => Boolean): Self = StObject.set(x, "isCommunityResource", js.Any.fromFunction0(value))
    }
  }
  
  type FormatFunc = js.Function1[/* value */ js.Any, js.Any]
  
  type FormatFuncs = StringDictionary[FormatFunc]
  
  @js.native
  trait Formats extends StObject {
    
    var block: FormatFuncs = js.native
    
    var blockWithTransactions: FormatFuncs = js.native
    
    var filter: FormatFuncs = js.native
    
    var filterLog: FormatFuncs = js.native
    
    var receipt: FormatFuncs = js.native
    
    var receiptLog: FormatFuncs = js.native
    
    var transaction: FormatFuncs = js.native
    
    var transactionRequest: FormatFuncs = js.native
  }
  object Formats {
    
    @scala.inline
    def apply(
      block: FormatFuncs,
      blockWithTransactions: FormatFuncs,
      filter: FormatFuncs,
      filterLog: FormatFuncs,
      receipt: FormatFuncs,
      receiptLog: FormatFuncs,
      transaction: FormatFuncs,
      transactionRequest: FormatFuncs
    ): Formats = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], blockWithTransactions = blockWithTransactions.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], filterLog = filterLog.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any], receiptLog = receiptLog.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any], transactionRequest = transactionRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formats]
    }
    
    @scala.inline
    implicit class FormatsMutableBuilder[Self <: Formats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: FormatFuncs): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockWithTransactions(value: FormatFuncs): Self = StObject.set(x, "blockWithTransactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: FormatFuncs): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterLog(value: FormatFuncs): Self = StObject.set(x, "filterLog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceipt(value: FormatFuncs): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiptLog(value: FormatFuncs): Self = StObject.set(x, "receiptLog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransaction(value: FormatFuncs): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionRequest(value: FormatFuncs): Self = StObject.set(x, "transactionRequest", value.asInstanceOf[js.Any])
    }
  }
}
