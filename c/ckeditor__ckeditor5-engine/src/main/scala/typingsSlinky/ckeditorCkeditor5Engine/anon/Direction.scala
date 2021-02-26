package typingsSlinky.ckeditorCkeditor5Engine.anon

import typingsSlinky.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typingsSlinky.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.character
import typingsSlinky.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.codePoint
import typingsSlinky.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typingsSlinky.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direction extends StObject {
  
  var direction: js.UndefOr[forward | backward] = js.native
  
  var unit: js.UndefOr[character | codePoint | word] = js.native
}
object Direction {
  
  @scala.inline
  def apply(): Direction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: forward | backward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setUnit(value: character | codePoint | word): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
