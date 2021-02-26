package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.expressionsMod.expressions.Expression
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.IImportedWebService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/call-web-service-action relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceCallAction")
@js.native
class WebServiceCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def httpConfiguration: HttpConfiguration = js.native
  def httpConfiguration_=(newValue: HttpConfiguration): Unit = js.native
  
  def importedWebService: IImportedWebService | Null = js.native
  
  def importedWebServiceQualifiedName: String | Null = js.native
  
  def importedWebService_=(newValue: IImportedWebService | Null): Unit = js.native
  
  def isValidationRequired: Boolean = js.native
  def isValidationRequired_=(newValue: Boolean): Unit = js.native
  
  def operationName: String = js.native
  def operationName_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.15.0: introduced
    */
  def proxyConfiguration: ProxyConfiguration | Null = js.native
  def proxyConfiguration_=(newValue: ProxyConfiguration | Null): Unit = js.native
  
  def requestBodyHandling: RequestHandling = js.native
  def requestBodyHandling_=(newValue: RequestHandling): Unit = js.native
  
  def requestHeaderHandling: RequestHandling = js.native
  def requestHeaderHandling_=(newValue: RequestHandling): Unit = js.native
  
  /**
    * In version 7.15.0: introduced
    */
  def requestProxyType: RequestProxyType = js.native
  def requestProxyType_=(newValue: RequestProxyType): Unit = js.native
  
  def resultHandling: ResultHandling = js.native
  def resultHandling_=(newValue: ResultHandling): Unit = js.native
  
  /**
    * In version 6.7.0: deleted
    */
  def sendNullValueChoice: NullValueOption = js.native
  def sendNullValueChoice_=(newValue: NullValueOption): Unit = js.native
  
  def serviceName: String = js.native
  def serviceName_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.15.0: deleted
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
  
  def useRequestTimeOut: Boolean = js.native
  def useRequestTimeOut_=(newValue: Boolean): Unit = js.native
}
object WebServiceCallAction {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceCallAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WebServiceCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceCallAction.create")
  @js.native
  def create(model: IModel): WebServiceCallAction = js.native
  
  /**
    * Creates and returns a new WebServiceCallAction instance in the SDK and on the server.
    * The new WebServiceCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceCallAction.createIn")
  @js.native
  def createIn(container: ActionActivity): WebServiceCallAction = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceCallAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceCallAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
