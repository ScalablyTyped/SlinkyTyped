package typingsSlinky.rbx.levelItemMod

import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/level/level-item.LevelItemVariablesOverrides, rbx.rbx/components/level/level-item.LevelItemVariablesDefaults> */
trait LevelItemVariables extends js.Object {
  var alignments: left | right
}

object LevelItemVariables {
  @scala.inline
  def apply(alignments: left | right): LevelItemVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelItemVariables]
  }
}

