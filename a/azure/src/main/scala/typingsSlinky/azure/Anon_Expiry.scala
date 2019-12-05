package typingsSlinky.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expiry extends js.Object {
  var Expiry: js.Date
  var Permission: js.UndefOr[String] = js.undefined
  var Start: js.UndefOr[js.Date] = js.undefined
}

object Anon_Expiry {
  @scala.inline
  def apply(Expiry: js.Date, Permission: String = null, Start: js.Date = null): Anon_Expiry = {
    val __obj = js.Dynamic.literal(Expiry = Expiry.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Expiry]
  }
}

