package typingsSlinky.coinbase.coinbaseMod

import typingsSlinky.coinbase.Anon_Amount
import typingsSlinky.coinbase.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  var data: Anon_Amount
  var warnings: js.UndefOr[js.Array[Anon_Id]] = js.undefined
}

object Price {
  @scala.inline
  def apply(data: Anon_Amount, warnings: js.Array[Anon_Id] = null): Price = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
}

