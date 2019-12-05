package typingsSlinky.focusDashTrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object focusDashTrapMod {
  import org.scalajs.dom.raw.HTMLElement
  import typingsSlinky.focusDashTrap.focusDashTrapStrings.onActivate
  import typingsSlinky.std.Pick

  type ActivateOptions = Pick[Options, onActivate]
  type FocusTarget = HTMLElement | String | js.Function0[HTMLElement]
}
