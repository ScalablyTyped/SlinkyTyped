package typingsSlinky.blueprintjsCore.domUtilsMod

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/common/utils/domUtils", "throttleReactEventCallback")
@js.native
object throttleReactEventCallback extends js.Object {
  
  def apply(callback: js.Function2[/* event */ SyntheticEvent[Event, _], /* repeated */ js.Any, _]): js.Function1[/* event2 */ SyntheticEvent[Event, _], Unit] = js.native
  def apply(
    callback: js.Function2[/* event */ SyntheticEvent[Event, _], /* repeated */ js.Any, _],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ SyntheticEvent[Event, _], Unit] = js.native
}
