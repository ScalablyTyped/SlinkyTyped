package typingsSlinky.jsmediatags.flactagcontentsMod

import typingsSlinky.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FLACTagContents extends js.Object {
  var blocks: js.Array[MetadataBlock] = js.native
  def toArray(): ByteArray = js.native
}

object FLACTagContents {
  @scala.inline
  def apply(blocks: js.Array[MetadataBlock], toArray: () => ByteArray): FLACTagContents = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[FLACTagContents]
  }
  @scala.inline
  implicit class FLACTagContentsOps[Self <: FLACTagContents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocks(value: js.Array[MetadataBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToArray(value: () => ByteArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

