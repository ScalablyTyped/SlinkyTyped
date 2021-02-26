package typingsSlinky.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Length extends StObject {
  
  /**
    * The length.
    */
  var length: Double = js.native
  
  /**
    * The offset.
    */
  var offset: Double = js.native
  
  /**
    * The alternative type.
    */
  var types: js.Array[String] = js.native
  
  /**
    * The number of typos.
    */
  var typos: Double = js.native
  
  /**
    * The list of alternative words.
    */
  var words: js.Array[String] = js.native
}
object Length {
  
  @scala.inline
  def apply(length: Double, offset: Double, types: js.Array[String], typos: Double, words: js.Array[String]): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], typos = typos.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  @scala.inline
  implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    @scala.inline
    def setTypos(value: Double): Self = StObject.set(x, "typos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
