package typingsSlinky.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcClientMod {
  import typingsSlinky.atGrpcGrpcDashJs.Anon_Address
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallMod.ServiceError
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcChannelDashOptionsMod.ChannelOptions
  import typingsSlinky.std.Partial

  type ClientOptions = Partial[ChannelOptions] with Anon_Address
  type UnaryCallback[ResponseType] = js.Function2[/* err */ ServiceError | Null, /* value */ js.UndefOr[ResponseType], Unit]
}
