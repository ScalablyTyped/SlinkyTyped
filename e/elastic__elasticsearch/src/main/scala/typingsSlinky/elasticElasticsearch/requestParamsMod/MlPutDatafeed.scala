package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlPutDatafeed[T] extends Generic {
  var body: T = js.native
  var datafeed_id: String = js.native
}

object MlPutDatafeed {
  @scala.inline
  def apply[T](body: T, datafeed_id: String): MlPutDatafeed[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutDatafeed[T]]
  }
  @scala.inline
  implicit class MlPutDatafeedOps[Self[t] <: MlPutDatafeed[t], T] (val x: Self[T]) extends AnyVal {
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
    def withDatafeed_id(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafeed_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

