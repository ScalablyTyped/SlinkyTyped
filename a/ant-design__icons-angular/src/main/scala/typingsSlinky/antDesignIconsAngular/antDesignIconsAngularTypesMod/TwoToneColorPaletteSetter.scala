package typingsSlinky.antDesignIconsAngular.antDesignIconsAngularTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwoToneColorPaletteSetter extends js.Object {
  var primaryColor: String = js.native
  var secondaryColor: js.UndefOr[String] = js.native
}

object TwoToneColorPaletteSetter {
  @scala.inline
  def apply(primaryColor: String): TwoToneColorPaletteSetter = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoToneColorPaletteSetter]
  }
  @scala.inline
  implicit class TwoToneColorPaletteSetterOps[Self <: TwoToneColorPaletteSetter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryColor")(js.undefined)
        ret
    }
  }
  
}

