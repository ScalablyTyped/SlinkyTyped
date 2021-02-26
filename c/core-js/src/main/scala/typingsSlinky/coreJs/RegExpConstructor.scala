package typingsSlinky.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegExpConstructor extends StObject {
  
  def escape(str: java.lang.String): java.lang.String = js.native
}
object RegExpConstructor {
  
  @scala.inline
  def apply(escape: java.lang.String => java.lang.String): RegExpConstructor = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape))
    __obj.asInstanceOf[RegExpConstructor]
  }
  
  @scala.inline
  implicit class RegExpConstructorMutableBuilder[Self <: RegExpConstructor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEscape(value: java.lang.String => java.lang.String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
  }
}
