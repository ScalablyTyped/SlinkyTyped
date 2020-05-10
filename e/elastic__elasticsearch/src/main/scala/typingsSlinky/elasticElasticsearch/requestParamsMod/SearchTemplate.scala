package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.all
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.closed
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_and_fetch
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.none
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.open
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.query_and_fetch
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchTemplate[T] extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  var body: T = js.native
  var expand_wildcards: js.UndefOr[open | closed | none | all] = js.native
  var explain: js.UndefOr[Boolean] = js.native
  var ignore_throttled: js.UndefOr[Boolean] = js.native
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
  var preference: js.UndefOr[String] = js.native
  var profile: js.UndefOr[Boolean] = js.native
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.native
  var routing: js.UndefOr[String | js.Array[String]] = js.native
  var scroll: js.UndefOr[String] = js.native
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.native
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  var typed_keys: js.UndefOr[Boolean] = js.native
}

object SearchTemplate {
  @scala.inline
  def apply[T](body: T): SearchTemplate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTemplate[T]]
  }
  @scala.inline
  implicit class SearchTemplateOps[Self[t] <: SearchTemplate[t], T] (val x: Self[T]) extends AnyVal {
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
    def withAllow_no_indices(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_no_indices: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_indices")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand_wildcards(value: open | closed | none | all): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand_wildcards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand_wildcards: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand_wildcards")(js.undefined)
        ret
    }
    @scala.inline
    def withExplain(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplain: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explain")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore_throttled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_throttled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore_throttled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_throttled")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore_unavailable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_unavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore_unavailable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_unavailable")(js.undefined)
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
    def withPreference(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreference: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
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
    def withRouting(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouting: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
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

