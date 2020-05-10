package typingsSlinky.reactNativeMaterialKit.mod.MKPropTypes

import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`100`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`200`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`300`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`400`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`500`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`600`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`700`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`800`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.`900`
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.bold
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.italic
import typingsSlinky.reactNativeMaterialKit.reactNativeMaterialKitStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait font extends js.Object {
  var color: js.UndefOr[String] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontStyle: js.UndefOr[normal | italic] = js.native
  var fontWeight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.native
}

object font {
  @scala.inline
  def apply(): font = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[font]
  }
  @scala.inline
  implicit class fontOps[Self <: font] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
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
    def withFontStyle(value: normal | italic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
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
  }
  
}

