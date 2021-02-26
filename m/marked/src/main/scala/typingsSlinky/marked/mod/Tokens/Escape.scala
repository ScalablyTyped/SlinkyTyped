package typingsSlinky.marked.mod.Tokens

import typingsSlinky.marked.markedStrings.escape
import typingsSlinky.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Escape extends Token {
  
  var raw: String = js.native
  
  var text: String = js.native
  
  var `type`: escape = js.native
}
object Escape {
  
  @scala.inline
  def apply(raw: String, text: String, `type`: escape): Escape = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Escape]
  }
  
  @scala.inline
  implicit class EscapeMutableBuilder[Self <: Escape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: escape): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
