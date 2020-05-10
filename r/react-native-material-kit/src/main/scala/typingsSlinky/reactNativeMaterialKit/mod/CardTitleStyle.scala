package typingsSlinky.reactNativeMaterialKit.mod

import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`100`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`200`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`300`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`400`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`500`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`600`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`700`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`800`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`900`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.absolute
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.bold
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.normal
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.relative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardTitleStyle extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontWeight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.native
  var left: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Double] = js.native
  var position: js.UndefOr[absolute | relative] = js.native
  var top: js.UndefOr[Double] = js.native
}

object CardTitleStyle {
  @scala.inline
  def apply(): CardTitleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTitleStyle]
  }
  @scala.inline
  implicit class CardTitleStyleOps[Self <: CardTitleStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: absolute | relative): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

