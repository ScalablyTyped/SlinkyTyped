package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings")
@js.native
class ConditionalVisibilitySettings protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalVisibilitySettings")
@js.native
object ConditionalVisibilitySettings extends js.Object {
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ConditionallyVisibleWidget element passed as argument.
    */
  def createInConditionallyVisibleWidgetUnderConditionalVisibilitySettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionallyVisibleWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent ControlBarButton element passed as argument.
    */
  def createInControlBarButtonUnderConditionalVisibilitySettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ControlBarButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  def createInCustomWidgetUnderConditionalVisibilitySettings(container: CustomWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent LayoutGridRow element passed as argument.
    */
  def createInLayoutGridRowUnderConditionalVisibilitySettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridRow): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent NavigationListItem element passed as argument.
    */
  def createInNavigationListItemUnderConditionalVisibilitySettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationListItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TabPage element passed as argument.
    */
  def createInTabPageUnderConditionalVisibilitySettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  /**
    * Creates and returns a new ConditionalVisibilitySettings instance in the SDK and on the server.
    * The new ConditionalVisibilitySettings will be automatically stored in the 'conditionalVisibilitySettings' property
    * of the parent TableRow element passed as argument.
    */
  def createInTableRowUnderConditionalVisibilitySettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TableRow): typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalVisibilitySettings = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
