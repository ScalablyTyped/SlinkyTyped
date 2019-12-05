package typingsSlinky.rsocketDashTypes

import typingsSlinky.rsocketDashTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsSlinky.rsocketDashTypes.rsocketDashTypesStrings.CONNECTING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CONNECTING extends ConnectionStatus {
  var kind: CONNECTING
}

object Anon_CONNECTING {
  @scala.inline
  def apply(kind: CONNECTING): Anon_CONNECTING = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CONNECTING]
  }
}

