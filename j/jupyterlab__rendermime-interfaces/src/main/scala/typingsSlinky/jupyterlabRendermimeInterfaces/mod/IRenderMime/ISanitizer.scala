package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that handles html sanitization.
  */
@js.native
trait ISanitizer extends StObject {
  
  /**
    * Sanitize an HTML string.
    */
  def sanitize(dirty: String): String = js.native
}
object ISanitizer {
  
  @scala.inline
  def apply(sanitize: String => String): ISanitizer = {
    val __obj = js.Dynamic.literal(sanitize = js.Any.fromFunction1(sanitize))
    __obj.asInstanceOf[ISanitizer]
  }
  
  @scala.inline
  implicit class ISanitizerMutableBuilder[Self <: ISanitizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSanitize(value: String => String): Self = StObject.set(x, "sanitize", js.Any.fromFunction1(value))
  }
}
