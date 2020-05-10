package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSearchResponse[T] extends js.Object {
  var responses: js.UndefOr[js.Array[SearchResponse[T]]] = js.native
}

object MSearchResponse {
  @scala.inline
  def apply[T](): MSearchResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSearchResponse[T]]
  }
  @scala.inline
  implicit class MSearchResponseOps[Self[t] <: MSearchResponse[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withResponses(value: js.Array[SearchResponse[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(js.undefined)
        ret
    }
  }
  
}

