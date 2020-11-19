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
  * See: {@link https://docs.mendix.com/refguide7/log-message relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LogMessageAction")
@js.native
class LogMessageAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def includeLatestStackTrace: Boolean = js.native
  def includeLatestStackTrace_=(newValue: Boolean): Unit = js.native
  
  def level: LogLevel = js.native
  def level_=(newValue: LogLevel): Unit = js.native
  
  def messageTemplate: StringTemplate = js.native
  def messageTemplate_=(newValue: StringTemplate): Unit = js.native
  
  @JSName("model")
  var model_FLogMessageAction: IModel = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def node: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def nodeModel: Expression = js.native
  def nodeModel_=(newValue: Expression): Unit = js.native
  
  def node_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LogMessageAction")
@js.native
object LogMessageAction extends js.Object {
  
  /**
    * Creates and returns a new LogMessageAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): LogMessageAction = js.native
  
  /**
    * Creates and returns a new LogMessageAction instance in the SDK and on the server.
    * The new LogMessageAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): LogMessageAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
