package typingsSlinky.carbonThemes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends js.Object {
  var active01: String = js.native
  var activeDanger: String = js.native
  var activePrimary: String = js.native
  var activeSecondary: String = js.native
  var activeTertiary: String = js.native
  var activeUI: String = js.native
  var brand01: String = js.native
  var brand02: String = js.native
  var brand03: String = js.native
  var disabled01: String = js.native
  var disabled02: String = js.native
  var disabled03: String = js.native
  var field01: String = js.native
  var field02: String = js.native
  var focus: String = js.native
  var highlight: String = js.native
  var hoverDanger: String = js.native
  var hoverField: String = js.native
  var hoverPrimary: String = js.native
  var hoverPrimaryText: String = js.native
  var hoverRow: String = js.native
  var hoverSecondary: String = js.native
  var hoverSelectedUI: String = js.native
  var hoverTertiary: String = js.native
  var hoverUI: String = js.native
  var icon01: String = js.native
  var icon02: String = js.native
  var interactive01: String = js.native
  var interactive02: String = js.native
  var interactive03: String = js.native
  var inverse01: String = js.native
  var inverse02: String = js.native
  var overlay01: String = js.native
  var selectedUI: String = js.native
  var support01: String = js.native
  var support02: String = js.native
  var support03: String = js.native
  var support04: String = js.native
  var text01: String = js.native
  var text02: String = js.native
  var text03: String = js.native
  var text04: String = js.native
  var ui01: String = js.native
  var ui02: String = js.native
  var ui03: String = js.native
  var ui04: String = js.native
  var ui05: String = js.native
  var uiBackground: String = js.native
  var visitedLink: String = js.native
}

object Theme {
  @scala.inline
  def apply(
    active01: String,
    activeDanger: String,
    activePrimary: String,
    activeSecondary: String,
    activeTertiary: String,
    activeUI: String,
    brand01: String,
    brand02: String,
    brand03: String,
    disabled01: String,
    disabled02: String,
    disabled03: String,
    field01: String,
    field02: String,
    focus: String,
    highlight: String,
    hoverDanger: String,
    hoverField: String,
    hoverPrimary: String,
    hoverPrimaryText: String,
    hoverRow: String,
    hoverSecondary: String,
    hoverSelectedUI: String,
    hoverTertiary: String,
    hoverUI: String,
    icon01: String,
    icon02: String,
    interactive01: String,
    interactive02: String,
    interactive03: String,
    inverse01: String,
    inverse02: String,
    overlay01: String,
    selectedUI: String,
    support01: String,
    support02: String,
    support03: String,
    support04: String,
    text01: String,
    text02: String,
    text03: String,
    text04: String,
    ui01: String,
    ui02: String,
    ui03: String,
    ui04: String,
    ui05: String,
    uiBackground: String,
    visitedLink: String
  ): Theme = {
    val __obj = js.Dynamic.literal(active01 = active01.asInstanceOf[js.Any], activeDanger = activeDanger.asInstanceOf[js.Any], activePrimary = activePrimary.asInstanceOf[js.Any], activeSecondary = activeSecondary.asInstanceOf[js.Any], activeTertiary = activeTertiary.asInstanceOf[js.Any], activeUI = activeUI.asInstanceOf[js.Any], brand01 = brand01.asInstanceOf[js.Any], brand02 = brand02.asInstanceOf[js.Any], brand03 = brand03.asInstanceOf[js.Any], disabled01 = disabled01.asInstanceOf[js.Any], disabled02 = disabled02.asInstanceOf[js.Any], disabled03 = disabled03.asInstanceOf[js.Any], field01 = field01.asInstanceOf[js.Any], field02 = field02.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], hoverDanger = hoverDanger.asInstanceOf[js.Any], hoverField = hoverField.asInstanceOf[js.Any], hoverPrimary = hoverPrimary.asInstanceOf[js.Any], hoverPrimaryText = hoverPrimaryText.asInstanceOf[js.Any], hoverRow = hoverRow.asInstanceOf[js.Any], hoverSecondary = hoverSecondary.asInstanceOf[js.Any], hoverSelectedUI = hoverSelectedUI.asInstanceOf[js.Any], hoverTertiary = hoverTertiary.asInstanceOf[js.Any], hoverUI = hoverUI.asInstanceOf[js.Any], icon01 = icon01.asInstanceOf[js.Any], icon02 = icon02.asInstanceOf[js.Any], interactive01 = interactive01.asInstanceOf[js.Any], interactive02 = interactive02.asInstanceOf[js.Any], interactive03 = interactive03.asInstanceOf[js.Any], inverse01 = inverse01.asInstanceOf[js.Any], inverse02 = inverse02.asInstanceOf[js.Any], overlay01 = overlay01.asInstanceOf[js.Any], selectedUI = selectedUI.asInstanceOf[js.Any], support01 = support01.asInstanceOf[js.Any], support02 = support02.asInstanceOf[js.Any], support03 = support03.asInstanceOf[js.Any], support04 = support04.asInstanceOf[js.Any], text01 = text01.asInstanceOf[js.Any], text02 = text02.asInstanceOf[js.Any], text03 = text03.asInstanceOf[js.Any], text04 = text04.asInstanceOf[js.Any], ui01 = ui01.asInstanceOf[js.Any], ui02 = ui02.asInstanceOf[js.Any], ui03 = ui03.asInstanceOf[js.Any], ui04 = ui04.asInstanceOf[js.Any], ui05 = ui05.asInstanceOf[js.Any], uiBackground = uiBackground.asInstanceOf[js.Any], visitedLink = visitedLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveDanger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDanger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivePrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTertiary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTertiary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveUI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrand01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrand02(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand02")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrand03(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand03")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled02(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled02")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled03(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled03")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField02(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field02")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverDanger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDanger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverPrimaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverPrimaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverSelectedUI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverSelectedUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverTertiary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverTertiary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverUI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon02(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon02")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractive01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractive02(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive02")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractive03(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive03")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverse01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverse02(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse02")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlay01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedUI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupport01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupport02(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support02")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupport03(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support03")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupport04(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support04")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText02(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text02")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText03(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text03")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText04(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text04")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUi01(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUi02(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui02")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUi03(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui03")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUi04(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui04")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUi05(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui05")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisitedLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitedLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

