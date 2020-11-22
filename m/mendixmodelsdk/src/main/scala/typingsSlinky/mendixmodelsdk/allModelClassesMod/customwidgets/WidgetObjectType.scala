package typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObjectType")
@js.native
class WidgetObjectType protected ()
  extends typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObjectType")
@js.native
object WidgetObjectType extends js.Object {
  
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
  
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * The new WidgetObjectType will be automatically stored in the 'objectType' property
    * of the parent CustomWidgetType element passed as argument.
    */
  def createInCustomWidgetTypeUnderObjectType(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetType): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
  
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * The new WidgetObjectType will be automatically stored in the 'objectType' property
    * of the parent WidgetValueType element passed as argument.
    */
  def createInWidgetValueTypeUnderObjectType(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
