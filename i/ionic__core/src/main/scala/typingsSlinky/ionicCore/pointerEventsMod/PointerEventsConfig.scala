package typingsSlinky.ionicCore.pointerEventsMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerEventsConfig extends js.Object {
  var capture: js.UndefOr[Boolean] = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var passive: js.UndefOr[Boolean] = js.native
  var pointerMove: js.UndefOr[js.Function1[/* ev */ js.Any, Unit]] = js.native
  var pointerUp: js.UndefOr[js.Function1[/* ev */ js.Any, Unit]] = js.native
  var zone: js.UndefOr[Boolean] = js.native
  def pointerDown(ev: js.Any): Boolean = js.native
}

object PointerEventsConfig {
  @scala.inline
  def apply(pointerDown: js.Any => Boolean): PointerEventsConfig = {
    val __obj = js.Dynamic.literal(pointerDown = js.Any.fromFunction1(pointerDown))
    __obj.asInstanceOf[PointerEventsConfig]
  }
  @scala.inline
  implicit class PointerEventsConfigOps[Self <: PointerEventsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointerDown(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
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
    def withPointerMove(value: /* ev */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointerMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerMove")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerUp(value: /* ev */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointerUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerUp")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

