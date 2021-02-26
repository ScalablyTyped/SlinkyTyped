package typingsSlinky.ethereumjsTx

import typingsSlinky.ethereumjsCommon.mod.default
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type BufferLike = Buffer | TransformableToBuffer | PrefixedHexString | Double
  
  @js.native
  trait FakeTxData extends TxData {
    
    /**
      * The sender of the Tx.
      */
    var from: js.UndefOr[BufferLike] = js.native
  }
  object FakeTxData {
    
    @scala.inline
    def apply(): FakeTxData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FakeTxData]
    }
    
    @scala.inline
    implicit class FakeTxDataMutableBuilder[Self <: FakeTxData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: BufferLike): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
  
  type PrefixedHexString = String
  
  @js.native
  trait TransactionOptions extends StObject {
    
    /**
      * The chain of the transaction, default: 'mainnet'
      */
    var chain: js.UndefOr[Double | String] = js.native
    
    /**
      * A Common object defining the chain and the hardfork a transaction belongs to.
      */
    var common: js.UndefOr[default] = js.native
    
    /**
      * The hardfork of the transaction, default: 'petersburg'
      */
    var hardfork: js.UndefOr[String] = js.native
  }
  object TransactionOptions {
    
    @scala.inline
    def apply(): TransactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionOptions]
    }
    
    @scala.inline
    implicit class TransactionOptionsMutableBuilder[Self <: TransactionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChain(value: Double | String): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
      
      @scala.inline
      def setCommon(value: default): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      @scala.inline
      def setHardfork(value: String): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardforkUndefined: Self = StObject.set(x, "hardfork", js.undefined)
    }
  }
  
  @js.native
  trait TransformableToBuffer extends StObject {
    
    def toBuffer(): Buffer = js.native
  }
  object TransformableToBuffer {
    
    @scala.inline
    def apply(toBuffer: () => Buffer): TransformableToBuffer = {
      val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.asInstanceOf[TransformableToBuffer]
    }
    
    @scala.inline
    implicit class TransformableToBufferMutableBuilder[Self <: TransformableToBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TxData extends StObject {
    
    /**
      * This will contain the data of the message or the init of a contract
      */
    var data: js.UndefOr[BufferLike] = js.native
    
    /**
      * The transaction's gas limit.
      */
    var gasLimit: js.UndefOr[BufferLike] = js.native
    
    /**
      * The transaction's gas price.
      */
    var gasPrice: js.UndefOr[BufferLike] = js.native
    
    /**
      * The transaction's nonce.
      */
    var nonce: js.UndefOr[BufferLike] = js.native
    
    /**
      * EC signature parameter.
      */
    var r: js.UndefOr[BufferLike] = js.native
    
    /**
      * EC signature parameter.
      */
    var s: js.UndefOr[BufferLike] = js.native
    
    /**
      * The transaction's the address is sent to.
      */
    var to: js.UndefOr[BufferLike] = js.native
    
    /**
      * EC recovery ID.
      */
    var v: js.UndefOr[BufferLike] = js.native
    
    /**
      * The amount of Ether sent.
      */
    var value: js.UndefOr[BufferLike] = js.native
  }
  object TxData {
    
    @scala.inline
    def apply(): TxData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TxData]
    }
    
    @scala.inline
    implicit class TxDataMutableBuilder[Self <: TxData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: BufferLike): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setGasLimit(value: BufferLike): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      @scala.inline
      def setGasPrice(value: BufferLike): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      @scala.inline
      def setNonce(value: BufferLike): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setR(value: BufferLike): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      @scala.inline
      def setS(value: BufferLike): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setTo(value: BufferLike): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setV(value: BufferLike): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      @scala.inline
      def setValue(value: BufferLike): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
