package typingsSlinky.rbx.mediaItemMod

import typingsSlinky.rbx.rbxStrings.content
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/media/media-item.MediaItemVariablesOverrides, rbx.rbx/components/media/media-item.MediaItemVariablesDefaults> */
trait MediaItemVariables extends js.Object {
  var alignments: content | left | right
}

object MediaItemVariables {
  @scala.inline
  def apply(alignments: content | left | right): MediaItemVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItemVariables]
  }
}

