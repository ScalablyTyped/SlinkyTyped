package typingsSlinky.reactNative.mod.Animated

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NodeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventConfig[T] extends js.Object {
  var listener: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, T], Unit]] = js.undefined
  var useNativeDriver: Boolean
}

object EventConfig {
  @scala.inline
  def apply[T](useNativeDriver: Boolean, listener: SyntheticEvent[NodeHandle, T] => Unit = null): EventConfig[T] = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    if (listener != null) __obj.updateDynamic("listener")(js.Any.fromFunction1(listener))
    __obj.asInstanceOf[EventConfig[T]]
  }
}

