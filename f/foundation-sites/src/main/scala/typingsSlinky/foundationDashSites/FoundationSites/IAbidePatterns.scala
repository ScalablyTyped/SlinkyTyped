package typingsSlinky.foundationDashSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbidePatterns extends js.Object {
  var alpha: js.UndefOr[js.RegExp] = js.undefined
  var alpha_numeric: js.UndefOr[js.RegExp] = js.undefined
  var card: js.UndefOr[js.RegExp] = js.undefined
  var color: js.UndefOr[js.RegExp] = js.undefined
  var cvv: js.UndefOr[js.RegExp] = js.undefined
  var date: js.UndefOr[js.RegExp] = js.undefined
  var dateISO: js.UndefOr[js.RegExp] = js.undefined
  var datetime: js.UndefOr[js.RegExp] = js.undefined
  var day_month_year: js.UndefOr[js.RegExp] = js.undefined
  var domain: js.UndefOr[js.RegExp] = js.undefined
  var email: js.UndefOr[js.RegExp] = js.undefined
  var integer: js.UndefOr[js.RegExp] = js.undefined
  var month_day_year: js.UndefOr[js.RegExp] = js.undefined
  var number: js.UndefOr[js.RegExp] = js.undefined
  var time: js.UndefOr[js.RegExp] = js.undefined
  var url: js.UndefOr[js.RegExp] = js.undefined
}

object IAbidePatterns {
  @scala.inline
  def apply(
    alpha: js.RegExp = null,
    alpha_numeric: js.RegExp = null,
    card: js.RegExp = null,
    color: js.RegExp = null,
    cvv: js.RegExp = null,
    date: js.RegExp = null,
    dateISO: js.RegExp = null,
    datetime: js.RegExp = null,
    day_month_year: js.RegExp = null,
    domain: js.RegExp = null,
    email: js.RegExp = null,
    integer: js.RegExp = null,
    month_day_year: js.RegExp = null,
    number: js.RegExp = null,
    time: js.RegExp = null,
    url: js.RegExp = null
  ): IAbidePatterns = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (alpha_numeric != null) __obj.updateDynamic("alpha_numeric")(alpha_numeric.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cvv != null) __obj.updateDynamic("cvv")(cvv.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dateISO != null) __obj.updateDynamic("dateISO")(dateISO.asInstanceOf[js.Any])
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.asInstanceOf[js.Any])
    if (day_month_year != null) __obj.updateDynamic("day_month_year")(day_month_year.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (integer != null) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (month_day_year != null) __obj.updateDynamic("month_day_year")(month_day_year.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbidePatterns]
  }
}

