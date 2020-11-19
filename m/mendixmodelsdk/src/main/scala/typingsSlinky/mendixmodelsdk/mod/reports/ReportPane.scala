package typingsSlinky.mendixmodelsdk.mod.reports

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DivContainer
import typingsSlinky.mendixmodelsdk.pagesMod.pages.GroupBox
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Header
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Layout
import typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridColumn
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ListView
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewTemplate
import typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationListItem
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Snippet
import typingsSlinky.mendixmodelsdk.pagesMod.pages.SplitPane
import typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage
import typingsSlinky.mendixmodelsdk.pagesMod.pages.TableCell
import typingsSlinky.mendixmodelsdk.pagesMod.pages.TemplateGridContents
import typingsSlinky.mendixmodelsdk.pagesMod.pages.VerticalFlow
import typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/report-pane relevant section in reference guide}
  *
  * In version 6.10.0: deleted
  */
@JSImport("mendixmodelsdk", "reports.ReportPane")
@js.native
class ReportPane protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportPane {
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
@JSImport("mendixmodelsdk", "reports.ReportPane")
@js.native
object ReportPane extends js.Object {
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'footerWidget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 6.9.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInDataViewUnderWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'leftWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInHeaderUnderLeftWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'rightWidget' property
    * of the parent pages.Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInHeaderUnderRightWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInLayoutUnderWidget(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInListViewUnderWidget(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'parameterWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'reportWidget' property
    * of the parent ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInSnippetUnderWidget(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'firstWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'secondWidget' property
    * of the parent pages.SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInTabPageUnderWidget(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInTableCellUnderWidget(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widget' property
    * of the parent pages.TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  /**
    * Creates and returns a new ReportPane instance in the SDK and on the server.
    * The new ReportPane will be automatically stored in the 'widgets' property
    * of the parent pages.VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
