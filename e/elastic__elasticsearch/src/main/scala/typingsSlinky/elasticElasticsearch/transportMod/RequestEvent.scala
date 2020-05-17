package typingsSlinky.elasticElasticsearch.transportMod

import typingsSlinky.elasticElasticsearch.anon.Aborted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestEvent[T, C] extends js.Object {
  var body: T = js.native
  var headers: anyObject | Null = js.native
  var meta: Aborted[C] = js.native
  var statusCode: Double | Null = js.native
  var warnings: js.Array[String] | Null = js.native
}

object RequestEvent {
  @scala.inline
  def apply[T, C](body: T, meta: Aborted[C]): RequestEvent[T, C] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEvent[T, C]]
  }
  @scala.inline
  implicit class RequestEventOps[Self[t, c] <: RequestEvent[t, c], T, C] (val x: Self[T, C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, C]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, C]) with Other]
    @scala.inline
    def withBody(value: T): Self[T, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: Aborted[C]): Self[T, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: anyObject): Self[T, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadersNull: Self[T, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(null)
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self[T, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCodeNull: Self[T, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(null)
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[String]): Self[T, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningsNull: Self[T, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(null)
        ret
    }
  }
  
}

