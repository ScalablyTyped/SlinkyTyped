package typingsSlinky.materializeCss.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TapTargetOptions> */
@js.native
trait PartialTapTargetOptions extends js.Object {
  var onClose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* origin */ Element, Unit]] = js.native
  var onOpen: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* origin */ Element, Unit]] = js.native
}

object PartialTapTargetOptions {
  @scala.inline
  def apply(): PartialTapTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTapTargetOptions]
  }
  @scala.inline
  implicit class PartialTapTargetOptionsOps[Self <: PartialTapTargetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClose(value: js.ThisFunction1[PartialTapTargetOptions, /* origin */ Element, Unit]): Self = {
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
    def withOnOpen(value: js.ThisFunction1[PartialTapTargetOptions, /* origin */ Element, Unit]): Self = {
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

