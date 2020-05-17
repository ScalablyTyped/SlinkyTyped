package typingsSlinky.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Explanation[T] extends js.Object {
  var _explanation: js.UndefOr[typingsSlinky.elasticsearch.mod.Explanation] = js.native
  var _id: String = js.native
  var _index: String = js.native
  var _score: Double = js.native
  var _source: T = js.native
  var _type: String = js.native
  var _version: js.UndefOr[Double] = js.native
  var fields: js.UndefOr[js.Any] = js.native
  var highlight: js.UndefOr[js.Any] = js.native
  var inner_hits: js.UndefOr[js.Any] = js.native
  var matched_queries: js.UndefOr[js.Array[String]] = js.native
  var sort: js.UndefOr[js.Array[String]] = js.native
}

object Explanation {
  @scala.inline
  def apply[T](_id: String, _index: String, _score: Double, _source: T, _type: String): Explanation[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _score = _score.asInstanceOf[js.Any], _source = _source.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explanation[T]]
  }
  @scala.inline
  implicit class ExplanationOps[Self[t] <: Explanation[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_id(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_index(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_score(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_source(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_type(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_explanation(value: typingsSlinky.elasticsearch.mod.Explanation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_explanation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_explanation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_explanation")(js.undefined)
        ret
    }
    @scala.inline
    def with_version(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_version: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_version")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withInner_hits(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner_hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInner_hits: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner_hits")(js.undefined)
        ret
    }
    @scala.inline
    def withMatched_queries(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matched_queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatched_queries: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matched_queries")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

