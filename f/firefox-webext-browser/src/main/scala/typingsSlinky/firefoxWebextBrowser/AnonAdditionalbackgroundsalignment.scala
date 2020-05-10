package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsAlignment
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsTiling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdditionalbackgroundsalignment extends js.Object {
  var additional_backgrounds_alignment: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsAlignment]] = js.native
  var additional_backgrounds_tiling: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsTiling]] = js.native
}

object AnonAdditionalbackgroundsalignment {
  @scala.inline
  def apply(): AnonAdditionalbackgroundsalignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdditionalbackgroundsalignment]
  }
  @scala.inline
  implicit class AnonAdditionalbackgroundsalignmentOps[Self <: AnonAdditionalbackgroundsalignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditional_backgrounds_alignment(value: js.Array[ThemeTypeAdditionalBackgroundsAlignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_backgrounds_alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditional_backgrounds_alignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_backgrounds_alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditional_backgrounds_tiling(value: js.Array[ThemeTypeAdditionalBackgroundsTiling]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_backgrounds_tiling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditional_backgrounds_tiling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_backgrounds_tiling")(js.undefined)
        ret
    }
  }
  
}

