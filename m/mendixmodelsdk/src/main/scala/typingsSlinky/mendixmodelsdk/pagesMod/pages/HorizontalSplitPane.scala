package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/scroll-container relevant section in reference guide}
  *
  * In version 8.0.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane")
@js.native
class HorizontalSplitPane protected () extends SplitPane {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("model")
  var model_FHorizontalSplitPane: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.HorizontalSplitPane")
@js.native
object HorizontalSplitPane extends js.Object {
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInDataViewUnderFooterWidgets(container: DataView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInDataViewUnderWidgets(container: DataView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInDivContainerUnderWidgets(container: DivContainer): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInHeaderUnderLeftWidgets(container: Header): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInHeaderUnderRightWidgets(container: Header): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInListViewUnderWidgets(container: ListView): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSnippetUnderWidgets(container: Snippet): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInTabPageUnderWidgets(container: TabPage): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInTableCellUnderWidgets(container: TableCell): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): HorizontalSplitPane = js.native
  
  /**
    * Creates and returns a new HorizontalSplitPane instance in the SDK and on the server.
    * The new HorizontalSplitPane will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): HorizontalSplitPane = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
