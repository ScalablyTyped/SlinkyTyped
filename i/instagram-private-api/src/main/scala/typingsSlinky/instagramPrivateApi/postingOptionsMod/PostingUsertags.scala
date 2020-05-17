package typingsSlinky.instagramPrivateApi.postingOptionsMod

import typingsSlinky.instagramPrivateApi.anon.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostingUsertags extends js.Object {
  var in: js.Array[Position] = js.native
}

object PostingUsertags {
  @scala.inline
  def apply(in: js.Array[Position]): PostingUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingUsertags]
  }
  @scala.inline
  implicit class PostingUsertagsOps[Self <: PostingUsertags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn(value: js.Array[Position]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

