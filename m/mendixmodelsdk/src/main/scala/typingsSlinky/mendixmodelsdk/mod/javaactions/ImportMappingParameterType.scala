package typingsSlinky.mendixmodelsdk.mod.javaactions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 7.2.0: introduced
  */
@JSImport("mendixmodelsdk", "javaactions.ImportMappingParameterType")
@js.native
class ImportMappingParameterType protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.javaactions.ImportMappingParameterType {
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
@JSImport("mendixmodelsdk", "javaactions.ImportMappingParameterType")
@js.native
object ImportMappingParameterType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ImportMappingParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.ImportMappingParameterType = js.native
  /**
    * Creates and returns a new ImportMappingParameterType instance in the SDK and on the server.
    * The new ImportMappingParameterType will be automatically stored in the 'parameterType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 to 7.20.0
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.JavaActionParameter): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.ImportMappingParameterType = js.native
}

