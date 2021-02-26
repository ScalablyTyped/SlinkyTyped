package typingsSlinky.mendixmodelsdk.pagesMod.pages

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
  * See: {@link https://docs.mendix.com/refguide/text relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText")
@js.native
class DynamicText protected () extends ConditionallyVisibleWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def content: ClientTemplate = js.native
  def content_=(newValue: ClientTemplate): Unit = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def nativeTextStyle: NativeTextStyle = js.native
  def nativeTextStyle_=(newValue: NativeTextStyle): Unit = js.native
  
  def renderMode: TextRenderMode = js.native
  def renderMode_=(newValue: TextRenderMode): Unit = js.native
}
object DynamicText {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.create")
  @js.native
  def create(model: IModel): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): DynamicText = js.native
  
  /**
    * Creates and returns a new DynamicText instance in the SDK and on the server.
    * The new DynamicText will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): DynamicText = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DynamicText.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
