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
  def apply[T](useNativeDriver: Boolean): EventConfig[T] = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventConfig[T]]
  }
  @scala.inline
  implicit class EventConfigOps[Self <: EventConfig[_], T] (val x: Self with EventConfig[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def setListener(value: SyntheticEvent[NodeHandle, T] => Unit): Self = this.set("listener", js.Any.fromFunction1(value))
    @scala.inline
    def deleteListener: Self = this.set("listener", js.undefined)
  }
  
}

