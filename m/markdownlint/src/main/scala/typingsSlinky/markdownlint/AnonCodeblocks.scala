package typingsSlinky.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCodeblocks extends js.Object {
  var code_blocks: js.UndefOr[Boolean] = js.native
}

object AnonCodeblocks {
  @scala.inline
  def apply(): AnonCodeblocks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCodeblocks]
  }
  @scala.inline
  implicit class AnonCodeblocksOps[Self <: AnonCodeblocks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode_blocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode_blocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_blocks")(js.undefined)
        ret
    }
  }
  
}

