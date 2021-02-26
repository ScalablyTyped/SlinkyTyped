package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.navigationMod.navigation.NativeNavigationProfile
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ActionButton
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ActionItem
import typingsSlinky.mendixmodelsdk.pagesMod.pages.AssociationWidget
import typingsSlinky.mendixmodelsdk.pagesMod.pages.AttributeWidget
import typingsSlinky.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DivContainer
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DynamicImageViewer
import typingsSlinky.mendixmodelsdk.pagesMod.pages.GridActionButton
import typingsSlinky.mendixmodelsdk.pagesMod.pages.GroupBox
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Header
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
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  @JSImport("mendixmodelsdk", "nativepages.BottomBarItem")
  @js.native
  class BottomBarItem protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.nativepages.BottomBarItem {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BottomBarItem {
    
    @JSImport("mendixmodelsdk", "nativepages.BottomBarItem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.BottomBarItem.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem = js.native
    
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * The new BottomBarItem will be automatically stored in the 'bottomBarItems' property
      * of the parent navigation.NativeNavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.BottomBarItem.createIn")
    @js.native
    def createIn(container: NativeNavigationProfile): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.BottomBarItem.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.BottomBarItem.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @JSImport("mendixmodelsdk", "nativepages.NativeLayout")
  @js.native
  class NativeLayout protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.nativepages.NativeLayout {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object NativeLayout {
    
    @JSImport("mendixmodelsdk", "nativepages.NativeLayout")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new NativeLayout unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativeLayout.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativeLayout.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativeLayout.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @JSImport("mendixmodelsdk", "nativepages.NativeLayoutCallArgument")
  @js.native
  class NativeLayoutCallArgument protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.nativepages.NativeLayoutCallArgument {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NativeLayoutCallArgument {
    
    @JSImport("mendixmodelsdk", "nativepages.NativeLayoutCallArgument")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativeLayoutCallArgument.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument = js.native
    
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * The new NativeLayoutCallArgument will be automatically stored in the 'arguments' property
      * of the parent NativePage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativeLayoutCallArgument.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePage): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativeLayoutCallArgument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativeLayoutCallArgument.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @JSImport("mendixmodelsdk", "nativepages.NativePage")
  @js.native
  class NativePage protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.nativepages.NativePage {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object NativePage {
    
    @JSImport("mendixmodelsdk", "nativepages.NativePage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new NativePage unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePage.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePage = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePage.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction")
  @js.native
  class NativePageClientAction protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.nativepages.NativePageClientAction {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NativePageClientAction {
    
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInActionButtonUnderAction")
    @js.native
    def createInActionButtonUnderAction(container: ActionButton): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInActionItemUnderAction")
    @js.native
    def createInActionItemUnderAction(container: ActionItem): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AssociationWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInAssociationWidgetUnderOnChangeAction")
    @js.native
    def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInAttributeWidgetUnderOnChangeAction")
    @js.native
    def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onEnterAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInAttributeWidgetUnderOnEnterAction")
    @js.native
    def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onLeaveAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInAttributeWidgetUnderOnLeaveAction")
    @js.native
    def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.DynamicImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInDynamicImageViewerUnderClickAction")
    @js.native
    def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.GridActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInGridActionButtonUnderAction")
    @js.native
    def createInGridActionButtonUnderAction(container: GridActionButton): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInListViewUnderClickAction")
    @js.native
    def createInListViewUnderClickAction(container: ListView): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInMenuItemUnderAction")
    @js.native
    def createInMenuItemUnderAction(container: MenuItem): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInReferenceSetSelectorUnderOnChangeAction")
    @js.native
    def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.StaticImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInStaticImageViewerUnderClickAction")
    @js.native
    def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.createInWidgetValueUnderAction")
    @js.native
    def createInWidgetValueUnderAction(container: WidgetValue): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePageClientAction.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder")
  @js.native
  class NativePlaceholder protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.nativepages.NativePlaceholder {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NativePlaceholder {
    
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'headerWidget' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "nativepages.NativePlaceholder.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
