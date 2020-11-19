package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/drop-down relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown")
@js.native
class DropDown protected () extends AttributeWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  /**
    * In version 7.2.0: introduced
    */
  def emptyOptionCaption: Text = js.native
  def emptyOptionCaption_=(newValue: Text): Unit = js.native
  
  @JSName("model")
  var model_FDropDown: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDown")
@js.native
object DropDown extends js.Object {
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): DropDown = js.native
  
  /**
    * Creates and returns a new DropDown instance in the SDK and on the server.
    * The new DropDown will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): DropDown = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
