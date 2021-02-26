package typingsSlinky.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text extends StObject {
  
  var bidi: TextBidi = js.native
  
  var format: TextFormat = js.native
}
object Text {
  
  @scala.inline
  def apply(bidi: TextBidi, format: TextFormat): Text = {
    val __obj = js.Dynamic.literal(bidi = bidi.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidi(value: TextBidi): Self = StObject.set(x, "bidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: TextFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
