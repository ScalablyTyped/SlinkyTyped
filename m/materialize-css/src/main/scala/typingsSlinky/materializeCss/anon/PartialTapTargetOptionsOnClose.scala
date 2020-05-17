package typingsSlinky.materializeCss.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.TapTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TapTargetOptions> */
@js.native
trait PartialTapTargetOptionsOnClose extends js.Object {
  var onClose: js.UndefOr[js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]] = js.native
  var onOpen: js.UndefOr[js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]] = js.native
}

object PartialTapTargetOptionsOnClose {
  @scala.inline
  def apply(): PartialTapTargetOptionsOnClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTapTargetOptionsOnClose]
  }
  @scala.inline
  implicit class PartialTapTargetOptionsOnCloseOps[Self <: PartialTapTargetOptionsOnClose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClose(value: js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
  }
  
}

