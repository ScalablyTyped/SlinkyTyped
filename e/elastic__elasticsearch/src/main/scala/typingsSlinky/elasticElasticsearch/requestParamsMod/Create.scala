package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.`false`
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.`true`
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.external
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.external_gte
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.internal
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Create[T] extends Generic {
  var body: T = js.native
  var id: String = js.native
  var index: String = js.native
  var pipeline: js.UndefOr[String] = js.native
  var refresh: js.UndefOr[`true` | `false` | wait_for] = js.native
  var routing: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
  var version_type: js.UndefOr[internal | external | external_gte] = js.native
  var wait_for_active_shards: js.UndefOr[String] = js.native
}

object Create {
  @scala.inline
  def apply[T](body: T, id: String, index: String): Create[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create[T]]
  }
  @scala.inline
  implicit class CreateOps[Self[t] <: Create[t], T] (val x: Self[T]) extends AnyVal {
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
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipeline(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipeline: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: `true` | `false` | wait_for): Self[T] = {
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
    @scala.inline
    def withVersion(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion_type(value: internal | external | external_gte): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion_type: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_type")(js.undefined)
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

