package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.IJavaActionParameter
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
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
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 6.7.0: deleted
    */
  def argument: String = js.native
  def argument_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FJavaActionParameterMapping: IModel = js.native
  
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
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.JavaActionParameterMapping")
@js.native
object JavaActionParameterMapping extends js.Object {
  
  /**
    * Creates and returns a new JavaActionParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): JavaActionParameterMapping = js.native
  
  /**
    * Creates and returns a new JavaActionParameterMapping instance in the SDK and on the server.
    * The new JavaActionParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent JavaActionCallAction element passed as argument.
    */
  def createIn(container: JavaActionCallAction): JavaActionParameterMapping = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
