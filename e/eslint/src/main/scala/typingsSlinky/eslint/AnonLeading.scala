package typingsSlinky.eslint

import typingsSlinky.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLeading extends js.Object {
  var leading: js.Array[Comment] = js.native
  var trailing: js.Array[Comment] = js.native
}

object AnonLeading {
  @scala.inline
  def apply(leading: js.Array[Comment], trailing: js.Array[Comment]): AnonLeading = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeading]
  }
  @scala.inline
  implicit class AnonLeadingOps[Self <: AnonLeading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeading(value: js.Array[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrailing(value: js.Array[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

