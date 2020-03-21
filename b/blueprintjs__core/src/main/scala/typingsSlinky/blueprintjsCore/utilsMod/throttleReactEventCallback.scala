package typingsSlinky.blueprintjsCore.utilsMod

import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils", "throttleReactEventCallback")
@js.native
object throttleReactEventCallback extends js.Object {
  def apply(callback: js.Function2[/* event */ SyntheticEvent[Event_, _], /* repeated */ js.Any, _]): js.Function1[/* event2 */ SyntheticEvent[Event_, _], Unit] = js.native
  def apply(
    callback: js.Function2[/* event */ SyntheticEvent[Event_, _], /* repeated */ js.Any, _],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ SyntheticEvent[Event_, _], Unit] = js.native
}

