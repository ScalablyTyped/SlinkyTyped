package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.asc
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pagination request.
  *
  * @link https://commerce.coinbase.com/docs/api/#pagination
  */
@js.native
trait PaginationRequest extends js.Object {
  /**
    * A cursor for use in pagination.
    * This is a resource ID that defines your place in the list.
    */
  var ending_before: js.UndefOr[String | Null] = js.native
  /**
    * Number of results per call.
    *
    * Accepted values: 0 - 100
    * Default: 25
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Order of resources in the response.
    *
    * default: desc
    */
  var order: js.UndefOr[asc | desc] = js.native
  /**
    * A cursor for use in pagination.
    * This is a resource ID that defines your place in the list.
    */
  var starting_after: js.UndefOr[String | Null] = js.native
}

object PaginationRequest {
  @scala.inline
  def apply(): PaginationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationRequest]
  }
  @scala.inline
  implicit class PaginationRequestOps[Self <: PaginationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnding_before(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ending_before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnding_before: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ending_before")(js.undefined)
        ret
    }
    @scala.inline
    def withEnding_beforeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ending_before")(null)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: asc | desc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withStarting_after(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starting_after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarting_after: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starting_after")(js.undefined)
        ret
    }
    @scala.inline
    def withStarting_afterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starting_after")(null)
        ret
    }
  }
  
}

