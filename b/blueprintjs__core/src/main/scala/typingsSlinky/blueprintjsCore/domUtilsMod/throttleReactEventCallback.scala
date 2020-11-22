package typingsSlinky.blueprintjsCore.domUtilsMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/common/utils/domUtils", "throttleReactEventCallback")
@js.native
object throttleReactEventCallback extends js.Object {
  
  def apply[E /* <: SyntheticEvent[Event, Element] */](callback: js.Function2[/* event */ E, /* repeated */ js.Any, _]): js.Function1[/* event2 */ E, Unit] = js.native
  def apply[E /* <: SyntheticEvent[Event, Element] */](
    callback: js.Function2[/* event */ E, /* repeated */ js.Any, _],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ E, Unit] = js.native
}
