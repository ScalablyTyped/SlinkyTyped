package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.bignumMod.BigNumber
import typingsSlinky.asmcryptoJs.bignumMod.Modulus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsaMod {
  
  @JSImport("asmcrypto.js/dist_es8/rsa/rsa", "RSA")
  @js.native
  class RSA protected () extends StObject {
    def this(key: js.Array[js.typedarray.Uint8Array]) = this()
    
    def decrypt(msg: BigNumber): this.type = js.native
    
    def encrypt(msg: BigNumber): this.type = js.native
    
    val key: typingsSlinky.asmcryptoJs.rsaMod.key = js.native
    
    var result: js.typedarray.Uint8Array = js.native
  }
  
  @js.native
  trait key extends StObject {
    
    var `0`: Modulus = js.native
    
    var `1`: BigNumber = js.native
    
    var `2`: js.UndefOr[BigNumber] = js.native
    
    var `3`: js.UndefOr[Modulus] = js.native
    
    var `4`: js.UndefOr[Modulus] = js.native
    
    var `5`: js.UndefOr[BigNumber] = js.native
    
    var `6`: js.UndefOr[BigNumber] = js.native
    
    var `7`: js.UndefOr[BigNumber] = js.native
  }
  object key {
    
    @scala.inline
    def apply(`0`: Modulus, `1`: BigNumber): key = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[key]
    }
    
    @scala.inline
    implicit class keyMutableBuilder[Self <: key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set0(value: Modulus): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1(value: BigNumber): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2(value: BigNumber): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2Undefined: Self = StObject.set(x, "2", js.undefined)
      
      @scala.inline
      def set3(value: Modulus): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set3Undefined: Self = StObject.set(x, "3", js.undefined)
      
      @scala.inline
      def set4(value: Modulus): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4Undefined: Self = StObject.set(x, "4", js.undefined)
      
      @scala.inline
      def set5(value: BigNumber): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set5Undefined: Self = StObject.set(x, "5", js.undefined)
      
      @scala.inline
      def set6(value: BigNumber): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set6Undefined: Self = StObject.set(x, "6", js.undefined)
      
      @scala.inline
      def set7(value: BigNumber): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set7Undefined: Self = StObject.set(x, "7", js.undefined)
    }
  }
}
