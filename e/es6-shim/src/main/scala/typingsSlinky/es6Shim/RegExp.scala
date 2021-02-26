package typingsSlinky.es6Shim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegExp extends StObject {
  
  /**
    * Returns a string indicating the flags of the regular expression in question. This field is read-only.
    * The characters in this string are sequenced and concatenated in the following order:
    *
    *    - "g" for global
    *    - "i" for ignoreCase
    *    - "m" for multiline
    *    - "u" for unicode
    *    - "y" for sticky
    *
    * If no flags are set, the value is the empty string.
    */
  var flags: java.lang.String = js.native
}
object RegExp {
  
  @scala.inline
  def apply(flags: java.lang.String): RegExp = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExp]
  }
  
  @scala.inline
  implicit class RegExpMutableBuilder[Self <: RegExp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: java.lang.String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
  }
}
