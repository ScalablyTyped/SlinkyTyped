package typingsSlinky.reactDraggable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Draggable = slinky.core.ReactComponentClass[typingsSlinky.reactDraggable.anon.PartialDraggableProps]
  type DraggableEventHandler = js.Function2[
    /* e */ typingsSlinky.reactDraggable.mod.DraggableEvent, 
    /* data */ typingsSlinky.reactDraggable.mod.DraggableData, 
    scala.Unit | typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
  ]
}
