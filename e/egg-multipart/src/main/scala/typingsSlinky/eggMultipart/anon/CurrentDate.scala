package typingsSlinky.eggMultipart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentDate extends js.Object {
  var currentDate: js.UndefOr[String | Double | js.Date] = js.undefined
  var endDate: js.UndefOr[String | Double | js.Date] = js.undefined
  var iterator: js.UndefOr[Boolean] = js.undefined
  var tz: js.UndefOr[String] = js.undefined
  var utc: js.UndefOr[Boolean] = js.undefined
}

object CurrentDate {
  @scala.inline
  def apply(
    currentDate: String | Double | js.Date = null,
    endDate: String | Double | js.Date = null,
    iterator: js.UndefOr[Boolean] = js.undefined,
    tz: String = null,
    utc: js.UndefOr[Boolean] = js.undefined
  ): CurrentDate = {
    val __obj = js.Dynamic.literal()
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(iterator)) __obj.updateDynamic("iterator")(iterator.get.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz.asInstanceOf[js.Any])
    if (!js.isUndefined(utc)) __obj.updateDynamic("utc")(utc.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentDate]
  }
}

