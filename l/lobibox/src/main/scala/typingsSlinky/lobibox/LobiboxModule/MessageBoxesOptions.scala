package typingsSlinky.lobibox.LobiboxModule

import typingsSlinky.lobibox.AnonCancel
import typingsSlinky.lobibox.AnonConfirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageBoxesOptions extends MessageBoxesDefault {
  var bodyClass: js.UndefOr[String] = js.native
  var buttons: js.UndefOr[AnonCancel | js.Any] = js.native
  @JSName("buttonsAlign")
  var buttonsAlign_MessageBoxesOptions: js.UndefOr[js.Any] = js.native
  var callback: js.UndefOr[
    js.Function3[/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var modalClasses: js.UndefOr[AnonConfirm] = js.native
}

object MessageBoxesOptions {
  @scala.inline
  def apply(): MessageBoxesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBoxesOptions]
  }
  @scala.inline
  implicit class MessageBoxesOptionsOps[Self <: MessageBoxesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClass")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: AnonCancel | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonsAlign(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonsAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonsAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonsAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: (/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withModalClasses(value: AnonConfirm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalClasses")(js.undefined)
        ret
    }
  }
  
}

