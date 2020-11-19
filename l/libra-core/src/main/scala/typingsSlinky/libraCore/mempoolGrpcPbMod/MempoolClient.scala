package typingsSlinky.libraCore.mempoolGrpcPbMod

import typingsSlinky.grpc.mod.ChannelCredentials
import typingsSlinky.grpc.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_grpc_pb", "MempoolClient")
@js.native
class MempoolClient protected ()
  extends Client
     with IMempoolClient {
  def this(address: String, credentials: ChannelCredentials) = this()
  def this(address: String, credentials: ChannelCredentials, options: js.Object) = this()
}
