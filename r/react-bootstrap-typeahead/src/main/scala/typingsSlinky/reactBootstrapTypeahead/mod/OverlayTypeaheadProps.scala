package typingsSlinky.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadProps<any>, 'align' | 'dropup' | 'flip' | 'onMenuHide' | 'onMenuShow' | 'onMenuToggle'> */
@js.native
trait OverlayTypeaheadProps extends js.Object {
  var align: js.UndefOr[TypeaheadAlign] = js.native
  var dropup: js.UndefOr[Boolean] = js.native
  var flip: js.UndefOr[Boolean] = js.native
  var onMenuHide: js.UndefOr[js.Function0[Unit]] = js.native
  var onMenuShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onMenuToggle: js.UndefOr[js.Function1[/* show */ Boolean, Unit]] = js.native
}

object OverlayTypeaheadProps {
  @scala.inline
  def apply(): OverlayTypeaheadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayTypeaheadProps]
  }
  @scala.inline
  implicit class OverlayTypeaheadPropsOps[Self <: OverlayTypeaheadProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: TypeaheadAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withDropup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropup")(js.undefined)
        ret
    }
    @scala.inline
    def withFlip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMenuHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMenuShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuToggle(value: /* show */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMenuToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuToggle")(js.undefined)
        ret
    }
  }
  
}

