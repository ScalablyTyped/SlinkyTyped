package typingsSlinky.eslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeComments extends js.Object {
  var includeComments: js.UndefOr[Boolean] = js.native
}

object IncludeComments {
  @scala.inline
  def apply(): IncludeComments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeComments]
  }
  @scala.inline
  implicit class IncludeCommentsOps[Self <: IncludeComments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeComments")(js.undefined)
        ret
    }
  }
  
}

