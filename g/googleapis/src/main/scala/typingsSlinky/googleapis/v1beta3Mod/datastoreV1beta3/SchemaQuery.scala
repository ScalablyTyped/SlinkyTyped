package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A query for entities.
  */
@js.native
trait SchemaQuery extends js.Object {
  /**
    * The properties to make distinct. The query results will contain the first
    * result for each distinct combination of values for the given properties
    * (if empty, all results are returned).
    */
  var distinctOn: js.UndefOr[js.Array[SchemaPropertyReference]] = js.native
  /**
    * An ending point for the query results. Query cursors are returned in
    * query result batches and [can only be used to limit the same
    * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var endCursor: js.UndefOr[String] = js.native
  /**
    * The filter to apply.
    */
  var filter: js.UndefOr[SchemaFilter] = js.native
  /**
    * The kinds to query (if empty, returns entities of all kinds). Currently
    * at most 1 kind may be specified.
    */
  var kind: js.UndefOr[js.Array[SchemaKindExpression]] = js.native
  /**
    * The maximum number of results to return. Applies after all other
    * constraints. Optional. Unspecified is interpreted as no limit. Must be
    * &gt;= 0 if specified.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The number of results to skip. Applies before limit, but after all other
    * constraints. Optional. Must be &gt;= 0 if specified.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The order to apply to the query results (if empty, order is unspecified).
    */
  var order: js.UndefOr[js.Array[SchemaPropertyOrder]] = js.native
  /**
    * The projection to return. Defaults to returning all properties.
    */
  var projection: js.UndefOr[js.Array[SchemaProjection]] = js.native
  /**
    * A starting point for the query results. Query cursors are returned in
    * query result batches and [can only be used to continue the same
    * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var startCursor: js.UndefOr[String] = js.native
}

object SchemaQuery {
  @scala.inline
  def apply(): SchemaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuery]
  }
  @scala.inline
  implicit class SchemaQueryOps[Self <: SchemaQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistinctOn(value: js.Array[SchemaPropertyReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinctOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistinctOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinctOn")(js.undefined)
        ret
    }
    @scala.inline
    def withEndCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: SchemaFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: js.Array[SchemaKindExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withOrder(value: js.Array[SchemaPropertyOrder]): Self = {
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
    def withProjection(value: js.Array[SchemaProjection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCursor")(js.undefined)
        ret
    }
  }
  
}

