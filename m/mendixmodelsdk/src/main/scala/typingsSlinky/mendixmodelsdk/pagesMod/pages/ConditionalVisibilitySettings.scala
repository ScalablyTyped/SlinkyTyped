package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.securityMod.security.IModuleRole
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings")
@js.native
class ConditionalVisibilitySettings protected () extends ConditionalSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def ignoreSecurity: Boolean = js.native
  def ignoreSecurity_=(newValue: Boolean): Unit = js.native
  
  def moduleRoles: IList[IModuleRole] = js.native
  
  def moduleRolesQualifiedNames: js.Array[String] = js.native
}
object ConditionalVisibilitySettings {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings.create")
  @js.native
  def create(model: IModel): ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ConditionallyVisibleWidget element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings.createInConditionallyVisibleWidgetUnderConditionalVisibilitySettings")
  @js.native
  def createInConditionallyVisibleWidgetUnderConditionalVisibilitySettings(container: ConditionallyVisibleWidget): ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings.createInControlBarButtonUnderConditionalVisibilitySettings")
  @js.native
  def createInControlBarButtonUnderConditionalVisibilitySettings(container: ControlBarButton): ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings.createInCustomWidgetUnderConditionalVisibilitySettings")
  @js.native
  def createInCustomWidgetUnderConditionalVisibilitySettings(container: CustomWidget): ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent LayoutGridRow element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings.createInLayoutGridRowUnderConditionalVisibilitySettings")
  @js.native
  def createInLayoutGridRowUnderConditionalVisibilitySettings(container: LayoutGridRow): ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent NavigationListItem element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings.createInNavigationListItemUnderConditionalVisibilitySettings")
  @js.native
  def createInNavigationListItemUnderConditionalVisibilitySettings(container: NavigationListItem): ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TabPage element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings.createInTabPageUnderConditionalVisibilitySettings")
  @js.native
  def createInTabPageUnderConditionalVisibilitySettings(container: TabPage): ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TableRow element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings.createInTableRowUnderConditionalVisibilitySettings")
  @js.native
  def createInTableRowUnderConditionalVisibilitySettings(container: TableRow): ConditionalVisibilitySettings = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalVisibilitySettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
