package typingsSlinky.fullcalendar.inputTypesMod

import typingsSlinky.fullcalendar.jqueryHooksMod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomButtonInput extends js.Object {
  var bootstrapFontAwesome: js.UndefOr[String] = js.native
  var bootstrapGlyphicon: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var text: String = js.native
  var themeIcon: js.UndefOr[String] = js.native
  def click(element: JQuery): Unit = js.native
}

object CustomButtonInput {
  @scala.inline
  def apply(click: JQuery => Unit, text: String): CustomButtonInput = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomButtonInput]
  }
  @scala.inline
  implicit class CustomButtonInputOps[Self <: CustomButtonInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootstrapFontAwesome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapFontAwesome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapFontAwesome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapFontAwesome")(js.undefined)
        ret
    }
    @scala.inline
    def withBootstrapGlyphicon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapGlyphicon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapGlyphicon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapGlyphicon")(js.undefined)
        ret
    }
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
    def withThemeIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeIcon")(js.undefined)
        ret
    }
  }
  
}

