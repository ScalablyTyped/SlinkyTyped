package typingsSlinky.grpcGrpcJs.mod

import typingsSlinky.grpcGrpcJs.channelMod.ChannelImplementation
import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js", "Channel")
@js.native
class Channel protected () extends ChannelImplementation {
  def this(
    target: String,
    credentials: typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
    options: ChannelOptions
  ) = this()
}
