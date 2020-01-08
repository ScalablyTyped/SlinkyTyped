package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.distGenMenusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.distGenNavigationMod.navigation.NativeNavigationProfile
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ActionButton
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ActionItem
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AssociationWidget
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.BuildingBlock
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientAction
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DataView
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DivContainer
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DynamicImageViewer
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.FormBase
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.GridActionButton
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.GroupBox
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Header
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.IFormBase
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ILayoutParameter
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Icon
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Layout
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.LayoutCallArgument
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.LayoutGridColumn
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListView
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.NavigationListItem
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ReferenceSetSelector
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Snippet
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SplitPane
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.StaticImageViewer
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.TabPage
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.TableCell
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.TemplateGridContents
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Widget
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.distSdkInternalVersionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/nativepages", JSImport.Namespace)
@js.native
object distGenNativepagesMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
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
    class BottomBarItem protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FBottomBarItem: IModel = js.native
      def action(): ClientAction = js.native
      def action(newValue: ClientAction): js.Any = js.native
      def caption(): Text = js.native
      def caption(newValue: Text): js.Any = js.native
      def containerAsNativeNavigationProfile(): NativeNavigationProfile = js.native
      def icon(): Icon | Null = js.native
      def icon(newValue: Icon): js.Any = js.native
      @JSName("icon")
      def icon_Any(): js.Any = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
      */
    @js.native
    trait INativeLayout extends IFormBase
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
      */
    @js.native
    trait INativePage extends IFormBase
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenPagesMod.pages.IFormBase because Already inherited
    - typings.mendixmodelsdk.distGenNativepagesMod.nativepages.INativeLayout because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class NativeLayout protected () extends FormBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FNativeLayout: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MNativeLayout(): FolderBase = js.native
      /**
        * In version 7.22.0: introduced
        */
      def headerWidget(): Widget | Null = js.native
      def headerWidget(newValue: Widget): js.Any = js.native
      @JSName("headerWidget")
      def headerWidget_Any(): js.Any = js.native
      def widgets(): IList[Widget] = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.0.0: deleted
      * In version 7.23.0: introduced
      */
    @js.native
    class NativeLayoutCallArgument protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FNativeLayoutCallArgument: IModel = js.native
      def containerAsNativePage(): NativePage = js.native
      def parameter(): ILayoutParameter = js.native
      def parameter(newValue: ILayoutParameter): js.Any = js.native
      def parameterQualifiedName(): String = js.native
      def widgets(): IList[Widget] = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.0.0: deleted
      * In version 7.21.0: introduced
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenPagesMod.pages.IFormBase because Already inherited
    - typings.mendixmodelsdk.distGenNativepagesMod.nativepages.INativePage because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class NativePage protected () extends FormBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FNativePage: IModel = js.native
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * In version 7.23.0: introduced
        */
      def arguments(): IList[NativeLayoutCallArgument] = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MNativePage(): FolderBase = js.native
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        */
      def layout(): INativeLayout = js.native
      def layout(newValue: INativeLayout): js.Any = js.native
      def layoutQualifiedName(): String = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.0.0: deleted
      * In version 7.23.0: introduced
      */
    @js.native
    class NativePageClientAction protected () extends ClientAction {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FNativePageClientAction: IModel = js.native
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        */
      def page(): INativePage | Null = js.native
      def page(newValue: INativePage): js.Any = js.native
      def pageQualifiedName(): String | Null = js.native
      @JSName("page")
      def page_Any(): js.Any = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.0.0: deleted
      * In version 7.23.0: introduced
      */
    @js.native
    class NativePlaceholder protected () extends Widget {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FNativePlaceholder: IModel = js.native
    }
    
    /* static members */
    @js.native
    object BottomBarItem extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new BottomBarItem instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): BottomBarItem = js.native
      /**
        * Creates and returns a new BottomBarItem instance in the SDK and on the server.
        * The new BottomBarItem will be automatically stored in the 'bottomBarItems' property
        * of the parent navigation.NativeNavigationProfile element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      def createIn(container: NativeNavigationProfile): BottomBarItem = js.native
    }
    
    /* static members */
    @js.native
    object NativeLayout extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new NativeLayout unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): NativeLayout = js.native
    }
    
    /* static members */
    @js.native
    object NativeLayoutCallArgument extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): NativeLayoutCallArgument = js.native
      /**
        * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
        * The new NativeLayoutCallArgument will be automatically stored in the 'arguments' property
        * of the parent NativePage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createIn(container: NativePage): NativeLayoutCallArgument = js.native
    }
    
    /* static members */
    @js.native
    object NativePage extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new NativePage unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): NativePage = js.native
    }
    
    /* static members */
    @js.native
    object NativePageClientAction extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent pages.ActionButton element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInActionButtonUnderAction(container: ActionButton): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent pages.ActionItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInActionItemUnderAction(container: ActionItem): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
        * of the parent pages.AssociationWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
        * of the parent pages.AttributeWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onEnterAction' property
        * of the parent pages.AttributeWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onLeaveAction' property
        * of the parent pages.AttributeWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'clickAction' property
        * of the parent pages.DynamicImageViewer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent pages.GridActionButton element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInGridActionButtonUnderAction(container: GridActionButton): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'clickAction' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInListViewUnderClickAction(container: ListView): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent menus.MenuItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInMenuItemUnderAction(container: MenuItem): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
        * of the parent pages.ReferenceSetSelector element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'clickAction' property
        * of the parent pages.StaticImageViewer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): NativePageClientAction = js.native
      /**
        * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
        * The new NativePageClientAction will be automatically stored in the 'action' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInWidgetValueUnderAction(container: WidgetValue): NativePageClientAction = js.native
    }
    
    /* static members */
    @js.native
    object NativePlaceholder extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInBuildingBlockUnderWidgets(container: BuildingBlock): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInDataViewUnderFooterWidgets(container: DataView): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInDataViewUnderWidgets(container: DataView): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInDivContainerUnderWidgets(container: DivContainer): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInGroupBoxUnderWidgets(container: GroupBox): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInHeaderUnderLeftWidgets(container: Header): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInHeaderUnderRightWidgets(container: Header): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInLayoutUnderWidgets(container: Layout): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInListViewTemplateUnderWidgets(container: ListViewTemplate): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInListViewUnderWidgets(container: ListView): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'headerWidget' property
        * of the parent NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInNativeLayoutUnderWidgets(container: NativeLayout): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInNavigationListItemUnderWidgets(container: NavigationListItem): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInSnippetUnderWidgets(container: Snippet): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInSplitPaneUnderFirstWidgets(container: SplitPane): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInSplitPaneUnderSecondWidgets(container: SplitPane): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInTabPageUnderWidgets(container: TabPage): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInTableCellUnderWidgets(container: TableCell): NativePlaceholder = js.native
      /**
        * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
        * The new NativePlaceholder will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): NativePlaceholder = js.native
    }
    
  }
  
}

