package typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.RpcOperationElement")
@js.native
class RpcOperationElement protected ()
  extends typingsSlinky.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.RpcOperationElement")
@js.native
object RpcOperationElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement = js.native
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderRequestBodyRpcElement(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement = js.native
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestHeaderRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderRequestHeaderRpcElement(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement = js.native
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'responseBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderResponseBodyRpcElement(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.RpcOperationElement = js.native
}

