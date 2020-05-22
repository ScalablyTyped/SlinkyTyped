package typingsSlinky.rbx.tagTagMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/tag/tag.TagVariablesOverrides, rbx.rbx/elements/tag/tag.TagVariablesDefaults> */
trait TagVariables extends js.Object {
  var sizes: normal | medium | large
}

object TagVariables {
  @scala.inline
  def apply(sizes: normal | medium | large): TagVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagVariables]
  }
}

