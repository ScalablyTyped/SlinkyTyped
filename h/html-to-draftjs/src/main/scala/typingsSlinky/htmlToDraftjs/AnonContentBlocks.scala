package typingsSlinky.htmlToDraftjs

import typingsSlinky.draftJs.mod.ContentBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentBlocks extends js.Object {
  var contentBlocks: js.Array[ContentBlock] = js.native
  var entityMap: js.UndefOr[js.Any] = js.native
}

object AnonContentBlocks {
  @scala.inline
  def apply(contentBlocks: js.Array[ContentBlock]): AnonContentBlocks = {
    val __obj = js.Dynamic.literal(contentBlocks = contentBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentBlocks]
  }
  @scala.inline
  implicit class AnonContentBlocksOps[Self <: AnonContentBlocks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentBlocks(value: js.Array[ContentBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityMap")(js.undefined)
        ret
    }
  }
  
}

