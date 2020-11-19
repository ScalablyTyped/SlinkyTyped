package typingsSlinky.mendixmodelsdk.allModelClassesMod.datatypes

import typingsSlinky.mendixmodelsdk.datatypesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EntityType")
@js.native
abstract class EntityType protected ()
  extends typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.EntityType {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EntityType")
@js.native
object EntityType extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
