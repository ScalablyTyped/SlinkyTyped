package typingsSlinky.jpm.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait STResponse[T] extends js.Object {
  var json: T = js.native
}

object STResponse {
  @scala.inline
  def apply[T](json: T): STResponse[T] = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[STResponse[T]]
  }
  @scala.inline
  implicit class STResponseOps[Self[t] <: STResponse[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withJson(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

