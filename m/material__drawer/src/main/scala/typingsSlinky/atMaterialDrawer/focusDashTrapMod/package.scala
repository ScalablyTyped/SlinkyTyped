package typingsSlinky.atMaterialDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object focusDashTrapMod {
  import org.scalajs.dom.raw.HTMLElement
  import typingsSlinky.atMaterialDrawer.atMaterialDrawerStrings.onActivate
  import typingsSlinky.std.Pick

  type ActivateOptions = Pick[Options, onActivate]
  type FocusTarget = HTMLElement | String | js.Function0[HTMLElement]
}
