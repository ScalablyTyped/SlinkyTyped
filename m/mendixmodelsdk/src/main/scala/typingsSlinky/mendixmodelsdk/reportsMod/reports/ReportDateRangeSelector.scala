package typingsSlinky.mendixmodelsdk.reportsMod.reports

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DivContainer
import typingsSlinky.mendixmodelsdk.pagesMod.pages.GroupBox
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Header
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Layout
import typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridColumn
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ListView
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewTemplate
import typingsSlinky.mendixmodelsdk.pagesMod.pages.MasterDetailRegion
import typingsSlinky.mendixmodelsdk.pagesMod.pages.NativeLayoutContent
import typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationListItem
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Snippet
import typingsSlinky.mendixmodelsdk.pagesMod.pages.SplitPane
import typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage
import typingsSlinky.mendixmodelsdk.pagesMod.pages.TableCell
import typingsSlinky.mendixmodelsdk.pagesMod.pages.TemplateGridContents
import typingsSlinky.mendixmodelsdk.pagesMod.pages.VerticalFlow
import typingsSlinky.mendixmodelsdk.pagesMod.pages.WebLayoutContent
import typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/report-date-parameter relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector")
@js.native
class ReportDateRangeSelector protected () extends ReportParameter {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def fields: IList[ReportDateRangeField] = js.native
  
  def fieldsPerRow: Double = js.native
  def fieldsPerRow_=(newValue: Double): Unit = js.native
  
  def fromCaption: Text = js.native
  def fromCaption_=(newValue: Text): Unit = js.native
  
  def maxYear: Double = js.native
  def maxYear_=(newValue: Double): Unit = js.native
  
  def minYear: Double = js.native
  def minYear_=(newValue: Double): Unit = js.native
  
  @JSName("model")
  var model_FReportDateRangeSelector: IModel = js.native
  
  def showFromToRange: Boolean = js.native
  def showFromToRange_=(newValue: Boolean): Unit = js.native
  
  def toCaption: Text = js.native
  def toCaption_=(newValue: Text): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector")
@js.native
object ReportDateRangeSelector extends js.Object {
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'footerWidget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'footerWidgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'leftWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'leftWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'rightWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'rightWidgets' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'sidebarWidgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'parameterWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'reportWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'firstWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'firstWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'secondWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'secondWidgets' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent pages.WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportDateRangeSelector = js.native
  
  /**
    * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
    * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): ReportDateRangeSelector = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
