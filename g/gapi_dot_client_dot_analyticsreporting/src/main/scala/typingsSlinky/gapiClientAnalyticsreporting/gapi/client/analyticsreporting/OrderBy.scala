package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBy extends js.Object {
  /**
    * The field which to sort by. The default sort order is ascending. Example:
    * `ga:browser`.
    * Note, that you can only specify one field for sort here. For example,
    * `ga:browser, ga:city` is not valid.
    */
  var fieldName: js.UndefOr[String] = js.native
  /** The order type. The default orderType is `VALUE`. */
  var orderType: js.UndefOr[String] = js.native
  /** The sorting order for the field. */
  var sortOrder: js.UndefOr[String] = js.native
}

object OrderBy {
  @scala.inline
  def apply(): OrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderBy]
  }
  @scala.inline
  implicit class OrderByOps[Self <: OrderBy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderType")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
  }
  
}

