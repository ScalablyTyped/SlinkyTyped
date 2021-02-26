package typingsSlinky.mendixmodelsdk.allModelClassesMod.javaactions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.DecimalType")
@js.native
class DecimalType protected ()
  extends typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.DecimalType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DecimalType {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.DecimalType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.DecimalType.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.DecimalType = js.native
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.DecimalType.createInBasicParameterTypeUnderType")
  @js.native
  def createInBasicParameterTypeUnderType(container: typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.BasicParameterType): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.DecimalType = js.native
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'javaType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 6.6.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.DecimalType.createInJavaActionParameterUnderJavaType")
  @js.native
  def createInJavaActionParameterUnderJavaType(container: typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.JavaActionParameter): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.DecimalType = js.native
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'javaReturnType' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.DecimalType.createInJavaActionUnderJavaReturnType")
  @js.native
  def createInJavaActionUnderJavaReturnType(container: typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.JavaAction): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.DecimalType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.DecimalType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.DecimalType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
