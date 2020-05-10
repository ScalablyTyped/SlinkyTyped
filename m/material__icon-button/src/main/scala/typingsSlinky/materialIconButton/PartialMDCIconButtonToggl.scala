package typingsSlinky.materialIconButton

import typingsSlinky.materialIconButton.typesMod.MDCIconButtonToggleEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/icon-button.@material/icon-button/adapter.MDCIconButtonToggleAdapter> */
@js.native
trait PartialMDCIconButtonToggl extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  var notifyChange: js.UndefOr[js.Function1[/* evtData */ MDCIconButtonToggleEventDetail, Unit]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var setAttr: js.UndefOr[js.Function2[/* attrName */ String, /* attrValue */ String, Unit]] = js.native
}

object PartialMDCIconButtonToggl {
  @scala.inline
  def apply(): PartialMDCIconButtonToggl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCIconButtonToggl]
  }
  @scala.inline
  implicit class PartialMDCIconButtonTogglOps[Self <: PartialMDCIconButtonToggl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: /* className */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHasClass(value: /* className */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyChange(value: /* evtData */ MDCIconButtonToggleEventDetail => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotifyChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClass(value: /* className */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttr(value: (/* attrName */ String, /* attrValue */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttr")(js.undefined)
        ret
    }
  }
  
}

