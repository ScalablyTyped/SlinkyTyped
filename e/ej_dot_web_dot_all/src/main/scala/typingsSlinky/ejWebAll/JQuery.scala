package typingsSlinky.ejWebAll

import typingsSlinky.ejWebAll.ej.Accordion
import typingsSlinky.ejWebAll.ej.Accordion.Model
import typingsSlinky.ejWebAll.ej.Autocomplete
import typingsSlinky.ejWebAll.ej.Button
import typingsSlinky.ejWebAll.ej.Captcha
import typingsSlinky.ejWebAll.ej.CheckBox
import typingsSlinky.ejWebAll.ej.ColorPicker
import typingsSlinky.ejWebAll.ej.ComboBox
import typingsSlinky.ejWebAll.ej.CurrencyTextbox
import typingsSlinky.ejWebAll.ej.DatePicker
import typingsSlinky.ejWebAll.ej.DateRangePicker
import typingsSlinky.ejWebAll.ej.DateTimePicker
import typingsSlinky.ejWebAll.ej.Dialog
import typingsSlinky.ejWebAll.ej.DocumentEditor
import typingsSlinky.ejWebAll.ej.Draggable
import typingsSlinky.ejWebAll.ej.DropDownList
import typingsSlinky.ejWebAll.ej.DropDownTree
import typingsSlinky.ejWebAll.ej.Droppable
import typingsSlinky.ejWebAll.ej.FileExplorer
import typingsSlinky.ejWebAll.ej.Gantt
import typingsSlinky.ejWebAll.ej.Grid
import typingsSlinky.ejWebAll.ej.GroupButton
import typingsSlinky.ejWebAll.ej.Kanban
import typingsSlinky.ejWebAll.ej.ListBox
import typingsSlinky.ejWebAll.ej.ListView
import typingsSlinky.ejWebAll.ej.MaskEdit
import typingsSlinky.ejWebAll.ej.Menu
import typingsSlinky.ejWebAll.ej.NavigationDrawer
import typingsSlinky.ejWebAll.ej.NumericTextbox
import typingsSlinky.ejWebAll.ej.Pager
import typingsSlinky.ejWebAll.ej.PdfViewer
import typingsSlinky.ejWebAll.ej.PercentageTextbox
import typingsSlinky.ejWebAll.ej.PivotChart
import typingsSlinky.ejWebAll.ej.PivotClient
import typingsSlinky.ejWebAll.ej.PivotGauge
import typingsSlinky.ejWebAll.ej.PivotGrid
import typingsSlinky.ejWebAll.ej.PivotPager
import typingsSlinky.ejWebAll.ej.PivotSchemaDesigner
import typingsSlinky.ejWebAll.ej.PivotTreeMap
import typingsSlinky.ejWebAll.ej.Print
import typingsSlinky.ejWebAll.ej.ProgressBar
import typingsSlinky.ejWebAll.ej.RTE
import typingsSlinky.ejWebAll.ej.RadialMenu
import typingsSlinky.ejWebAll.ej.RadialSlider
import typingsSlinky.ejWebAll.ej.RadioButton
import typingsSlinky.ejWebAll.ej.Rating
import typingsSlinky.ejWebAll.ej.RecurrenceEditor
import typingsSlinky.ejWebAll.ej.ReportDesigner
import typingsSlinky.ejWebAll.ej.ReportViewer
import typingsSlinky.ejWebAll.ej.Resizable
import typingsSlinky.ejWebAll.ej.Ribbon
import typingsSlinky.ejWebAll.ej.Rotator
import typingsSlinky.ejWebAll.ej.Schedule
import typingsSlinky.ejWebAll.ej.Scroller
import typingsSlinky.ejWebAll.ej.Signature
import typingsSlinky.ejWebAll.ej.Slider_
import typingsSlinky.ejWebAll.ej.SpellCheck
import typingsSlinky.ejWebAll.ej.SplitButton
import typingsSlinky.ejWebAll.ej.Splitter
import typingsSlinky.ejWebAll.ej.Spreadsheet
import typingsSlinky.ejWebAll.ej.Tab
import typingsSlinky.ejWebAll.ej.TagCloud
import typingsSlinky.ejWebAll.ej.Tile
import typingsSlinky.ejWebAll.ej.TimePicker
import typingsSlinky.ejWebAll.ej.ToggleButton
import typingsSlinky.ejWebAll.ej.Toolbar
import typingsSlinky.ejWebAll.ej.Tooltip
import typingsSlinky.ejWebAll.ej.TreeGrid
import typingsSlinky.ejWebAll.ej.TreeView
import typingsSlinky.ejWebAll.ej.Uploadbox
import typingsSlinky.ejWebAll.ej.WaitingPopup
import typingsSlinky.ejWebAll.ej.datavisualization.Barcode
import typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph
import typingsSlinky.ejWebAll.ej.datavisualization.Chart
import typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge
import typingsSlinky.ejWebAll.ej.datavisualization.Diagram
import typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge
import typingsSlinky.ejWebAll.ej.datavisualization.HeatMap
import typingsSlinky.ejWebAll.ej.datavisualization.HeatMapLegend
import typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge
import typingsSlinky.ejWebAll.ej.datavisualization.Map
import typingsSlinky.ejWebAll.ej.datavisualization.Overview
import typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator
import typingsSlinky.ejWebAll.ej.datavisualization.Sparkline
import typingsSlinky.ejWebAll.ej.datavisualization.SunburstChart
import typingsSlinky.ejWebAll.ej.datavisualization.SymbolPalette
import typingsSlinky.ejWebAll.ej.datavisualization.TreeMap
import typingsSlinky.ejWebAll.ejWebAllStrings.ejAccordion
import typingsSlinky.ejWebAll.ejWebAllStrings.ejAutocomplete
import typingsSlinky.ejWebAll.ejWebAllStrings.ejBarcode
import typingsSlinky.ejWebAll.ejWebAllStrings.ejBulletGraph
import typingsSlinky.ejWebAll.ejWebAllStrings.ejButton
import typingsSlinky.ejWebAll.ejWebAllStrings.ejCaptcha
import typingsSlinky.ejWebAll.ejWebAllStrings.ejChart
import typingsSlinky.ejWebAll.ejWebAllStrings.ejCheckBox
import typingsSlinky.ejWebAll.ejWebAllStrings.ejCircularGauge
import typingsSlinky.ejWebAll.ejWebAllStrings.ejColorPicker
import typingsSlinky.ejWebAll.ejWebAllStrings.ejComboBox
import typingsSlinky.ejWebAll.ejWebAllStrings.ejCurrencyTextbox
import typingsSlinky.ejWebAll.ejWebAllStrings.ejDatePicker
import typingsSlinky.ejWebAll.ejWebAllStrings.ejDateRangePicker
import typingsSlinky.ejWebAll.ejWebAllStrings.ejDateTimePicker
import typingsSlinky.ejWebAll.ejWebAllStrings.ejDiagram
import typingsSlinky.ejWebAll.ejWebAllStrings.ejDialog
import typingsSlinky.ejWebAll.ejWebAllStrings.ejDigitalGauge
import typingsSlinky.ejWebAll.ejWebAllStrings.ejDocumentEditor
import typingsSlinky.ejWebAll.ejWebAllStrings.ejDraggable
import typingsSlinky.ejWebAll.ejWebAllStrings.ejDropDownList
import typingsSlinky.ejWebAll.ejWebAllStrings.ejDropDownTree
import typingsSlinky.ejWebAll.ejWebAllStrings.ejDroppable
import typingsSlinky.ejWebAll.ejWebAllStrings.ejFileExplorer
import typingsSlinky.ejWebAll.ejWebAllStrings.ejGantt
import typingsSlinky.ejWebAll.ejWebAllStrings.ejGrid
import typingsSlinky.ejWebAll.ejWebAllStrings.ejGroupButton
import typingsSlinky.ejWebAll.ejWebAllStrings.ejHeatMap
import typingsSlinky.ejWebAll.ejWebAllStrings.ejHeatMapLegend
import typingsSlinky.ejWebAll.ejWebAllStrings.ejKanban
import typingsSlinky.ejWebAll.ejWebAllStrings.ejLinearGauge
import typingsSlinky.ejWebAll.ejWebAllStrings.ejListBox
import typingsSlinky.ejWebAll.ejWebAllStrings.ejListView
import typingsSlinky.ejWebAll.ejWebAllStrings.ejMap
import typingsSlinky.ejWebAll.ejWebAllStrings.ejMaskEdit
import typingsSlinky.ejWebAll.ejWebAllStrings.ejMenu
import typingsSlinky.ejWebAll.ejWebAllStrings.ejNavigationDrawer
import typingsSlinky.ejWebAll.ejWebAllStrings.ejNumericTextbox
import typingsSlinky.ejWebAll.ejWebAllStrings.ejOverview
import typingsSlinky.ejWebAll.ejWebAllStrings.ejPager
import typingsSlinky.ejWebAll.ejWebAllStrings.ejPdfViewer
import typingsSlinky.ejWebAll.ejWebAllStrings.ejPercentageTextbox
import typingsSlinky.ejWebAll.ejWebAllStrings.ejPivotChart
import typingsSlinky.ejWebAll.ejWebAllStrings.ejPivotClient
import typingsSlinky.ejWebAll.ejWebAllStrings.ejPivotGauge
import typingsSlinky.ejWebAll.ejWebAllStrings.ejPivotGrid
import typingsSlinky.ejWebAll.ejWebAllStrings.ejPivotPager
import typingsSlinky.ejWebAll.ejWebAllStrings.ejPivotSchemaDesigner
import typingsSlinky.ejWebAll.ejWebAllStrings.ejPivotTreeMap
import typingsSlinky.ejWebAll.ejWebAllStrings.ejPrint
import typingsSlinky.ejWebAll.ejWebAllStrings.ejProgressBar
import typingsSlinky.ejWebAll.ejWebAllStrings.ejRTE
import typingsSlinky.ejWebAll.ejWebAllStrings.ejRadialMenu
import typingsSlinky.ejWebAll.ejWebAllStrings.ejRadialSlider
import typingsSlinky.ejWebAll.ejWebAllStrings.ejRadioButton
import typingsSlinky.ejWebAll.ejWebAllStrings.ejRangeNavigator
import typingsSlinky.ejWebAll.ejWebAllStrings.ejRating
import typingsSlinky.ejWebAll.ejWebAllStrings.ejRecurrenceEditor
import typingsSlinky.ejWebAll.ejWebAllStrings.ejReportDesigner
import typingsSlinky.ejWebAll.ejWebAllStrings.ejReportViewer
import typingsSlinky.ejWebAll.ejWebAllStrings.ejResizable
import typingsSlinky.ejWebAll.ejWebAllStrings.ejRibbon
import typingsSlinky.ejWebAll.ejWebAllStrings.ejRotator
import typingsSlinky.ejWebAll.ejWebAllStrings.ejSchedule
import typingsSlinky.ejWebAll.ejWebAllStrings.ejScroller
import typingsSlinky.ejWebAll.ejWebAllStrings.ejSignature
import typingsSlinky.ejWebAll.ejWebAllStrings.ejSlider
import typingsSlinky.ejWebAll.ejWebAllStrings.ejSparkline
import typingsSlinky.ejWebAll.ejWebAllStrings.ejSpellCheck
import typingsSlinky.ejWebAll.ejWebAllStrings.ejSplitButton
import typingsSlinky.ejWebAll.ejWebAllStrings.ejSplitter
import typingsSlinky.ejWebAll.ejWebAllStrings.ejSpreadsheet
import typingsSlinky.ejWebAll.ejWebAllStrings.ejSunburstChart
import typingsSlinky.ejWebAll.ejWebAllStrings.ejSymbolPalette
import typingsSlinky.ejWebAll.ejWebAllStrings.ejTab
import typingsSlinky.ejWebAll.ejWebAllStrings.ejTagCloud
import typingsSlinky.ejWebAll.ejWebAllStrings.ejTile
import typingsSlinky.ejWebAll.ejWebAllStrings.ejTimePicker
import typingsSlinky.ejWebAll.ejWebAllStrings.ejToggleButton
import typingsSlinky.ejWebAll.ejWebAllStrings.ejToolbar
import typingsSlinky.ejWebAll.ejWebAllStrings.ejTooltip
import typingsSlinky.ejWebAll.ejWebAllStrings.ejTreeGrid
import typingsSlinky.ejWebAll.ejWebAllStrings.ejTreeMap
import typingsSlinky.ejWebAll.ejWebAllStrings.ejTreeView
import typingsSlinky.ejWebAll.ejWebAllStrings.ejUploadbox
import typingsSlinky.ejWebAll.ejWebAllStrings.ejWaitingPopup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def data(key: js.Any): js.Any = js.native
  @JSName("data")
  def data_ejAccordion(key: ejAccordion): Accordion = js.native
  @JSName("data")
  def data_ejAutocomplete(key: ejAutocomplete): Autocomplete = js.native
  @JSName("data")
  def data_ejBarcode(key: ejBarcode): Barcode = js.native
  @JSName("data")
  def data_ejBulletGraph(key: ejBulletGraph): BulletGraph = js.native
  @JSName("data")
  def data_ejButton(key: ejButton): Button = js.native
  @JSName("data")
  def data_ejCaptcha(key: ejCaptcha): Captcha = js.native
  @JSName("data")
  def data_ejChart(key: ejChart): Chart = js.native
  @JSName("data")
  def data_ejCheckBox(key: ejCheckBox): CheckBox = js.native
  @JSName("data")
  def data_ejCircularGauge(key: ejCircularGauge): CircularGauge = js.native
  @JSName("data")
  def data_ejColorPicker(key: ejColorPicker): ColorPicker = js.native
  @JSName("data")
  def data_ejComboBox(key: ejComboBox): ComboBox = js.native
  @JSName("data")
  def data_ejCurrencyTextbox(key: ejCurrencyTextbox): CurrencyTextbox = js.native
  @JSName("data")
  def data_ejDatePicker(key: ejDatePicker): DatePicker = js.native
  @JSName("data")
  def data_ejDateRangePicker(key: ejDateRangePicker): DateRangePicker = js.native
  @JSName("data")
  def data_ejDateTimePicker(key: ejDateTimePicker): DateTimePicker = js.native
  @JSName("data")
  def data_ejDiagram(key: ejDiagram): Diagram = js.native
  @JSName("data")
  def data_ejDialog(key: ejDialog): Dialog = js.native
  @JSName("data")
  def data_ejDigitalGauge(key: ejDigitalGauge): DigitalGauge = js.native
  @JSName("data")
  def data_ejDocumentEditor(key: ejDocumentEditor): DocumentEditor = js.native
  @JSName("data")
  def data_ejDraggable(key: ejDraggable): Draggable = js.native
  @JSName("data")
  def data_ejDropDownList(key: ejDropDownList): DropDownList = js.native
  @JSName("data")
  def data_ejDropDownTree(key: ejDropDownTree): DropDownTree = js.native
  @JSName("data")
  def data_ejDroppable(key: ejDroppable): Droppable = js.native
  @JSName("data")
  def data_ejFileExplorer(key: ejFileExplorer): FileExplorer = js.native
  @JSName("data")
  def data_ejGantt(key: ejGantt): Gantt = js.native
  @JSName("data")
  def data_ejGrid(key: ejGrid): Grid = js.native
  @JSName("data")
  def data_ejGroupButton(key: ejGroupButton): GroupButton = js.native
  @JSName("data")
  def data_ejHeatMap(key: ejHeatMap): HeatMap = js.native
  @JSName("data")
  def data_ejHeatMapLegend(key: ejHeatMapLegend): HeatMapLegend = js.native
  @JSName("data")
  def data_ejKanban(key: ejKanban): Kanban = js.native
  @JSName("data")
  def data_ejLinearGauge(key: ejLinearGauge): LinearGauge = js.native
  @JSName("data")
  def data_ejListBox(key: ejListBox): ListBox = js.native
  @JSName("data")
  def data_ejListView(key: ejListView): ListView = js.native
  @JSName("data")
  def data_ejMap(key: ejMap): Map = js.native
  @JSName("data")
  def data_ejMaskEdit(key: ejMaskEdit): MaskEdit = js.native
  @JSName("data")
  def data_ejMenu(key: ejMenu): Menu = js.native
  @JSName("data")
  def data_ejNavigationDrawer(key: ejNavigationDrawer): NavigationDrawer = js.native
  @JSName("data")
  def data_ejNumericTextbox(key: ejNumericTextbox): NumericTextbox = js.native
  @JSName("data")
  def data_ejOverview(key: ejOverview): Overview = js.native
  @JSName("data")
  def data_ejPager(key: ejPager): Pager = js.native
  @JSName("data")
  def data_ejPdfViewer(key: ejPdfViewer): PdfViewer = js.native
  @JSName("data")
  def data_ejPercentageTextbox(key: ejPercentageTextbox): PercentageTextbox = js.native
  @JSName("data")
  def data_ejPivotChart(key: ejPivotChart): PivotChart = js.native
  @JSName("data")
  def data_ejPivotClient(key: ejPivotClient): PivotClient = js.native
  @JSName("data")
  def data_ejPivotGauge(key: ejPivotGauge): PivotGauge = js.native
  @JSName("data")
  def data_ejPivotGrid(key: ejPivotGrid): PivotGrid = js.native
  @JSName("data")
  def data_ejPivotPager(key: ejPivotPager): PivotPager = js.native
  @JSName("data")
  def data_ejPivotSchemaDesigner(key: ejPivotSchemaDesigner): PivotSchemaDesigner = js.native
  @JSName("data")
  def data_ejPivotTreeMap(key: ejPivotTreeMap): PivotTreeMap = js.native
  @JSName("data")
  def data_ejPrint(key: ejPrint): Print = js.native
  @JSName("data")
  def data_ejProgressBar(key: ejProgressBar): ProgressBar = js.native
  @JSName("data")
  def data_ejRTE(key: ejRTE): RTE = js.native
  @JSName("data")
  def data_ejRadialMenu(key: ejRadialMenu): RadialMenu = js.native
  @JSName("data")
  def data_ejRadialSlider(key: ejRadialSlider): RadialSlider = js.native
  @JSName("data")
  def data_ejRadioButton(key: ejRadioButton): RadioButton = js.native
  @JSName("data")
  def data_ejRangeNavigator(key: ejRangeNavigator): RangeNavigator = js.native
  @JSName("data")
  def data_ejRating(key: ejRating): Rating = js.native
  @JSName("data")
  def data_ejRecurrenceEditor(key: ejRecurrenceEditor): RecurrenceEditor = js.native
  @JSName("data")
  def data_ejReportDesigner(key: ejReportDesigner): ReportDesigner = js.native
  @JSName("data")
  def data_ejReportViewer(key: ejReportViewer): ReportViewer = js.native
  @JSName("data")
  def data_ejResizable(key: ejResizable): Resizable = js.native
  @JSName("data")
  def data_ejRibbon(key: ejRibbon): Ribbon = js.native
  @JSName("data")
  def data_ejRotator(key: ejRotator): Rotator = js.native
  @JSName("data")
  def data_ejSchedule(key: ejSchedule): Schedule = js.native
  @JSName("data")
  def data_ejScroller(key: ejScroller): Scroller = js.native
  @JSName("data")
  def data_ejSignature(key: ejSignature): Signature = js.native
  @JSName("data")
  def data_ejSlider(key: ejSlider): Slider_ = js.native
  @JSName("data")
  def data_ejSparkline(key: ejSparkline): Sparkline = js.native
  @JSName("data")
  def data_ejSpellCheck(key: ejSpellCheck): SpellCheck = js.native
  @JSName("data")
  def data_ejSplitButton(key: ejSplitButton): SplitButton = js.native
  @JSName("data")
  def data_ejSplitter(key: ejSplitter): Splitter = js.native
  @JSName("data")
  def data_ejSpreadsheet(key: ejSpreadsheet): Spreadsheet = js.native
  @JSName("data")
  def data_ejSunburstChart(key: ejSunburstChart): SunburstChart = js.native
  @JSName("data")
  def data_ejSymbolPalette(key: ejSymbolPalette): SymbolPalette = js.native
  @JSName("data")
  def data_ejTab(key: ejTab): Tab = js.native
  @JSName("data")
  def data_ejTagCloud(key: ejTagCloud): TagCloud = js.native
  @JSName("data")
  def data_ejTile(key: ejTile): Tile = js.native
  @JSName("data")
  def data_ejTimePicker(key: ejTimePicker): TimePicker = js.native
  @JSName("data")
  def data_ejToggleButton(key: ejToggleButton): ToggleButton = js.native
  @JSName("data")
  def data_ejToolbar(key: ejToolbar): Toolbar = js.native
  @JSName("data")
  def data_ejTooltip(key: ejTooltip): Tooltip = js.native
  @JSName("data")
  def data_ejTreeGrid(key: ejTreeGrid): TreeGrid = js.native
  @JSName("data")
  def data_ejTreeMap(key: ejTreeMap): TreeMap = js.native
  @JSName("data")
  def data_ejTreeView(key: ejTreeView): TreeView = js.native
  @JSName("data")
  def data_ejUploadbox(key: ejUploadbox): Uploadbox = js.native
  @JSName("data")
  def data_ejWaitingPopup(key: ejWaitingPopup): WaitingPopup = js.native
  
  def ejAccordion(): JQuery = js.native
  def ejAccordion(memberName: js.Any): js.Any = js.native
  def ejAccordion(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejAccordion(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejAccordion(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejAccordion(options: Model): JQuery = js.native
  
  def ejAutocomplete(): JQuery = js.native
  def ejAutocomplete(memberName: js.Any): js.Any = js.native
  def ejAutocomplete(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejAutocomplete(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejAutocomplete(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejAutocomplete(options: typingsSlinky.ejWebAll.ej.Autocomplete.Model): JQuery = js.native
  
  def ejBarcode(): JQuery = js.native
  def ejBarcode(memberName: js.Any): js.Any = js.native
  def ejBarcode(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejBarcode(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejBarcode(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejBarcode(options: typingsSlinky.ejWebAll.ej.Model): JQuery = js.native
  
  def ejBulletGraph(): JQuery = js.native
  def ejBulletGraph(memberName: js.Any): js.Any = js.native
  def ejBulletGraph(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejBulletGraph(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejBulletGraph(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejBulletGraph(options: typingsSlinky.ejWebAll.ej.Model): JQuery = js.native
  
  def ejButton(): JQuery = js.native
  def ejButton(memberName: js.Any): js.Any = js.native
  def ejButton(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejButton(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejButton(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejButton(options: typingsSlinky.ejWebAll.ej.Button.Model): JQuery = js.native
  
  def ejCaptcha(): JQuery = js.native
  def ejCaptcha(memberName: js.Any): js.Any = js.native
  def ejCaptcha(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejCaptcha(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejCaptcha(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejCaptcha(options: typingsSlinky.ejWebAll.ej.Captcha.Model): JQuery = js.native
  
  def ejChart(): JQuery = js.native
  def ejChart(memberName: js.Any): js.Any = js.native
  def ejChart(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejChart(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejChart(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejChart(options: typingsSlinky.ejWebAll.ej.Model): JQuery = js.native
  
  def ejCheckBox(): JQuery = js.native
  def ejCheckBox(memberName: js.Any): js.Any = js.native
  def ejCheckBox(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejCheckBox(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejCheckBox(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejCheckBox(options: typingsSlinky.ejWebAll.ej.CheckBox.Model): JQuery = js.native
  
  def ejCircularGauge(): JQuery = js.native
  def ejCircularGauge(memberName: js.Any): js.Any = js.native
  def ejCircularGauge(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejCircularGauge(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejCircularGauge(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejCircularGauge(options: typingsSlinky.ejWebAll.ej.Model): JQuery = js.native
  
  def ejColorPicker(): JQuery = js.native
  def ejColorPicker(memberName: js.Any): js.Any = js.native
  def ejColorPicker(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejColorPicker(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejColorPicker(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejColorPicker(options: typingsSlinky.ejWebAll.ej.ColorPicker.Model): JQuery = js.native
  
  def ejComboBox(): JQuery = js.native
  def ejComboBox(memberName: js.Any): js.Any = js.native
  def ejComboBox(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejComboBox(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejComboBox(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejComboBox(options: typingsSlinky.ejWebAll.ej.ComboBox.Model): JQuery = js.native
  
  def ejCurrencyTextbox(): JQuery = js.native
  def ejCurrencyTextbox(memberName: js.Any): js.Any = js.native
  def ejCurrencyTextbox(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejCurrencyTextbox(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejCurrencyTextbox(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejCurrencyTextbox(options: typingsSlinky.ejWebAll.ej.Editor.Model): JQuery = js.native
  
  def ejDatePicker(): JQuery = js.native
  def ejDatePicker(memberName: js.Any): js.Any = js.native
  def ejDatePicker(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejDatePicker(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejDatePicker(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejDatePicker(options: typingsSlinky.ejWebAll.ej.DatePicker.Model): JQuery = js.native
  
  def ejDateRangePicker(): JQuery = js.native
  def ejDateRangePicker(memberName: js.Any): js.Any = js.native
  def ejDateRangePicker(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejDateRangePicker(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejDateRangePicker(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejDateRangePicker(options: typingsSlinky.ejWebAll.ej.DateRangePicker.Model): JQuery = js.native
  
  def ejDateTimePicker(): JQuery = js.native
  def ejDateTimePicker(memberName: js.Any): js.Any = js.native
  def ejDateTimePicker(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejDateTimePicker(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejDateTimePicker(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejDateTimePicker(options: typingsSlinky.ejWebAll.ej.DateTimePicker.Model): JQuery = js.native
  
  def ejDiagram(): JQuery = js.native
  def ejDiagram(memberName: js.Any): js.Any = js.native
  def ejDiagram(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejDiagram(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejDiagram(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejDiagram(options: typingsSlinky.ejWebAll.ej.Model): JQuery = js.native
  
  def ejDialog(): JQuery = js.native
  def ejDialog(memberName: js.Any): js.Any = js.native
  def ejDialog(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejDialog(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejDialog(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejDialog(options: typingsSlinky.ejWebAll.ej.Dialog.Model): JQuery = js.native
  
  def ejDigitalGauge(): JQuery = js.native
  def ejDigitalGauge(memberName: js.Any): js.Any = js.native
  def ejDigitalGauge(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejDigitalGauge(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejDigitalGauge(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejDigitalGauge(options: typingsSlinky.ejWebAll.ej.Model): JQuery = js.native
  
  def ejDocumentEditor(): JQuery = js.native
  def ejDocumentEditor(memberName: js.Any): js.Any = js.native
  def ejDocumentEditor(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejDocumentEditor(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejDocumentEditor(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejDocumentEditor(options: typingsSlinky.ejWebAll.ej.DocumentEditor.Model): JQuery = js.native
  
  def ejDraggable(): JQuery = js.native
  def ejDraggable(memberName: js.Any): js.Any = js.native
  def ejDraggable(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejDraggable(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejDraggable(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejDraggable(options: typingsSlinky.ejWebAll.ej.Draggable.Model): JQuery = js.native
  
  def ejDropDownList(): JQuery = js.native
  def ejDropDownList(memberName: js.Any): js.Any = js.native
  def ejDropDownList(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejDropDownList(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejDropDownList(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejDropDownList(options: typingsSlinky.ejWebAll.ej.DropDownList.Model): JQuery = js.native
  
  def ejDropDownTree(): JQuery = js.native
  def ejDropDownTree(memberName: js.Any): js.Any = js.native
  def ejDropDownTree(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejDropDownTree(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejDropDownTree(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejDropDownTree(options: typingsSlinky.ejWebAll.ej.DropDownTree.Model): JQuery = js.native
  
  def ejDroppable(): JQuery = js.native
  def ejDroppable(memberName: js.Any): js.Any = js.native
  def ejDroppable(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejDroppable(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejDroppable(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejDroppable(options: typingsSlinky.ejWebAll.ej.Droppable.Model): JQuery = js.native
  
  def ejFileExplorer(): JQuery = js.native
  def ejFileExplorer(memberName: js.Any): js.Any = js.native
  def ejFileExplorer(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejFileExplorer(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejFileExplorer(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejFileExplorer(options: typingsSlinky.ejWebAll.ej.FileExplorer.Model): JQuery = js.native
  
  def ejGantt(): JQuery = js.native
  def ejGantt(memberName: js.Any): js.Any = js.native
  def ejGantt(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejGantt(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejGantt(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejGantt(options: typingsSlinky.ejWebAll.ej.Gantt.Model): JQuery = js.native
  
  def ejGrid(): JQuery = js.native
  def ejGrid(memberName: js.Any): js.Any = js.native
  def ejGrid(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejGrid(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejGrid(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejGrid(options: typingsSlinky.ejWebAll.ej.Grid.Model): JQuery = js.native
  
  def ejGroupButton(): JQuery = js.native
  def ejGroupButton(memberName: js.Any): js.Any = js.native
  def ejGroupButton(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejGroupButton(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejGroupButton(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejGroupButton(options: typingsSlinky.ejWebAll.ej.GroupButton.Model): JQuery = js.native
  
  def ejHeatMap(): JQuery = js.native
  def ejHeatMap(memberName: js.Any): js.Any = js.native
  def ejHeatMap(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejHeatMap(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejHeatMap(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejHeatMap(options: typingsSlinky.ejWebAll.ej.Model): JQuery = js.native
  
  def ejHeatMapLegend(): JQuery = js.native
  def ejHeatMapLegend(memberName: js.Any): js.Any = js.native
  def ejHeatMapLegend(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejHeatMapLegend(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejHeatMapLegend(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejHeatMapLegend(options: typingsSlinky.ejWebAll.ej.datavisualization.HeatMapLegend.Model): JQuery = js.native
  
  def ejKanban(): JQuery = js.native
  def ejKanban(memberName: js.Any): js.Any = js.native
  def ejKanban(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejKanban(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejKanban(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejKanban(options: typingsSlinky.ejWebAll.ej.Kanban.Model): JQuery = js.native
  
  def ejLinearGauge(): JQuery = js.native
  def ejLinearGauge(memberName: js.Any): js.Any = js.native
  def ejLinearGauge(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejLinearGauge(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejLinearGauge(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejLinearGauge(options: typingsSlinky.ejWebAll.ej.Model): JQuery = js.native
  
  def ejListBox(): JQuery = js.native
  def ejListBox(memberName: js.Any): js.Any = js.native
  def ejListBox(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejListBox(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejListBox(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejListBox(options: typingsSlinky.ejWebAll.ej.ListBox.Model): JQuery = js.native
  
  def ejListView(): JQuery = js.native
  def ejListView(memberName: js.Any): js.Any = js.native
  def ejListView(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejListView(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejListView(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejListView(options: typingsSlinky.ejWebAll.ej.ListView.Model): JQuery = js.native
  
  def ejMap(): JQuery = js.native
  def ejMap(memberName: js.Any): js.Any = js.native
  def ejMap(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejMap(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejMap(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejMap(options: typingsSlinky.ejWebAll.ej.Model): JQuery = js.native
  
  def ejMaskEdit(): JQuery = js.native
  def ejMaskEdit(memberName: js.Any): js.Any = js.native
  def ejMaskEdit(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejMaskEdit(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejMaskEdit(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejMaskEdit(options: typingsSlinky.ejWebAll.ej.MaskEdit.Model): JQuery = js.native
  
  def ejMenu(): JQuery = js.native
  def ejMenu(memberName: js.Any): js.Any = js.native
  def ejMenu(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejMenu(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejMenu(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejMenu(options: typingsSlinky.ejWebAll.ej.Menu.Model): JQuery = js.native
  
  def ejNavigationDrawer(): JQuery = js.native
  def ejNavigationDrawer(memberName: js.Any): js.Any = js.native
  def ejNavigationDrawer(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejNavigationDrawer(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejNavigationDrawer(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejNavigationDrawer(options: typingsSlinky.ejWebAll.ej.NavigationDrawer.Model): JQuery = js.native
  
  def ejNumericTextbox(): JQuery = js.native
  def ejNumericTextbox(memberName: js.Any): js.Any = js.native
  def ejNumericTextbox(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejNumericTextbox(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejNumericTextbox(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejNumericTextbox(options: typingsSlinky.ejWebAll.ej.Editor.Model): JQuery = js.native
  
  def ejOverview(): JQuery = js.native
  def ejOverview(memberName: js.Any): js.Any = js.native
  def ejOverview(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejOverview(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejOverview(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejOverview(options: typingsSlinky.ejWebAll.ej.datavisualization.Overview.Model): JQuery = js.native
  
  def ejPager(): JQuery = js.native
  def ejPager(memberName: js.Any): js.Any = js.native
  def ejPager(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejPager(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejPager(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejPager(options: typingsSlinky.ejWebAll.ej.Pager.Model): JQuery = js.native
  
  def ejPdfViewer(): JQuery = js.native
  def ejPdfViewer(memberName: js.Any): js.Any = js.native
  def ejPdfViewer(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejPdfViewer(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejPdfViewer(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejPdfViewer(options: typingsSlinky.ejWebAll.ej.PdfViewer.Model): JQuery = js.native
  
  def ejPercentageTextbox(): JQuery = js.native
  def ejPercentageTextbox(memberName: js.Any): js.Any = js.native
  def ejPercentageTextbox(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejPercentageTextbox(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejPercentageTextbox(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejPercentageTextbox(options: typingsSlinky.ejWebAll.ej.Editor.Model): JQuery = js.native
  
  def ejPivotChart(): JQuery = js.native
  def ejPivotChart(memberName: js.Any): js.Any = js.native
  def ejPivotChart(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejPivotChart(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejPivotChart(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejPivotChart(options: typingsSlinky.ejWebAll.ej.PivotChart.Model): JQuery = js.native
  
  def ejPivotClient(): JQuery = js.native
  def ejPivotClient(memberName: js.Any): js.Any = js.native
  def ejPivotClient(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejPivotClient(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejPivotClient(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejPivotClient(options: typingsSlinky.ejWebAll.ej.PivotClient.Model): JQuery = js.native
  
  def ejPivotGauge(): JQuery = js.native
  def ejPivotGauge(memberName: js.Any): js.Any = js.native
  def ejPivotGauge(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejPivotGauge(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejPivotGauge(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejPivotGauge(options: typingsSlinky.ejWebAll.ej.PivotGauge.Model): JQuery = js.native
  
  def ejPivotGrid(): JQuery = js.native
  def ejPivotGrid(memberName: js.Any): js.Any = js.native
  def ejPivotGrid(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejPivotGrid(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejPivotGrid(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejPivotGrid(options: typingsSlinky.ejWebAll.ej.PivotGrid.Model): JQuery = js.native
  
  def ejPivotPager(): JQuery = js.native
  def ejPivotPager(memberName: js.Any): js.Any = js.native
  def ejPivotPager(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejPivotPager(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejPivotPager(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejPivotPager(options: typingsSlinky.ejWebAll.ej.PivotPager.Model): JQuery = js.native
  
  def ejPivotSchemaDesigner(): JQuery = js.native
  def ejPivotSchemaDesigner(memberName: js.Any): js.Any = js.native
  def ejPivotSchemaDesigner(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejPivotSchemaDesigner(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejPivotSchemaDesigner(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejPivotSchemaDesigner(options: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner.Model): JQuery = js.native
  
  def ejPivotTreeMap(): JQuery = js.native
  def ejPivotTreeMap(memberName: js.Any): js.Any = js.native
  def ejPivotTreeMap(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejPivotTreeMap(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejPivotTreeMap(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejPivotTreeMap(options: typingsSlinky.ejWebAll.ej.PivotTreeMap.Model): JQuery = js.native
  
  def ejPrint(): JQuery = js.native
  def ejPrint(memberName: js.Any): js.Any = js.native
  def ejPrint(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejPrint(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejPrint(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejPrint(options: typingsSlinky.ejWebAll.ej.Print.Model): JQuery = js.native
  
  def ejProgressBar(): JQuery = js.native
  def ejProgressBar(memberName: js.Any): js.Any = js.native
  def ejProgressBar(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejProgressBar(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejProgressBar(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejProgressBar(options: typingsSlinky.ejWebAll.ej.ProgressBar.Model): JQuery = js.native
  
  def ejRTE(): JQuery = js.native
  def ejRTE(memberName: js.Any): js.Any = js.native
  def ejRTE(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejRTE(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejRTE(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejRTE(options: typingsSlinky.ejWebAll.ej.RTE.Model): JQuery = js.native
  
  def ejRadialMenu(): JQuery = js.native
  def ejRadialMenu(memberName: js.Any): js.Any = js.native
  def ejRadialMenu(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejRadialMenu(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejRadialMenu(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejRadialMenu(options: typingsSlinky.ejWebAll.ej.RadialMenu.Model): JQuery = js.native
  
  def ejRadialSlider(): JQuery = js.native
  def ejRadialSlider(memberName: js.Any): js.Any = js.native
  def ejRadialSlider(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejRadialSlider(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejRadialSlider(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejRadialSlider(options: typingsSlinky.ejWebAll.ej.RadialSlider.Model): JQuery = js.native
  
  def ejRadioButton(): JQuery = js.native
  def ejRadioButton(memberName: js.Any): js.Any = js.native
  def ejRadioButton(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejRadioButton(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejRadioButton(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejRadioButton(options: typingsSlinky.ejWebAll.ej.RadioButton.Model): JQuery = js.native
  
  def ejRangeNavigator(): JQuery = js.native
  def ejRangeNavigator(memberName: js.Any): js.Any = js.native
  def ejRangeNavigator(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejRangeNavigator(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejRangeNavigator(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejRangeNavigator(options: typingsSlinky.ejWebAll.ej.Model): JQuery = js.native
  
  def ejRating(): JQuery = js.native
  def ejRating(memberName: js.Any): js.Any = js.native
  def ejRating(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejRating(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejRating(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejRating(options: typingsSlinky.ejWebAll.ej.Rating.Model): JQuery = js.native
  
  def ejRecurrenceEditor(): JQuery = js.native
  def ejRecurrenceEditor(memberName: js.Any): js.Any = js.native
  def ejRecurrenceEditor(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejRecurrenceEditor(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejRecurrenceEditor(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejRecurrenceEditor(options: typingsSlinky.ejWebAll.ej.RecurrenceEditor.Model): JQuery = js.native
  
  def ejReportDesigner(): JQuery = js.native
  def ejReportDesigner(memberName: js.Any): js.Any = js.native
  def ejReportDesigner(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejReportDesigner(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejReportDesigner(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejReportDesigner(options: typingsSlinky.ejWebAll.ej.ReportDesigner.Model): JQuery = js.native
  
  def ejReportViewer(): JQuery = js.native
  def ejReportViewer(memberName: js.Any): js.Any = js.native
  def ejReportViewer(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejReportViewer(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejReportViewer(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejReportViewer(options: typingsSlinky.ejWebAll.ej.ReportViewer.Model): JQuery = js.native
  
  def ejResizable(): JQuery = js.native
  def ejResizable(memberName: js.Any): js.Any = js.native
  def ejResizable(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejResizable(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejResizable(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejResizable(options: typingsSlinky.ejWebAll.ej.Resizable.Model): JQuery = js.native
  
  def ejRibbon(): JQuery = js.native
  def ejRibbon(memberName: js.Any): js.Any = js.native
  def ejRibbon(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejRibbon(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejRibbon(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejRibbon(options: typingsSlinky.ejWebAll.ej.Ribbon.Model): JQuery = js.native
  
  def ejRotator(): JQuery = js.native
  def ejRotator(memberName: js.Any): js.Any = js.native
  def ejRotator(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejRotator(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejRotator(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejRotator(options: typingsSlinky.ejWebAll.ej.Rotator.Model): JQuery = js.native
  
  def ejSchedule(): JQuery = js.native
  def ejSchedule(memberName: js.Any): js.Any = js.native
  def ejSchedule(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejSchedule(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejSchedule(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejSchedule(options: typingsSlinky.ejWebAll.ej.Schedule.Model): JQuery = js.native
  
  def ejScroller(): JQuery = js.native
  def ejScroller(memberName: js.Any): js.Any = js.native
  def ejScroller(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejScroller(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejScroller(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejScroller(options: typingsSlinky.ejWebAll.ej.Scroller.Model): JQuery = js.native
  
  def ejSignature(): JQuery = js.native
  def ejSignature(memberName: js.Any): js.Any = js.native
  def ejSignature(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejSignature(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejSignature(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejSignature(options: typingsSlinky.ejWebAll.ej.Signature.Model): JQuery = js.native
  
  def ejSlider(): JQuery = js.native
  def ejSlider(memberName: js.Any): js.Any = js.native
  def ejSlider(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejSlider(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejSlider(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejSlider(options: typingsSlinky.ejWebAll.ej.Slider_.Model): JQuery = js.native
  
  def ejSparkline(): JQuery = js.native
  def ejSparkline(memberName: js.Any): js.Any = js.native
  def ejSparkline(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejSparkline(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejSparkline(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejSparkline(options: typingsSlinky.ejWebAll.ej.Sparkline.Model): JQuery = js.native
  
  def ejSpellCheck(): JQuery = js.native
  def ejSpellCheck(memberName: js.Any): js.Any = js.native
  def ejSpellCheck(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejSpellCheck(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejSpellCheck(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejSpellCheck(options: typingsSlinky.ejWebAll.ej.SpellCheck.Model): JQuery = js.native
  
  def ejSplitButton(): JQuery = js.native
  def ejSplitButton(memberName: js.Any): js.Any = js.native
  def ejSplitButton(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejSplitButton(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejSplitButton(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejSplitButton(options: typingsSlinky.ejWebAll.ej.SplitButton.Model): JQuery = js.native
  
  def ejSplitter(): JQuery = js.native
  def ejSplitter(memberName: js.Any): js.Any = js.native
  def ejSplitter(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejSplitter(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejSplitter(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejSplitter(options: typingsSlinky.ejWebAll.ej.Splitter.Model): JQuery = js.native
  
  def ejSpreadsheet(): JQuery = js.native
  def ejSpreadsheet(memberName: js.Any): js.Any = js.native
  def ejSpreadsheet(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejSpreadsheet(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejSpreadsheet(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejSpreadsheet(options: typingsSlinky.ejWebAll.ej.Spreadsheet.Model): JQuery = js.native
  
  def ejSunburstChart(): JQuery = js.native
  def ejSunburstChart(memberName: js.Any): js.Any = js.native
  def ejSunburstChart(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejSunburstChart(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejSunburstChart(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejSunburstChart(options: typingsSlinky.ejWebAll.ej.datavisualization.SunburstChart.Model): JQuery = js.native
  
  def ejSymbolPalette(): JQuery = js.native
  def ejSymbolPalette(memberName: js.Any): js.Any = js.native
  def ejSymbolPalette(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejSymbolPalette(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejSymbolPalette(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejSymbolPalette(options: typingsSlinky.ejWebAll.ej.datavisualization.SymbolPalette.Model): JQuery = js.native
  
  def ejTab(): JQuery = js.native
  def ejTab(memberName: js.Any): js.Any = js.native
  def ejTab(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejTab(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejTab(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejTab(options: typingsSlinky.ejWebAll.ej.Tab.Model): JQuery = js.native
  
  def ejTagCloud(): JQuery = js.native
  def ejTagCloud(memberName: js.Any): js.Any = js.native
  def ejTagCloud(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejTagCloud(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejTagCloud(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejTagCloud(options: typingsSlinky.ejWebAll.ej.TagCloud.Model): JQuery = js.native
  
  def ejTile(): JQuery = js.native
  def ejTile(memberName: js.Any): js.Any = js.native
  def ejTile(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejTile(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejTile(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejTile(options: typingsSlinky.ejWebAll.ej.Tile.Model): JQuery = js.native
  
  def ejTimePicker(): JQuery = js.native
  def ejTimePicker(memberName: js.Any): js.Any = js.native
  def ejTimePicker(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejTimePicker(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejTimePicker(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejTimePicker(options: typingsSlinky.ejWebAll.ej.TimePicker.Model): JQuery = js.native
  
  def ejToggleButton(): JQuery = js.native
  def ejToggleButton(memberName: js.Any): js.Any = js.native
  def ejToggleButton(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejToggleButton(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejToggleButton(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejToggleButton(options: typingsSlinky.ejWebAll.ej.ToggleButton.Model): JQuery = js.native
  
  def ejToolbar(): JQuery = js.native
  def ejToolbar(memberName: js.Any): js.Any = js.native
  def ejToolbar(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejToolbar(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejToolbar(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejToolbar(options: typingsSlinky.ejWebAll.ej.Toolbar.Model): JQuery = js.native
  
  def ejTooltip(): JQuery = js.native
  def ejTooltip(memberName: js.Any): js.Any = js.native
  def ejTooltip(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejTooltip(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejTooltip(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejTooltip(options: typingsSlinky.ejWebAll.ej.Tooltip.Model): JQuery = js.native
  
  def ejTreeGrid(): JQuery = js.native
  def ejTreeGrid(memberName: js.Any): js.Any = js.native
  def ejTreeGrid(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejTreeGrid(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejTreeGrid(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejTreeGrid(options: typingsSlinky.ejWebAll.ej.TreeGrid.Model): JQuery = js.native
  
  def ejTreeMap(): JQuery = js.native
  def ejTreeMap(memberName: js.Any): js.Any = js.native
  def ejTreeMap(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejTreeMap(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejTreeMap(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejTreeMap(options: typingsSlinky.ejWebAll.ej.Model): JQuery = js.native
  
  def ejTreeView(): JQuery = js.native
  def ejTreeView(memberName: js.Any): js.Any = js.native
  def ejTreeView(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejTreeView(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejTreeView(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejTreeView(options: typingsSlinky.ejWebAll.ej.TreeView.Model): JQuery = js.native
  
  def ejUploadbox(): JQuery = js.native
  def ejUploadbox(memberName: js.Any): js.Any = js.native
  def ejUploadbox(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejUploadbox(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejUploadbox(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejUploadbox(options: typingsSlinky.ejWebAll.ej.Uploadbox.Model): JQuery = js.native
  
  def ejWaitingPopup(): JQuery = js.native
  def ejWaitingPopup(memberName: js.Any): js.Any = js.native
  def ejWaitingPopup(memberName: js.Any, value: js.UndefOr[scala.Nothing], param: js.Any): js.Any = js.native
  def ejWaitingPopup(memberName: js.Any, value: js.Any): js.Any = js.native
  def ejWaitingPopup(memberName: js.Any, value: js.Any, param: js.Any): js.Any = js.native
  def ejWaitingPopup(options: typingsSlinky.ejWebAll.ej.WaitingPopup.Model): JQuery = js.native
}
