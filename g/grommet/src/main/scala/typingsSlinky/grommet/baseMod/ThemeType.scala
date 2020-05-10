package typingsSlinky.grommet.baseMod

import typingsSlinky.grommet.AnonActive
import typingsSlinky.grommet.AnonAnalog
import typingsSlinky.grommet.AnonAnimation
import typingsSlinky.grommet.AnonBaseline
import typingsSlinky.grommet.AnonBorderHeading
import typingsSlinky.grommet.AnonCaptions
import typingsSlinky.grommet.AnonCheck
import typingsSlinky.grommet.AnonColorColors
import typingsSlinky.grommet.AnonColorExtend
import typingsSlinky.grommet.AnonContainer
import typingsSlinky.grommet.AnonContent
import typingsSlinky.grommet.AnonContinent
import typingsSlinky.grommet.AnonControl
import typingsSlinky.grommet.AnonDisabledExtend
import typingsSlinky.grommet.AnonEdge
import typingsSlinky.grommet.AnonExtend
import typingsSlinky.grommet.AnonExtendFont
import typingsSlinky.grommet.AnonFontWeight
import typingsSlinky.grommet.AnonGap
import typingsSlinky.grommet.AnonGroupEnd
import typingsSlinky.grommet.AnonHeading
import typingsSlinky.grommet.AnonIcons
import typingsSlinky.grommet.AnonItem
import typingsSlinky.grommet.AnonLine
import typingsSlinky.grommet.AnonMargin
import typingsSlinky.grommet.AnonMaxHeight
import typingsSlinky.grommet.AnonMinWidth
import typingsSlinky.grommet.AnonPanel
import typingsSlinky.grommet.AnonResponsiveBreakpoint
import typingsSlinky.grommet.AnonRow
import typingsSlinky.grommet.AnonSizeAnonDictxLarge
import typingsSlinky.grommet.AnonSmall
import typingsSlinky.grommet.AnonThumb
import typingsSlinky.grommet.AnonXxlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeType extends js.Object {
  var accordion: js.UndefOr[AnonBorderHeading] = js.native
  var anchor: js.UndefOr[AnonFontWeight] = js.native
  var box: js.UndefOr[AnonResponsiveBreakpoint] = js.native
  var button: js.UndefOr[AnonMinWidth] = js.native
  var calendar: js.UndefOr[AnonHeading] = js.native
  var carousel: js.UndefOr[AnonAnimation] = js.native
  var chart: js.UndefOr[AnonColorExtend] = js.native
  var checkBox: js.UndefOr[AnonCheck] = js.native
  var clock: js.UndefOr[AnonAnalog] = js.native
  var collapsible: js.UndefOr[AnonBaseline] = js.native
  var dataTable: js.UndefOr[AnonGroupEnd] = js.native
  var diagram: js.UndefOr[AnonLine] = js.native
  var drop: js.UndefOr[AnonMaxHeight] = js.native
  var formField: js.UndefOr[AnonContent] = js.native
  var global: js.UndefOr[AnonActive] = js.native
  var grommet: js.UndefOr[AnonExtend] = js.native
  var heading: js.UndefOr[AnonExtendFont] = js.native
  var icon: js.UndefOr[AnonSizeAnonDictxLarge] = js.native
  var layer: js.UndefOr[AnonContainer] = js.native
  var list: js.UndefOr[AnonItem] = js.native
  var maskedInput: js.UndefOr[AnonExtend] = js.native
  var menu: js.UndefOr[AnonIcons] = js.native
  var meter: js.UndefOr[AnonColorColors] = js.native
  var paragraph: js.UndefOr[AnonXxlarge] = js.native
  var radioButton: js.UndefOr[AnonGap] = js.native
  var rangeInput: js.UndefOr[AnonThumb] = js.native
  var rangeSelector: js.UndefOr[AnonEdge] = js.native
  var select: js.UndefOr[AnonControl] = js.native
  var tab: js.UndefOr[AnonMargin] = js.native
  var table: js.UndefOr[AnonRow] = js.native
  var tabs: js.UndefOr[AnonPanel] = js.native
  var text: js.UndefOr[AnonSmall] = js.native
  var textArea: js.UndefOr[AnonDisabledExtend] = js.native
  var textInput: js.UndefOr[AnonDisabledExtend] = js.native
  var video: js.UndefOr[AnonCaptions] = js.native
  var worldMap: js.UndefOr[AnonContinent] = js.native
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
    def withAccordion(value: AnonBorderHeading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccordion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchor(value: AnonFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withBox(value: AnonResponsiveBreakpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: AnonMinWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendar(value: AnonHeading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(js.undefined)
        ret
    }
    @scala.inline
    def withCarousel(value: AnonAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carousel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarousel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carousel")(js.undefined)
        ret
    }
    @scala.inline
    def withChart(value: AnonColorExtend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckBox(value: AnonCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBox")(js.undefined)
        ret
    }
    @scala.inline
    def withClock(value: AnonAnalog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsible(value: AnonBaseline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTable(value: AnonGroupEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTable")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagram(value: AnonLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagram")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: AnonMaxHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withFormField(value: AnonContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formField")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: AnonActive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withGrommet(value: AnonExtend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grommet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrommet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grommet")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: AnonExtendFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: AnonSizeAnonDictxLarge): Self = {
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
    def withLayer(value: AnonContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: AnonItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskedInput(value: AnonExtend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskedInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskedInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskedInput")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: AnonIcons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(js.undefined)
        ret
    }
    @scala.inline
    def withMeter(value: AnonColorColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meter")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraph(value: AnonXxlarge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioButton(value: AnonGap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeInput(value: AnonThumb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeInput")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelector(value: AnonEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: AnonControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withTab(value: AnonMargin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: AnonRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withTabs(value: AnonPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: AnonSmall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextArea(value: AnonDisabledExtend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textArea")(js.undefined)
        ret
    }
    @scala.inline
    def withTextInput(value: AnonDisabledExtend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInput")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: AnonCaptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
    @scala.inline
    def withWorldMap(value: AnonContinent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorldMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldMap")(js.undefined)
        ret
    }
  }
  
}

