package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDashboardEvents extends IEvents {
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
}
object IDashboardEvents {
  
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IDashboardEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IDashboardEvents]
  }
  
  @scala.inline
  implicit class IDashboardEventsMutableBuilder[Self <: IDashboardEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnStarted(value: () => Unit): Self = StObject.set(x, "OnStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    @scala.inline
    def setOnStop(value: () => Unit): Self = StObject.set(x, "OnStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
  }
}
