package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.customwidgets

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType")
@js.native
class WidgetObjectType protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.customwidgets.WidgetObjectType {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "customwidgets.WidgetObjectType")
@js.native
object WidgetObjectType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetObjectType = js.native
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * The new WidgetObjectType will be automatically stored in the 'objectType' property
    * of the parent CustomWidgetType element passed as argument.
    */
  def createInCustomWidgetTypeUnderObjectType(container: typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidgetType): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetObjectType = js.native
  /**
    * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
    * The new WidgetObjectType will be automatically stored in the 'objectType' property
    * of the parent WidgetValueType element passed as argument.
    */
  def createInWidgetValueTypeUnderObjectType(container: typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValueType): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetObjectType = js.native
}

