package typingsSlinky.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ResizeCallback = js.Function4[
    /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, 
    /* direction */ typingsSlinky.reResizable.resizerMod.Direction, 
    /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, 
    /* delta */ typingsSlinky.reResizable.mod.NumberSize, 
    scala.Unit
  ]
  type ResizeDirection = typingsSlinky.reResizable.resizerMod.Direction
  type ResizeStartCallback = js.Function3[
    /* e */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLDivElement] | slinky.web.SyntheticTouchEvent[org.scalajs.dom.raw.HTMLDivElement], 
    /* dir */ typingsSlinky.reResizable.resizerMod.Direction, 
    /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, 
    scala.Unit | scala.Boolean
  ]
}
