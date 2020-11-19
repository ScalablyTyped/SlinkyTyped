package typingsSlinky.mendixmodelsdk.mod.javaactions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk", "javaactions.FloatType")
@js.native
class FloatType protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.javaactions.FloatType {
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
@JSImport("mendixmodelsdk", "javaactions.FloatType")
@js.native
object FloatType extends js.Object {
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  def createInBasicParameterTypeUnderType(container: typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.BasicParameterType): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  def createInJavaActionParameterUnderJavaType(container: typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.JavaActionParameter): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.FloatType = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  def createInJavaActionUnderJavaReturnType(container: typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.JavaAction): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.FloatType = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
