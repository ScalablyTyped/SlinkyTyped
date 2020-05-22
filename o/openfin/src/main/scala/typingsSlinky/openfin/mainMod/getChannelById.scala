package typingsSlinky.openfin.mainMod

import typingsSlinky.openfin.contextChannelsMod.Channel
import typingsSlinky.openfin.contextChannelsMod.ChannelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/main", "getChannelById")
@js.native
object getChannelById extends js.Object {
  def apply(channelId: ChannelId): js.Promise[Channel] = js.native
}

