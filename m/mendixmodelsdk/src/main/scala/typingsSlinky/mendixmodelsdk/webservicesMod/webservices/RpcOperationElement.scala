package typingsSlinky.mendixmodelsdk.webservicesMod.webservices

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcOperationElement")
@js.native
class RpcOperationElement protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsOperationInfo: OperationInfo = js.native
  
  def messagePartElements: IList[RpcMessagePartElement] = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
}
object RpcOperationElement {
  
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcOperationElement")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcOperationElement.create")
  @js.native
  def create(model: IModel): RpcOperationElement = js.native
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcOperationElement.createInOperationInfoUnderRequestBodyRpcElement")
  @js.native
  def createInOperationInfoUnderRequestBodyRpcElement(container: OperationInfo): RpcOperationElement = js.native
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestHeaderRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcOperationElement.createInOperationInfoUnderRequestHeaderRpcElement")
  @js.native
  def createInOperationInfoUnderRequestHeaderRpcElement(container: OperationInfo): RpcOperationElement = js.native
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'responseBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcOperationElement.createInOperationInfoUnderResponseBodyRpcElement")
  @js.native
  def createInOperationInfoUnderResponseBodyRpcElement(container: OperationInfo): RpcOperationElement = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcOperationElement.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcOperationElement.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
