package typingsSlinky.rbx.levelItemMod

import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelItemVariablesDefaults extends js.Object {
  var alignments: left | right
}

object LevelItemVariablesDefaults {
  @scala.inline
  def apply(alignments: left | right): LevelItemVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelItemVariablesDefaults]
  }
}

