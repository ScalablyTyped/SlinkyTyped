package typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.EntityTypeCodeActionParameterValue")
@js.native
class EntityTypeCodeActionParameterValue protected ()
  extends typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EntityTypeCodeActionParameterValue {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.EntityTypeCodeActionParameterValue")
@js.native
object EntityTypeCodeActionParameterValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EntityTypeCodeActionParameterValue = js.native
  /**
    * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
    * The new EntityTypeCodeActionParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInJavaActionParameterMappingUnderParameterValue(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EntityTypeCodeActionParameterValue = js.native
  /**
    * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
    * The new EntityTypeCodeActionParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInJavaScriptActionParameterMappingUnderParameterValue(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EntityTypeCodeActionParameterValue = js.native
}

