package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/layout-grid relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGrid")
@js.native
class LayoutGrid protected () extends ConditionallyVisibleWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def rows: IList[LayoutGridRow] = js.native
  
  def width: ContainerWidth = js.native
  def width_=(newValue: ContainerWidth): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGrid")
@js.native
object LayoutGrid extends js.Object {
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): LayoutGrid = js.native
  
  /**
    * Creates and returns a new LayoutGrid instance in the SDK and on the server.
    * The new LayoutGrid will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): LayoutGrid = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
