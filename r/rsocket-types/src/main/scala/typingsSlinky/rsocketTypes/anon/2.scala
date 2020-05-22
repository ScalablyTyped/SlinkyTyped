package typingsSlinky.rsocketTypes.anon

import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsSlinky.rsocketTypes.rsocketTypesStrings.CLOSED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends ConnectionStatus {
  var kind: CLOSED
}

object `2` {
  @scala.inline
  def apply(kind: CLOSED): `2` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

