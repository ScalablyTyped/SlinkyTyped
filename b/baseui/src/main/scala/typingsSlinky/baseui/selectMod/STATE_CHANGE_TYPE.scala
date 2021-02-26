package typingsSlinky.baseui.selectMod

import typingsSlinky.baseui.baseuiStrings.clear
import typingsSlinky.baseui.baseuiStrings.remove
import typingsSlinky.baseui.baseuiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait STATE_CHANGE_TYPE extends StObject {
  
  var clear: typingsSlinky.baseui.baseuiStrings.clear = js.native
  
  var remove: typingsSlinky.baseui.baseuiStrings.remove = js.native
  
  var select: typingsSlinky.baseui.baseuiStrings.select = js.native
}
object STATE_CHANGE_TYPE {
  
  @JSImport("baseui/select", "STATE_CHANGE_TYPE")
  @js.native
  val ^ : STATE_CHANGE_TYPE = js.native
  
  @scala.inline
  implicit class STATE_CHANGE_TYPEMutableBuilder[Self <: STATE_CHANGE_TYPE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: clear): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: remove): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: select): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
