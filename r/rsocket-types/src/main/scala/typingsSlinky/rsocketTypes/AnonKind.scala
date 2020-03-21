package typingsSlinky.rsocketTypes

import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsSlinky.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKind extends ConnectionStatus {
  var kind: NOT_CONNECTED
}

object AnonKind {
  @scala.inline
  def apply(kind: NOT_CONNECTED): AnonKind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKind]
  }
}

