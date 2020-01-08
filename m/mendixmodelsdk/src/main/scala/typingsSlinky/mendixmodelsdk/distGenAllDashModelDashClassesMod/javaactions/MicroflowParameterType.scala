package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.javaactions

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.MicroflowParameterType")
@js.native
class MicroflowParameterType protected ()
  extends typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.MicroflowParameterType {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.MicroflowParameterType")
@js.native
object MicroflowParameterType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.MicroflowParameterType = js.native
  /**
    * Creates and returns a new MicroflowParameterType instance in the SDK and on the server.
    * The new MicroflowParameterType will be automatically stored in the 'parameterType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 to 7.20.0
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaActionParameter): typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.MicroflowParameterType = js.native
}

