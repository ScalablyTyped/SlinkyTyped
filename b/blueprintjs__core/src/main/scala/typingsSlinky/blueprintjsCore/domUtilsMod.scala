package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/domUtils", "elementIsOrContains")
  @js.native
  def elementIsOrContains(element: HTMLElement, testElement: HTMLElement): Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/domUtils", "throttle")
  @js.native
  def throttle[T /* <: js.Function */](method: T): T = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/domUtils", "throttleEvent")
  @js.native
  def throttleEvent(target: EventTarget, eventName: String, newEventName: String): js.Function1[/* event */ Event, Unit] = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/domUtils", "throttleReactEventCallback")
  @js.native
  def throttleReactEventCallback[E /* <: SyntheticEvent[Event, Element] */](callback: js.Function2[/* event */ E, /* repeated */ js.Any, _]): js.Function1[/* event2 */ E, Unit] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/domUtils", "throttleReactEventCallback")
  @js.native
  def throttleReactEventCallback[E /* <: SyntheticEvent[Event, Element] */](
    callback: js.Function2[/* event */ E, /* repeated */ js.Any, _],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ E, Unit] = js.native
  
  @js.native
  trait IThrottledReactEventOptions extends StObject {
    
    var preventDefault: js.UndefOr[Boolean] = js.native
  }
  object IThrottledReactEventOptions {
    
    @scala.inline
    def apply(): IThrottledReactEventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThrottledReactEventOptions]
    }
    
    @scala.inline
    implicit class IThrottledReactEventOptionsMutableBuilder[Self <: IThrottledReactEventOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    }
  }
}
