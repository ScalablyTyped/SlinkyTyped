package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.customwidgets

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetPropertyType")
@js.native
class WidgetPropertyType protected ()
  extends typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetPropertyType {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetPropertyType")
@js.native
object WidgetPropertyType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetPropertyType = js.native
  /**
    * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
    * The new WidgetPropertyType will be automatically stored in the 'propertyTypes' property
    * of the parent WidgetObjectType element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetObjectType): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetPropertyType = js.native
}

