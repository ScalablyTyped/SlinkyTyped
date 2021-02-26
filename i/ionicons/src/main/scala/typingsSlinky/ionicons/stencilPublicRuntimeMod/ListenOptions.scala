package typingsSlinky.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenOptions extends StObject {
  
  /**
    * Event listener attached with `@Listen` does not "capture" by default,
    * When a event listener is set to "capture", means the event will be dispatched
    * during the "capture phase". Please see
    * https://www.quirksmode.org/js/events_order.html for further information.
    */
  var capture: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, Stencil uses several heuristics to determine if
    * it must attach a `passive` event listener or not.
    *
    * Using the `passive` option can be used to change the default behaviour.
    * Please see https://developers.google.com/web/updates/2016/06/passive-event-listeners for further information.
    */
  var passive: js.UndefOr[Boolean] = js.native
  
  /**
    * Handlers can also be registered for an event other than the host itself.
    * The `target` option can be used to change where the event listener is attached,
    * this is useful for listening to application-wide events.
    */
  var target: js.UndefOr[ListenTargetOptions] = js.native
}
object ListenOptions {
  
  @scala.inline
  def apply(): ListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenOptions]
  }
  
  @scala.inline
  implicit class ListenOptionsMutableBuilder[Self <: ListenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    
    @scala.inline
    def setTarget(value: ListenTargetOptions): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
