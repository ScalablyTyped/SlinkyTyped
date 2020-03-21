package typingsSlinky.coinbase.mod

import typingsSlinky.coinbase.AnonAmount
import typingsSlinky.coinbase.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  var data: AnonAmount
  var warnings: js.UndefOr[js.Array[AnonId]] = js.undefined
}

object Price {
  @scala.inline
  def apply(data: AnonAmount, warnings: js.Array[AnonId] = null): Price = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
}

