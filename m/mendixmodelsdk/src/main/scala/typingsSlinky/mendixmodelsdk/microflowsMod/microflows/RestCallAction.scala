package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.expressionsMod.expressions.Expression
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/call-rest-action relevant section in reference guide}
  *
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RestCallAction")
@js.native
class RestCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.0.2: introduced
    */
  def errorResultHandlingType: ErrorResultHandlingType = js.native
  def errorResultHandlingType_=(newValue: ErrorResultHandlingType): Unit = js.native
  
  def httpConfiguration: HttpConfiguration = js.native
  def httpConfiguration_=(newValue: HttpConfiguration): Unit = js.native
  
  /**
    * In version 7.15.0: introduced
    */
  def proxyConfiguration: ProxyConfiguration | Null = js.native
  def proxyConfiguration_=(newValue: ProxyConfiguration | Null): Unit = js.native
  
  def requestHandling: RequestHandling = js.native
  
  /**
    * In version 6.9.0: introduced
    */
  def requestHandlingType: RequestHandlingType = js.native
  def requestHandlingType_=(newValue: RequestHandlingType): Unit = js.native
  
  def requestHandling_=(newValue: RequestHandling): Unit = js.native
  
  /**
    * In version 7.15.0: introduced
    */
  def requestProxyType: RequestProxyType = js.native
  def requestProxyType_=(newValue: RequestProxyType): Unit = js.native
  
  def resultHandling: ResultHandling = js.native
  
  /**
    * In version 6.9.0: introduced
    */
  def resultHandlingType: ResultHandlingType = js.native
  def resultHandlingType_=(newValue: ResultHandlingType): Unit = js.native
  
  def resultHandling_=(newValue: ResultHandling): Unit = js.native
  
  /**
    * In version 7.15.0: deleted
    * In version 7.1.0: introduced
    */
  def timeOut: Double = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 7.15.0: introduced
    */
  def timeOutExpression: String = js.native
  def timeOutExpression_=(newValue: String): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 7.15.0: introduced
    */
  def timeOutModel: Expression = js.native
  def timeOutModel_=(newValue: Expression): Unit = js.native
  
  def timeOut_=(newValue: Double): Unit = js.native
  
  /**
    * In version 7.1.0: introduced
    */
  def useRequestTimeOut: Boolean = js.native
  def useRequestTimeOut_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RestCallAction")
@js.native
object RestCallAction extends js.Object {
  
  /**
    * Creates and returns a new RestCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RestCallAction = js.native
  
  /**
    * Creates and returns a new RestCallAction instance in the SDK and on the server.
    * The new RestCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createIn(container: ActionActivity): RestCallAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
