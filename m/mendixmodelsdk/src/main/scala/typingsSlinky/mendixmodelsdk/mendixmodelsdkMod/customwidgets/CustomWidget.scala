package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.customwidgets

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayout
import typingsSlinky.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.BuildingBlock
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DataView
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DivContainer
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.GroupBox
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Header
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Layout
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.LayoutCallArgument
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.LayoutGridColumn
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListView
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MasterDetailRegion
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.NativeLayoutContent
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.NavigationListItem
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Snippet
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SplitPane
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.TabPage
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.TableCell
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.TemplateGridContents
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.WebLayoutContent
import typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `CustomWidgets`.
  */
@JSImport("mendixmodelsdk", "customwidgets.CustomWidget")
@js.native
class CustomWidget protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.customwidgets.CustomWidget {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "customwidgets.CustomWidget")
@js.native
object CustomWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'footerWidget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'footerWidgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'leftWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'leftWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'rightWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'rightWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'firstWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'firstWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'secondWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'secondWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widget' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent pages.WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
  /**
    * Creates and returns a new CustomWidget instance in the SDK and on the server.
    * The new CustomWidget will be automatically stored in the 'widgets' property
    * of the parent WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget = js.native
}

