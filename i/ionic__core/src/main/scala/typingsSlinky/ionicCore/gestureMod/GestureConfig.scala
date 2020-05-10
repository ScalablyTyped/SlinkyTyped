package typingsSlinky.ionicCore.gestureMod

import org.scalajs.dom.raw.Node
import typingsSlinky.ionicCore.ionicCoreStrings.x
import typingsSlinky.ionicCore.ionicCoreStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureConfig extends js.Object {
  var canStart: js.UndefOr[GestureCallback] = js.native
  var direction: js.UndefOr[x | y] = js.native
  var disableScroll: js.UndefOr[Boolean] = js.native
  var el: Node = js.native
  var gestureName: String = js.native
  var gesturePriority: js.UndefOr[Double] = js.native
  var maxAngle: js.UndefOr[Double] = js.native
  var notCaptured: js.UndefOr[GestureCallback] = js.native
  var onEnd: js.UndefOr[GestureCallback] = js.native
  var onMove: js.UndefOr[GestureCallback] = js.native
  var onStart: js.UndefOr[GestureCallback] = js.native
  var onWillStart: js.UndefOr[js.Function1[/* _ */ GestureDetail, js.Promise[Unit]]] = js.native
  var passive: js.UndefOr[Boolean] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object GestureConfig {
  @scala.inline
  def apply(el: Node, gestureName: String): GestureConfig = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], gestureName = gestureName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureConfig]
  }
  @scala.inline
  implicit class GestureConfigOps[Self <: GestureConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEl(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGestureName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanStart(value: /* detail */ GestureDetail => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withGesturePriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesturePriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGesturePriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesturePriority")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withNotCaptured(value: /* detail */ GestureDetail => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notCaptured")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotCaptured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notCaptured")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: /* detail */ GestureDetail => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMove(value: /* detail */ GestureDetail => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: /* detail */ GestureDetail => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWillStart(value: /* _ */ GestureDetail => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWillStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPassive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

