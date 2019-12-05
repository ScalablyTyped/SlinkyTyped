package typingsSlinky.reactDashMovable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import org.scalajs.dom.raw.Element
  import slinky.web.SyntheticKeyboardEvent
  import slinky.web.SyntheticMouseEvent
  import slinky.web.SyntheticTouchEvent

  type TEvent = SyntheticMouseEvent[Element] | SyntheticTouchEvent[Element] | SyntheticKeyboardEvent[Element]
}
