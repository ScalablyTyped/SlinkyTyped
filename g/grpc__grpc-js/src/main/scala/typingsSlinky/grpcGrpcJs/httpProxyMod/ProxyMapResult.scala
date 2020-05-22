package typingsSlinky.grpcGrpcJs.httpProxyMod

import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typingsSlinky.grpcGrpcJs.uriParserMod.GrpcUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyMapResult extends js.Object {
  var extraOptions: ChannelOptions
  var target: GrpcUri
}

object ProxyMapResult {
  @scala.inline
  def apply(extraOptions: ChannelOptions, target: GrpcUri): ProxyMapResult = {
    val __obj = js.Dynamic.literal(extraOptions = extraOptions.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyMapResult]
  }
}

