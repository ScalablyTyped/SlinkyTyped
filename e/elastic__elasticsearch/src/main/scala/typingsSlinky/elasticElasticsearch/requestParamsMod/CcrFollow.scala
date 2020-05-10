package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CcrFollow[T] extends Generic {
  var body: T = js.native
  var index: String = js.native
  var wait_for_active_shards: js.UndefOr[String] = js.native
}

object CcrFollow {
  @scala.inline
  def apply[T](body: T, index: String): CcrFollow[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrFollow[T]]
  }
  @scala.inline
  implicit class CcrFollowOps[Self[t] <: CcrFollow[t], T] (val x: Self[T]) extends AnyVal {
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
    def withIndex(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
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

