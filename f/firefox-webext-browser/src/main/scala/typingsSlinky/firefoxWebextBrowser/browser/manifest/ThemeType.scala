package typingsSlinky.firefoxWebextBrowser.browser.manifest

import typingsSlinky.firefoxWebextBrowser.anon.Accentcolor
import typingsSlinky.firefoxWebextBrowser.anon.Additionalbackgrounds
import typingsSlinky.firefoxWebextBrowser.anon.Additionalbackgroundsalignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeType extends js.Object {
  var colors: js.UndefOr[Accentcolor] = js.native
  var images: js.UndefOr[Additionalbackgrounds] = js.native
  var properties: js.UndefOr[Additionalbackgroundsalignment] = js.native
}

object ThemeType {
  @scala.inline
  def apply(): ThemeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeType]
  }
  @scala.inline
  implicit class ThemeTypeOps[Self <: ThemeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: Accentcolor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: Additionalbackgrounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Additionalbackgroundsalignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

