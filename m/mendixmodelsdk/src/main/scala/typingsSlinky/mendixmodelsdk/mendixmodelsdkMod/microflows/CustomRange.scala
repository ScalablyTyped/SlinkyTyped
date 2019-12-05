package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.microflows

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.CustomRange")
@js.native
class CustomRange protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.CustomRange {
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
@JSImport("mendixmodelsdk", "microflows.CustomRange")
@js.native
object CustomRange extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.CustomRange = js.native
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * The new CustomRange will be automatically stored in the 'range' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  def createInDatabaseRetrieveSourceUnderRange(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.DatabaseRetrieveSource): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.CustomRange = js.native
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * The new CustomRange will be automatically stored in the 'range' property
    * of the parent ImportMappingCall element passed as argument.
    */
  def createInImportMappingCallUnderRange(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ImportMappingCall): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.CustomRange = js.native
}

