package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.microflows

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/inheritance-split relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "microflows.InheritanceSplit")
@js.native
class InheritanceSplit protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.InheritanceSplit {
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
@JSImport("mendixmodelsdk", "microflows.InheritanceSplit")
@js.native
object InheritanceSplit extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new InheritanceSplit instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.InheritanceSplit = js.native
  /**
    * Creates and returns a new InheritanceSplit instance in the SDK and on the server.
    * The new InheritanceSplit will be automatically stored in the 'objects' property
    * of the parent MicroflowObjectCollection element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowObjectCollection): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.InheritanceSplit = js.native
}

