package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mget[T] extends Generic {
  var _source: js.UndefOr[String | js.Array[String]] = js.native
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.native
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.native
  var _source_include: js.UndefOr[String | js.Array[String]] = js.native
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.native
  var body: T = js.native
  var index: js.UndefOr[String] = js.native
  var preference: js.UndefOr[String] = js.native
  var realtime: js.UndefOr[Boolean] = js.native
  var refresh: js.UndefOr[Boolean] = js.native
  var routing: js.UndefOr[String] = js.native
  var stored_fields: js.UndefOr[String | js.Array[String]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Mget {
  @scala.inline
  def apply[T](body: T): Mget[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mget[T]]
  }
  @scala.inline
  implicit class MgetOps[Self[t] <: Mget[t], T] (val x: Self[T]) extends AnyVal {
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
    def with_source(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_source: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(js.undefined)
        ret
    }
    @scala.inline
    def with_source_exclude(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source_exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_source_exclude: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source_exclude")(js.undefined)
        ret
    }
    @scala.inline
    def with_source_excludes(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source_excludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_source_excludes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source_excludes")(js.undefined)
        ret
    }
    @scala.inline
    def with_source_include(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source_include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_source_include: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source_include")(js.undefined)
        ret
    }
    @scala.inline
    def with_source_includes(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source_includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_source_includes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source_includes")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String): Self[T] = {
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
    def withRealtime(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtime: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefresh: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withRouting(value: String): Self[T] = {
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
    def withStored_fields(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stored_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStored_fields: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stored_fields")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self[T] = {
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

