package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.reports

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
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
import typingsSlinky.mendixmodelsdk.distGenReportsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/report-parameter relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown")
@js.native
class ReportDropDown protected ()
  extends typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown")
@js.native
object ReportDropDown extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'footerWidget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'footerWidgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'leftWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'leftWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'rightWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'rightWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'sidebarWidgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'parameterWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'reportWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'firstWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'firstWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'secondWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'secondWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widget' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent pages.WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
  /**
    * Creates and returns a new ReportDropDown instance in the SDK and on the server.
    * The new ReportDropDown will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDropDown = js.native
}

