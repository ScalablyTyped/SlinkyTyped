package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.javaactions

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.IntegerType")
@js.native
class IntegerType protected ()
  extends typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.IntegerType {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.IntegerType")
@js.native
object IntegerType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new IntegerType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.IntegerType = js.native
  /**
    * Creates and returns a new IntegerType instance in the SDK and on the server.
    * The new IntegerType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  def createInBasicParameterTypeUnderType(container: typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.BasicParameterType): typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.IntegerType = js.native
  /**
    * Creates and returns a new IntegerType instance in the SDK and on the server.
    * The new IntegerType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  def createInJavaActionParameterUnderJavaType(container: typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaActionParameter): typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.IntegerType = js.native
  /**
    * Creates and returns a new IntegerType instance in the SDK and on the server.
    * The new IntegerType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  def createInJavaActionUnderJavaReturnType(container: typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaAction): typingsSlinky.mendixmodelsdk.distGenJavaactionsMod.javaactions.IntegerType = js.native
}

