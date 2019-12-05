package typingsSlinky.reDashResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reDashResizableMod {
  import org.scalajs.dom.raw.HTMLDivElement
  import org.scalajs.dom.raw.MouseEvent
  import org.scalajs.dom.raw.TouchEvent
  import slinky.web.SyntheticMouseEvent
  import slinky.web.SyntheticTouchEvent
  import typingsSlinky.reDashResizable.libResizerMod.Direction

  type ResizeCallback = js.Function4[
    /* event */ MouseEvent | TouchEvent, 
    /* direction */ Direction, 
    /* elementRef */ HTMLDivElement, 
    /* delta */ NumberSize, 
    Unit
  ]
  type ResizeDirection = Direction
  type ResizeStartCallback = js.Function3[
    /* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], 
    /* dir */ Direction, 
    /* elementRef */ HTMLDivElement, 
    Unit | Boolean
  ]
}
