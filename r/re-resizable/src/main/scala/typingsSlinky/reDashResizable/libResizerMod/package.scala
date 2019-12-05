package typingsSlinky.reDashResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libResizerMod {
  import org.scalajs.dom.raw.HTMLDivElement
  import slinky.web.SyntheticMouseEvent
  import slinky.web.SyntheticTouchEvent

  type OnStartCallback = js.Function2[
    /* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], 
    /* dir */ Direction, 
    Unit
  ]
}
