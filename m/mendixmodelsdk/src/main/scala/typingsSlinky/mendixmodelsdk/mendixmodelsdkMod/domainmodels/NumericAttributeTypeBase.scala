package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.NumericAttributeTypeBase")
@js.native
abstract class NumericAttributeTypeBase protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.NumericAttributeTypeBase {
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
@JSImport("mendixmodelsdk", "domainmodels.NumericAttributeTypeBase")
@js.native
object NumericAttributeTypeBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

