package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonIcon
import typingsSlinky.devextreme.AnonValidationGroup
import typingsSlinky.devextreme.devextremeStrings.back
import typingsSlinky.devextreme.devextremeStrings.contained
import typingsSlinky.devextreme.devextremeStrings.danger
import typingsSlinky.devextreme.devextremeStrings.default_
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.devextremeStrings.outlined
import typingsSlinky.devextreme.devextremeStrings.success
import typingsSlinky.devextreme.devextremeStrings.text
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxButtonOptions extends WidgetOptions[dxButton] {
  /** Specifies the icon to be displayed on the button. */
  var icon: js.UndefOr[String] = js.native
  /** A function that is executed when the Button is clicked or tapped. */
  var onClick: js.UndefOr[js.Function1[/* e */ AnonValidationGroup, _]] = js.native
  /** Specifies how the button is styled. */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.native
  /** Specifies a custom template for the Button widget. */
  var template: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** The text displayed on the button. */
  var text: js.UndefOr[String] = js.native
  /** Specifies the button type. */
  var `type`: js.UndefOr[back | danger | default_ | normal | success] = js.native
  /** Specifies whether the button submits an HTML form. */
  var useSubmitBehavior: js.UndefOr[Boolean] = js.native
  /** Specifies the name of the validation group to be accessed in the click event handler. */
  var validationGroup: js.UndefOr[String] = js.native
}

object dxButtonOptions {
  @scala.inline
  def apply(): dxButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxButtonOptions]
  }
  @scala.inline
  implicit class dxButtonOptionsOps[Self <: dxButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* e */ AnonValidationGroup => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withStylingMode(value: text | outlined | contained): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFunction2(value: (/* buttonData */ AnonIcon, /* contentElement */ dxElement) => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: back | danger | default_ | normal | success): Self = {
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
    @scala.inline
    def withUseSubmitBehavior(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSubmitBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSubmitBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSubmitBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationGroup")(js.undefined)
        ret
    }
  }
  
}

