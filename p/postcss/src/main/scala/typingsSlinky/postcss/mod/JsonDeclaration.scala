package typingsSlinky.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonDeclaration extends JsonNode {
  
  /**
    * True if the declaration has an !important annotation.
    */
  var important: js.UndefOr[Boolean] = js.native
}
object JsonDeclaration {
  
  @scala.inline
  def apply(): JsonDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonDeclaration]
  }
  
  @scala.inline
  implicit class JsonDeclarationMutableBuilder[Self <: JsonDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
  }
}
