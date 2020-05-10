package typingsSlinky.jestDocblock

import typingsSlinky.jestDocblock.mod.Pragmas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComments extends js.Object {
  var comments: String = js.native
  var pragmas: Pragmas = js.native
}

object AnonComments {
  @scala.inline
  def apply(comments: String, pragmas: Pragmas): AnonComments = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], pragmas = pragmas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComments]
  }
  @scala.inline
  implicit class AnonCommentsOps[Self <: AnonComments] (val x: Self) extends AnyVal {
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
    def withPragmas(value: Pragmas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pragmas")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

