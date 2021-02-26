package typingsSlinky.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Padding strategy.
  */
@js.native
trait Padding extends StObject {
  
  /**
    * Pads data using the algorithm defined in PKCS #5/7.
    *
    * @param data The data to pad.
    * @param blockSize The multiple that the data should be padded to.
    *
    * @example
    *
    *     CryptoJS.pad.Pkcs7.pad(wordArray, 4);
    */
  def pad(data: WordArray, blockSize: Double): Unit = js.native
  
  /**
    * Unpads data that had been padded using the algorithm defined in PKCS #5/7.
    *
    * @param data The data to unpad.
    *
    * @example
    *
    *     CryptoJS.pad.Pkcs7.unpad(wordArray);
    */
  def unpad(data: WordArray): Unit = js.native
}
object Padding {
  
  @scala.inline
  def apply(pad: (WordArray, Double) => Unit, unpad: WordArray => Unit): Padding = {
    val __obj = js.Dynamic.literal(pad = js.Any.fromFunction2(pad), unpad = js.Any.fromFunction1(unpad))
    __obj.asInstanceOf[Padding]
  }
  
  @scala.inline
  implicit class PaddingMutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPad(value: (WordArray, Double) => Unit): Self = StObject.set(x, "pad", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnpad(value: WordArray => Unit): Self = StObject.set(x, "unpad", js.Any.fromFunction1(value))
  }
}
