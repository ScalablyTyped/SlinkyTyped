package typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions

import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntityBase")
@js.native
abstract class ExposedEntityBase protected ()
  extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntityBase {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntityBase")
@js.native
object ExposedEntityBase extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
