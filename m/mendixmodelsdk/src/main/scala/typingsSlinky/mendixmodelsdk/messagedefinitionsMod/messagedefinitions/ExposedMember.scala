package typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element
import typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedMember")
@js.native
abstract class ExposedMember protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  /**
    * In version 7.15.0: introduced
    */
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.15.0: introduced
    */
  def example: String = js.native
  def example_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FExposedMember: IModel = js.native
  
  def originalName: String = js.native
  def originalName_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.ExposedMember")
@js.native
object ExposedMember extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
