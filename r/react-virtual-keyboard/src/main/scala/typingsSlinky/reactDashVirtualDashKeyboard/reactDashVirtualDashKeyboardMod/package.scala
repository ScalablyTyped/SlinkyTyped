package typingsSlinky.reactDashVirtualDashKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashVirtualDashKeyboardMod {
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.Event
  import slinky.core.ReactComponentClass

  type Keyboard = ReactComponentClass[KeyboardProps]
  type kbEvents = js.Function3[
    /* event */ js.UndefOr[String | Event], 
    /* keyboard */ js.UndefOr[Element], 
    /* el */ js.UndefOr[Element], 
    Unit
  ]
}
