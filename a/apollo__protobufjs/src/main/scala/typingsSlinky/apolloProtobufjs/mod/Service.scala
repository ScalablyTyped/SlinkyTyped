package typingsSlinky.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs", "Service")
@js.native
class Service protected () extends NamespaceBase {
  /**
    * Constructs a new service instance.
    * @param name Service name
    * @param [options] Service options
    * @throws {TypeError} If arguments are invalid
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[js.UndefOr[js.Any]]) = this()
  
  /**
    * Creates a runtime service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  def create(rpcImpl: RPCImpl): typingsSlinky.apolloProtobufjs.mod.rpc.Service = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean): typingsSlinky.apolloProtobufjs.mod.rpc.Service = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typingsSlinky.apolloProtobufjs.mod.rpc.Service = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typingsSlinky.apolloProtobufjs.mod.rpc.Service = js.native
  
  /** Service methods. */
  var methods: StringDictionary[js.UndefOr[Method]] = js.native
  
  /** Methods of this service as an array for iteration. */
  val methodsArray: js.Array[Method] = js.native
}
/* static members */
@JSImport("@apollo/protobufjs", "Service")
@js.native
object Service extends js.Object {
  
  /**
    * Constructs a service from a service descriptor.
    * @param name Service name
    * @param json Service descriptor
    * @returns Created service
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IService): Service = js.native
}
