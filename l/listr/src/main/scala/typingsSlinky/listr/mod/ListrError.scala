package typingsSlinky.listr.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrError[Ctx] extends Error {
  var context: Ctx = js.native
}

object ListrError {
  @scala.inline
  def apply[Ctx](context: Ctx, message: String, name: String): ListrError[Ctx] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrError[Ctx]]
  }
  @scala.inline
  implicit class ListrErrorOps[Self[ctx] <: ListrError[ctx], Ctx] (val x: Self[Ctx]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ctx] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ctx]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Ctx] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Ctx] with Other]
    @scala.inline
    def withContext(value: Ctx): Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

