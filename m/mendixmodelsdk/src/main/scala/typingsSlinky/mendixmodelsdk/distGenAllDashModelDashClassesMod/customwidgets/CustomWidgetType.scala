package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.customwidgets

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetType")
@js.native
class CustomWidgetType protected ()
  extends typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidgetType {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetType")
@js.native
object CustomWidgetType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidgetType = js.native
  /**
    * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
    * The new CustomWidgetType will be automatically stored in the 'type' property
    * of the parent CustomWidget element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget): typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidgetType = js.native
}

