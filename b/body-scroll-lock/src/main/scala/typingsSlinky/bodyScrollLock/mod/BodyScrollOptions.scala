package typingsSlinky.bodyScrollLock.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyScrollOptions extends js.Object {
  var allowTouchMove: js.UndefOr[js.Function1[/* el */ HTMLElement | Element, Unit]] = js.native
  var reserveScrollBarGap: js.UndefOr[Boolean] = js.native
}

object BodyScrollOptions {
  @scala.inline
  def apply(): BodyScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyScrollOptions]
  }
  @scala.inline
  implicit class BodyScrollOptionsOps[Self <: BodyScrollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowTouchMove(value: /* el */ HTMLElement | Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTouchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAllowTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withReserveScrollBarGap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserveScrollBarGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReserveScrollBarGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserveScrollBarGap")(js.undefined)
        ret
    }
  }
  
}

