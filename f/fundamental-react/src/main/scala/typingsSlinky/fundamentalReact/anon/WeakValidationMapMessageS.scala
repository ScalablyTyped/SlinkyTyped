package typingsSlinky.fundamentalReact.anon

import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/MessageStrip/MessageStrip.MessageStripProps> */
@js.native
trait WeakValidationMapMessageS extends js.Object {
  var buttonProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var dismissible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var link: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var linkProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var linkText: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var localizedText: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var noGlyph: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var onCloseClicked: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.native
  var `type`: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
}

object WeakValidationMapMessageS {
  @scala.inline
  def apply(): WeakValidationMapMessageS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapMessageS]
  }
  @scala.inline
  implicit class WeakValidationMapMessageSOps[Self <: WeakValidationMapMessageS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonProps(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissible(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissible")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkProps(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkText(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizedText(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedText")(js.undefined)
        ret
    }
    @scala.inline
    def withNoGlyph(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGlyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoGlyph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGlyph")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseClicked(value: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseClicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCloseClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

