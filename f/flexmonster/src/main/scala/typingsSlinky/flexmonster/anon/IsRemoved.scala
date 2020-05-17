package typingsSlinky.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsRemoved extends js.Object {
  var isRemoved: Boolean = js.native
  var uniqueName: String = js.native
}

object IsRemoved {
  @scala.inline
  def apply(isRemoved: Boolean, uniqueName: String): IsRemoved = {
    val __obj = js.Dynamic.literal(isRemoved = isRemoved.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRemoved]
  }
  @scala.inline
  implicit class IsRemovedOps[Self <: IsRemoved] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

