package typingsSlinky.rbx.heroHeroMod

import typingsSlinky.rbx.rbxStrings.`fullheight-with-navbar`
import typingsSlinky.rbx.rbxStrings.fullheight
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroVariablesDefaults extends js.Object {
  var sizes: small | medium | large | fullheight | `fullheight-with-navbar`
}

object HeroVariablesDefaults {
  @scala.inline
  def apply(sizes: small | medium | large | fullheight | `fullheight-with-navbar`): HeroVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroVariablesDefaults]
  }
}

