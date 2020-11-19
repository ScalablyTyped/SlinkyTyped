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

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.TemplateArgument")
@js.native
class TemplateArgument protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsTemplate: Template = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def expression: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def expressionModel: Expression = js.native
  def expressionModel_=(newValue: Expression): Unit = js.native
  
  def expression_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FTemplateArgument: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.TemplateArgument")
@js.native
object TemplateArgument extends js.Object {
  
  /**
    * Creates and returns a new TemplateArgument instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TemplateArgument = js.native
  
  /**
    * Creates and returns a new TemplateArgument instance in the SDK and on the server.
    * The new TemplateArgument will be automatically stored in the 'arguments' property
    * of the parent Template element passed as argument.
    */
  def createIn(container: Template): TemplateArgument = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
