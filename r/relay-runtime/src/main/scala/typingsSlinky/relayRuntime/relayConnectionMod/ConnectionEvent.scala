package typingsSlinky.relayRuntime.relayConnectionMod

import typingsSlinky.relayRuntime.anon.Edge
import typingsSlinky.relayRuntime.anon.EdgeData
import typingsSlinky.relayRuntime.anon.Edges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.anon.Edges[TEdge]
  - typingsSlinky.relayRuntime.anon.EdgeData[TEdge]
  - typingsSlinky.relayRuntime.anon.Edge[TEdge]
*/
trait ConnectionEvent[TEdge] extends js.Object

object ConnectionEvent {
  @scala.inline
  implicit def apply[TEdge](value: Edge[TEdge]): ConnectionEvent[TEdge] = value.asInstanceOf[ConnectionEvent[TEdge]]
  @scala.inline
  implicit def apply[TEdge](value: EdgeData[TEdge]): ConnectionEvent[TEdge] = value.asInstanceOf[ConnectionEvent[TEdge]]
  @scala.inline
  implicit def apply[TEdge](value: Edges[TEdge]): ConnectionEvent[TEdge] = value.asInstanceOf[ConnectionEvent[TEdge]]
}

