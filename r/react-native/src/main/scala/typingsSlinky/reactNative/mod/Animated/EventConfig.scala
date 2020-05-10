package typingsSlinky.reactNative.mod.Animated

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NodeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventConfig[T] extends js.Object {
  var listener: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, T], Unit]] = js.native
  var useNativeDriver: Boolean = js.native
}

object EventConfig {
  @scala.inline
  def apply[T](useNativeDriver: Boolean): EventConfig[T] = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventConfig[T]]
  }
  @scala.inline
  implicit class EventConfigOps[Self[t] <: EventConfig[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withUseNativeDriver(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListener(value: SyntheticEvent[NodeHandle, T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutListener: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listener")(js.undefined)
        ret
    }
  }
  
}

