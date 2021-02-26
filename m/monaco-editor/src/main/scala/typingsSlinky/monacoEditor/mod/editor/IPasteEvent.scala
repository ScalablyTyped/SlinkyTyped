package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPasteEvent extends StObject {
  
  val mode: String | Null = js.native
  
  val range: Range = js.native
}
object IPasteEvent {
  
  @scala.inline
  def apply(range: Range): IPasteEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPasteEvent]
  }
  
  @scala.inline
  implicit class IPasteEventMutableBuilder[Self <: IPasteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeNull: Self = StObject.set(x, "mode", null)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
