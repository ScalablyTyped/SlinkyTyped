package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.microflows

import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/microflows relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "microflows.Microflow")
@js.native
class Microflow protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.Microflow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "microflows.Microflow")
@js.native
object Microflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Microflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.Microflow = js.native
}

