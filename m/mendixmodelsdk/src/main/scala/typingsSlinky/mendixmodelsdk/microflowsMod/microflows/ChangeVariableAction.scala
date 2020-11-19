package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.expressionsMod.expressions.Expression
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/change-variable relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ChangeVariableAction")
@js.native
class ChangeVariableAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def changeVariableName: String = js.native
  def changeVariableName_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FChangeVariableAction: IModel = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def value: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def valueModel: Expression = js.native
  def valueModel_=(newValue: Expression): Unit = js.native
  
  def value_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ChangeVariableAction")
@js.native
object ChangeVariableAction extends js.Object {
  
  /**
    * Creates and returns a new ChangeVariableAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ChangeVariableAction = js.native
  
  /**
    * Creates and returns a new ChangeVariableAction instance in the SDK and on the server.
    * The new ChangeVariableAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): ChangeVariableAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
