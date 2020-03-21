package typingsSlinky.reactDraggable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Draggable = slinky.core.ReactComponentClass[typingsSlinky.reactDraggable.PartialDraggableProps]
  type DraggableEvent = (slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.SVGElement]) | (slinky.web.SyntheticTouchEvent[org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.SVGElement]) | org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent
  type DraggableEventHandler = js.Function2[
    /* e */ typingsSlinky.reactDraggable.mod.DraggableEvent, 
    /* data */ typingsSlinky.reactDraggable.mod.DraggableData, 
    scala.Unit | typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
  ]
}
