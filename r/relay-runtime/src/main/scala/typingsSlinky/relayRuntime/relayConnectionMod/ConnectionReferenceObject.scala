package typingsSlinky.relayRuntime.relayConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionReferenceObject[TEdge] extends js.Object {
  var __connection: ConnectionReference[TEdge] = js.native
}

object ConnectionReferenceObject {
  @scala.inline
  def apply[TEdge](__connection: ConnectionReference[TEdge]): ConnectionReferenceObject[TEdge] = {
    val __obj = js.Dynamic.literal(__connection = __connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionReferenceObject[TEdge]]
  }
  @scala.inline
  implicit class ConnectionReferenceObjectOps[Self[tedge] <: ConnectionReferenceObject[tedge], TEdge] (val x: Self[TEdge]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEdge] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEdge]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEdge] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEdge] with Other]
    @scala.inline
    def with__connection(value: ConnectionReference[TEdge]): Self[TEdge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__connection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

