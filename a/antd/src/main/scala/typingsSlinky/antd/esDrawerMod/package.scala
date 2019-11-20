package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esDrawerMod {
  import org.scalajs.dom.raw.HTMLButtonElement
  import org.scalajs.dom.raw.HTMLDivElement
  import org.scalajs.dom.raw.HTMLElement
  import slinky.web.SyntheticKeyboardEvent
  import slinky.web.SyntheticMouseEvent

  type EventType = SyntheticKeyboardEvent[HTMLDivElement] | (SyntheticMouseEvent[HTMLDivElement | HTMLButtonElement])
  type getContainerFunc = js.Function0[HTMLElement]
}
