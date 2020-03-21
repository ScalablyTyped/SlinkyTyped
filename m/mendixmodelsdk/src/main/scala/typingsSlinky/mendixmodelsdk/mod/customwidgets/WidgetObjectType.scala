package typingsSlinky.mendixmodelsdk.mod.customwidgets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType")
@js.native
class WidgetObjectType protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetObjectType {
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
@JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType")
@js.native
object WidgetObjectType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
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
}

