package typingsSlinky.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod

import typingsSlinky.atGrpcGrpcDashJs.buildSrcClientMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "Client")
@js.native
class Client protected ()
  extends typingsSlinky.atGrpcGrpcDashJs.buildSrcClientMod.Client {
  def this(
    address: String,
    credentials: typingsSlinky.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials
  ) = this()
  def this(
    address: String,
    credentials: typingsSlinky.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials,
    options: ClientOptions
  ) = this()
}

