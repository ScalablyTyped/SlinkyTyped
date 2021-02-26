package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.EASE_IN
import typingsSlinky.figma.figmaStrings.EASE_IN_AND_OUT
import typingsSlinky.figma.figmaStrings.EASE_OUT
import typingsSlinky.figma.figmaStrings.LINEAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Easing extends StObject {
  
  val `type`: EASE_IN | EASE_OUT | EASE_IN_AND_OUT | LINEAR = js.native
}
object Easing {
  
  @scala.inline
  def apply(`type`: EASE_IN | EASE_OUT | EASE_IN_AND_OUT | LINEAR): Easing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
  
  @scala.inline
  implicit class EasingMutableBuilder[Self <: Easing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EASE_IN | EASE_OUT | EASE_IN_AND_OUT | LINEAR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
