package typingsSlinky.googleGax.operationsClientMod

import typingsSlinky.googleGax.fallbackMod.GrpcClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/operationsClient", "OperationsClientBuilder")
@js.native
class OperationsClientBuilder protected () extends js.Object {
  def this(gaxGrpc: GrpcClient) = this()
  /**
    * Builds a new Operations Client
    * @param gaxGrpc {GrpcClient}
    */
  def this(gaxGrpc: typingsSlinky.googleGax.grpcMod.GrpcClient) = this()
  def operationsClient(opts: OperationsClientOptions): OperationsClient = js.native
}

