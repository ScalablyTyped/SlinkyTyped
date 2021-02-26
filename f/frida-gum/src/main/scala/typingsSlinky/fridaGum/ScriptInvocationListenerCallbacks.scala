package typingsSlinky.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptInvocationListenerCallbacks extends InvocationListenerCallbacks {
  
  /**
    * Called synchronously when a thread is about to enter the target function.
    */
  var onEnter: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit]
  ] = js.native
  
  /**
    * Called synchronously when a thread is about to leave the target function.
    */
  var onLeave: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, Unit]
  ] = js.native
}
object ScriptInvocationListenerCallbacks {
  
  @scala.inline
  def apply(): ScriptInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptInvocationListenerCallbacks]
  }
  
  @scala.inline
  implicit class ScriptInvocationListenerCallbacksMutableBuilder[Self <: ScriptInvocationListenerCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnEnter(value: js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit]): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    @scala.inline
    def setOnLeave(value: js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, Unit]): Self = StObject.set(x, "onLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
  }
}
