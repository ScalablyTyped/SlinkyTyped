package typingsSlinky.rbx.mediaItemMod

import typingsSlinky.rbx.rbxStrings.content
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/media/media-item.MediaItemVariablesOverrides, rbx.rbx/components/media/media-item.MediaItemVariablesDefaults> */
@js.native
trait MediaItemVariables extends js.Object {
  var alignments: content | left | right = js.native
}

object MediaItemVariables {
  @scala.inline
  def apply(alignments: content | left | right): MediaItemVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItemVariables]
  }
  @scala.inline
  implicit class MediaItemVariablesOps[Self <: MediaItemVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignments(value: content | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

