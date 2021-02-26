package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.navigationMod.navigation.NativeNavigationProfile
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ActionButton
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ActionItem
import typingsSlinky.mendixmodelsdk.pagesMod.pages.AssociationWidget
import typingsSlinky.mendixmodelsdk.pagesMod.pages.AttributeWidget
import typingsSlinky.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientAction
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DivContainer
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DynamicImageViewer
import typingsSlinky.mendixmodelsdk.pagesMod.pages.FormBase
import typingsSlinky.mendixmodelsdk.pagesMod.pages.GridActionButton
import typingsSlinky.mendixmodelsdk.pagesMod.pages.GroupBox
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Header
import typingsSlinky.mendixmodelsdk.pagesMod.pages.IFormBase
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ILayoutParameter
import typingsSlinky.mendixmodelsdk.pagesMod.pages.IPage
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Icon
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Layout
import typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridColumn
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ListView
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewTemplate
import typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationListItem
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Snippet
import typingsSlinky.mendixmodelsdk.pagesMod.pages.SplitPane
import typingsSlinky.mendixmodelsdk.pagesMod.pages.StaticImageViewer
import typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage
import typingsSlinky.mendixmodelsdk.pagesMod.pages.TableCell
import typingsSlinky.mendixmodelsdk.pagesMod.pages.TemplateGridContents
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Widget
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativepagesMod {
  
  @JSImport("mendixmodelsdk/dist/gen/nativepages", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object nativepages {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `NativePages`.
      */
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.BottomBarItem")
    @js.native
    class BottomBarItem protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * In version 8.15.0: deleted
        */
      def action: ClientAction = js.native
      def action_=(newValue: ClientAction): Unit = js.native
      
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
      
      def containerAsNativeNavigationProfile: NativeNavigationProfile = js.native
      
      def icon: Icon | Null = js.native
      def icon_=(newValue: Icon | Null): Unit = js.native
      
      /**
        * In version 8.15.0: introduced
        */
      def page: IPage | Null = js.native
      
      def pageQualifiedName: String | Null = js.native
      
      def page_=(newValue: IPage | Null): Unit = js.native
    }
    object BottomBarItem {
      
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.BottomBarItem")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new BottomBarItem instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.BottomBarItem.create")
      @js.native
      def create(model: IModel): BottomBarItem = js.native
      
      /**
        * Creates and returns a new BottomBarItem instance in the SDK and on the server.
        * The new BottomBarItem will be automatically stored in the 'bottomBarItems' property
        * of the parent navigation.NativeNavigationProfile element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.BottomBarItem.createIn")
      @js.native
      def createIn(container: NativeNavigationProfile): BottomBarItem = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.BottomBarItem.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.BottomBarItem.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.pagesMod.pages.IFormBase because Already inherited
    - typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.INativeLayout because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativeLayout")
    @js.native
    class NativeLayout protected () extends FormBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MNativeLayout: FolderBase = js.native
      
      /**
        * In version 7.22.0: introduced
        */
      def headerWidget: Widget | Null = js.native
      def headerWidget_=(newValue: Widget | Null): Unit = js.native
      
      def widgets: IList[Widget] = js.native
    }
    object NativeLayout {
      
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativeLayout")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new NativeLayout unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativeLayout.createIn")
      @js.native
      def createIn(container: IFolderBase): NativeLayout = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativeLayout.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativeLayout.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.23.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativeLayoutCallArgument")
    @js.native
    class NativeLayoutCallArgument protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsNativePage: NativePage = js.native
      
      def parameter: ILayoutParameter = js.native
      
      def parameterQualifiedName: String = js.native
      
      def parameter_=(newValue: ILayoutParameter): Unit = js.native
      
      def widgets: IList[Widget] = js.native
    }
    object NativeLayoutCallArgument {
      
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativeLayoutCallArgument")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativeLayoutCallArgument.create")
      @js.native
      def create(model: IModel): NativeLayoutCallArgument = js.native
      
      /**
        * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
        * The new NativeLayoutCallArgument will be automatically stored in the 'arguments' property
        * of the parent NativePage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativeLayoutCallArgument.createIn")
      @js.native
      def createIn(container: NativePage): NativeLayoutCallArgument = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativeLayoutCallArgument.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativeLayoutCallArgument.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.pagesMod.pages.IFormBase because Already inherited
    - typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.INativePage because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePage")
    @js.native
    class NativePage protected () extends FormBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        *
        * In version 7.23.0: introduced
        */
      def arguments: IList[NativeLayoutCallArgument] = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MNativePage: FolderBase = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def layout: INativeLayout = js.native
      
      def layoutQualifiedName: String = js.native
      
      def layout_=(newValue: INativeLayout): Unit = js.native
    }
    object NativePage {
      
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePage")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new NativePage unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePage.createIn")
      @js.native
      def createIn(container: IFolderBase): NativePage = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePage.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePage.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.23.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction")
    @js.native
    class NativePageClientAction protected () extends ClientAction {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def page: INativePage | Null = js.native
      
      def pageQualifiedName: String | Null = js.native
      
      def page_=(newValue: INativePage | Null): Unit = js.native
    }
    object NativePageClientAction {
      
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.create")
      @js.native
      def create(model: IModel): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent pages.ActionButton element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInActionButtonUnderAction")
      @js.native
      def createInActionButtonUnderAction(container: ActionButton): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent pages.ActionItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInActionItemUnderAction")
      @js.native
      def createInActionItemUnderAction(container: ActionItem): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
        * of the parent pages.AssociationWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInAssociationWidgetUnderOnChangeAction")
      @js.native
      def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
        * of the parent pages.AttributeWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInAttributeWidgetUnderOnChangeAction")
      @js.native
      def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onEnterAction' property
        * of the parent pages.AttributeWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInAttributeWidgetUnderOnEnterAction")
      @js.native
      def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onLeaveAction' property
        * of the parent pages.AttributeWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInAttributeWidgetUnderOnLeaveAction")
      @js.native
      def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'clickAction' property
        * of the parent pages.DynamicImageViewer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInDynamicImageViewerUnderClickAction")
      @js.native
      def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent pages.GridActionButton element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInGridActionButtonUnderAction")
      @js.native
      def createInGridActionButtonUnderAction(container: GridActionButton): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'clickAction' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInListViewUnderClickAction")
      @js.native
      def createInListViewUnderClickAction(container: ListView): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent menus.MenuItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInMenuItemUnderAction")
      @js.native
      def createInMenuItemUnderAction(container: MenuItem): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
        * of the parent pages.ReferenceSetSelector element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInReferenceSetSelectorUnderOnChangeAction")
      @js.native
      def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'clickAction' property
        * of the parent pages.StaticImageViewer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInStaticImageViewerUnderClickAction")
      @js.native
      def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): NativePageClientAction = js.native
      
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.createInWidgetValueUnderAction")
      @js.native
      def createInWidgetValueUnderAction(container: WidgetValue): NativePageClientAction = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePageClientAction.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.23.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder")
    @js.native
    class NativePlaceholder protected () extends Widget {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object NativePlaceholder {
      
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.create")
      @js.native
      def create(model: IModel): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInBuildingBlockUnderWidgets")
      @js.native
      def createInBuildingBlockUnderWidgets(container: BuildingBlock): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInDataViewUnderFooterWidgets")
      @js.native
      def createInDataViewUnderFooterWidgets(container: DataView): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInDataViewUnderWidgets")
      @js.native
      def createInDataViewUnderWidgets(container: DataView): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInDivContainerUnderWidgets")
      @js.native
      def createInDivContainerUnderWidgets(container: DivContainer): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInGroupBoxUnderWidgets")
      @js.native
      def createInGroupBoxUnderWidgets(container: GroupBox): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInHeaderUnderLeftWidgets")
      @js.native
      def createInHeaderUnderLeftWidgets(container: Header): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInHeaderUnderRightWidgets")
      @js.native
      def createInHeaderUnderRightWidgets(container: Header): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInLayoutCallArgumentUnderWidgets")
      @js.native
      def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInLayoutGridColumnUnderWidgets")
      @js.native
      def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInLayoutUnderWidgets")
      @js.native
      def createInLayoutUnderWidgets(container: Layout): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInListViewTemplateUnderWidgets")
      @js.native
      def createInListViewTemplateUnderWidgets(container: ListViewTemplate): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInListViewUnderWidgets")
      @js.native
      def createInListViewUnderWidgets(container: ListView): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInNativeLayoutCallArgumentUnderWidgets")
      @js.native
      def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'headerWidget' property
        * of the parent NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInNativeLayoutUnderHeaderWidget")
      @js.native
      def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInNativeLayoutUnderWidgets")
      @js.native
      def createInNativeLayoutUnderWidgets(container: NativeLayout): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInNavigationListItemUnderWidgets")
      @js.native
      def createInNavigationListItemUnderWidgets(container: NavigationListItem): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInScrollContainerRegionUnderWidgets")
      @js.native
      def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInSnippetUnderWidgets")
      @js.native
      def createInSnippetUnderWidgets(container: Snippet): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInSplitPaneUnderFirstWidgets")
      @js.native
      def createInSplitPaneUnderFirstWidgets(container: SplitPane): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInSplitPaneUnderSecondWidgets")
      @js.native
      def createInSplitPaneUnderSecondWidgets(container: SplitPane): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInTabPageUnderWidgets")
      @js.native
      def createInTabPageUnderWidgets(container: TabPage): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInTableCellUnderWidgets")
      @js.native
      def createInTableCellUnderWidgets(container: TableCell): NativePlaceholder = js.native
      
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.createInTemplateGridContentsUnderWidgets")
      @js.native
      def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): NativePlaceholder = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages.NativePlaceholder.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
      */
    @js.native
    trait INativeLayout extends IFormBase
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
      */
    @js.native
    trait INativePage extends IFormBase
  }
}
