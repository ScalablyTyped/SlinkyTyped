package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientAction
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Icon
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menusMod {
  
  @JSImport("mendixmodelsdk/dist/gen/menus", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object menus {
    
    /**
      * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
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
    - typingsSlinky.mendixmodelsdk.menusMod.menus.IMenuDocument because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuDocument")
    @js.native
    class MenuDocument protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MMenuDocument: FolderBase = js.native
      
      def itemCollection: MenuItemCollection = js.native
      def itemCollection_=(newValue: MenuItemCollection): Unit = js.native
    }
    object MenuDocument {
      
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuDocument")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new MenuDocument unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuDocument.createIn")
      @js.native
      def createIn(container: IFolderBase): MenuDocument = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuDocument.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuDocument.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItem")
    @js.native
    class MenuItem protected () extends MenuItemContainer {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def action: ClientAction = js.native
      def action_=(newValue: ClientAction): Unit = js.native
      
      /**
        * In version 8.12.0: introduced
        */
      def alternativeText: Text | Null = js.native
      def alternativeText_=(newValue: Text | Null): Unit = js.native
      
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
      
      def icon: Icon | Null = js.native
      def icon_=(newValue: Icon | Null): Unit = js.native
    }
    object MenuItem {
      
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItem")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MenuItem instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItem.create")
      @js.native
      def create(model: IModel): MenuItem = js.native
      
      /**
        * Creates and returns a new MenuItem instance in the SDK and on the server.
        * The new MenuItem will be automatically stored in the 'items' property
        * of the parent MenuItemContainer element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItem.createIn")
      @js.native
      def createIn(container: MenuItemContainer): MenuItem = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItem.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItem.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItemCollection")
    @js.native
    class MenuItemCollection protected () extends MenuItemContainer {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object MenuItemCollection {
      
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItemCollection")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItemCollection.create")
      @js.native
      def create(model: IModel): MenuItemCollection = js.native
      
      /**
        * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
        * The new MenuItemCollection will be automatically stored in the 'itemCollection' property
        * of the parent MenuDocument element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItemCollection.createInMenuDocumentUnderItemCollection")
      @js.native
      def createInMenuDocumentUnderItemCollection(container: MenuDocument): MenuItemCollection = js.native
      
      /**
        * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
        * The new MenuItemCollection will be automatically stored in the 'menuItemCollection' property
        * of the parent navigation.NavigationProfile element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItemCollection.createInNavigationProfileUnderMenuItemCollection")
      @js.native
      def createInNavigationProfileUnderMenuItemCollection(container: NavigationProfile): MenuItemCollection = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItemCollection.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItemCollection.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItemContainer")
    @js.native
    abstract class MenuItemContainer protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMenuDocument: MenuDocument = js.native
      
      def containerAsMenuItemContainer: MenuItemContainer = js.native
      
      def containerAsNavigationProfile: NavigationProfile = js.native
      
      def items: IList[MenuItem] = js.native
    }
    object MenuItemContainer {
      
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItemContainer")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItemContainer.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/menus", "menus.MenuItemContainer.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Menus`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
      */
    @js.native
    trait IMenuDocument extends IDocument
  }
}
