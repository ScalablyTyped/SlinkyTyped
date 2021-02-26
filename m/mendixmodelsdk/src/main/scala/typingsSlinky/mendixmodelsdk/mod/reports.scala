package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
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
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reports {
  
  @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum")
  @js.native
  class AggregateFunctionEnum protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.AggregateFunctionEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object AggregateFunctionEnum {
    
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum.Average")
    @js.native
    def Average: typingsSlinky.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    @scala.inline
    def Average_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Average")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum.Count")
    @js.native
    def Count: typingsSlinky.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    @scala.inline
    def Count_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Count")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum.Maximum")
    @js.native
    def Maximum: typingsSlinky.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    @scala.inline
    def Maximum_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum.Minimum")
    @js.native
    def Minimum: typingsSlinky.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    @scala.inline
    def Minimum_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minimum")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum.Sum")
    @js.native
    def Sum: typingsSlinky.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    @scala.inline
    def Sum_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sum")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.AspectRatio")
  @js.native
  class AspectRatio protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.AspectRatio {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object AspectRatio {
    
    @JSImport("mendixmodelsdk", "reports.AspectRatio")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.FourToThree")
    @js.native
    def FourToThree: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def FourToThree_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FourToThree")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.NineToSixteen")
    @js.native
    def NineToSixteen: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def NineToSixteen_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NineToSixteen")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.OneToOne")
    @js.native
    def OneToOne: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def OneToOne_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneToOne")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.SixteenToNine")
    @js.native
    def SixteenToNine: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def SixteenToNine_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SixteenToNine")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.ThreeToFour")
    @js.native
    def ThreeToFour: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def ThreeToFour_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThreeToFour")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.ThreeToTwo")
    @js.native
    def ThreeToTwo: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def ThreeToTwo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThreeToTwo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.TwoToThree")
    @js.native
    def TwoToThree: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def TwoToThree_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TwoToThree")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-grid relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.BasicReport")
  @js.native
  class BasicReport protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.BasicReport {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BasicReport {
    
    @JSImport("mendixmodelsdk", "reports.BasicReport")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: WidgetValue): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.BasicReportAggregate")
  @js.native
  class BasicReportAggregate protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.BasicReportAggregate {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BasicReportAggregate {
    
    @JSImport("mendixmodelsdk", "reports.BasicReportAggregate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportAggregate.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReportAggregate = js.native
    
    /**
      * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
      * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
      * of the parent BasicReport element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportAggregate.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReportAggregate = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportAggregate.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportAggregate.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.BasicReportColumn")
  @js.native
  class BasicReportColumn protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.BasicReportColumn {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BasicReportColumn {
    
    @JSImport("mendixmodelsdk", "reports.BasicReportColumn")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportColumn.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReportColumn = js.native
    
    /**
      * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
      * The new BasicReportColumn will be automatically stored in the 'columns' property
      * of the parent BasicReport element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportColumn.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReportColumn = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportColumn.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportColumn.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.ChartType")
  @js.native
  class ChartType protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ChartType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ChartType {
    
    @JSImport("mendixmodelsdk", "reports.ChartType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ChartType.Area")
    @js.native
    def Area: typingsSlinky.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    @scala.inline
    def Area_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Area")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ChartType.HorizontalBars")
    @js.native
    def HorizontalBars: typingsSlinky.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    @scala.inline
    def HorizontalBars_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HorizontalBars")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ChartType.Lines")
    @js.native
    def Lines: typingsSlinky.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    @scala.inline
    def Lines_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Lines")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ChartType.VerticalBars")
    @js.native
    def VerticalBars: typingsSlinky.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ChartType.VerticalBars3D")
    @js.native
    def VerticalBars3D: typingsSlinky.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    @scala.inline
    def VerticalBars3D_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VerticalBars3D")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VerticalBars_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VerticalBars")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.ColumnFormat")
  @js.native
  class ColumnFormat protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ColumnFormat {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ColumnFormat {
    
    @JSImport("mendixmodelsdk", "reports.ColumnFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ColumnFormat.Default")
    @js.native
    def Default: typingsSlinky.mendixmodelsdk.reportsMod.reports.ColumnFormat = js.native
    @scala.inline
    def Default_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ColumnFormat.MonthName")
    @js.native
    def MonthName: typingsSlinky.mendixmodelsdk.reportsMod.reports.ColumnFormat = js.native
    @scala.inline
    def MonthName_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MonthName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ColumnFormat.WeekdayName")
    @js.native
    def WeekdayName: typingsSlinky.mendixmodelsdk.reportsMod.reports.ColumnFormat = js.native
    @scala.inline
    def WeekdayName_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeekdayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum")
  @js.native
  class DateRangeFieldEnum protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.DateRangeFieldEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DateRangeFieldEnum {
    
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum.Month")
    @js.native
    def Month: typingsSlinky.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    @scala.inline
    def Month_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum.Period")
    @js.native
    def Period: typingsSlinky.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    @scala.inline
    def Period_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Period")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum.Quarter")
    @js.native
    def Quarter: typingsSlinky.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    @scala.inline
    def Quarter_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quarter")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum.Week")
    @js.native
    def Week: typingsSlinky.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    @scala.inline
    def Week_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum.Year")
    @js.native
    def Year: typingsSlinky.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    @scala.inline
    def Year_=(x: typingsSlinky.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-button relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.ReportButton")
  @js.native
  class ReportButton protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportButton {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportButton {
    
    @JSImport("mendixmodelsdk", "reports.ReportButton")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: WidgetValue): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-chart relevant document}
    */
  @JSImport("mendixmodelsdk", "reports.ReportChart")
  @js.native
  class ReportChart protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportChart {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportChart {
    
    @JSImport("mendixmodelsdk", "reports.ReportChart")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: WidgetValue): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.ReportChartSeries")
  @js.native
  class ReportChartSeries protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportChartSeries {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportChartSeries {
    
    @JSImport("mendixmodelsdk", "reports.ReportChartSeries")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChartSeries.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChartSeries = js.native
    
    /**
      * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
      * The new ReportChartSeries will be automatically stored in the 'seriess' property
      * of the parent ReportChart element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChartSeries.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChartSeries = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChartSeries.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChartSeries.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/date-range-field relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.ReportDateRangeField")
  @js.native
  class ReportDateRangeField protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportDateRangeField {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportDateRangeField {
    
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeField")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeField.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeField = js.native
    
    /**
      * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
      * The new ReportDateRangeField will be automatically stored in the 'fields' property
      * of the parent ReportDateRangeSelector element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeField.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeField = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeField.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeField.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-date-parameter relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector")
  @js.native
  class ReportDateRangeSelector protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportDateRangeSelector {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportDateRangeSelector {
    
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: WidgetValue): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-parameter relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.ReportDropDown")
  @js.native
  class ReportDropDown protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportDropDown {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportDropDown {
    
    @JSImport("mendixmodelsdk", "reports.ReportDropDown")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: WidgetValue): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide6/report-pane relevant section in reference guide}
    *
    * In version 6.10.0: deleted
    */
  @JSImport("mendixmodelsdk", "reports.ReportPane")
  @js.native
  class ReportPane protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportPane {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportPane {
    
    @JSImport("mendixmodelsdk", "reports.ReportPane")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.ReportParameter")
  @js.native
  abstract class ReportParameter protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportParameter {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportParameter {
    
    @JSImport("mendixmodelsdk", "reports.ReportParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportParameter.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide/report-widgets relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.ReportWidget")
  @js.native
  abstract class ReportWidget protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportWidget {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportWidget {
    
    @JSImport("mendixmodelsdk", "reports.ReportWidget")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportWidget.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportWidget.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.ReportZoomInfo")
  @js.native
  class ReportZoomInfo protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportZoomInfo {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportZoomInfo {
    
    @JSImport("mendixmodelsdk", "reports.ReportZoomInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomInfo.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportZoomInfo = js.native
    
    /**
      * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
      * The new ReportZoomInfo will be automatically stored in the 'zoomInfo' property
      * of the parent BasicReport element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomInfo.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportZoomInfo = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomInfo.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomInfo.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.ReportZoomMapping")
  @js.native
  class ReportZoomMapping protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportZoomMapping {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportZoomMapping {
    
    @JSImport("mendixmodelsdk", "reports.ReportZoomMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomMapping.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportZoomMapping = js.native
    
    /**
      * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
      * The new ReportZoomMapping will be automatically stored in the 'mappings' property
      * of the parent ReportZoomInfo element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomMapping.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportZoomInfo): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportZoomMapping = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomMapping.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
