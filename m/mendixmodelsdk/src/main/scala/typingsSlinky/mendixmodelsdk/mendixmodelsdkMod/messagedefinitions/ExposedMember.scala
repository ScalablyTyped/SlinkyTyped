package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.messagedefinitions

import typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember")
@js.native
abstract class ExposedMember protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.messagedefinitions.ExposedMember {
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
@JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember")
@js.native
object ExposedMember extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

