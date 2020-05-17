package typingsSlinky.grommet.anon

import typingsSlinky.grommet.utilsMod.DeepReadonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined grommet.grommet/utils.DeepReadonly<grommet.grommet/themes/base.ThemeType> */
@js.native
trait DeepReadonlyThemeType extends js.Object {
  val accordion: js.UndefOr[BorderHeading | DeepReadonly[js.UndefOr[BorderHeading]]] = js.native
  val anchor: js.UndefOr[FontWeight | DeepReadonly[js.UndefOr[FontWeight]]] = js.native
  val box: js.UndefOr[ResponsiveBreakpoint | DeepReadonly[js.UndefOr[ResponsiveBreakpoint]]] = js.native
  val button: js.UndefOr[MinWidth | DeepReadonly[js.UndefOr[MinWidth]]] = js.native
  val calendar: js.UndefOr[Heading | DeepReadonly[js.UndefOr[Heading]]] = js.native
  val carousel: js.UndefOr[Animation | DeepReadonly[js.UndefOr[Animation]]] = js.native
  val chart: js.UndefOr[ColorExtend | DeepReadonly[js.UndefOr[ColorExtend]]] = js.native
  val checkBox: js.UndefOr[Check | DeepReadonly[js.UndefOr[Check]]] = js.native
  val clock: js.UndefOr[Analog | DeepReadonly[js.UndefOr[Analog]]] = js.native
  val collapsible: js.UndefOr[Baseline | DeepReadonly[js.UndefOr[Baseline]]] = js.native
  val dataTable: js.UndefOr[GroupEnd | DeepReadonly[js.UndefOr[GroupEnd]]] = js.native
  val diagram: js.UndefOr[Line | DeepReadonly[js.UndefOr[Line]]] = js.native
  val drop: js.UndefOr[MaxHeight | DeepReadonly[js.UndefOr[MaxHeight]]] = js.native
  val formField: js.UndefOr[Content | DeepReadonly[js.UndefOr[Content]]] = js.native
  val global: js.UndefOr[Active | DeepReadonly[js.UndefOr[Active]]] = js.native
  val grommet: js.UndefOr[Extend | DeepReadonly[js.UndefOr[Extend]]] = js.native
  val heading: js.UndefOr[ExtendFont | DeepReadonly[js.UndefOr[ExtendFont]]] = js.native
  val icon: js.UndefOr[SizeDictxLarge | DeepReadonly[js.UndefOr[SizeDictxLarge]]] = js.native
  val layer: js.UndefOr[Container | DeepReadonly[js.UndefOr[Container]]] = js.native
  val list: js.UndefOr[Item | DeepReadonly[js.UndefOr[Item]]] = js.native
  val maskedInput: js.UndefOr[Extend | DeepReadonly[js.UndefOr[Extend]]] = js.native
  val menu: js.UndefOr[Icons | DeepReadonly[js.UndefOr[Icons]]] = js.native
  val meter: js.UndefOr[ColorColors | DeepReadonly[js.UndefOr[ColorColors]]] = js.native
  val paragraph: js.UndefOr[Xxlarge | DeepReadonly[js.UndefOr[Xxlarge]]] = js.native
  val radioButton: js.UndefOr[Gap | DeepReadonly[js.UndefOr[Gap]]] = js.native
  val rangeInput: js.UndefOr[Thumb | DeepReadonly[js.UndefOr[Thumb]]] = js.native
  val rangeSelector: js.UndefOr[Edge | DeepReadonly[js.UndefOr[Edge]]] = js.native
  val select: js.UndefOr[Control | DeepReadonly[js.UndefOr[Control]]] = js.native
  val tab: js.UndefOr[Margin | DeepReadonly[js.UndefOr[Margin]]] = js.native
  val table: js.UndefOr[Row | DeepReadonly[js.UndefOr[Row]]] = js.native
  val tabs: js.UndefOr[Panel | DeepReadonly[js.UndefOr[Panel]]] = js.native
  val text: js.UndefOr[Small | DeepReadonly[js.UndefOr[Small]]] = js.native
  val textArea: js.UndefOr[DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]] = js.native
  val textInput: js.UndefOr[DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]] = js.native
  val video: js.UndefOr[Captions | DeepReadonly[js.UndefOr[Captions]]] = js.native
  val worldMap: js.UndefOr[Continent | DeepReadonly[js.UndefOr[Continent]]] = js.native
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
    def withAccordion(value: BorderHeading | DeepReadonly[js.UndefOr[BorderHeading]]): Self = {
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
    def withAnchor(value: FontWeight | DeepReadonly[js.UndefOr[FontWeight]]): Self = {
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
    def withBox(value: ResponsiveBreakpoint | DeepReadonly[js.UndefOr[ResponsiveBreakpoint]]): Self = {
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
    def withButton(value: MinWidth | DeepReadonly[js.UndefOr[MinWidth]]): Self = {
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
    def withCalendar(value: Heading | DeepReadonly[js.UndefOr[Heading]]): Self = {
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
    def withCarousel(value: Animation | DeepReadonly[js.UndefOr[Animation]]): Self = {
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
    def withChart(value: ColorExtend | DeepReadonly[js.UndefOr[ColorExtend]]): Self = {
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
    def withCheckBox(value: Check | DeepReadonly[js.UndefOr[Check]]): Self = {
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
    def withClock(value: Analog | DeepReadonly[js.UndefOr[Analog]]): Self = {
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
    def withCollapsible(value: Baseline | DeepReadonly[js.UndefOr[Baseline]]): Self = {
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
    def withDataTable(value: GroupEnd | DeepReadonly[js.UndefOr[GroupEnd]]): Self = {
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
    def withDiagram(value: Line | DeepReadonly[js.UndefOr[Line]]): Self = {
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
    def withDrop(value: MaxHeight | DeepReadonly[js.UndefOr[MaxHeight]]): Self = {
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
    def withFormField(value: Content | DeepReadonly[js.UndefOr[Content]]): Self = {
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
    def withGlobal(value: Active | DeepReadonly[js.UndefOr[Active]]): Self = {
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
    def withGrommet(value: Extend | DeepReadonly[js.UndefOr[Extend]]): Self = {
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
    def withHeading(value: ExtendFont | DeepReadonly[js.UndefOr[ExtendFont]]): Self = {
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
    def withIcon(value: SizeDictxLarge | DeepReadonly[js.UndefOr[SizeDictxLarge]]): Self = {
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
    def withLayer(value: Container | DeepReadonly[js.UndefOr[Container]]): Self = {
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
    def withList(value: Item | DeepReadonly[js.UndefOr[Item]]): Self = {
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
    def withMaskedInput(value: Extend | DeepReadonly[js.UndefOr[Extend]]): Self = {
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
    def withMenu(value: Icons | DeepReadonly[js.UndefOr[Icons]]): Self = {
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
    def withMeter(value: ColorColors | DeepReadonly[js.UndefOr[ColorColors]]): Self = {
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
    def withParagraph(value: Xxlarge | DeepReadonly[js.UndefOr[Xxlarge]]): Self = {
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
    def withRadioButton(value: Gap | DeepReadonly[js.UndefOr[Gap]]): Self = {
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
    def withRangeInput(value: Thumb | DeepReadonly[js.UndefOr[Thumb]]): Self = {
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
    def withRangeSelector(value: Edge | DeepReadonly[js.UndefOr[Edge]]): Self = {
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
    def withSelect(value: Control | DeepReadonly[js.UndefOr[Control]]): Self = {
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
    def withTab(value: Margin | DeepReadonly[js.UndefOr[Margin]]): Self = {
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
    def withTable(value: Row | DeepReadonly[js.UndefOr[Row]]): Self = {
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
    def withTabs(value: Panel | DeepReadonly[js.UndefOr[Panel]]): Self = {
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
    def withText(value: Small | DeepReadonly[js.UndefOr[Small]]): Self = {
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
    def withTextArea(value: DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]): Self = {
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
    def withTextInput(value: DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]): Self = {
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
    def withVideo(value: Captions | DeepReadonly[js.UndefOr[Captions]]): Self = {
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
    def withWorldMap(value: Continent | DeepReadonly[js.UndefOr[Continent]]): Self = {
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

