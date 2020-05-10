package typingsSlinky.grommet

import typingsSlinky.grommet.utilsMod.DeepReadonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined grommet.grommet/utils.DeepReadonly<grommet.grommet/themes/base.ThemeType> */
@js.native
trait DeepReadonlyThemeType extends js.Object {
  val accordion: js.UndefOr[AnonBorderHeading | DeepReadonly[js.UndefOr[AnonBorderHeading]]] = js.native
  val anchor: js.UndefOr[AnonFontWeight | DeepReadonly[js.UndefOr[AnonFontWeight]]] = js.native
  val box: js.UndefOr[AnonResponsiveBreakpoint | DeepReadonly[js.UndefOr[AnonResponsiveBreakpoint]]] = js.native
  val button: js.UndefOr[AnonMinWidth | DeepReadonly[js.UndefOr[AnonMinWidth]]] = js.native
  val calendar: js.UndefOr[AnonHeading | DeepReadonly[js.UndefOr[AnonHeading]]] = js.native
  val carousel: js.UndefOr[AnonAnimation | DeepReadonly[js.UndefOr[AnonAnimation]]] = js.native
  val chart: js.UndefOr[AnonColorExtend | DeepReadonly[js.UndefOr[AnonColorExtend]]] = js.native
  val checkBox: js.UndefOr[AnonCheck | DeepReadonly[js.UndefOr[AnonCheck]]] = js.native
  val clock: js.UndefOr[AnonAnalog | DeepReadonly[js.UndefOr[AnonAnalog]]] = js.native
  val collapsible: js.UndefOr[AnonBaseline | DeepReadonly[js.UndefOr[AnonBaseline]]] = js.native
  val dataTable: js.UndefOr[AnonGroupEnd | DeepReadonly[js.UndefOr[AnonGroupEnd]]] = js.native
  val diagram: js.UndefOr[AnonLine | DeepReadonly[js.UndefOr[AnonLine]]] = js.native
  val drop: js.UndefOr[AnonMaxHeight | DeepReadonly[js.UndefOr[AnonMaxHeight]]] = js.native
  val formField: js.UndefOr[AnonContent | DeepReadonly[js.UndefOr[AnonContent]]] = js.native
  val global: js.UndefOr[AnonActive | DeepReadonly[js.UndefOr[AnonActive]]] = js.native
  val grommet: js.UndefOr[AnonExtend | DeepReadonly[js.UndefOr[AnonExtend]]] = js.native
  val heading: js.UndefOr[AnonExtendFont | DeepReadonly[js.UndefOr[AnonExtendFont]]] = js.native
  val icon: js.UndefOr[AnonSizeAnonDictxLarge | DeepReadonly[js.UndefOr[AnonSizeAnonDictxLarge]]] = js.native
  val layer: js.UndefOr[AnonContainer | DeepReadonly[js.UndefOr[AnonContainer]]] = js.native
  val list: js.UndefOr[AnonItem | DeepReadonly[js.UndefOr[AnonItem]]] = js.native
  val maskedInput: js.UndefOr[AnonExtend | DeepReadonly[js.UndefOr[AnonExtend]]] = js.native
  val menu: js.UndefOr[AnonIcons | DeepReadonly[js.UndefOr[AnonIcons]]] = js.native
  val meter: js.UndefOr[AnonColorColors | DeepReadonly[js.UndefOr[AnonColorColors]]] = js.native
  val paragraph: js.UndefOr[AnonXxlarge | DeepReadonly[js.UndefOr[AnonXxlarge]]] = js.native
  val radioButton: js.UndefOr[AnonGap | DeepReadonly[js.UndefOr[AnonGap]]] = js.native
  val rangeInput: js.UndefOr[AnonThumb | DeepReadonly[js.UndefOr[AnonThumb]]] = js.native
  val rangeSelector: js.UndefOr[AnonEdge | DeepReadonly[js.UndefOr[AnonEdge]]] = js.native
  val select: js.UndefOr[AnonControl | DeepReadonly[js.UndefOr[AnonControl]]] = js.native
  val tab: js.UndefOr[AnonMargin | DeepReadonly[js.UndefOr[AnonMargin]]] = js.native
  val table: js.UndefOr[AnonRow | DeepReadonly[js.UndefOr[AnonRow]]] = js.native
  val tabs: js.UndefOr[AnonPanel | DeepReadonly[js.UndefOr[AnonPanel]]] = js.native
  val text: js.UndefOr[AnonSmall | DeepReadonly[js.UndefOr[AnonSmall]]] = js.native
  val textArea: js.UndefOr[AnonDisabledExtend | DeepReadonly[js.UndefOr[AnonDisabledExtend]]] = js.native
  val textInput: js.UndefOr[AnonDisabledExtend | DeepReadonly[js.UndefOr[AnonDisabledExtend]]] = js.native
  val video: js.UndefOr[AnonCaptions | DeepReadonly[js.UndefOr[AnonCaptions]]] = js.native
  val worldMap: js.UndefOr[AnonContinent | DeepReadonly[js.UndefOr[AnonContinent]]] = js.native
}

object DeepReadonlyThemeType {
  @scala.inline
  def apply(): DeepReadonlyThemeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepReadonlyThemeType]
  }
  @scala.inline
  implicit class DeepReadonlyThemeTypeOps[Self <: DeepReadonlyThemeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccordion(value: AnonBorderHeading | DeepReadonly[js.UndefOr[AnonBorderHeading]]): Self = {
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
    def withAnchor(value: AnonFontWeight | DeepReadonly[js.UndefOr[AnonFontWeight]]): Self = {
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
    def withBox(value: AnonResponsiveBreakpoint | DeepReadonly[js.UndefOr[AnonResponsiveBreakpoint]]): Self = {
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
    def withButton(value: AnonMinWidth | DeepReadonly[js.UndefOr[AnonMinWidth]]): Self = {
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
    def withCalendar(value: AnonHeading | DeepReadonly[js.UndefOr[AnonHeading]]): Self = {
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
    def withCarousel(value: AnonAnimation | DeepReadonly[js.UndefOr[AnonAnimation]]): Self = {
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
    def withChart(value: AnonColorExtend | DeepReadonly[js.UndefOr[AnonColorExtend]]): Self = {
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
    def withCheckBox(value: AnonCheck | DeepReadonly[js.UndefOr[AnonCheck]]): Self = {
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
    def withClock(value: AnonAnalog | DeepReadonly[js.UndefOr[AnonAnalog]]): Self = {
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
    def withCollapsible(value: AnonBaseline | DeepReadonly[js.UndefOr[AnonBaseline]]): Self = {
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
    def withDataTable(value: AnonGroupEnd | DeepReadonly[js.UndefOr[AnonGroupEnd]]): Self = {
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
    def withDiagram(value: AnonLine | DeepReadonly[js.UndefOr[AnonLine]]): Self = {
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
    def withDrop(value: AnonMaxHeight | DeepReadonly[js.UndefOr[AnonMaxHeight]]): Self = {
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
    def withFormField(value: AnonContent | DeepReadonly[js.UndefOr[AnonContent]]): Self = {
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
    def withGlobal(value: AnonActive | DeepReadonly[js.UndefOr[AnonActive]]): Self = {
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
    def withGrommet(value: AnonExtend | DeepReadonly[js.UndefOr[AnonExtend]]): Self = {
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
    def withHeading(value: AnonExtendFont | DeepReadonly[js.UndefOr[AnonExtendFont]]): Self = {
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
    def withIcon(value: AnonSizeAnonDictxLarge | DeepReadonly[js.UndefOr[AnonSizeAnonDictxLarge]]): Self = {
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
    def withLayer(value: AnonContainer | DeepReadonly[js.UndefOr[AnonContainer]]): Self = {
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
    def withList(value: AnonItem | DeepReadonly[js.UndefOr[AnonItem]]): Self = {
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
    def withMaskedInput(value: AnonExtend | DeepReadonly[js.UndefOr[AnonExtend]]): Self = {
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
    def withMenu(value: AnonIcons | DeepReadonly[js.UndefOr[AnonIcons]]): Self = {
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
    def withMeter(value: AnonColorColors | DeepReadonly[js.UndefOr[AnonColorColors]]): Self = {
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
    def withParagraph(value: AnonXxlarge | DeepReadonly[js.UndefOr[AnonXxlarge]]): Self = {
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
    def withRadioButton(value: AnonGap | DeepReadonly[js.UndefOr[AnonGap]]): Self = {
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
    def withRangeInput(value: AnonThumb | DeepReadonly[js.UndefOr[AnonThumb]]): Self = {
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
    def withRangeSelector(value: AnonEdge | DeepReadonly[js.UndefOr[AnonEdge]]): Self = {
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
    def withSelect(value: AnonControl | DeepReadonly[js.UndefOr[AnonControl]]): Self = {
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
    def withTab(value: AnonMargin | DeepReadonly[js.UndefOr[AnonMargin]]): Self = {
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
    def withTable(value: AnonRow | DeepReadonly[js.UndefOr[AnonRow]]): Self = {
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
    def withTabs(value: AnonPanel | DeepReadonly[js.UndefOr[AnonPanel]]): Self = {
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
    def withText(value: AnonSmall | DeepReadonly[js.UndefOr[AnonSmall]]): Self = {
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
    def withTextArea(value: AnonDisabledExtend | DeepReadonly[js.UndefOr[AnonDisabledExtend]]): Self = {
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
    def withTextInput(value: AnonDisabledExtend | DeepReadonly[js.UndefOr[AnonDisabledExtend]]): Self = {
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
    def withVideo(value: AnonCaptions | DeepReadonly[js.UndefOr[AnonCaptions]]): Self = {
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
    def withWorldMap(value: AnonContinent | DeepReadonly[js.UndefOr[AnonContinent]]): Self = {
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

