package typingsSlinky.reactRnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Grid = js.Tuple2[scala.Double, scala.Double]
  type RndDragCallback = typingsSlinky.reactDraggable.mod.DraggableEventHandler
  type RndResizeCallback = js.Function5[
    /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, 
    /* dir */ typingsSlinky.reResizable.mod.ResizeDirection, 
    /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, 
    /* delta */ typingsSlinky.reactRnd.mod.ResizableDelta, 
    /* position */ typingsSlinky.reactRnd.mod.Position, 
    scala.Unit
  ]
  type RndResizeStartCallback = js.Function3[
    /* e */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLDivElement] | slinky.web.SyntheticTouchEvent[org.scalajs.dom.raw.HTMLDivElement], 
    /* dir */ typingsSlinky.reResizable.mod.ResizeDirection, 
    /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, 
    scala.Unit
  ]
  type TODO = js.Any
}
