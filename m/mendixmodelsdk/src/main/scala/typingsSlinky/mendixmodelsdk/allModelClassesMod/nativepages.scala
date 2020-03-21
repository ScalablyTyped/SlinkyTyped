package typingsSlinky.mendixmodelsdk.allModelClassesMod

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages")
@js.native
object nativepages extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `NativePages`.
    */
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: introduced
    */
  @js.native
  class BottomBarItem protected ()
    extends typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @js.native
  class NativeLayout protected ()
    extends typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativeLayoutCallArgument protected ()
    extends typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @js.native
  class NativePage protected ()
    extends typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePage {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativePageClientAction protected ()
    extends typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativePlaceholder protected ()
    extends typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder {
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
  @js.native
  object BottomBarItem extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem = js.native
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * The new BottomBarItem will be automatically stored in the 'bottomBarItems' property
      * of the parent navigation.NativeNavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createIn(container: NativeNavigationProfile): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem = js.native
  }
  
  /* static members */
  @js.native
  object NativeLayout extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new NativeLayout unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout = js.native
  }
  
  /* static members */
  @js.native
  object NativeLayoutCallArgument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument = js.native
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * The new NativeLayoutCallArgument will be automatically stored in the 'arguments' property
      * of the parent NativePage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePage): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument = js.native
  }
  
  /* static members */
  @js.native
  object NativePage extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new NativePage unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePage = js.native
  }
  
  /* static members */
  @js.native
  object NativePageClientAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInActionButtonUnderAction(container: ActionButton): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInActionItemUnderAction(container: ActionItem): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AssociationWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onEnterAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onLeaveAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.DynamicImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.GridActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInGridActionButtonUnderAction(container: GridActionButton): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewUnderClickAction(container: ListView): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInMenuItemUnderAction(container: MenuItem): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.StaticImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInWidgetValueUnderAction(container: WidgetValue): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
  }
  
  /* static members */
  @js.native
  object NativePlaceholder extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDataViewUnderFooterWidgets(container: DataView): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDataViewUnderWidgets(container: DataView): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDivContainerUnderWidgets(container: DivContainer): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInHeaderUnderLeftWidgets(container: Header): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInHeaderUnderRightWidgets(container: Header): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewUnderWidgets(container: ListView): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'headerWidget' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSnippetUnderWidgets(container: Snippet): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTabPageUnderWidgets(container: TabPage): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTableCellUnderWidgets(container: TableCell): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
  }
  
}

