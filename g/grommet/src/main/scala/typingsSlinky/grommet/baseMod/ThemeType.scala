package typingsSlinky.grommet.baseMod

import typingsSlinky.grommet.anon.Active
import typingsSlinky.grommet.anon.Analog
import typingsSlinky.grommet.anon.Animation
import typingsSlinky.grommet.anon.Baseline
import typingsSlinky.grommet.anon.BorderHeading
import typingsSlinky.grommet.anon.Captions
import typingsSlinky.grommet.anon.Check
import typingsSlinky.grommet.anon.ColorColors
import typingsSlinky.grommet.anon.ColorExtend
import typingsSlinky.grommet.anon.Container
import typingsSlinky.grommet.anon.Content
import typingsSlinky.grommet.anon.Continent
import typingsSlinky.grommet.anon.Control
import typingsSlinky.grommet.anon.DisabledExtend
import typingsSlinky.grommet.anon.Edge
import typingsSlinky.grommet.anon.Extend
import typingsSlinky.grommet.anon.ExtendFont
import typingsSlinky.grommet.anon.FontWeight
import typingsSlinky.grommet.anon.Gap
import typingsSlinky.grommet.anon.GroupEnd
import typingsSlinky.grommet.anon.Heading
import typingsSlinky.grommet.anon.Icons
import typingsSlinky.grommet.anon.Item
import typingsSlinky.grommet.anon.Line
import typingsSlinky.grommet.anon.Margin
import typingsSlinky.grommet.anon.MaxHeight
import typingsSlinky.grommet.anon.MinWidth
import typingsSlinky.grommet.anon.Panel
import typingsSlinky.grommet.anon.ResponsiveBreakpoint
import typingsSlinky.grommet.anon.Row
import typingsSlinky.grommet.anon.SizeDictxLarge
import typingsSlinky.grommet.anon.Small
import typingsSlinky.grommet.anon.Thumb
import typingsSlinky.grommet.anon.Xxlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeType extends js.Object {
  var accordion: js.UndefOr[BorderHeading] = js.native
  var anchor: js.UndefOr[FontWeight] = js.native
  var box: js.UndefOr[ResponsiveBreakpoint] = js.native
  var button: js.UndefOr[MinWidth] = js.native
  var calendar: js.UndefOr[Heading] = js.native
  var carousel: js.UndefOr[Animation] = js.native
  var chart: js.UndefOr[ColorExtend] = js.native
  var checkBox: js.UndefOr[Check] = js.native
  var clock: js.UndefOr[Analog] = js.native
  var collapsible: js.UndefOr[Baseline] = js.native
  var dataTable: js.UndefOr[GroupEnd] = js.native
  var diagram: js.UndefOr[Line] = js.native
  var drop: js.UndefOr[MaxHeight] = js.native
  var formField: js.UndefOr[Content] = js.native
  var global: js.UndefOr[Active] = js.native
  var grommet: js.UndefOr[Extend] = js.native
  var heading: js.UndefOr[ExtendFont] = js.native
  var icon: js.UndefOr[SizeDictxLarge] = js.native
  var layer: js.UndefOr[Container] = js.native
  var list: js.UndefOr[Item] = js.native
  var maskedInput: js.UndefOr[Extend] = js.native
  var menu: js.UndefOr[Icons] = js.native
  var meter: js.UndefOr[ColorColors] = js.native
  var paragraph: js.UndefOr[Xxlarge] = js.native
  var radioButton: js.UndefOr[Gap] = js.native
  var rangeInput: js.UndefOr[Thumb] = js.native
  var rangeSelector: js.UndefOr[Edge] = js.native
  var select: js.UndefOr[Control] = js.native
  var tab: js.UndefOr[Margin] = js.native
  var table: js.UndefOr[Row] = js.native
  var tabs: js.UndefOr[Panel] = js.native
  var text: js.UndefOr[Small] = js.native
  var textArea: js.UndefOr[DisabledExtend] = js.native
  var textInput: js.UndefOr[DisabledExtend] = js.native
  var video: js.UndefOr[Captions] = js.native
  var worldMap: js.UndefOr[Continent] = js.native
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
    def withAccordion(value: BorderHeading): Self = {
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
    def withAnchor(value: FontWeight): Self = {
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
    def withBox(value: ResponsiveBreakpoint): Self = {
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
    def withButton(value: MinWidth): Self = {
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
    def withCalendar(value: Heading): Self = {
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
    def withCarousel(value: Animation): Self = {
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
    def withChart(value: ColorExtend): Self = {
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
    def withCheckBox(value: Check): Self = {
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
    def withClock(value: Analog): Self = {
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
    def withCollapsible(value: Baseline): Self = {
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
    def withDataTable(value: GroupEnd): Self = {
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
    def withDiagram(value: Line): Self = {
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
    def withDrop(value: MaxHeight): Self = {
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
    def withFormField(value: Content): Self = {
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
    def withGlobal(value: Active): Self = {
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
    def withGrommet(value: Extend): Self = {
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
    def withHeading(value: ExtendFont): Self = {
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
    def withIcon(value: SizeDictxLarge): Self = {
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
    def withLayer(value: Container): Self = {
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
    def withList(value: Item): Self = {
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
    def withMaskedInput(value: Extend): Self = {
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
    def withMenu(value: Icons): Self = {
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
    def withMeter(value: ColorColors): Self = {
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
    def withParagraph(value: Xxlarge): Self = {
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
    def withRadioButton(value: Gap): Self = {
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
    def withRangeInput(value: Thumb): Self = {
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
    def withRangeSelector(value: Edge): Self = {
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
    def withSelect(value: Control): Self = {
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
    def withTab(value: Margin): Self = {
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
    def withTable(value: Row): Self = {
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
    def withTabs(value: Panel): Self = {
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
    def withText(value: Small): Self = {
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
    def withTextArea(value: DisabledExtend): Self = {
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
    def withTextInput(value: DisabledExtend): Self = {
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
    def withVideo(value: Captions): Self = {
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
    def withWorldMap(value: Continent): Self = {
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

