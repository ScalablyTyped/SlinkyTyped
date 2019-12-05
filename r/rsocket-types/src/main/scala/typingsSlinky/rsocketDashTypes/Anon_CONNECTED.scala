package typingsSlinky.rsocketDashTypes

import typingsSlinky.rsocketDashTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsSlinky.rsocketDashTypes.rsocketDashTypesStrings.CONNECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CONNECTED extends ConnectionStatus {
  var kind: CONNECTED
}

object Anon_CONNECTED {
  @scala.inline
  def apply(kind: CONNECTED): Anon_CONNECTED = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CONNECTED]
  }
}

