package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.manifest.ImageDataOrExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Additionalbackgrounds extends js.Object {
  var additional_backgrounds: js.UndefOr[js.Array[ImageDataOrExtensionURL]] = js.native
  /**
    * @deprecated Unsupported images property, use 'theme.images.theme_frame', this alias is ignored in
    *     Firefox >= 70.
    */
  var headerURL: js.UndefOr[ImageDataOrExtensionURL] = js.native
  var theme_frame: js.UndefOr[ImageDataOrExtensionURL] = js.native
}

object Additionalbackgrounds {
  @scala.inline
  def apply(): Additionalbackgrounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Additionalbackgrounds]
  }
  @scala.inline
  implicit class AdditionalbackgroundsOps[Self <: Additionalbackgrounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditional_backgrounds(value: js.Array[ImageDataOrExtensionURL]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_backgrounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditional_backgrounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_backgrounds")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderURL(value: ImageDataOrExtensionURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerURL")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme_frame(value: ImageDataOrExtensionURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme_frame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_frame")(js.undefined)
        ret
    }
  }
  
}

