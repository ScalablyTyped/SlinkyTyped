package typingsSlinky.kendoDashUi

import typingsSlinky.kendoDashUi.kendo.dataviz.ui.ArcGauge
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.ArcGaugeOptions
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.Barcode
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.BarcodeOptions
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.Chart
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.ChartOptions
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.Diagram
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.DiagramOptions
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.LinearGauge
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.LinearGaugeOptions
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.Map
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.MapOptions
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.QRCode
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.QRCodeOptions
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.RadialGauge
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.RadialGaugeOptions
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.Sparkline
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.SparklineOptions
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.StockChart
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.StockChartOptions
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.TreeMap
import typingsSlinky.kendoDashUi.kendo.dataviz.ui.TreeMapOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.ActionSheet
import typingsSlinky.kendoDashUi.kendo.mobile.ui.ActionSheetOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.BackButton
import typingsSlinky.kendoDashUi.kendo.mobile.ui.BackButtonOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.Collapsible
import typingsSlinky.kendoDashUi.kendo.mobile.ui.CollapsibleOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.DetailButton
import typingsSlinky.kendoDashUi.kendo.mobile.ui.DetailButtonOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.Drawer
import typingsSlinky.kendoDashUi.kendo.mobile.ui.DrawerOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.Layout
import typingsSlinky.kendoDashUi.kendo.mobile.ui.LayoutOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.Loader
import typingsSlinky.kendoDashUi.kendo.mobile.ui.LoaderOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.ModalView
import typingsSlinky.kendoDashUi.kendo.mobile.ui.ModalViewOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.NavBar
import typingsSlinky.kendoDashUi.kendo.mobile.ui.NavBarOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.Pane
import typingsSlinky.kendoDashUi.kendo.mobile.ui.PaneOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.PopOver
import typingsSlinky.kendoDashUi.kendo.mobile.ui.PopOverOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.ScrollView
import typingsSlinky.kendoDashUi.kendo.mobile.ui.ScrollViewOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.Scroller
import typingsSlinky.kendoDashUi.kendo.mobile.ui.ScrollerOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.SplitView
import typingsSlinky.kendoDashUi.kendo.mobile.ui.SplitViewOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.Switch
import typingsSlinky.kendoDashUi.kendo.mobile.ui.SwitchOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.TabStrip
import typingsSlinky.kendoDashUi.kendo.mobile.ui.TabStripOptions
import typingsSlinky.kendoDashUi.kendo.mobile.ui.View
import typingsSlinky.kendoDashUi.kendo.mobile.ui.ViewOptions
import typingsSlinky.kendoDashUi.kendo.ui.Alert
import typingsSlinky.kendoDashUi.kendo.ui.AlertOptions
import typingsSlinky.kendoDashUi.kendo.ui.AutoComplete
import typingsSlinky.kendoDashUi.kendo.ui.AutoCompleteOptions
import typingsSlinky.kendoDashUi.kendo.ui.Button
import typingsSlinky.kendoDashUi.kendo.ui.ButtonGroup
import typingsSlinky.kendoDashUi.kendo.ui.ButtonGroupOptions
import typingsSlinky.kendoDashUi.kendo.ui.ButtonOptions
import typingsSlinky.kendoDashUi.kendo.ui.Calendar
import typingsSlinky.kendoDashUi.kendo.ui.CalendarOptions
import typingsSlinky.kendoDashUi.kendo.ui.Chat
import typingsSlinky.kendoDashUi.kendo.ui.ChatOptions
import typingsSlinky.kendoDashUi.kendo.ui.ColorPalette
import typingsSlinky.kendoDashUi.kendo.ui.ColorPaletteOptions
import typingsSlinky.kendoDashUi.kendo.ui.ColorPicker
import typingsSlinky.kendoDashUi.kendo.ui.ColorPickerOptions
import typingsSlinky.kendoDashUi.kendo.ui.ComboBox
import typingsSlinky.kendoDashUi.kendo.ui.ComboBoxOptions
import typingsSlinky.kendoDashUi.kendo.ui.Confirm
import typingsSlinky.kendoDashUi.kendo.ui.ConfirmOptions
import typingsSlinky.kendoDashUi.kendo.ui.ContextMenu
import typingsSlinky.kendoDashUi.kendo.ui.ContextMenuOptions
import typingsSlinky.kendoDashUi.kendo.ui.DateInput
import typingsSlinky.kendoDashUi.kendo.ui.DateInputOptions
import typingsSlinky.kendoDashUi.kendo.ui.DatePicker
import typingsSlinky.kendoDashUi.kendo.ui.DatePickerOptions
import typingsSlinky.kendoDashUi.kendo.ui.DateRangePicker
import typingsSlinky.kendoDashUi.kendo.ui.DateRangePickerOptions
import typingsSlinky.kendoDashUi.kendo.ui.DateTimePicker
import typingsSlinky.kendoDashUi.kendo.ui.DateTimePickerOptions
import typingsSlinky.kendoDashUi.kendo.ui.Dialog
import typingsSlinky.kendoDashUi.kendo.ui.DialogOptions
import typingsSlinky.kendoDashUi.kendo.ui.Draggable
import typingsSlinky.kendoDashUi.kendo.ui.DraggableOptions
import typingsSlinky.kendoDashUi.kendo.ui.DropDownList
import typingsSlinky.kendoDashUi.kendo.ui.DropDownListOptions
import typingsSlinky.kendoDashUi.kendo.ui.DropDownTree
import typingsSlinky.kendoDashUi.kendo.ui.DropDownTreeOptions
import typingsSlinky.kendoDashUi.kendo.ui.DropTarget
import typingsSlinky.kendoDashUi.kendo.ui.DropTargetArea
import typingsSlinky.kendoDashUi.kendo.ui.DropTargetAreaOptions
import typingsSlinky.kendoDashUi.kendo.ui.DropTargetOptions
import typingsSlinky.kendoDashUi.kendo.ui.Editor
import typingsSlinky.kendoDashUi.kendo.ui.EditorOptions
import typingsSlinky.kendoDashUi.kendo.ui.Filter
import typingsSlinky.kendoDashUi.kendo.ui.FilterMenu
import typingsSlinky.kendoDashUi.kendo.ui.FilterMenuOptions
import typingsSlinky.kendoDashUi.kendo.ui.FilterOptions
import typingsSlinky.kendoDashUi.kendo.ui.FlatColorPicker
import typingsSlinky.kendoDashUi.kendo.ui.FlatColorPickerOptions
import typingsSlinky.kendoDashUi.kendo.ui.Gantt
import typingsSlinky.kendoDashUi.kendo.ui.GanttOptions
import typingsSlinky.kendoDashUi.kendo.ui.Grid
import typingsSlinky.kendoDashUi.kendo.ui.GridOptions
import typingsSlinky.kendoDashUi.kendo.ui.ListBox
import typingsSlinky.kendoDashUi.kendo.ui.ListBoxOptions
import typingsSlinky.kendoDashUi.kendo.ui.ListView
import typingsSlinky.kendoDashUi.kendo.ui.ListViewOptions
import typingsSlinky.kendoDashUi.kendo.ui.MaskedTextBox
import typingsSlinky.kendoDashUi.kendo.ui.MaskedTextBoxOptions
import typingsSlinky.kendoDashUi.kendo.ui.MediaPlayer
import typingsSlinky.kendoDashUi.kendo.ui.MediaPlayerOptions
import typingsSlinky.kendoDashUi.kendo.ui.Menu
import typingsSlinky.kendoDashUi.kendo.ui.MenuOptions
import typingsSlinky.kendoDashUi.kendo.ui.MultiColumnComboBox
import typingsSlinky.kendoDashUi.kendo.ui.MultiColumnComboBoxOptions
import typingsSlinky.kendoDashUi.kendo.ui.MultiSelect
import typingsSlinky.kendoDashUi.kendo.ui.MultiSelectOptions
import typingsSlinky.kendoDashUi.kendo.ui.MultiViewCalendar
import typingsSlinky.kendoDashUi.kendo.ui.MultiViewCalendarOptions
import typingsSlinky.kendoDashUi.kendo.ui.Notification
import typingsSlinky.kendoDashUi.kendo.ui.NotificationOptions
import typingsSlinky.kendoDashUi.kendo.ui.NumericTextBox
import typingsSlinky.kendoDashUi.kendo.ui.NumericTextBoxOptions
import typingsSlinky.kendoDashUi.kendo.ui.PDFViewer
import typingsSlinky.kendoDashUi.kendo.ui.PDFViewerOptions
import typingsSlinky.kendoDashUi.kendo.ui.Pager
import typingsSlinky.kendoDashUi.kendo.ui.PagerOptions
import typingsSlinky.kendoDashUi.kendo.ui.PanelBar
import typingsSlinky.kendoDashUi.kendo.ui.PanelBarOptions
import typingsSlinky.kendoDashUi.kendo.ui.PivotConfigurator
import typingsSlinky.kendoDashUi.kendo.ui.PivotConfiguratorOptions
import typingsSlinky.kendoDashUi.kendo.ui.PivotGrid
import typingsSlinky.kendoDashUi.kendo.ui.PivotGridOptions
import typingsSlinky.kendoDashUi.kendo.ui.Popup
import typingsSlinky.kendoDashUi.kendo.ui.PopupOptions
import typingsSlinky.kendoDashUi.kendo.ui.ProgressBar
import typingsSlinky.kendoDashUi.kendo.ui.ProgressBarOptions
import typingsSlinky.kendoDashUi.kendo.ui.Prompt
import typingsSlinky.kendoDashUi.kendo.ui.PromptOptions
import typingsSlinky.kendoDashUi.kendo.ui.RangeSlider
import typingsSlinky.kendoDashUi.kendo.ui.RangeSliderOptions
import typingsSlinky.kendoDashUi.kendo.ui.Rating
import typingsSlinky.kendoDashUi.kendo.ui.RatingOptions
import typingsSlinky.kendoDashUi.kendo.ui.ResponsivePanel
import typingsSlinky.kendoDashUi.kendo.ui.ResponsivePanelOptions
import typingsSlinky.kendoDashUi.kendo.ui.Scheduler
import typingsSlinky.kendoDashUi.kendo.ui.SchedulerOptions
import typingsSlinky.kendoDashUi.kendo.ui.Slider
import typingsSlinky.kendoDashUi.kendo.ui.SliderOptions
import typingsSlinky.kendoDashUi.kendo.ui.Sortable
import typingsSlinky.kendoDashUi.kendo.ui.SortableOptions
import typingsSlinky.kendoDashUi.kendo.ui.Splitter
import typingsSlinky.kendoDashUi.kendo.ui.SplitterOptions
import typingsSlinky.kendoDashUi.kendo.ui.Spreadsheet
import typingsSlinky.kendoDashUi.kendo.ui.SpreadsheetOptions
import typingsSlinky.kendoDashUi.kendo.ui.TimePicker
import typingsSlinky.kendoDashUi.kendo.ui.TimePickerOptions
import typingsSlinky.kendoDashUi.kendo.ui.Timeline
import typingsSlinky.kendoDashUi.kendo.ui.TimelineOptions
import typingsSlinky.kendoDashUi.kendo.ui.ToolBar
import typingsSlinky.kendoDashUi.kendo.ui.ToolBarOptions
import typingsSlinky.kendoDashUi.kendo.ui.Tooltip
import typingsSlinky.kendoDashUi.kendo.ui.TooltipOptions
import typingsSlinky.kendoDashUi.kendo.ui.Touch
import typingsSlinky.kendoDashUi.kendo.ui.TouchOptions
import typingsSlinky.kendoDashUi.kendo.ui.TreeList
import typingsSlinky.kendoDashUi.kendo.ui.TreeListOptions
import typingsSlinky.kendoDashUi.kendo.ui.TreeView
import typingsSlinky.kendoDashUi.kendo.ui.TreeViewOptions
import typingsSlinky.kendoDashUi.kendo.ui.Upload
import typingsSlinky.kendoDashUi.kendo.ui.UploadOptions
import typingsSlinky.kendoDashUi.kendo.ui.Validator
import typingsSlinky.kendoDashUi.kendo.ui.ValidatorOptions
import typingsSlinky.kendoDashUi.kendo.ui.Window
import typingsSlinky.kendoDashUi.kendo.ui.WindowOptions
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoAlert
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoArcGauge
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoAutoComplete
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoBarcode
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoButton
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoButtonGroup
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoCalendar
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoChart
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoChat
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoColorPalette
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoColorPicker
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoComboBox
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoConfirm
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoContextMenu
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoDateInput
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoDatePicker
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoDateRangePicker
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoDateTimePicker
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoDiagram
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoDialog
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoDraggable
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoDropDownList
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoDropDownTree
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoDropTarget
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoDropTargetArea
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoEditor
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoFilter
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoFilterMenu
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoFlatColorPicker
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoGantt
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoGrid
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoLinearGauge
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoListBox
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoListView
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMap
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMaskedTextBox
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMediaPlayer
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMenu
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileActionSheet
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileBackButton
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileButton
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileButtonGroup
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileCollapsible
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileDetailButton
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileDrawer
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileLayout
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileListView
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileLoader
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileModalView
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileNavBar
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobilePane
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobilePopOver
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileScrollView
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileScroller
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileSplitView
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileSwitch
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileTabStrip
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMobileView
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMultiColumnComboBox
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMultiSelect
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoMultiViewCalendar
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoNotification
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoNumericTextBox
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoPDFViewer
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoPager
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoPanelBar
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoPivotConfigurator
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoPivotGrid
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoPopup
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoProgressBar
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoPrompt
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoQRCode
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoRadialGauge
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoRangeSlider
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoRating
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoResponsivePanel
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoScheduler
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoScrollView
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoSlider
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoSortable
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoSparkline
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoSplitter
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoSpreadsheet
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoStockChart
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoSwitch
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoTabStrip
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoTimePicker
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoTimeline
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoToolBar
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoTooltip
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoTouch
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoTreeList
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoTreeMap
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoTreeView
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoUpload
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoValidator
import typingsSlinky.kendoDashUi.kendoDashUiStrings.kendoWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def data(key: js.Any): js.Any = js.native
  @JSName("data")
  def data_kendoAlert(key: kendoAlert): Alert = js.native
  @JSName("data")
  def data_kendoArcGauge(key: kendoArcGauge): ArcGauge = js.native
  @JSName("data")
  def data_kendoAutoComplete(key: kendoAutoComplete): AutoComplete = js.native
  @JSName("data")
  def data_kendoBarcode(key: kendoBarcode): Barcode = js.native
  @JSName("data")
  def data_kendoButton(key: kendoButton): Button = js.native
  @JSName("data")
  def data_kendoButtonGroup(key: kendoButtonGroup): ButtonGroup = js.native
  @JSName("data")
  def data_kendoCalendar(key: kendoCalendar): Calendar = js.native
  @JSName("data")
  def data_kendoChart(key: kendoChart): Chart = js.native
  @JSName("data")
  def data_kendoChat(key: kendoChat): Chat = js.native
  @JSName("data")
  def data_kendoColorPalette(key: kendoColorPalette): ColorPalette = js.native
  @JSName("data")
  def data_kendoColorPicker(key: kendoColorPicker): ColorPicker = js.native
  @JSName("data")
  def data_kendoComboBox(key: kendoComboBox): ComboBox = js.native
  @JSName("data")
  def data_kendoConfirm(key: kendoConfirm): Confirm = js.native
  @JSName("data")
  def data_kendoContextMenu(key: kendoContextMenu): ContextMenu = js.native
  @JSName("data")
  def data_kendoDateInput(key: kendoDateInput): DateInput = js.native
  @JSName("data")
  def data_kendoDatePicker(key: kendoDatePicker): DatePicker = js.native
  @JSName("data")
  def data_kendoDateRangePicker(key: kendoDateRangePicker): DateRangePicker = js.native
  @JSName("data")
  def data_kendoDateTimePicker(key: kendoDateTimePicker): DateTimePicker = js.native
  @JSName("data")
  def data_kendoDiagram(key: kendoDiagram): Diagram = js.native
  @JSName("data")
  def data_kendoDialog(key: kendoDialog): Dialog = js.native
  @JSName("data")
  def data_kendoDraggable(key: kendoDraggable): Draggable = js.native
  @JSName("data")
  def data_kendoDropDownList(key: kendoDropDownList): DropDownList = js.native
  @JSName("data")
  def data_kendoDropDownTree(key: kendoDropDownTree): DropDownTree = js.native
  @JSName("data")
  def data_kendoDropTarget(key: kendoDropTarget): DropTarget = js.native
  @JSName("data")
  def data_kendoDropTargetArea(key: kendoDropTargetArea): DropTargetArea = js.native
  @JSName("data")
  def data_kendoEditor(key: kendoEditor): Editor = js.native
  @JSName("data")
  def data_kendoFilter(key: kendoFilter): Filter = js.native
  @JSName("data")
  def data_kendoFilterMenu(key: kendoFilterMenu): FilterMenu = js.native
  @JSName("data")
  def data_kendoFlatColorPicker(key: kendoFlatColorPicker): FlatColorPicker = js.native
  @JSName("data")
  def data_kendoGantt(key: kendoGantt): Gantt = js.native
  @JSName("data")
  def data_kendoGrid(key: kendoGrid): Grid = js.native
  @JSName("data")
  def data_kendoLinearGauge(key: kendoLinearGauge): LinearGauge = js.native
  @JSName("data")
  def data_kendoListBox(key: kendoListBox): ListBox = js.native
  @JSName("data")
  def data_kendoListView(key: kendoListView): ListView = js.native
  @JSName("data")
  def data_kendoMap(key: kendoMap): Map = js.native
  @JSName("data")
  def data_kendoMaskedTextBox(key: kendoMaskedTextBox): MaskedTextBox = js.native
  @JSName("data")
  def data_kendoMediaPlayer(key: kendoMediaPlayer): MediaPlayer = js.native
  @JSName("data")
  def data_kendoMenu(key: kendoMenu): Menu = js.native
  @JSName("data")
  def data_kendoMobileActionSheet(key: kendoMobileActionSheet): ActionSheet = js.native
  @JSName("data")
  def data_kendoMobileBackButton(key: kendoMobileBackButton): BackButton = js.native
  @JSName("data")
  def data_kendoMobileButton(key: kendoMobileButton): typingsSlinky.kendoDashUi.kendo.mobile.ui.Button = js.native
  @JSName("data")
  def data_kendoMobileButtonGroup(key: kendoMobileButtonGroup): typingsSlinky.kendoDashUi.kendo.mobile.ui.ButtonGroup = js.native
  @JSName("data")
  def data_kendoMobileCollapsible(key: kendoMobileCollapsible): Collapsible = js.native
  @JSName("data")
  def data_kendoMobileDetailButton(key: kendoMobileDetailButton): DetailButton = js.native
  @JSName("data")
  def data_kendoMobileDrawer(key: kendoMobileDrawer): Drawer = js.native
  @JSName("data")
  def data_kendoMobileLayout(key: kendoMobileLayout): Layout = js.native
  @JSName("data")
  def data_kendoMobileListView(key: kendoMobileListView): typingsSlinky.kendoDashUi.kendo.mobile.ui.ListView = js.native
  @JSName("data")
  def data_kendoMobileLoader(key: kendoMobileLoader): Loader = js.native
  @JSName("data")
  def data_kendoMobileModalView(key: kendoMobileModalView): ModalView = js.native
  @JSName("data")
  def data_kendoMobileNavBar(key: kendoMobileNavBar): NavBar = js.native
  @JSName("data")
  def data_kendoMobilePane(key: kendoMobilePane): Pane = js.native
  @JSName("data")
  def data_kendoMobilePopOver(key: kendoMobilePopOver): PopOver = js.native
  @JSName("data")
  def data_kendoMobileScrollView(key: kendoMobileScrollView): ScrollView = js.native
  @JSName("data")
  def data_kendoMobileScroller(key: kendoMobileScroller): Scroller = js.native
  @JSName("data")
  def data_kendoMobileSplitView(key: kendoMobileSplitView): SplitView = js.native
  @JSName("data")
  def data_kendoMobileSwitch(key: kendoMobileSwitch): Switch = js.native
  @JSName("data")
  def data_kendoMobileTabStrip(key: kendoMobileTabStrip): TabStrip = js.native
  @JSName("data")
  def data_kendoMobileView(key: kendoMobileView): View = js.native
  @JSName("data")
  def data_kendoMultiColumnComboBox(key: kendoMultiColumnComboBox): MultiColumnComboBox = js.native
  @JSName("data")
  def data_kendoMultiSelect(key: kendoMultiSelect): MultiSelect = js.native
  @JSName("data")
  def data_kendoMultiViewCalendar(key: kendoMultiViewCalendar): MultiViewCalendar = js.native
  @JSName("data")
  def data_kendoNotification(key: kendoNotification): Notification = js.native
  @JSName("data")
  def data_kendoNumericTextBox(key: kendoNumericTextBox): NumericTextBox = js.native
  @JSName("data")
  def data_kendoPDFViewer(key: kendoPDFViewer): PDFViewer = js.native
  @JSName("data")
  def data_kendoPager(key: kendoPager): Pager = js.native
  @JSName("data")
  def data_kendoPanelBar(key: kendoPanelBar): PanelBar = js.native
  @JSName("data")
  def data_kendoPivotConfigurator(key: kendoPivotConfigurator): PivotConfigurator = js.native
  @JSName("data")
  def data_kendoPivotGrid(key: kendoPivotGrid): PivotGrid = js.native
  @JSName("data")
  def data_kendoPopup(key: kendoPopup): Popup = js.native
  @JSName("data")
  def data_kendoProgressBar(key: kendoProgressBar): ProgressBar = js.native
  @JSName("data")
  def data_kendoPrompt(key: kendoPrompt): Prompt = js.native
  @JSName("data")
  def data_kendoQRCode(key: kendoQRCode): QRCode = js.native
  @JSName("data")
  def data_kendoRadialGauge(key: kendoRadialGauge): RadialGauge = js.native
  @JSName("data")
  def data_kendoRangeSlider(key: kendoRangeSlider): RangeSlider = js.native
  @JSName("data")
  def data_kendoRating(key: kendoRating): Rating = js.native
  @JSName("data")
  def data_kendoResponsivePanel(key: kendoResponsivePanel): ResponsivePanel = js.native
  @JSName("data")
  def data_kendoScheduler(key: kendoScheduler): Scheduler = js.native
  @JSName("data")
  def data_kendoScrollView(key: kendoScrollView): typingsSlinky.kendoDashUi.kendo.ui.ScrollView = js.native
  @JSName("data")
  def data_kendoSlider(key: kendoSlider): Slider = js.native
  @JSName("data")
  def data_kendoSortable(key: kendoSortable): Sortable = js.native
  @JSName("data")
  def data_kendoSparkline(key: kendoSparkline): Sparkline = js.native
  @JSName("data")
  def data_kendoSplitter(key: kendoSplitter): Splitter = js.native
  @JSName("data")
  def data_kendoSpreadsheet(key: kendoSpreadsheet): Spreadsheet = js.native
  @JSName("data")
  def data_kendoStockChart(key: kendoStockChart): StockChart = js.native
  @JSName("data")
  def data_kendoSwitch(key: kendoSwitch): typingsSlinky.kendoDashUi.kendo.ui.Switch = js.native
  @JSName("data")
  def data_kendoTabStrip(key: kendoTabStrip): typingsSlinky.kendoDashUi.kendo.ui.TabStrip = js.native
  @JSName("data")
  def data_kendoTimePicker(key: kendoTimePicker): TimePicker = js.native
  @JSName("data")
  def data_kendoTimeline(key: kendoTimeline): Timeline = js.native
  @JSName("data")
  def data_kendoToolBar(key: kendoToolBar): ToolBar = js.native
  @JSName("data")
  def data_kendoTooltip(key: kendoTooltip): Tooltip = js.native
  @JSName("data")
  def data_kendoTouch(key: kendoTouch): Touch = js.native
  @JSName("data")
  def data_kendoTreeList(key: kendoTreeList): TreeList = js.native
  @JSName("data")
  def data_kendoTreeMap(key: kendoTreeMap): TreeMap = js.native
  @JSName("data")
  def data_kendoTreeView(key: kendoTreeView): TreeView = js.native
  @JSName("data")
  def data_kendoUpload(key: kendoUpload): Upload = js.native
  @JSName("data")
  def data_kendoValidator(key: kendoValidator): Validator = js.native
  @JSName("data")
  def data_kendoWindow(key: kendoWindow): Window = js.native
  def kendoAlert(): JQuery = js.native
  def kendoAlert(options: AlertOptions): JQuery = js.native
  def kendoArcGauge(): JQuery = js.native
  def kendoArcGauge(options: ArcGaugeOptions): JQuery = js.native
  def kendoAutoComplete(): JQuery = js.native
  def kendoAutoComplete(options: AutoCompleteOptions): JQuery = js.native
  def kendoBarcode(): JQuery = js.native
  def kendoBarcode(options: BarcodeOptions): JQuery = js.native
  def kendoButton(): JQuery = js.native
  def kendoButton(options: ButtonOptions): JQuery = js.native
  def kendoButtonGroup(): JQuery = js.native
  def kendoButtonGroup(options: ButtonGroupOptions): JQuery = js.native
  def kendoCalendar(): JQuery = js.native
  def kendoCalendar(options: CalendarOptions): JQuery = js.native
  def kendoChart(): JQuery = js.native
  def kendoChart(options: ChartOptions): JQuery = js.native
  def kendoChat(): JQuery = js.native
  def kendoChat(options: ChatOptions): JQuery = js.native
  def kendoColorPalette(): JQuery = js.native
  def kendoColorPalette(options: ColorPaletteOptions): JQuery = js.native
  def kendoColorPicker(): JQuery = js.native
  def kendoColorPicker(options: ColorPickerOptions): JQuery = js.native
  def kendoComboBox(): JQuery = js.native
  def kendoComboBox(options: ComboBoxOptions): JQuery = js.native
  def kendoConfirm(): JQuery = js.native
  def kendoConfirm(options: ConfirmOptions): JQuery = js.native
  def kendoContextMenu(): JQuery = js.native
  def kendoContextMenu(options: ContextMenuOptions): JQuery = js.native
  def kendoDateInput(): JQuery = js.native
  def kendoDateInput(options: DateInputOptions): JQuery = js.native
  def kendoDatePicker(): JQuery = js.native
  def kendoDatePicker(options: DatePickerOptions): JQuery = js.native
  def kendoDateRangePicker(): JQuery = js.native
  def kendoDateRangePicker(options: DateRangePickerOptions): JQuery = js.native
  def kendoDateTimePicker(): JQuery = js.native
  def kendoDateTimePicker(options: DateTimePickerOptions): JQuery = js.native
  def kendoDiagram(): JQuery = js.native
  def kendoDiagram(options: DiagramOptions): JQuery = js.native
  def kendoDialog(): JQuery = js.native
  def kendoDialog(options: DialogOptions): JQuery = js.native
  def kendoDraggable(): JQuery = js.native
  def kendoDraggable(options: DraggableOptions): JQuery = js.native
  def kendoDropDownList(): JQuery = js.native
  def kendoDropDownList(options: DropDownListOptions): JQuery = js.native
  def kendoDropDownTree(): JQuery = js.native
  def kendoDropDownTree(options: DropDownTreeOptions): JQuery = js.native
  def kendoDropTarget(): JQuery = js.native
  def kendoDropTarget(options: DropTargetOptions): JQuery = js.native
  def kendoDropTargetArea(): JQuery = js.native
  def kendoDropTargetArea(options: DropTargetAreaOptions): JQuery = js.native
  def kendoEditor(): JQuery = js.native
  def kendoEditor(options: EditorOptions): JQuery = js.native
  def kendoFilter(): JQuery = js.native
  def kendoFilter(options: FilterOptions): JQuery = js.native
  def kendoFilterMenu(): JQuery = js.native
  def kendoFilterMenu(options: FilterMenuOptions): JQuery = js.native
  def kendoFlatColorPicker(): JQuery = js.native
  def kendoFlatColorPicker(options: FlatColorPickerOptions): JQuery = js.native
  def kendoGantt(): JQuery = js.native
  def kendoGantt(options: GanttOptions): JQuery = js.native
  def kendoGrid(): JQuery = js.native
  def kendoGrid(options: GridOptions): JQuery = js.native
  def kendoLinearGauge(): JQuery = js.native
  def kendoLinearGauge(options: LinearGaugeOptions): JQuery = js.native
  def kendoListBox(): JQuery = js.native
  def kendoListBox(options: ListBoxOptions): JQuery = js.native
  def kendoListView(): JQuery = js.native
  def kendoListView(options: ListViewOptions): JQuery = js.native
  def kendoMap(): JQuery = js.native
  def kendoMap(options: MapOptions): JQuery = js.native
  def kendoMaskedTextBox(): JQuery = js.native
  def kendoMaskedTextBox(options: MaskedTextBoxOptions): JQuery = js.native
  def kendoMediaPlayer(): JQuery = js.native
  def kendoMediaPlayer(options: MediaPlayerOptions): JQuery = js.native
  def kendoMenu(): JQuery = js.native
  def kendoMenu(options: MenuOptions): JQuery = js.native
  def kendoMobileActionSheet(): JQuery = js.native
  def kendoMobileActionSheet(options: ActionSheetOptions): JQuery = js.native
  def kendoMobileBackButton(): JQuery = js.native
  def kendoMobileBackButton(options: BackButtonOptions): JQuery = js.native
  def kendoMobileButton(): JQuery = js.native
  def kendoMobileButton(options: typingsSlinky.kendoDashUi.kendo.mobile.ui.ButtonOptions): JQuery = js.native
  def kendoMobileButtonGroup(): JQuery = js.native
  def kendoMobileButtonGroup(options: typingsSlinky.kendoDashUi.kendo.mobile.ui.ButtonGroupOptions): JQuery = js.native
  def kendoMobileCollapsible(): JQuery = js.native
  def kendoMobileCollapsible(options: CollapsibleOptions): JQuery = js.native
  def kendoMobileDetailButton(): JQuery = js.native
  def kendoMobileDetailButton(options: DetailButtonOptions): JQuery = js.native
  def kendoMobileDrawer(): JQuery = js.native
  def kendoMobileDrawer(options: DrawerOptions): JQuery = js.native
  def kendoMobileLayout(): JQuery = js.native
  def kendoMobileLayout(options: LayoutOptions): JQuery = js.native
  def kendoMobileListView(): JQuery = js.native
  def kendoMobileListView(options: typingsSlinky.kendoDashUi.kendo.mobile.ui.ListViewOptions): JQuery = js.native
  def kendoMobileLoader(): JQuery = js.native
  def kendoMobileLoader(options: LoaderOptions): JQuery = js.native
  def kendoMobileModalView(): JQuery = js.native
  def kendoMobileModalView(options: ModalViewOptions): JQuery = js.native
  def kendoMobileNavBar(): JQuery = js.native
  def kendoMobileNavBar(options: NavBarOptions): JQuery = js.native
  def kendoMobilePane(): JQuery = js.native
  def kendoMobilePane(options: PaneOptions): JQuery = js.native
  def kendoMobilePopOver(): JQuery = js.native
  def kendoMobilePopOver(options: PopOverOptions): JQuery = js.native
  def kendoMobileScrollView(): JQuery = js.native
  def kendoMobileScrollView(options: ScrollViewOptions): JQuery = js.native
  def kendoMobileScroller(): JQuery = js.native
  def kendoMobileScroller(options: ScrollerOptions): JQuery = js.native
  def kendoMobileSplitView(): JQuery = js.native
  def kendoMobileSplitView(options: SplitViewOptions): JQuery = js.native
  def kendoMobileSwitch(): JQuery = js.native
  def kendoMobileSwitch(options: SwitchOptions): JQuery = js.native
  def kendoMobileTabStrip(): JQuery = js.native
  def kendoMobileTabStrip(options: TabStripOptions): JQuery = js.native
  def kendoMobileView(): JQuery = js.native
  def kendoMobileView(options: ViewOptions): JQuery = js.native
  def kendoMultiColumnComboBox(): JQuery = js.native
  def kendoMultiColumnComboBox(options: MultiColumnComboBoxOptions): JQuery = js.native
  def kendoMultiSelect(): JQuery = js.native
  def kendoMultiSelect(options: MultiSelectOptions): JQuery = js.native
  def kendoMultiViewCalendar(): JQuery = js.native
  def kendoMultiViewCalendar(options: MultiViewCalendarOptions): JQuery = js.native
  def kendoNotification(): JQuery = js.native
  def kendoNotification(options: NotificationOptions): JQuery = js.native
  def kendoNumericTextBox(): JQuery = js.native
  def kendoNumericTextBox(options: NumericTextBoxOptions): JQuery = js.native
  def kendoPDFViewer(): JQuery = js.native
  def kendoPDFViewer(options: PDFViewerOptions): JQuery = js.native
  def kendoPager(): JQuery = js.native
  def kendoPager(options: PagerOptions): JQuery = js.native
  def kendoPanelBar(): JQuery = js.native
  def kendoPanelBar(options: PanelBarOptions): JQuery = js.native
  def kendoPivotConfigurator(): JQuery = js.native
  def kendoPivotConfigurator(options: PivotConfiguratorOptions): JQuery = js.native
  def kendoPivotGrid(): JQuery = js.native
  def kendoPivotGrid(options: PivotGridOptions): JQuery = js.native
  def kendoPopup(): JQuery = js.native
  def kendoPopup(options: PopupOptions): JQuery = js.native
  def kendoProgressBar(): JQuery = js.native
  def kendoProgressBar(options: ProgressBarOptions): JQuery = js.native
  def kendoPrompt(): JQuery = js.native
  def kendoPrompt(options: PromptOptions): JQuery = js.native
  def kendoQRCode(): JQuery = js.native
  def kendoQRCode(options: QRCodeOptions): JQuery = js.native
  def kendoRadialGauge(): JQuery = js.native
  def kendoRadialGauge(options: RadialGaugeOptions): JQuery = js.native
  def kendoRangeSlider(): JQuery = js.native
  def kendoRangeSlider(options: RangeSliderOptions): JQuery = js.native
  def kendoRating(): JQuery = js.native
  def kendoRating(options: RatingOptions): JQuery = js.native
  def kendoResponsivePanel(): JQuery = js.native
  def kendoResponsivePanel(options: ResponsivePanelOptions): JQuery = js.native
  def kendoScheduler(): JQuery = js.native
  def kendoScheduler(options: SchedulerOptions): JQuery = js.native
  def kendoScrollView(): JQuery = js.native
  def kendoScrollView(options: typingsSlinky.kendoDashUi.kendo.ui.ScrollViewOptions): JQuery = js.native
  def kendoSlider(): JQuery = js.native
  def kendoSlider(options: SliderOptions): JQuery = js.native
  def kendoSortable(): JQuery = js.native
  def kendoSortable(options: SortableOptions): JQuery = js.native
  def kendoSparkline(): JQuery = js.native
  def kendoSparkline(options: SparklineOptions): JQuery = js.native
  def kendoSplitter(): JQuery = js.native
  def kendoSplitter(options: SplitterOptions): JQuery = js.native
  def kendoSpreadsheet(): JQuery = js.native
  def kendoSpreadsheet(options: SpreadsheetOptions): JQuery = js.native
  def kendoStockChart(): JQuery = js.native
  def kendoStockChart(options: StockChartOptions): JQuery = js.native
  def kendoSwitch(): JQuery = js.native
  def kendoSwitch(options: typingsSlinky.kendoDashUi.kendo.ui.SwitchOptions): JQuery = js.native
  def kendoTabStrip(): JQuery = js.native
  def kendoTabStrip(options: typingsSlinky.kendoDashUi.kendo.ui.TabStripOptions): JQuery = js.native
  def kendoTimePicker(): JQuery = js.native
  def kendoTimePicker(options: TimePickerOptions): JQuery = js.native
  def kendoTimeline(): JQuery = js.native
  def kendoTimeline(options: TimelineOptions): JQuery = js.native
  def kendoToolBar(): JQuery = js.native
  def kendoToolBar(options: ToolBarOptions): JQuery = js.native
  def kendoTooltip(): JQuery = js.native
  def kendoTooltip(options: TooltipOptions): JQuery = js.native
  def kendoTouch(): JQuery = js.native
  def kendoTouch(options: TouchOptions): JQuery = js.native
  def kendoTreeList(): JQuery = js.native
  def kendoTreeList(options: TreeListOptions): JQuery = js.native
  def kendoTreeMap(): JQuery = js.native
  def kendoTreeMap(options: TreeMapOptions): JQuery = js.native
  def kendoTreeView(): JQuery = js.native
  def kendoTreeView(options: TreeViewOptions): JQuery = js.native
  def kendoUpload(): JQuery = js.native
  def kendoUpload(options: UploadOptions): JQuery = js.native
  def kendoValidator(): JQuery = js.native
  def kendoValidator(options: ValidatorOptions): JQuery = js.native
  def kendoWindow(): JQuery = js.native
  def kendoWindow(options: WindowOptions): JQuery = js.native
}

