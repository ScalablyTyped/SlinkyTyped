package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.AnonHits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResponse[T] extends js.Object {
  var _scroll_id: js.UndefOr[String] = js.native
  var _shards: ShardsResponse = js.native
  var aggregations: js.UndefOr[js.Any] = js.native
  var hits: AnonHits[T] = js.native
  var timed_out: Boolean = js.native
  var took: Double = js.native
}

object SearchResponse {
  @scala.inline
  def apply[T](_shards: ShardsResponse, hits: AnonHits[T], timed_out: Boolean, took: Double): SearchResponse[T] = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse[T]]
  }
  @scala.inline
  implicit class SearchResponseOps[Self[t] <: SearchResponse[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_shards(value: ShardsResponse): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHits(value: AnonHits[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimed_out(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timed_out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTook(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("took")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scroll_id(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scroll_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_scroll_id: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scroll_id")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregations(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregations: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregations")(js.undefined)
        ret
    }
  }
  
}

