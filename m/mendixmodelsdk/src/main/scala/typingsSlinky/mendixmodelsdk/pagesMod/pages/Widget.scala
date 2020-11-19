package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Pages`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/pages relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Widget")
@js.native
abstract class Widget protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  /**
    * In version 8.0.0: introduced
    */
  def appearance: Appearance = js.native
  def appearance_=(newValue: Appearance): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  
  def containerAsBuildingBlock: BuildingBlock = js.native
  
  def containerAsDataView: DataView = js.native
  
  def containerAsDivContainer: DivContainer = js.native
  
  def containerAsGroupBox: GroupBox = js.native
  
  def containerAsHeader: Header = js.native
  
  def containerAsLayout: Layout = js.native
  
  def containerAsLayoutCallArgument: LayoutCallArgument = js.native
  
  def containerAsLayoutGridColumn: LayoutGridColumn = js.native
  
  def containerAsListView: ListView = js.native
  
  def containerAsListViewTemplate: ListViewTemplate = js.native
  
  def containerAsMasterDetailRegion: MasterDetailRegion = js.native
  
  def containerAsNativeLayout: NativeLayout = js.native
  
  def containerAsNativeLayoutCallArgument: NativeLayoutCallArgument = js.native
  
  def containerAsNativeLayoutContent: NativeLayoutContent = js.native
  
  def containerAsNavigationListItem: NavigationListItem = js.native
  
  def containerAsReportPane: ReportPane = js.native
  
  def containerAsScrollContainerRegion: ScrollContainerRegion = js.native
  
  def containerAsSnippet: Snippet = js.native
  
  def containerAsSplitPane: SplitPane = js.native
  
  def containerAsTabPage: TabPage = js.native
  
  def containerAsTableCell: TableCell = js.native
  
  def containerAsTemplateGridContents: TemplateGridContents = js.native
  
  def containerAsVerticalFlow: VerticalFlow = js.native
  
  def containerAsWebLayoutContent: WebLayoutContent = js.native
  
  def containerAsWidgetValue: WidgetValue = js.native
  
  @JSName("model")
  var model_FWidget: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  
  def tabIndex: Double = js.native
  def tabIndex_=(newValue: Double): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Widget")
@js.native
object Widget extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
