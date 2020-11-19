package typingsSlinky.mendixmodelsdk.mod.codeactions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk", "codeactions.EntityTypeParameterType")
@js.native
class EntityTypeParameterType protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.codeactions.EntityTypeParameterType {
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
@JSImport("mendixmodelsdk", "codeactions.EntityTypeParameterType")
@js.native
object EntityTypeParameterType extends js.Object {
  
  /**
    * Creates and returns a new EntityTypeParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.EntityTypeParameterType = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
