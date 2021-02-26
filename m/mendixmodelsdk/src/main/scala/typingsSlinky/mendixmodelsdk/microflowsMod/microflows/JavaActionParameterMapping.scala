package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.IJavaActionParameter
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.JavaActionParameterMapping")
@js.native
class JavaActionParameterMapping protected () extends CodeActionParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 6.7.0: deleted
    */
  def argument: String = js.native
  def argument_=(newValue: String): Unit = js.native
  
  def parameter: IJavaActionParameter = js.native
  
  def parameterQualifiedName: String = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def parameterValue: CodeActionParameterValue = js.native
  def parameterValue_=(newValue: CodeActionParameterValue): Unit = js.native
  
  def parameter_=(newValue: IJavaActionParameter): Unit = js.native
  
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  def value: JavaActionParameterValue = js.native
  def value_=(newValue: JavaActionParameterValue): Unit = js.native
}
object JavaActionParameterMapping {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.JavaActionParameterMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new JavaActionParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.JavaActionParameterMapping.create")
  @js.native
  def create(model: IModel): JavaActionParameterMapping = js.native
  
  /**
    * Creates and returns a new JavaActionParameterMapping instance in the SDK and on the server.
    * The new JavaActionParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent JavaActionCallAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.JavaActionParameterMapping.createIn")
  @js.native
  def createIn(container: JavaActionCallAction): JavaActionParameterMapping = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.JavaActionParameterMapping.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.JavaActionParameterMapping.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
