package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/password-text-box relevant section in reference guide}
  *
  * In version 7.0.2: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox")
@js.native
class PasswordTextBox protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PasswordTextBox {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.BuildingBlock): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.BuildingBlock): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DivContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DivContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GroupBox): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GroupBox): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Header): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Header): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Header): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Header): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Layout): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Layout): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListView): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListView): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.MasterDetailRegion): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.NativeLayoutContent): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.NativeLayoutContent): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationListItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationListItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Snippet): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Snippet): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.SplitPane): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.SplitPane): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.SplitPane): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.SplitPane): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TableCell): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TableCell): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.VerticalFlow): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.WebLayoutContent): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /**
    * Creates and returns a new PasswordTextBox instance in the SDK and on the server.
    * The new PasswordTextBox will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): typingsSlinky.mendixmodelsdk.pagesMod.pages.PasswordTextBox = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PasswordTextBox.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
