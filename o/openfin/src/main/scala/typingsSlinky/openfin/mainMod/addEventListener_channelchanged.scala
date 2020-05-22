package typingsSlinky.openfin.mainMod

import typingsSlinky.openfin.contextChannelsMod.ChannelChangedEvent
import typingsSlinky.openfin.openfinStrings.`channel-changed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/main", "addEventListener")
@js.native
object addEventListener_channelchanged extends js.Object {
  def apply(eventType: `channel-changed`, handler: js.Function1[/* event */ ChannelChangedEvent, Unit]): Unit = js.native
}

