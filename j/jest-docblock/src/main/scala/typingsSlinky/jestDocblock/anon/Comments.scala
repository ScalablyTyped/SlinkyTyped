package typingsSlinky.jestDocblock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comments extends js.Object {
  var comments: String = js.native
  var pragmas: typingsSlinky.jestDocblock.mod.Pragmas = js.native
}

object Comments {
  @scala.inline
  def apply(comments: String, pragmas: typingsSlinky.jestDocblock.mod.Pragmas): Comments = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], pragmas = pragmas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comments]
  }
  @scala.inline
  implicit class CommentsOps[Self <: Comments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPragmas(value: typingsSlinky.jestDocblock.mod.Pragmas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pragmas")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

