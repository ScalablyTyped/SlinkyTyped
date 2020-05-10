package typingsSlinky.rcMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonManualRef extends js.Object {
  var manualRef: js.Function0[Unit] = js.native
  var onMouseEnter: js.Function0[Unit] = js.native
  var onMouseLeave: js.Function0[Unit] = js.native
  var onSelect: js.Function0[Unit] = js.native
}

object AnonManualRef {
  @scala.inline
  def apply(manualRef: () => Unit, onMouseEnter: () => Unit, onMouseLeave: () => Unit, onSelect: () => Unit): AnonManualRef = {
    val __obj = js.Dynamic.literal(manualRef = js.Any.fromFunction0(manualRef), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onSelect = js.Any.fromFunction0(onSelect))
    __obj.asInstanceOf[AnonManualRef]
  }
  @scala.inline
  implicit class AnonManualRefOps[Self <: AnonManualRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManualRef(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

