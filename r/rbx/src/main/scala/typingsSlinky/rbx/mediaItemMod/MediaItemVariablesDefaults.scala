package typingsSlinky.rbx.mediaItemMod

import typingsSlinky.rbx.rbxStrings.content
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaItemVariablesDefaults extends js.Object {
  var alignments: content | left | right
}

object MediaItemVariablesDefaults {
  @scala.inline
  def apply(alignments: content | left | right): MediaItemVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItemVariablesDefaults]
  }
}

