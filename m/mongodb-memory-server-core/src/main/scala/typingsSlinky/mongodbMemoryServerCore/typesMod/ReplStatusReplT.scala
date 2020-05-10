package typingsSlinky.mongodbMemoryServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplStatusReplT extends js.Object {
  var ismaster: Boolean = js.native
}

object ReplStatusReplT {
  @scala.inline
  def apply(ismaster: Boolean): ReplStatusReplT = {
    val __obj = js.Dynamic.literal(ismaster = ismaster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplStatusReplT]
  }
  @scala.inline
  implicit class ReplStatusReplTOps[Self <: ReplStatusReplT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsmaster(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ismaster")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

