package typingsSlinky.baseui.datepickerMod

import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ORIENTATION extends StObject {
  
  var horizontal: typingsSlinky.baseui.baseuiStrings.horizontal = js.native
  
  var vertical: typingsSlinky.baseui.baseuiStrings.vertical = js.native
}
object ORIENTATION {
  
  @JSImport("baseui/datepicker", "ORIENTATION")
  @js.native
  val ^ : ORIENTATION = js.native
  
  @scala.inline
  implicit class ORIENTATIONMutableBuilder[Self <: ORIENTATION] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
