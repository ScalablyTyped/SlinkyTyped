package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.javaactions

import typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.PrimitiveType")
@js.native
abstract class PrimitiveType protected ()
  extends typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.PrimitiveType {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.PrimitiveType")
@js.native
object PrimitiveType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

