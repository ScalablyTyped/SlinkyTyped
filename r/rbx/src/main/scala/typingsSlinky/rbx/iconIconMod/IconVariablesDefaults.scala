package typingsSlinky.rbx.iconIconMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconVariablesDefaults extends js.Object {
  var alignments: left | right
  var sizes: small | medium | large
}

object IconVariablesDefaults {
  @scala.inline
  def apply(alignments: left | right, sizes: small | medium | large): IconVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconVariablesDefaults]
  }
}

