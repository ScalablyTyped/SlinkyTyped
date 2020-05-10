package typingsSlinky.materialUiCore.createTypographyMod

import typingsSlinky.csstype.mod.FontFamilyProperty
import typingsSlinky.csstype.mod.FontWeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<{  fontFamily  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontFamily'],   fontSize  :number,   fontWeightLight  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightRegular  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightMedium  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight']}> */
@js.native
trait FontStyle extends js.Object {
  var fontFamily: FontFamilyProperty = js.native
  var fontSize: Double = js.native
  var fontWeightLight: FontWeightProperty = js.native
  var fontWeightMedium: FontWeightProperty = js.native
  var fontWeightRegular: FontWeightProperty = js.native
}

object FontStyle {
  @scala.inline
  def apply(
    fontFamily: FontFamilyProperty,
    fontSize: Double,
    fontWeightLight: FontWeightProperty,
    fontWeightMedium: FontWeightProperty,
    fontWeightRegular: FontWeightProperty
  ): FontStyle = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyle]
  }
  @scala.inline
  implicit class FontStyleOps[Self <: FontStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontFamily(value: FontFamilyProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeightLight(value: FontWeightProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeightMedium(value: FontWeightProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightMedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeightRegular(value: FontWeightProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightRegular")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

