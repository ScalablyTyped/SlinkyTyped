package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInputTextInputEventData extends StObject {
  
  var previousText: String = js.native
  
  var range: End = js.native
  
  var text: String = js.native
}
object TextInputTextInputEventData {
  
  @scala.inline
  def apply(previousText: String, range: End, text: String): TextInputTextInputEventData = {
    val __obj = js.Dynamic.literal(previousText = previousText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputTextInputEventData]
  }
  
  @scala.inline
  implicit class TextInputTextInputEventDataMutableBuilder[Self <: TextInputTextInputEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviousText(value: String): Self = StObject.set(x, "previousText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: End): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
