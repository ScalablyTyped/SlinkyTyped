package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.asc
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pagination response.
  *
  * @link https://commerce.coinbase.com/docs/api/#pagination
  */
/* Inlined parent std.Pick<coinbase-commerce-node.coinbase-commerce-node.PaginationRequest, 'order' | 'starting_after' | 'ending_before' | 'limit'> */
@js.native
trait Pagination extends js.Object {
  var cursor_range: js.Tuple2[String, String] = js.native
  var ending_before: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var next_uri: Null | String = js.native
  var order: js.UndefOr[asc | desc] = js.native
  var previous_uri: Null | String = js.native
  var starting_after: js.UndefOr[String] = js.native
  var total: Double = js.native
  var yielded: Double = js.native
}

object Pagination {
  @scala.inline
  def apply(cursor_range: js.Tuple2[String, String], total: Double, yielded: Double): Pagination = {
    val __obj = js.Dynamic.literal(cursor_range = cursor_range.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], yielded = yielded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
  @scala.inline
  implicit class PaginationOps[Self <: Pagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursor_range(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor_range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYielded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yielded")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withNext_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_uriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_uri")(null)
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
    def withPrevious_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious_uriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous_uri")(null)
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
  }
  
}

