package typingsSlinky.rbx.sectionSectionMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionVariablesDefaults extends js.Object {
  var sizes: medium | large
}

object SectionVariablesDefaults {
  @scala.inline
  def apply(sizes: medium | large): SectionVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionVariablesDefaults]
  }
}

