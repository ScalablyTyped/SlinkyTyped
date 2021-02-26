package typingsSlinky.reactOnsenui.mod

import typingsSlinky.reactOnsenui.reactOnsenuiStrings.action
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.initial
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.preaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullHookChangeEvent extends StObject {
  
  var state: initial | preaction | action = js.native
}
object PullHookChangeEvent {
  
  @scala.inline
  def apply(state: initial | preaction | action): PullHookChangeEvent = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullHookChangeEvent]
  }
  
  @scala.inline
  implicit class PullHookChangeEventMutableBuilder[Self <: PullHookChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: initial | preaction | action): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
