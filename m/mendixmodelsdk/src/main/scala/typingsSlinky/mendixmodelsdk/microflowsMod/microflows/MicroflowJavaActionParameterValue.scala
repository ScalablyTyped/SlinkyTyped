package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowJavaActionParameterValue")
@js.native
class MicroflowJavaActionParameterValue protected () extends JavaActionParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
}
object MicroflowJavaActionParameterValue {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowJavaActionParameterValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowJavaActionParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowJavaActionParameterValue.create")
  @js.native
  def create(model: IModel): MicroflowJavaActionParameterValue = js.native
  
  /**
    * Creates and returns a new MicroflowJavaActionParameterValue instance in the SDK and on the server.
    * The new MicroflowJavaActionParameterValue will be automatically stored in the 'value' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowJavaActionParameterValue.createIn")
  @js.native
  def createIn(container: JavaActionParameterMapping): MicroflowJavaActionParameterValue = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowJavaActionParameterValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowJavaActionParameterValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
