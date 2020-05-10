package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.AND
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.OR
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.all
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.closed
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.none
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count[T] extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  var analyze_wildcard: js.UndefOr[Boolean] = js.native
  var analyzer: js.UndefOr[String] = js.native
  var body: js.UndefOr[T] = js.native
  var default_operator: js.UndefOr[AND | OR] = js.native
  var df: js.UndefOr[String] = js.native
  var expand_wildcards: js.UndefOr[open | closed | none | all] = js.native
  var ignore_throttled: js.UndefOr[Boolean] = js.native
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
  var lenient: js.UndefOr[Boolean] = js.native
  var min_score: js.UndefOr[Double] = js.native
  var preference: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var routing: js.UndefOr[String | js.Array[String]] = js.native
  var terminate_after: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
}

object Count {
  @scala.inline
  def apply[T](): Count[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count[T]]
  }
  @scala.inline
  implicit class CountOps[Self[t] <: Count[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
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
    def withAnalyze_wildcard(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyze_wildcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyze_wildcard: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyze_wildcard")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalyzer(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzer")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_operator(value: AND | OR): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_operator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_operator")(js.undefined)
        ret
    }
    @scala.inline
    def withDf(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("df")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDf: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("df")(js.undefined)
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
    def withLenient(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLenient: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenient")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_score(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_score: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_score")(js.undefined)
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
    def withQ(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
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
    def withTerminate_after(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminate_after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminate_after: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminate_after")(js.undefined)
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
  }
  
}

