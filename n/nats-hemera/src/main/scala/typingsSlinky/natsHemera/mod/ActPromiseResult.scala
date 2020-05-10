package typingsSlinky.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActPromiseResult[T] extends js.Object {
  var context: Hemera[ClientRequest, ClientResponse] = js.native
  var data: T = js.native
}

object ActPromiseResult {
  @scala.inline
  def apply[T](context: Hemera[ClientRequest, ClientResponse], data: T): ActPromiseResult[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActPromiseResult[T]]
  }
  @scala.inline
  implicit class ActPromiseResultOps[Self[t] <: ActPromiseResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContext(value: Hemera[ClientRequest, ClientResponse]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

