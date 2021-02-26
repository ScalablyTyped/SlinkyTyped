package typingsSlinky.ledgerhqHwAppBtc

import typingsSlinky.ledgerhqHwAppBtc.mod.AddressFormat
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BitcoinAddress extends StObject {
    
    var bitcoinAddress: String = js.native
    
    var chainCode: String = js.native
    
    var publicKey: String = js.native
  }
  object BitcoinAddress {
    
    @scala.inline
    def apply(bitcoinAddress: String, chainCode: String, publicKey: String): BitcoinAddress = {
      val __obj = js.Dynamic.literal(bitcoinAddress = bitcoinAddress.asInstanceOf[js.Any], chainCode = chainCode.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitcoinAddress]
    }
    
    @scala.inline
    implicit class BitcoinAddressMutableBuilder[Self <: BitcoinAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitcoinAddress(value: String): Self = StObject.set(x, "bitcoinAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainCode(value: String): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Format extends StObject {
    
    var format: js.UndefOr[AddressFormat] = js.native
    
    var verify: js.UndefOr[Boolean] = js.native
  }
  object Format {
    
    @scala.inline
    def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: AddressFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setVerify(value: Boolean): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    var index: Double = js.native
    
    var progress: Double = js.native
    
    var total: Double = js.native
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, progress: Double, total: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait R extends StObject {
    
    var r: String = js.native
    
    var s: String = js.native
    
    var v: Double = js.native
  }
  object R {
    
    @scala.inline
    def apply(r: String, s: String, v: Double): R = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    @scala.inline
    implicit class RMutableBuilder[Self <: R] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrustedInput extends StObject {
    
    var trustedInput: Boolean = js.native
    
    var value: Buffer = js.native
  }
  object TrustedInput {
    
    @scala.inline
    def apply(trustedInput: Boolean, value: Buffer): TrustedInput = {
      val __obj = js.Dynamic.literal(trustedInput = trustedInput.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustedInput]
    }
    
    @scala.inline
    implicit class TrustedInputMutableBuilder[Self <: TrustedInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrustedInput(value: Boolean): Self = StObject.set(x, "trustedInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
