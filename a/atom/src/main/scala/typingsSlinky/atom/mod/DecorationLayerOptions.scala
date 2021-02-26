package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.`line-number`
import typingsSlinky.atom.atomStrings.block
import typingsSlinky.atom.atomStrings.cursor_
import typingsSlinky.atom.atomStrings.highlight
import typingsSlinky.atom.atomStrings.line
import typingsSlinky.atom.atomStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecorationLayerOptions extends SharedDecorationOptions {
  
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[line | `line-number` | text | highlight | block | cursor_] = js.native
}
object DecorationLayerOptions {
  
  @scala.inline
  def apply(): DecorationLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationLayerOptions]
  }
  
  @scala.inline
  implicit class DecorationLayerOptionsMutableBuilder[Self <: DecorationLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: line | `line-number` | text | highlight | block | cursor_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
