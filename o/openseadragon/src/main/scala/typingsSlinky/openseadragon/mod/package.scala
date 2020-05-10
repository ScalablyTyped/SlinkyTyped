package typingsSlinky.openseadragon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // TODO: use proper eventName type aliases, and OSDEvent where appropiate
  type EventHandler[T /* <: typingsSlinky.openseadragon.mod.OSDEvent[_] */] = js.Function1[/* event */ T, scala.Unit]
  type OnDrawCallback = js.Function3[
    /* position */ typingsSlinky.openseadragon.mod.Point, 
    /* size */ typingsSlinky.openseadragon.mod.Point, 
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    scala.Unit
  ]
}
