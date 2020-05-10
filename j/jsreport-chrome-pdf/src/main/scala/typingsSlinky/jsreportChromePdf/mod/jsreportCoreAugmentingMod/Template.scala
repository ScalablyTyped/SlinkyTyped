package typingsSlinky.jsreportChromePdf.mod.jsreportCoreAugmentingMod

import typingsSlinky.jsreportChromePdf.PartialChrome
import typingsSlinky.jsreportChromePdf.PartialChromeImage
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.`chrome-image`
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.`chrome-pdf`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  var chrome: js.UndefOr[PartialChrome] = js.native
  var chromeImage: js.UndefOr[PartialChromeImage] = js.native
  var recipe: `chrome-pdf` | `chrome-image` | String = js.native
}

object Template {
  @scala.inline
  def apply(recipe: `chrome-pdf` | `chrome-image` | String): Template = {
    val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipe(value: `chrome-pdf` | `chrome-image` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChrome(value: PartialChrome): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(js.undefined)
        ret
    }
    @scala.inline
    def withChromeImage(value: PartialChromeImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromeImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeImage")(js.undefined)
        ret
    }
  }
  
}

