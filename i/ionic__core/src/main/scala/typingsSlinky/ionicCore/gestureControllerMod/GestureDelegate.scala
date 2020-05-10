package typingsSlinky.ionicCore.gestureControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureDelegate extends js.Object {
  var ctrl: js.UndefOr[js.Any] = js.native
  var disableScroll: js.Any = js.native
  var id: js.Any = js.native
  var name: js.Any = js.native
  var priority: js.Any = js.native
  def canStart(): Boolean = js.native
  def capture(): Boolean = js.native
  def destroy(): Unit = js.native
  def release(): Unit = js.native
  def start(): Boolean = js.native
}

object GestureDelegate {
  @scala.inline
  def apply(
    canStart: () => Boolean,
    capture: () => Boolean,
    destroy: () => Unit,
    disableScroll: js.Any,
    id: js.Any,
    name: js.Any,
    priority: js.Any,
    release: () => Unit,
    start: () => Boolean
  ): GestureDelegate = {
    val __obj = js.Dynamic.literal(canStart = js.Any.fromFunction0(canStart), capture = js.Any.fromFunction0(capture), destroy = js.Any.fromFunction0(destroy), disableScroll = disableScroll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], release = js.Any.fromFunction0(release), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[GestureDelegate]
  }
  @scala.inline
  implicit class GestureDelegateOps[Self <: GestureDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanStart(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCapture(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableScroll(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCtrl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrl")(js.undefined)
        ret
    }
  }
  
}

