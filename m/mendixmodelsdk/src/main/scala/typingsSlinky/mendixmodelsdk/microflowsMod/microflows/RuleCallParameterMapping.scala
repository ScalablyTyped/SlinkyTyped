package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.expressionsMod.expressions.Expression
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RuleCallParameterMapping")
@js.native
class RuleCallParameterMapping protected () extends Element {
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
    */
  def argument: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def argumentModel: Expression = js.native
  def argumentModel_=(newValue: Expression): Unit = js.native
  
  def argument_=(newValue: String): Unit = js.native
  
  def containerAsRuleCall: RuleCall = js.native
  
  @JSName("model")
  var model_FRuleCallParameterMapping: IModel = js.native
  
  def parameter: IRuleParameter = js.native
  
  def parameterQualifiedName: String = js.native
  
  def parameter_=(newValue: IRuleParameter): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RuleCallParameterMapping")
@js.native
object RuleCallParameterMapping extends js.Object {
  
  /**
    * Creates and returns a new RuleCallParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RuleCallParameterMapping = js.native
  
  /**
    * Creates and returns a new RuleCallParameterMapping instance in the SDK and on the server.
    * The new RuleCallParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent RuleCall element passed as argument.
    */
  def createIn(container: RuleCall): RuleCallParameterMapping = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
