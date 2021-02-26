package typingsSlinky.coinbaseCommerceNode

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.DELAYED
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MANUAL
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MULTIPLE
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OTHER
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OVERPAID
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNDERPAID
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.applicationSlashjson
import typingsSlinky.coinbaseCommerceNode.mod.CryptoCurrency
import typingsSlinky.coinbaseCommerceNode.mod.CryptoName
import typingsSlinky.coinbaseCommerceNode.mod.FiatCurrency
import typingsSlinky.coinbaseCommerceNode.mod.PaymentStatus
import typingsSlinky.coinbaseCommerceNode.mod.Price
import typingsSlinky.coinbaseCommerceNode.mod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Block extends StObject {
    
    var block: Confirmationsaccumulated = js.native
    
    var network: CryptoName = js.native
    
    var status: PaymentStatus = js.native
    
    var transaction_id: String = js.native
    
    var value: Crypto = js.native
  }
  object Block {
    
    @scala.inline
    def apply(
      block: Confirmationsaccumulated,
      network: CryptoName,
      status: PaymentStatus,
      transaction_id: String,
      value: Crypto
    ): Block = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: Confirmationsaccumulated): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetwork(value: CryptoName): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: PaymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Crypto): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Confirmationsaccumulated extends StObject {
    
    var confirmations_accumulated: Double = js.native
    
    var confirmations_required: Double = js.native
    
    var hash: String = js.native
    
    var height: Double = js.native
  }
  object Confirmationsaccumulated {
    
    @scala.inline
    def apply(confirmations_accumulated: Double, confirmations_required: Double, hash: String, height: Double): Confirmationsaccumulated = {
      val __obj = js.Dynamic.literal(confirmations_accumulated = confirmations_accumulated.asInstanceOf[js.Any], confirmations_required = confirmations_required.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confirmationsaccumulated]
    }
    
    @scala.inline
    implicit class ConfirmationsaccumulatedMutableBuilder[Self <: Confirmationsaccumulated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmations_accumulated(value: Double): Self = StObject.set(x, "confirmations_accumulated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmations_required(value: Double): Self = StObject.set(x, "confirmations_required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    /**
      * Timeline entry context.
      */
    var context: js.UndefOr[UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER] = js.native
    
    /**
      * Timeline entry status.
      */
    var status: PaymentStatus = js.native
    
    /**
      * Timeline entry timestamp.
      */
    var time: Timestamp = js.native
  }
  object Context {
    
    @scala.inline
    def apply(status: PaymentStatus, time: Timestamp): Context = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setStatus(value: PaymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Timestamp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Crypto extends StObject {
    
    var crypto: Price[CryptoCurrency] = js.native
    
    var local: Price[FiatCurrency] = js.native
  }
  object Crypto {
    
    @scala.inline
    def apply(crypto: Price[CryptoCurrency], local: Price[FiatCurrency]): Crypto = {
      val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crypto]
    }
    
    @scala.inline
    implicit class CryptoMutableBuilder[Self <: Crypto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrypto(value: Price[CryptoCurrency]): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal(value: Price[FiatCurrency]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var Accept: applicationSlashjson = js.native
    
    var `Content-Type`: applicationSlashjson = js.native
    
    var `User-Agent`: String = js.native
    
    var `X-CC-Api-Key`: String = js.native
    
    var `X-CC-Version`: String = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(
      Accept: applicationSlashjson,
      `Content-Type`: applicationSlashjson,
      `User-Agent`: String,
      `X-CC-Api-Key`: String,
      `X-CC-Version`: String
    ): Dictkey = {
      val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any])
      __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
      __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
      __obj.updateDynamic("X-CC-Api-Key")(`X-CC-Api-Key`.asInstanceOf[js.Any])
      __obj.updateDynamic("X-CC-Version")(`X-CC-Version`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: applicationSlashjson): Self = StObject.set(x, "Accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setContent-Type`(value: applicationSlashjson): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUser-Agent`(value: String): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-CC-Api-Key`(value: String): Self = StObject.set(x, "X-CC-Api-Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-CC-Version`(value: String): Self = StObject.set(x, "X-CC-Version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<coinbase-commerce-node.coinbase-commerce-node.CryptoName, string>> */
  @js.native
  trait PartialRecordCryptoNamest extends StObject {
    
    var bitcoin: js.UndefOr[String] = js.native
    
    var bitcoincash: js.UndefOr[String] = js.native
    
    var ethereum: js.UndefOr[String] = js.native
    
    var litecoin: js.UndefOr[String] = js.native
    
    var usdc: js.UndefOr[String] = js.native
  }
  object PartialRecordCryptoNamest {
    
    @scala.inline
    def apply(): PartialRecordCryptoNamest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordCryptoNamest]
    }
    
    @scala.inline
    implicit class PartialRecordCryptoNamestMutableBuilder[Self <: PartialRecordCryptoNamest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitcoin(value: String): Self = StObject.set(x, "bitcoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitcoinUndefined: Self = StObject.set(x, "bitcoin", js.undefined)
      
      @scala.inline
      def setBitcoincash(value: String): Self = StObject.set(x, "bitcoincash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitcoincashUndefined: Self = StObject.set(x, "bitcoincash", js.undefined)
      
      @scala.inline
      def setEthereum(value: String): Self = StObject.set(x, "ethereum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEthereumUndefined: Self = StObject.set(x, "ethereum", js.undefined)
      
      @scala.inline
      def setLitecoin(value: String): Self = StObject.set(x, "litecoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLitecoinUndefined: Self = StObject.set(x, "litecoin", js.undefined)
      
      @scala.inline
      def setUsdc(value: String): Self = StObject.set(x, "usdc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsdcUndefined: Self = StObject.set(x, "usdc", js.undefined)
    }
  }
}
