package typingsSlinky.kendoUi

import typingsSlinky.kendoUi.kendo.dataviz.ui.ArcGauge
import typingsSlinky.kendoUi.kendo.dataviz.ui.ArcGaugeOptions
import typingsSlinky.kendoUi.kendo.dataviz.ui.Barcode
import typingsSlinky.kendoUi.kendo.dataviz.ui.BarcodeOptions
import typingsSlinky.kendoUi.kendo.dataviz.ui.Chart
import typingsSlinky.kendoUi.kendo.dataviz.ui.ChartOptions
import typingsSlinky.kendoUi.kendo.dataviz.ui.Diagram
import typingsSlinky.kendoUi.kendo.dataviz.ui.DiagramOptions
import typingsSlinky.kendoUi.kendo.dataviz.ui.LinearGauge
import typingsSlinky.kendoUi.kendo.dataviz.ui.LinearGaugeOptions
import typingsSlinky.kendoUi.kendo.dataviz.ui.Map
import typingsSlinky.kendoUi.kendo.dataviz.ui.MapOptions
import typingsSlinky.kendoUi.kendo.dataviz.ui.QRCode
import typingsSlinky.kendoUi.kendo.dataviz.ui.QRCodeOptions
import typingsSlinky.kendoUi.kendo.dataviz.ui.RadialGauge
import typingsSlinky.kendoUi.kendo.dataviz.ui.RadialGaugeOptions
import typingsSlinky.kendoUi.kendo.dataviz.ui.Sparkline
import typingsSlinky.kendoUi.kendo.dataviz.ui.SparklineOptions
import typingsSlinky.kendoUi.kendo.dataviz.ui.StockChart
import typingsSlinky.kendoUi.kendo.dataviz.ui.StockChartOptions
import typingsSlinky.kendoUi.kendo.dataviz.ui.TreeMap
import typingsSlinky.kendoUi.kendo.dataviz.ui.TreeMapOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.ActionSheet
import typingsSlinky.kendoUi.kendo.mobile.ui.ActionSheetOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.BackButton
import typingsSlinky.kendoUi.kendo.mobile.ui.BackButtonOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.Collapsible
import typingsSlinky.kendoUi.kendo.mobile.ui.CollapsibleOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.DetailButton
import typingsSlinky.kendoUi.kendo.mobile.ui.DetailButtonOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.Layout
import typingsSlinky.kendoUi.kendo.mobile.ui.LayoutOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.Loader
import typingsSlinky.kendoUi.kendo.mobile.ui.LoaderOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.ModalView
import typingsSlinky.kendoUi.kendo.mobile.ui.ModalViewOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.NavBar
import typingsSlinky.kendoUi.kendo.mobile.ui.NavBarOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.Pane
import typingsSlinky.kendoUi.kendo.mobile.ui.PaneOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.PopOver
import typingsSlinky.kendoUi.kendo.mobile.ui.PopOverOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.ScrollView
import typingsSlinky.kendoUi.kendo.mobile.ui.ScrollViewOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.Scroller
import typingsSlinky.kendoUi.kendo.mobile.ui.ScrollerOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.SplitView
import typingsSlinky.kendoUi.kendo.mobile.ui.SplitViewOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.Switch
import typingsSlinky.kendoUi.kendo.mobile.ui.SwitchOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.TabStrip
import typingsSlinky.kendoUi.kendo.mobile.ui.TabStripOptions
import typingsSlinky.kendoUi.kendo.mobile.ui.View
import typingsSlinky.kendoUi.kendo.mobile.ui.ViewOptions
import typingsSlinky.kendoUi.kendo.ui.Alert
import typingsSlinky.kendoUi.kendo.ui.AlertOptions
import typingsSlinky.kendoUi.kendo.ui.AutoComplete
import typingsSlinky.kendoUi.kendo.ui.AutoCompleteOptions
import typingsSlinky.kendoUi.kendo.ui.Button
import typingsSlinky.kendoUi.kendo.ui.ButtonGroup
import typingsSlinky.kendoUi.kendo.ui.ButtonGroupOptions
import typingsSlinky.kendoUi.kendo.ui.ButtonOptions
import typingsSlinky.kendoUi.kendo.ui.Calendar
import typingsSlinky.kendoUi.kendo.ui.CalendarOptions
import typingsSlinky.kendoUi.kendo.ui.Chat
import typingsSlinky.kendoUi.kendo.ui.ChatOptions
import typingsSlinky.kendoUi.kendo.ui.ColorPalette
import typingsSlinky.kendoUi.kendo.ui.ColorPaletteOptions
import typingsSlinky.kendoUi.kendo.ui.ColorPicker
import typingsSlinky.kendoUi.kendo.ui.ColorPickerOptions
import typingsSlinky.kendoUi.kendo.ui.ComboBox
import typingsSlinky.kendoUi.kendo.ui.ComboBoxOptions
import typingsSlinky.kendoUi.kendo.ui.Confirm
import typingsSlinky.kendoUi.kendo.ui.ConfirmOptions
import typingsSlinky.kendoUi.kendo.ui.ContextMenu
import typingsSlinky.kendoUi.kendo.ui.ContextMenuOptions
import typingsSlinky.kendoUi.kendo.ui.DateInput
import typingsSlinky.kendoUi.kendo.ui.DateInputOptions
import typingsSlinky.kendoUi.kendo.ui.DatePicker
import typingsSlinky.kendoUi.kendo.ui.DatePickerOptions
import typingsSlinky.kendoUi.kendo.ui.DateRangePicker
import typingsSlinky.kendoUi.kendo.ui.DateRangePickerOptions
import typingsSlinky.kendoUi.kendo.ui.DateTimePicker
import typingsSlinky.kendoUi.kendo.ui.DateTimePickerOptions
import typingsSlinky.kendoUi.kendo.ui.Dialog
import typingsSlinky.kendoUi.kendo.ui.DialogOptions
import typingsSlinky.kendoUi.kendo.ui.Draggable
import typingsSlinky.kendoUi.kendo.ui.DraggableOptions
import typingsSlinky.kendoUi.kendo.ui.Drawer
import typingsSlinky.kendoUi.kendo.ui.DrawerOptions
import typingsSlinky.kendoUi.kendo.ui.DropDownList
import typingsSlinky.kendoUi.kendo.ui.DropDownListOptions
import typingsSlinky.kendoUi.kendo.ui.DropDownTree
import typingsSlinky.kendoUi.kendo.ui.DropDownTreeOptions
import typingsSlinky.kendoUi.kendo.ui.DropTarget
import typingsSlinky.kendoUi.kendo.ui.DropTargetArea
import typingsSlinky.kendoUi.kendo.ui.DropTargetAreaOptions
import typingsSlinky.kendoUi.kendo.ui.DropTargetOptions
import typingsSlinky.kendoUi.kendo.ui.EditorOptions
import typingsSlinky.kendoUi.kendo.ui.Editor_
import typingsSlinky.kendoUi.kendo.ui.Filter
import typingsSlinky.kendoUi.kendo.ui.FilterMenu
import typingsSlinky.kendoUi.kendo.ui.FilterMenuOptions
import typingsSlinky.kendoUi.kendo.ui.FilterOptions
import typingsSlinky.kendoUi.kendo.ui.FlatColorPicker
import typingsSlinky.kendoUi.kendo.ui.FlatColorPickerOptions
import typingsSlinky.kendoUi.kendo.ui.Gantt
import typingsSlinky.kendoUi.kendo.ui.GanttOptions
import typingsSlinky.kendoUi.kendo.ui.Grid
import typingsSlinky.kendoUi.kendo.ui.GridOptions
import typingsSlinky.kendoUi.kendo.ui.ListBox
import typingsSlinky.kendoUi.kendo.ui.ListBoxOptions
import typingsSlinky.kendoUi.kendo.ui.ListView
import typingsSlinky.kendoUi.kendo.ui.ListViewOptions
import typingsSlinky.kendoUi.kendo.ui.MaskedTextBox
import typingsSlinky.kendoUi.kendo.ui.MaskedTextBoxOptions
import typingsSlinky.kendoUi.kendo.ui.MediaPlayer
import typingsSlinky.kendoUi.kendo.ui.MediaPlayerOptions
import typingsSlinky.kendoUi.kendo.ui.Menu
import typingsSlinky.kendoUi.kendo.ui.MenuOptions
import typingsSlinky.kendoUi.kendo.ui.MultiColumnComboBox
import typingsSlinky.kendoUi.kendo.ui.MultiColumnComboBoxOptions
import typingsSlinky.kendoUi.kendo.ui.MultiSelect
import typingsSlinky.kendoUi.kendo.ui.MultiSelectOptions
import typingsSlinky.kendoUi.kendo.ui.MultiViewCalendar
import typingsSlinky.kendoUi.kendo.ui.MultiViewCalendarOptions
import typingsSlinky.kendoUi.kendo.ui.Notification
import typingsSlinky.kendoUi.kendo.ui.NotificationOptions
import typingsSlinky.kendoUi.kendo.ui.NumericTextBox
import typingsSlinky.kendoUi.kendo.ui.NumericTextBoxOptions
import typingsSlinky.kendoUi.kendo.ui.PDFViewer
import typingsSlinky.kendoUi.kendo.ui.PDFViewerOptions
import typingsSlinky.kendoUi.kendo.ui.Pager
import typingsSlinky.kendoUi.kendo.ui.PagerOptions
import typingsSlinky.kendoUi.kendo.ui.PanelBar
import typingsSlinky.kendoUi.kendo.ui.PanelBarOptions
import typingsSlinky.kendoUi.kendo.ui.PivotConfigurator
import typingsSlinky.kendoUi.kendo.ui.PivotConfiguratorOptions
import typingsSlinky.kendoUi.kendo.ui.PivotGrid
import typingsSlinky.kendoUi.kendo.ui.PivotGridOptions
import typingsSlinky.kendoUi.kendo.ui.Popup
import typingsSlinky.kendoUi.kendo.ui.PopupOptions
import typingsSlinky.kendoUi.kendo.ui.ProgressBar
import typingsSlinky.kendoUi.kendo.ui.ProgressBarOptions
import typingsSlinky.kendoUi.kendo.ui.Prompt
import typingsSlinky.kendoUi.kendo.ui.PromptOptions
import typingsSlinky.kendoUi.kendo.ui.RangeSlider
import typingsSlinky.kendoUi.kendo.ui.RangeSliderOptions
import typingsSlinky.kendoUi.kendo.ui.Rating
import typingsSlinky.kendoUi.kendo.ui.RatingOptions
import typingsSlinky.kendoUi.kendo.ui.ResponsivePanel
import typingsSlinky.kendoUi.kendo.ui.ResponsivePanelOptions
import typingsSlinky.kendoUi.kendo.ui.Scheduler
import typingsSlinky.kendoUi.kendo.ui.SchedulerOptions
import typingsSlinky.kendoUi.kendo.ui.Slider
import typingsSlinky.kendoUi.kendo.ui.SliderOptions
import typingsSlinky.kendoUi.kendo.ui.Sortable
import typingsSlinky.kendoUi.kendo.ui.SortableOptions
import typingsSlinky.kendoUi.kendo.ui.Splitter
import typingsSlinky.kendoUi.kendo.ui.SplitterOptions
import typingsSlinky.kendoUi.kendo.ui.Spreadsheet
import typingsSlinky.kendoUi.kendo.ui.SpreadsheetOptions
import typingsSlinky.kendoUi.kendo.ui.Stepper
import typingsSlinky.kendoUi.kendo.ui.StepperOptions
import typingsSlinky.kendoUi.kendo.ui.TextBox
import typingsSlinky.kendoUi.kendo.ui.TextBoxOptions
import typingsSlinky.kendoUi.kendo.ui.TileLayout
import typingsSlinky.kendoUi.kendo.ui.TileLayoutOptions
import typingsSlinky.kendoUi.kendo.ui.TimePicker
import typingsSlinky.kendoUi.kendo.ui.TimePickerOptions
import typingsSlinky.kendoUi.kendo.ui.Timeline
import typingsSlinky.kendoUi.kendo.ui.TimelineOptions
import typingsSlinky.kendoUi.kendo.ui.ToolBar
import typingsSlinky.kendoUi.kendo.ui.ToolBarOptions
import typingsSlinky.kendoUi.kendo.ui.Tooltip
import typingsSlinky.kendoUi.kendo.ui.TooltipOptions
import typingsSlinky.kendoUi.kendo.ui.Touch
import typingsSlinky.kendoUi.kendo.ui.TouchOptions
import typingsSlinky.kendoUi.kendo.ui.TreeList
import typingsSlinky.kendoUi.kendo.ui.TreeListOptions
import typingsSlinky.kendoUi.kendo.ui.TreeView
import typingsSlinky.kendoUi.kendo.ui.TreeViewOptions
import typingsSlinky.kendoUi.kendo.ui.Upload
import typingsSlinky.kendoUi.kendo.ui.UploadOptions
import typingsSlinky.kendoUi.kendo.ui.Validator
import typingsSlinky.kendoUi.kendo.ui.ValidatorOptions
import typingsSlinky.kendoUi.kendo.ui.Window
import typingsSlinky.kendoUi.kendo.ui.WindowOptions
import typingsSlinky.kendoUi.kendoUiStrings.kendoAlert
import typingsSlinky.kendoUi.kendoUiStrings.kendoArcGauge
import typingsSlinky.kendoUi.kendoUiStrings.kendoAutoComplete
import typingsSlinky.kendoUi.kendoUiStrings.kendoBarcode
import typingsSlinky.kendoUi.kendoUiStrings.kendoButton
import typingsSlinky.kendoUi.kendoUiStrings.kendoButtonGroup
import typingsSlinky.kendoUi.kendoUiStrings.kendoCalendar
import typingsSlinky.kendoUi.kendoUiStrings.kendoChart
import typingsSlinky.kendoUi.kendoUiStrings.kendoChat
import typingsSlinky.kendoUi.kendoUiStrings.kendoColorPalette
import typingsSlinky.kendoUi.kendoUiStrings.kendoColorPicker
import typingsSlinky.kendoUi.kendoUiStrings.kendoComboBox
import typingsSlinky.kendoUi.kendoUiStrings.kendoConfirm
import typingsSlinky.kendoUi.kendoUiStrings.kendoContextMenu
import typingsSlinky.kendoUi.kendoUiStrings.kendoDateInput
import typingsSlinky.kendoUi.kendoUiStrings.kendoDatePicker
import typingsSlinky.kendoUi.kendoUiStrings.kendoDateRangePicker
import typingsSlinky.kendoUi.kendoUiStrings.kendoDateTimePicker
import typingsSlinky.kendoUi.kendoUiStrings.kendoDiagram
import typingsSlinky.kendoUi.kendoUiStrings.kendoDialog
import typingsSlinky.kendoUi.kendoUiStrings.kendoDraggable
import typingsSlinky.kendoUi.kendoUiStrings.kendoDrawer
import typingsSlinky.kendoUi.kendoUiStrings.kendoDropDownList
import typingsSlinky.kendoUi.kendoUiStrings.kendoDropDownTree
import typingsSlinky.kendoUi.kendoUiStrings.kendoDropTarget
import typingsSlinky.kendoUi.kendoUiStrings.kendoDropTargetArea
import typingsSlinky.kendoUi.kendoUiStrings.kendoEditor
import typingsSlinky.kendoUi.kendoUiStrings.kendoFilter
import typingsSlinky.kendoUi.kendoUiStrings.kendoFilterMenu
import typingsSlinky.kendoUi.kendoUiStrings.kendoFlatColorPicker
import typingsSlinky.kendoUi.kendoUiStrings.kendoGantt
import typingsSlinky.kendoUi.kendoUiStrings.kendoGrid
import typingsSlinky.kendoUi.kendoUiStrings.kendoLinearGauge
import typingsSlinky.kendoUi.kendoUiStrings.kendoListBox
import typingsSlinky.kendoUi.kendoUiStrings.kendoListView
import typingsSlinky.kendoUi.kendoUiStrings.kendoMap
import typingsSlinky.kendoUi.kendoUiStrings.kendoMaskedTextBox
import typingsSlinky.kendoUi.kendoUiStrings.kendoMediaPlayer
import typingsSlinky.kendoUi.kendoUiStrings.kendoMenu
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileActionSheet
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileBackButton
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileButton
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileButtonGroup
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileCollapsible
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileDetailButton
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileDrawer
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileLayout
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileListView
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileLoader
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileModalView
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileNavBar
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobilePane
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobilePopOver
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileScrollView
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileScroller
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileSplitView
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileSwitch
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileTabStrip
import typingsSlinky.kendoUi.kendoUiStrings.kendoMobileView
import typingsSlinky.kendoUi.kendoUiStrings.kendoMultiColumnComboBox
import typingsSlinky.kendoUi.kendoUiStrings.kendoMultiSelect
import typingsSlinky.kendoUi.kendoUiStrings.kendoMultiViewCalendar
import typingsSlinky.kendoUi.kendoUiStrings.kendoNotification
import typingsSlinky.kendoUi.kendoUiStrings.kendoNumericTextBox
import typingsSlinky.kendoUi.kendoUiStrings.kendoPDFViewer
import typingsSlinky.kendoUi.kendoUiStrings.kendoPager
import typingsSlinky.kendoUi.kendoUiStrings.kendoPanelBar
import typingsSlinky.kendoUi.kendoUiStrings.kendoPivotConfigurator
import typingsSlinky.kendoUi.kendoUiStrings.kendoPivotGrid
import typingsSlinky.kendoUi.kendoUiStrings.kendoPopup
import typingsSlinky.kendoUi.kendoUiStrings.kendoProgressBar
import typingsSlinky.kendoUi.kendoUiStrings.kendoPrompt
import typingsSlinky.kendoUi.kendoUiStrings.kendoQRCode
import typingsSlinky.kendoUi.kendoUiStrings.kendoRadialGauge
import typingsSlinky.kendoUi.kendoUiStrings.kendoRangeSlider
import typingsSlinky.kendoUi.kendoUiStrings.kendoRating
import typingsSlinky.kendoUi.kendoUiStrings.kendoResponsivePanel
import typingsSlinky.kendoUi.kendoUiStrings.kendoScheduler
import typingsSlinky.kendoUi.kendoUiStrings.kendoScrollView
import typingsSlinky.kendoUi.kendoUiStrings.kendoSlider
import typingsSlinky.kendoUi.kendoUiStrings.kendoSortable
import typingsSlinky.kendoUi.kendoUiStrings.kendoSparkline
import typingsSlinky.kendoUi.kendoUiStrings.kendoSplitter
import typingsSlinky.kendoUi.kendoUiStrings.kendoSpreadsheet
import typingsSlinky.kendoUi.kendoUiStrings.kendoStepper
import typingsSlinky.kendoUi.kendoUiStrings.kendoStockChart
import typingsSlinky.kendoUi.kendoUiStrings.kendoSwitch
import typingsSlinky.kendoUi.kendoUiStrings.kendoTabStrip
import typingsSlinky.kendoUi.kendoUiStrings.kendoTextBox
import typingsSlinky.kendoUi.kendoUiStrings.kendoTileLayout
import typingsSlinky.kendoUi.kendoUiStrings.kendoTimePicker
import typingsSlinky.kendoUi.kendoUiStrings.kendoTimeline
import typingsSlinky.kendoUi.kendoUiStrings.kendoToolBar
import typingsSlinky.kendoUi.kendoUiStrings.kendoTooltip
import typingsSlinky.kendoUi.kendoUiStrings.kendoTouch
import typingsSlinky.kendoUi.kendoUiStrings.kendoTreeList
import typingsSlinky.kendoUi.kendoUiStrings.kendoTreeMap
import typingsSlinky.kendoUi.kendoUiStrings.kendoTreeView
import typingsSlinky.kendoUi.kendoUiStrings.kendoUpload
import typingsSlinky.kendoUi.kendoUiStrings.kendoValidator
import typingsSlinky.kendoUi.kendoUiStrings.kendoWindow
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
  def data_kendoDrawer(key: kendoDrawer): Drawer = js.native
  @JSName("data")
  def data_kendoDropDownList(key: kendoDropDownList): DropDownList = js.native
  @JSName("data")
  def data_kendoDropDownTree(key: kendoDropDownTree): DropDownTree = js.native
  @JSName("data")
  def data_kendoDropTarget(key: kendoDropTarget): DropTarget = js.native
  @JSName("data")
  def data_kendoDropTargetArea(key: kendoDropTargetArea): DropTargetArea = js.native
  @JSName("data")
  def data_kendoEditor(key: kendoEditor): Editor_ = js.native
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
  def data_kendoMobileButton(key: kendoMobileButton): typingsSlinky.kendoUi.kendo.mobile.ui.Button = js.native
  @JSName("data")
  def data_kendoMobileButtonGroup(key: kendoMobileButtonGroup): typingsSlinky.kendoUi.kendo.mobile.ui.ButtonGroup = js.native
  @JSName("data")
  def data_kendoMobileCollapsible(key: kendoMobileCollapsible): Collapsible = js.native
  @JSName("data")
  def data_kendoMobileDetailButton(key: kendoMobileDetailButton): DetailButton = js.native
  @JSName("data")
  def data_kendoMobileDrawer(key: kendoMobileDrawer): typingsSlinky.kendoUi.kendo.mobile.ui.Drawer = js.native
  @JSName("data")
  def data_kendoMobileLayout(key: kendoMobileLayout): Layout = js.native
  @JSName("data")
  def data_kendoMobileListView(key: kendoMobileListView): typingsSlinky.kendoUi.kendo.mobile.ui.ListView = js.native
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
  def data_kendoScrollView(key: kendoScrollView): typingsSlinky.kendoUi.kendo.ui.ScrollView = js.native
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
  def data_kendoStepper(key: kendoStepper): Stepper = js.native
  @JSName("data")
  def data_kendoStockChart(key: kendoStockChart): StockChart = js.native
  @JSName("data")
  def data_kendoSwitch(key: kendoSwitch): typingsSlinky.kendoUi.kendo.ui.Switch = js.native
  @JSName("data")
  def data_kendoTabStrip(key: kendoTabStrip): typingsSlinky.kendoUi.kendo.ui.TabStrip = js.native
  @JSName("data")
  def data_kendoTextBox(key: kendoTextBox): TextBox = js.native
  @JSName("data")
  def data_kendoTileLayout(key: kendoTileLayout): TileLayout = js.native
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
  def kendoDrawer(): JQuery = js.native
  def kendoDrawer(options: DrawerOptions): JQuery = js.native
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
  def kendoMobileButton(options: typingsSlinky.kendoUi.kendo.mobile.ui.ButtonOptions): JQuery = js.native
  def kendoMobileButtonGroup(): JQuery = js.native
  def kendoMobileButtonGroup(options: typingsSlinky.kendoUi.kendo.mobile.ui.ButtonGroupOptions): JQuery = js.native
  def kendoMobileCollapsible(): JQuery = js.native
  def kendoMobileCollapsible(options: CollapsibleOptions): JQuery = js.native
  def kendoMobileDetailButton(): JQuery = js.native
  def kendoMobileDetailButton(options: DetailButtonOptions): JQuery = js.native
  def kendoMobileDrawer(): JQuery = js.native
  def kendoMobileDrawer(options: typingsSlinky.kendoUi.kendo.mobile.ui.DrawerOptions): JQuery = js.native
  def kendoMobileLayout(): JQuery = js.native
  def kendoMobileLayout(options: LayoutOptions): JQuery = js.native
  def kendoMobileListView(): JQuery = js.native
  def kendoMobileListView(options: typingsSlinky.kendoUi.kendo.mobile.ui.ListViewOptions): JQuery = js.native
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
  def kendoScrollView(options: typingsSlinky.kendoUi.kendo.ui.ScrollViewOptions): JQuery = js.native
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
  def kendoStepper(): JQuery = js.native
  def kendoStepper(options: StepperOptions): JQuery = js.native
  def kendoStockChart(): JQuery = js.native
  def kendoStockChart(options: StockChartOptions): JQuery = js.native
  def kendoSwitch(): JQuery = js.native
  def kendoSwitch(options: typingsSlinky.kendoUi.kendo.ui.SwitchOptions): JQuery = js.native
  def kendoTabStrip(): JQuery = js.native
  def kendoTabStrip(options: typingsSlinky.kendoUi.kendo.ui.TabStripOptions): JQuery = js.native
  def kendoTextBox(): JQuery = js.native
  def kendoTextBox(options: TextBoxOptions): JQuery = js.native
  def kendoTileLayout(): JQuery = js.native
  def kendoTileLayout(options: TileLayoutOptions): JQuery = js.native
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

