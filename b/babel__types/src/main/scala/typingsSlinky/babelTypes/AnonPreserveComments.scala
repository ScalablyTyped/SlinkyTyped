package typingsSlinky.babelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreserveComments extends js.Object {
  var preserveComments: Boolean = js.native
}

object AnonPreserveComments {
  @scala.inline
  def apply(preserveComments: Boolean): AnonPreserveComments = {
    val __obj = js.Dynamic.literal(preserveComments = preserveComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreserveComments]
  }
  @scala.inline
  implicit class AnonPreserveCommentsOps[Self <: AnonPreserveComments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreserveComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

