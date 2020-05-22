package typingsSlinky.rbx.breadcrumbBreadcrumbMod

import typingsSlinky.rbx.rbxStrings.arrow
import typingsSlinky.rbx.rbxStrings.bullet
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.dot
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.succeeds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbVariablesDefaults extends js.Object {
  var alignments: centered | right
  var separators: arrow | bullet | dot | succeeds
  var sizes: small | medium | large
}

object BreadcrumbVariablesDefaults {
  @scala.inline
  def apply(
    alignments: centered | right,
    separators: arrow | bullet | dot | succeeds,
    sizes: small | medium | large
  ): BreadcrumbVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbVariablesDefaults]
  }
}

