package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesRollover[T] extends Generic {
  var alias: String = js.native
  var body: js.UndefOr[T] = js.native
  var dry_run: js.UndefOr[Boolean] = js.native
  var include_type_name: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var new_index: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[String] = js.native
  var wait_for_active_shards: js.UndefOr[String] = js.native
}

object IndicesRollover {
  @scala.inline
  def apply[T](alias: String): IndicesRollover[T] = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRollover[T]]
  }
  @scala.inline
  implicit class IndicesRolloverOps[Self[t] <: IndicesRollover[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAlias(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
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
    def withDry_run(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dry_run")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDry_run: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dry_run")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_type_name(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_type_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_type_name: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_type_name")(js.undefined)
        ret
    }
    @scala.inline
    def withMaster_timeout(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaster_timeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_index(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_index: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_index")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWait_for_active_shards(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_active_shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_active_shards: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_active_shards")(js.undefined)
        ret
    }
  }
  
}

