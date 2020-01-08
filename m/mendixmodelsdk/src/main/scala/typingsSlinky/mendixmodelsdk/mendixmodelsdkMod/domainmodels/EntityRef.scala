package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk", "domainmodels.EntityRef")
@js.native
abstract class EntityRef protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.EntityRef {
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
@JSImport("mendixmodelsdk", "domainmodels.EntityRef")
@js.native
object EntityRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

