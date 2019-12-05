package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateParam extends js.Object {
  var date: js.Date
  var withMillis: js.UndefOr[Boolean] = js.undefined
}

object DateParam {
  @scala.inline
  def apply(date: js.Date, withMillis: js.UndefOr[Boolean] = js.undefined): DateParam = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (!js.isUndefined(withMillis)) __obj.updateDynamic("withMillis")(withMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateParam]
  }
}

