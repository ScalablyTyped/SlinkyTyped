package typingsSlinky.mendixmodelsdk.mod.messagedefinitions

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
@JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember")
@js.native
abstract class ExposedMember protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions.ExposedMember {
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
