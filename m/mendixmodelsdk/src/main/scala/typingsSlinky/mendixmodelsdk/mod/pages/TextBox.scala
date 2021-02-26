package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/text-box relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.TextBox")
@js.native
class TextBox protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.TextBox {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object TextBox {
  
  @JSImport("mendixmodelsdk", "pages.TextBox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.BuildingBlock): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.BuildingBlock): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DivContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DivContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GroupBox): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GroupBox): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Header): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Header): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Header): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Header): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Layout): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Layout): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListView): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListView): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.MasterDetailRegion): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.NativeLayoutContent): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.NativeLayoutContent): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationListItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationListItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Snippet): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Snippet): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.SplitPane): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.SplitPane): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.SplitPane): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.SplitPane): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TableCell): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TableCell): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.VerticalFlow): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.WebLayoutContent): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /**
    * Creates and returns a new TextBox instance in the SDK and on the server.
    * The new TextBox will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.TextBox.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
