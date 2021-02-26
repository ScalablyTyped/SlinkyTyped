package typingsSlinky.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encoding strategy.
  */
@js.native
trait Encoder extends StObject {
  
  /**
    * Converts a hex string to a word array.
    *
    * @param hexStr The hex string.
    *
    * @return The word array.
    *
    * @example
    *
    *     var wordArray = CryptoJS.enc.Hex.parse(hexString);
    */
  def parse(str: String): WordArray = js.native
  
  /**
    * Converts a word array to a hex string.
    *
    * @param wordArray The word array.
    *
    * @return The hex string.
    *
    * @example
    *
    *     var hexString = CryptoJS.enc.Hex.stringify(wordArray);
    */
  def stringify(wordArray: WordArray): String = js.native
}
object Encoder {
  
  @scala.inline
  def apply(parse: String => WordArray, stringify: WordArray => String): Encoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[Encoder]
  }
  
  @scala.inline
  implicit class EncoderMutableBuilder[Self <: Encoder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: String => WordArray): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringify(value: WordArray => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
  }
}
