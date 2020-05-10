package typingsSlinky.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostResponseData extends js.Object {
  val Messages: js.Array[PostResponseDataMessage] = js.native
}

object PostResponseData {
  @scala.inline
  def apply(Messages: js.Array[PostResponseDataMessage]): PostResponseData = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponseData]
  }
  @scala.inline
  implicit class PostResponseDataOps[Self <: PostResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: js.Array[PostResponseDataMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

