package typingsSlinky.node.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindOptions extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var port: Double
}

object BindOptions {
  @scala.inline
  def apply(port: Double, address: java.lang.String = null, exclusive: js.UndefOr[Boolean] = js.undefined): BindOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindOptions]
  }
}

