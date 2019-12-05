package typingsSlinky.reactDashRnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRndMod {
  import org.scalajs.dom.raw.HTMLDivElement
  import org.scalajs.dom.raw.HTMLElement
  import org.scalajs.dom.raw.MouseEvent
  import org.scalajs.dom.raw.SVGElement
  import org.scalajs.dom.raw.TouchEvent
  import slinky.web.SyntheticMouseEvent
  import slinky.web.SyntheticTouchEvent
  import typingsSlinky.reDashResizable.reDashResizableMod.ResizeDirection
  import typingsSlinky.reactDashDraggable.reactDashDraggableMod.DraggableEventHandler
  import typingsSlinky.reactDashRnd.Anon_DeltaX

  type $TODO = js.Any
  type DraggableData = Anon_DeltaX with Position
  type Grid = js.Tuple2[Double, Double]
  type RndDragCallback = DraggableEventHandler
  type RndDragEvent = (SyntheticMouseEvent[HTMLElement | SVGElement]) | (SyntheticTouchEvent[HTMLElement | SVGElement]) | MouseEvent | TouchEvent
  type RndResizeCallback = js.Function5[
    /* e */ MouseEvent | TouchEvent, 
    /* dir */ ResizeDirection, 
    /* elementRef */ HTMLDivElement, 
    /* delta */ ResizableDelta, 
    /* position */ Position, 
    Unit
  ]
  type RndResizeStartCallback = js.Function3[
    /* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], 
    /* dir */ ResizeDirection, 
    /* elementRef */ HTMLDivElement, 
    Unit
  ]
}
