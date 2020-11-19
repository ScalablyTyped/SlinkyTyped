package typingsSlinky.grpcGrpcJs.mod

import typingsSlinky.grpcGrpcJs.clientMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js", "Client")
@js.native
class Client protected ()
  extends typingsSlinky.grpcGrpcJs.clientMod.Client {
  def this(address: String, credentials: typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials) = this()
  def this(
    address: String,
    credentials: typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
    options: ClientOptions
  ) = this()
}
