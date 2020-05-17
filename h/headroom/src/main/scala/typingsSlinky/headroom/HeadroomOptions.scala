package typingsSlinky.headroom

import org.scalajs.dom.raw.Element
import typingsSlinky.headroom.anon.Initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadroomOptions extends js.Object {
  var classes: js.UndefOr[Initial] = js.native
  var offset: js.UndefOr[Double] = js.native
  var onBottom: js.UndefOr[js.Function0[Unit]] = js.native
  var onNotBottom: js.UndefOr[js.Function0[Unit]] = js.native
  var onNotTop: js.UndefOr[js.Function0[Unit]] = js.native
  var onPin: js.UndefOr[js.Function0[Unit]] = js.native
  var onTop: js.UndefOr[js.Function0[Unit]] = js.native
  var onUnpin: js.UndefOr[js.Function0[Unit]] = js.native
  var scroller: js.UndefOr[Element] = js.native
  var tolerance: js.UndefOr[js.Any] = js.native
}

object HeadroomOptions {
  @scala.inline
  def apply(): HeadroomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadroomOptions]
  }
  @scala.inline
  implicit class HeadroomOptionsOps[Self <: HeadroomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClasses(value: Initial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBottom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNotBottom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnNotBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNotTop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotTop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnNotTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnpin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnpin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnpin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnpin")(js.undefined)
        ret
    }
    @scala.inline
    def withScroller(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroller")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(js.undefined)
        ret
    }
  }
  
}

