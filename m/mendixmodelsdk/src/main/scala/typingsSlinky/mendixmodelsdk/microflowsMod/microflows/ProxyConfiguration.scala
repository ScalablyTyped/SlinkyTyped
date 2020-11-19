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

/**
  * In version 7.15.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ProxyConfiguration")
@js.native
class ProxyConfiguration protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsRestCallAction: RestCallAction = js.native
  
  def containerAsWebServiceCallAction: WebServiceCallAction = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def hostExpression: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def hostExpressionModel: Expression | Null = js.native
  def hostExpressionModel_=(newValue: Expression | Null): Unit = js.native
  
  def hostExpression_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FProxyConfiguration: IModel = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def passwordExpression: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def passwordExpressionModel: Expression | Null = js.native
  def passwordExpressionModel_=(newValue: Expression | Null): Unit = js.native
  
  def passwordExpression_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def portExpression: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def portExpressionModel: Expression | Null = js.native
  def portExpressionModel_=(newValue: Expression | Null): Unit = js.native
  
  def portExpression_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def useConfigurationExpression: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def useConfigurationExpressionModel: Expression | Null = js.native
  def useConfigurationExpressionModel_=(newValue: Expression | Null): Unit = js.native
  
  def useConfigurationExpression_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def usernameExpression: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def usernameExpressionModel: Expression | Null = js.native
  def usernameExpressionModel_=(newValue: Expression | Null): Unit = js.native
  
  def usernameExpression_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ProxyConfiguration")
@js.native
object ProxyConfiguration extends js.Object {
  
  /**
    * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ProxyConfiguration = js.native
  
  /**
    * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
    * The new ProxyConfiguration will be automatically stored in the 'proxyConfiguration' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInRestCallActionUnderProxyConfiguration(container: RestCallAction): ProxyConfiguration = js.native
  
  /**
    * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
    * The new ProxyConfiguration will be automatically stored in the 'proxyConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInWebServiceCallActionUnderProxyConfiguration(container: WebServiceCallAction): ProxyConfiguration = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
