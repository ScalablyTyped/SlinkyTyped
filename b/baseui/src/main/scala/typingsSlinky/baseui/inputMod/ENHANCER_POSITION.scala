package typingsSlinky.baseui.inputMod

import typingsSlinky.baseui.baseuiStrings.end
import typingsSlinky.baseui.baseuiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ENHANCER_POSITION extends StObject {
  
  var end: typingsSlinky.baseui.baseuiStrings.end = js.native
  
  var start: typingsSlinky.baseui.baseuiStrings.start = js.native
}
object ENHANCER_POSITION {
  
  @JSImport("baseui/input", "ENHANCER_POSITION")
  @js.native
  val ^ : ENHANCER_POSITION = js.native
  
  @scala.inline
  implicit class ENHANCER_POSITIONMutableBuilder[Self <: ENHANCER_POSITION] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: end): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: start): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
