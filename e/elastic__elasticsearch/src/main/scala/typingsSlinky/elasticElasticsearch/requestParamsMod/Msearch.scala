package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_and_fetch
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.query_and_fetch
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Msearch[T] extends Generic {
  var body: T = js.native
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
  var max_concurrent_searches: js.UndefOr[Double] = js.native
  var max_concurrent_shard_requests: js.UndefOr[Double] = js.native
  var pre_filter_shard_size: js.UndefOr[Double] = js.native
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.native
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.native
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  var typed_keys: js.UndefOr[Boolean] = js.native
}

object Msearch {
  @scala.inline
  def apply[T](body: T): Msearch[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msearch[T]]
  }
  @scala.inline
  implicit class MsearchOps[Self[t] <: Msearch[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBody(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCcs_minimize_roundtrips(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccs_minimize_roundtrips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcs_minimize_roundtrips: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccs_minimize_roundtrips")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_concurrent_searches(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_concurrent_searches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_concurrent_searches: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_concurrent_searches")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_concurrent_shard_requests(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_concurrent_shard_requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_concurrent_shard_requests: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_concurrent_shard_requests")(js.undefined)
        ret
    }
    @scala.inline
    def withPre_filter_shard_size(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre_filter_shard_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPre_filter_shard_size: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre_filter_shard_size")(js.undefined)
        ret
    }
    @scala.inline
    def withRest_total_hits_as_int(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest_total_hits_as_int")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRest_total_hits_as_int: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest_total_hits_as_int")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch_type(value: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_type: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_type")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTyped_keys(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typed_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTyped_keys: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typed_keys")(js.undefined)
        ret
    }
  }
  
}

