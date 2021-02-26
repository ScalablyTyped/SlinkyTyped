package typingsSlinky.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends StObject {
  
  /**
    * When entering this state, perform these actions if the condition is TRUE.
    */
  var onEnter: js.UndefOr[OnEnterLifecycle] = js.native
  
  /**
    * When exiting this state, perform these actions if the specified condition is TRUE.
    */
  var onExit: js.UndefOr[OnExitLifecycle] = js.native
  
  /**
    * When an input is received and the condition is TRUE, perform the specified actions.
    */
  var onInput: js.UndefOr[OnInputLifecycle] = js.native
  
  /**
    * The name of the state.
    */
  var stateName: StateName = js.native
}
object State {
  
  @scala.inline
  def apply(stateName: StateName): State = {
    val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnEnter(value: OnEnterLifecycle): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    @scala.inline
    def setOnExit(value: OnExitLifecycle): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    @scala.inline
    def setOnInput(value: OnInputLifecycle): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    @scala.inline
    def setStateName(value: StateName): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
  }
}
