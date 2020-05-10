package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StructuredQuery extends js.Object {
  /** A end point for the query results. */
  var endAt: js.UndefOr[Cursor] = js.native
  /** The collections to query. */
  var from: js.UndefOr[js.Array[CollectionSelector]] = js.native
  /**
    * The maximum number of results to return.
    *
    * Applies after all other constraints.
    * Must be >= 0 if specified.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The number of results to skip.
    *
    * Applies before limit, but after all other constraints. Must be >= 0 if
    * specified.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The order to apply to the query results.
    *
    * Firestore guarantees a stable ordering through the following rules:
    *
    * &#42; Any field required to appear in `order_by`, that is not already
    * specified in `order_by`, is appended to the order in field name order
    * by default.
    * &#42; If an order on `__name__` is not specified, it is appended by default.
    *
    * Fields are appended with the same sort direction as the last order
    * specified, or 'ASCENDING' if no order was specified. For example:
    *
    * &#42; `SELECT &#42; FROM Foo ORDER BY A` becomes
    * `SELECT &#42; FROM Foo ORDER BY A, __name__`
    * &#42; `SELECT &#42; FROM Foo ORDER BY A DESC` becomes
    * `SELECT &#42; FROM Foo ORDER BY A DESC, __name__ DESC`
    * &#42; `SELECT &#42; FROM Foo WHERE A > 1` becomes
    * `SELECT &#42; FROM Foo WHERE A > 1 ORDER BY A, __name__`
    */
  var orderBy: js.UndefOr[js.Array[Order]] = js.native
  /** The projection to return. */
  var select: js.UndefOr[Projection] = js.native
  /** A starting point for the query results. */
  var startAt: js.UndefOr[Cursor] = js.native
  /** The filter to apply. */
  var where: js.UndefOr[Filter] = js.native
}

object StructuredQuery {
  @scala.inline
  def apply(): StructuredQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredQuery]
  }
  @scala.inline
  implicit class StructuredQueryOps[Self <: StructuredQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndAt(value: Cursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAt")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: js.Array[CollectionSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
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
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: js.Array[Order]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: Projection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAt(value: Cursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(js.undefined)
        ret
    }
    @scala.inline
    def withWhere(value: Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

