package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DivContainer
import typingsSlinky.mendixmodelsdk.pagesMod.pages.EntityWidget
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
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customwidgets {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `CustomWidgets`.
    */
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidget")
  @js.native
  class CustomWidget protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.CustomWidget {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidget {
    
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'parameterWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: ReportPane): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'reportWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: ReportPane): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidget.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType")
  @js.native
  class CustomWidgetAttributeType protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.CustomWidgetAttributeType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object CustomWidgetAttributeType {
    
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.AutoNumber")
    @js.native
    def AutoNumber: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def AutoNumber_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AutoNumber")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Binary")
    @js.native
    def Binary: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Binary_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Boolean")
    @js.native
    def Boolean: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Boolean_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Currency")
    @js.native
    def Currency: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Currency_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Currency")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.DateTime")
    @js.native
    def DateTime: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def DateTime_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Decimal")
    @js.native
    def Decimal: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Decimal_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Enum")
    @js.native
    def Enum: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Enum_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enum")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Float")
    @js.native
    def Float: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Float_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.HashString")
    @js.native
    def HashString: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def HashString_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HashString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Integer")
    @js.native
    def Integer: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Integer_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.Long")
    @js.native
    def Long: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Long_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetAttributeType.String")
    @js.native
    def String: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def String_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.5.0: introduced
    */
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetDatabaseSource")
  @js.native
  class CustomWidgetDatabaseSource protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.CustomWidgetDatabaseSource {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidgetDatabaseSource {
    
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetDatabaseSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetDatabaseSource.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetDatabaseSource = js.native
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
      * of the parent pages.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetDatabaseSource.createInEntityWidgetUnderDataSource")
    @js.native
    def createInEntityWidgetUnderDataSource(container: EntityWidget): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetDatabaseSource = js.native
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetDatabaseSource.createInWidgetValueUnderDataSource")
    @js.native
    def createInWidgetValueUnderDataSource(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetDatabaseSource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetDatabaseSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetDatabaseSource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetType")
  @js.native
  class CustomWidgetType protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.CustomWidgetType {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidgetType {
    
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetType.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetType = js.native
    
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * The new CustomWidgetType will be automatically stored in the 'type' property
      * of the parent CustomWidget element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetType.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetType.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.5.0: introduced
    */
  @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource")
  @js.native
  class CustomWidgetXPathSource protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.CustomWidgetXPathSource {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidgetXPathSource {
    
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
      * of the parent pages.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource.createInEntityWidgetUnderDataSource")
    @js.native
    def createInEntityWidgetUnderDataSource(container: EntityWidget): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource.createInWidgetValueUnderDataSource")
    @js.native
    def createInWidgetValueUnderDataSource(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.IsPath")
  @js.native
  class IsPath protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.IsPath {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object IsPath {
    
    @JSImport("mendixmodelsdk", "customwidgets.IsPath")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.IsPath.No")
    @js.native
    def No: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath = js.native
    @scala.inline
    def No_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("No")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.IsPath.Optional")
    @js.native
    def Optional: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath = js.native
    @scala.inline
    def Optional_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Optional")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.IsPath.Yes")
    @js.native
    def Yes: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath = js.native
    @scala.inline
    def Yes_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Yes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.PathType")
  @js.native
  class PathType protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.PathType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object PathType {
    
    @JSImport("mendixmodelsdk", "customwidgets.PathType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.PathType.None")
    @js.native
    def None: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.PathType = js.native
    @scala.inline
    def None_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.PathType.Reference")
    @js.native
    def Reference: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.PathType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.PathType.ReferenceSet")
    @js.native
    def ReferenceSet: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.PathType = js.native
    @scala.inline
    def ReferenceSet_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Reference_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum")
  @js.native
  class SystemPropertyEnum protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.SystemPropertyEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object SystemPropertyEnum {
    
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum.Editability")
    @js.native
    def Editability: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    @scala.inline
    def Editability_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Editability")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum.Label")
    @js.native
    def Label: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    @scala.inline
    def Label_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum.Name")
    @js.native
    def Name: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    @scala.inline
    def Name_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Name")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum.TabIndex")
    @js.native
    def TabIndex: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    @scala.inline
    def TabIndex_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabIndex")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.SystemPropertyEnum.Visibility")
    @js.native
    def Visibility: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    @scala.inline
    def Visibility_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetEnumerationValue")
  @js.native
  class WidgetEnumerationValue protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetEnumerationValue {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetEnumerationValue {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetEnumerationValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetEnumerationValue.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetEnumerationValue = js.native
    
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * The new WidgetEnumerationValue will be automatically stored in the 'enumerationValues' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetEnumerationValue.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetEnumerationValue = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetEnumerationValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetEnumerationValue.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetObject")
  @js.native
  class WidgetObject protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetObject {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetObject {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObject.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject = js.native
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'object' property
      * of the parent CustomWidget element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObject.createInCustomWidgetUnderObject")
    @js.native
    def createInCustomWidgetUnderObject(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject = js.native
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'objects' property
      * of the parent WidgetValue element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObject.createInWidgetValueUnderObjects")
    @js.native
    def createInWidgetValueUnderObjects(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObject.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObject.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType")
  @js.native
  class WidgetObjectType protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetObjectType {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetObjectType {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent CustomWidgetType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType.createInCustomWidgetTypeUnderObjectType")
    @js.native
    def createInCustomWidgetTypeUnderObjectType(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetType): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType.createInWidgetValueTypeUnderObjectType")
    @js.native
    def createInWidgetValueTypeUnderObjectType(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetProperty")
  @js.native
  class WidgetProperty protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetProperty {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetProperty {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetProperty")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetProperty.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetProperty = js.native
    
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * The new WidgetProperty will be automatically stored in the 'properties' property
      * of the parent WidgetObject element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetProperty.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetProperty = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetProperty.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetProperty.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetPropertyType")
  @js.native
  class WidgetPropertyType protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetPropertyType {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetPropertyType {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetPropertyType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetPropertyType.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetPropertyType = js.native
    
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * The new WidgetPropertyType will be automatically stored in the 'propertyTypes' property
      * of the parent WidgetObjectType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetPropertyType.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetPropertyType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetPropertyType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetPropertyType.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnType")
  @js.native
  class WidgetReturnType protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetReturnType {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetReturnType {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnType.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnType = js.native
    
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * The new WidgetReturnType will be automatically stored in the 'returnType' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnType.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnType.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum")
  @js.native
  class WidgetReturnTypeEnum protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetReturnTypeEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object WidgetReturnTypeEnum {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Boolean")
    @js.native
    def Boolean: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Boolean_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.DateTime")
    @js.native
    def DateTime: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def DateTime_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Decimal")
    @js.native
    def Decimal: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Decimal_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Float")
    @js.native
    def Float: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Float_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Integer")
    @js.native
    def Integer: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Integer_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Object")
    @js.native
    def Object: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Object_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.String")
    @js.native
    def String: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def String_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetReturnTypeEnum.Void")
    @js.native
    def Void: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Void_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Void")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetTranslation")
  @js.native
  class WidgetTranslation protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetTranslation {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetTranslation {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetTranslation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetTranslation.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetTranslation = js.native
    
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * The new WidgetTranslation will be automatically stored in the 'translations' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetTranslation.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetTranslation = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetTranslation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetTranslation.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetValue")
  @js.native
  class WidgetValue protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetValue {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetValue {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValue.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue = js.native
    
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * The new WidgetValue will be automatically stored in the 'value' property
      * of the parent WidgetProperty element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValue.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetProperty): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValue.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetValueType")
  @js.native
  class WidgetValueType protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetValueType {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetValueType {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueType.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType = js.native
    
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * The new WidgetValueType will be automatically stored in the 'valueType' property
      * of the parent WidgetPropertyType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueType.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetPropertyType): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueType.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum")
  @js.native
  class WidgetValueTypeEnum protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetValueTypeEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object WidgetValueTypeEnum {
    
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Action")
    @js.native
    def Action: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Action_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Action")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Attribute")
    @js.native
    def Attribute: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Attribute_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Boolean")
    @js.native
    def Boolean: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Boolean_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.DataSource")
    @js.native
    def DataSource: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def DataSource_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Decimal")
    @js.native
    def Decimal: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Decimal_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Entity")
    @js.native
    def Entity: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.EntityConstraint")
    @js.native
    def EntityConstraint: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def EntityConstraint_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EntityConstraint")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Entity_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Entity")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Enumeration")
    @js.native
    def Enumeration: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Enumeration_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enumeration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Expression")
    @js.native
    def Expression: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Expression_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expression")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.File")
    @js.native
    def File: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def File_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Form")
    @js.native
    def Form: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Form_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Icon")
    @js.native
    def Icon: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Icon_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Image")
    @js.native
    def Image: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Image_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Integer")
    @js.native
    def Integer: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Integer_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Microflow")
    @js.native
    def Microflow: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Microflow_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Microflow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Nanoflow")
    @js.native
    def Nanoflow: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Nanoflow_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Nanoflow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Object")
    @js.native
    def Object: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Object_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.String")
    @js.native
    def String: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def String_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.System")
    @js.native
    def System: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def System_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("System")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.TextTemplate")
    @js.native
    def TextTemplate: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def TextTemplate_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.TranslatableString")
    @js.native
    def TranslatableString: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def TranslatableString_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TranslatableString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "customwidgets.WidgetValueTypeEnum.Widgets")
    @js.native
    def Widgets: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Widgets_=(x: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Widgets")(x.asInstanceOf[js.Any])
  }
}
