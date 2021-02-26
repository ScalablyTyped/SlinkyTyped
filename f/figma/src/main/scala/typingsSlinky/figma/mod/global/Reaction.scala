package typingsSlinky.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reaction extends StObject {
  
  var action: Action = js.native
  
  var trigger: Trigger = js.native
}
object Reaction {
  
  @scala.inline
  def apply(action: Action, trigger: Trigger): Reaction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reaction]
  }
  
  @scala.inline
  implicit class ReactionMutableBuilder[Self <: Reaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
