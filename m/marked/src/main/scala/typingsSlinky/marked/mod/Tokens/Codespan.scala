package typingsSlinky.marked.mod.Tokens

import typingsSlinky.marked.markedStrings.codespan
import typingsSlinky.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Codespan extends Token {
  
  var raw: String = js.native
  
  var text: String = js.native
  
  var `type`: codespan = js.native
}
object Codespan {
  
  @scala.inline
  def apply(raw: String, text: String, `type`: codespan): Codespan = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codespan]
  }
  
  @scala.inline
  implicit class CodespanMutableBuilder[Self <: Codespan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: codespan): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
