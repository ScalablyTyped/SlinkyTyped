package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaError extends js.Object {
  /**
    * Domain, or broad category, of the error.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Specific reason for the error. Some of the possible values are:   -
    * &quot;groupTooBig&quot; - The group of users requested is too large for a
    * single query.  - &quot;tooManyCalendarsRequested&quot; - The number of
    * calendars requested is too large for a single query.  -
    * &quot;notFound&quot; - The requested resource was not found.  -
    * &quot;internalError&quot; - The API service has encountered an internal
    * error.  Additional error types may be added in the future, so clients
    * should gracefully handle additional error statuses not included in this
    * list.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaError {
  @scala.inline
  def apply(): SchemaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaError]
  }
  @scala.inline
  implicit class SchemaErrorOps[Self <: SchemaError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

