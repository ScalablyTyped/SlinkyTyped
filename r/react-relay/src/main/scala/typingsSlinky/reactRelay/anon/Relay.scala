package typingsSlinky.reactRelay.anon

import typingsSlinky.reactRelay.mod.RelayProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relay extends js.Object {
  var relay: js.UndefOr[RelayProp] = js.undefined
}

object Relay {
  @scala.inline
  def apply(relay: RelayProp = null): Relay = {
    val __obj = js.Dynamic.literal()
    if (relay != null) __obj.updateDynamic("relay")(relay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relay]
  }
}

