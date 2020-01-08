package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportPane
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.0.2: deleted
  */
@JSImport("mendixmodelsdk", "pages.SyncButton")
@js.native
class SyncButton protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.SyncButton {
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
@JSImport("mendixmodelsdk", "pages.SyncButton")
@js.native
object SyncButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.1
    */
  def createInDataViewUnderFooterWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DataView): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInDataViewUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DataView): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInDivContainerUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DivContainer): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInGroupBoxUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.GroupBox): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInHeaderUnderLeftWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Header): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInHeaderUnderRightWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Header): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutCallArgumentUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.LayoutCallArgument): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutGridColumnUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.LayoutGridColumn): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInLayoutUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Layout): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInListViewTemplateUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInListViewUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListView): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInNavigationListItemUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.NavigationListItem): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInScrollContainerRegionUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSnippetUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Snippet): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSplitPaneUnderFirstWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SplitPane): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInSplitPaneUnderSecondWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SplitPane): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTabPageUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.TabPage): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTableCellUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.TableCell): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInTemplateGridContentsUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.TemplateGridContents): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
  /**
    * Creates and returns a new SyncButton instance in the SDK and on the server.
    * The new SyncButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInVerticalFlowUnderWidgets(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.VerticalFlow): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SyncButton = js.native
}

