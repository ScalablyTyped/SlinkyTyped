package typingsSlinky.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonDomSettings extends js.Object {
  var button: js.UndefOr[ButtonDomButtomButton] = js.native
  var buttonContainer: js.UndefOr[ButtonDomButtomCommon] = js.native
  var buttonLiner: js.UndefOr[ButtonDomButtomCommon] = js.native
  var collection: js.UndefOr[ButtonDomButtomCommon] = js.native
  var container: js.UndefOr[ButtonDomButtomCommon] = js.native
}

object ButtonDomSettings {
  @scala.inline
  def apply(): ButtonDomSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonDomSettings]
  }
  @scala.inline
  implicit class ButtonDomSettingsOps[Self <: ButtonDomSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: ButtonDomButtomButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonContainer(value: ButtonDomButtomCommon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonLiner(value: ButtonDomButtomCommon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLiner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonLiner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLiner")(js.undefined)
        ret
    }
    @scala.inline
    def withCollection(value: ButtonDomButtomCommon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: ButtonDomButtomCommon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
  }
  
}

