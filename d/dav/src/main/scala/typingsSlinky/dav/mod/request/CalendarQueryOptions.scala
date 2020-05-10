package typingsSlinky.dav.mod.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarQueryOptions extends js.Object {
  /**
    * value for Depth header.
    */
  var depth: js.UndefOr[String] = js.native
  /**
    * list of filters to send with request.
    */
  var filters: js.Array[js.Object] = js.native
  /**
    * list of props to request.
    */
  var props: js.Array[js.Object] = js.native
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: String = js.native
}

object CalendarQueryOptions {
  @scala.inline
  def apply(filters: js.Array[js.Object], props: js.Array[js.Object], timezone: String): CalendarQueryOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarQueryOptions]
  }
  @scala.inline
  implicit class CalendarQueryOptionsOps[Self <: CalendarQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
  }
  
}

