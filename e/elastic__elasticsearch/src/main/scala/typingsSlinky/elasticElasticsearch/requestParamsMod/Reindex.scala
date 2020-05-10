package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reindex[T] extends Generic {
  var body: T = js.native
  var max_docs: js.UndefOr[Double] = js.native
  var refresh: js.UndefOr[Boolean] = js.native
  var requests_per_second: js.UndefOr[Double] = js.native
  var scroll: js.UndefOr[String] = js.native
  var slices: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[String] = js.native
  var wait_for_active_shards: js.UndefOr[String] = js.native
  var wait_for_completion: js.UndefOr[Boolean] = js.native
}

object Reindex {
  @scala.inline
  def apply[T](body: T): Reindex[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reindex[T]]
  }
  @scala.inline
  implicit class ReindexOps[Self[t] <: Reindex[t], T] (val x: Self[T]) extends AnyVal {
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
    def withMax_docs(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_docs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_docs")(js.undefined)
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
    def withRequests_per_second(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests_per_second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests_per_second: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests_per_second")(js.undefined)
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
    def withSlices(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlices: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slices")(js.undefined)
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
    @scala.inline
    def withWait_for_completion(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_completion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_completion: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_completion")(js.undefined)
        ret
    }
  }
  
}

