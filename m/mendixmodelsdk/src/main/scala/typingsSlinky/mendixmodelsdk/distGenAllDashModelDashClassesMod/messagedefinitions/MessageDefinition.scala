package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.messagedefinitions

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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.MessageDefinition")
@js.native
abstract class MessageDefinition protected ()
  extends typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.MessageDefinition {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.MessageDefinition")
@js.native
object MessageDefinition extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

