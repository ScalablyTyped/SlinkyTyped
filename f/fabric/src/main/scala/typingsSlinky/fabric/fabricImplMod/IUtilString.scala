package typingsSlinky.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtilString extends StObject {
  
  /**
    * Camelizes a string
    * @param string String to camelize
    */
  def camelize(string: String): String = js.native
  
  /**
    * Capitalizes a string
    * @param string String to capitalize
    * @param [firstLetterOnly] If true only first letter is capitalized
    * and other letters stay untouched, if false first letter is capitalized
    * and other letters are converted to lowercase.
    */
  def capitalize(string: String, firstLetterOnly: Boolean): String = js.native
  
  /**
    * Escapes XML in a string
    * @param string String to escape
    */
  def escapeXml(string: String): String = js.native
  
  /**
    * Divide a string in the user perceived single units
    * @param {String} textstring String to escape
    * @return {Array} array containing the graphemes
    */
  def graphemeSplit(string: String): js.Array[String] = js.native
}
object IUtilString {
  
  @scala.inline
  def apply(
    camelize: String => String,
    capitalize: (String, Boolean) => String,
    escapeXml: String => String,
    graphemeSplit: String => js.Array[String]
  ): IUtilString = {
    val __obj = js.Dynamic.literal(camelize = js.Any.fromFunction1(camelize), capitalize = js.Any.fromFunction2(capitalize), escapeXml = js.Any.fromFunction1(escapeXml), graphemeSplit = js.Any.fromFunction1(graphemeSplit))
    __obj.asInstanceOf[IUtilString]
  }
  
  @scala.inline
  implicit class IUtilStringMutableBuilder[Self <: IUtilString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamelize(value: String => String): Self = StObject.set(x, "camelize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCapitalize(value: (String, Boolean) => String): Self = StObject.set(x, "capitalize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEscapeXml(value: String => String): Self = StObject.set(x, "escapeXml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGraphemeSplit(value: String => js.Array[String]): Self = StObject.set(x, "graphemeSplit", js.Any.fromFunction1(value))
  }
}
