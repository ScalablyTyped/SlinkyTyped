package typingsSlinky.relayRuntime.relayConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionResolver[TEdge, TState] extends js.Object {
  def initialize(): TState = js.native
  def reduce(state: TState, event: ConnectionEvent[TEdge]): TState = js.native
}

object ConnectionResolver {
  @scala.inline
  def apply[TEdge, TState](initialize: () => TState, reduce: (TState, ConnectionEvent[TEdge]) => TState): ConnectionResolver[TEdge, TState] = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction0(initialize), reduce = js.Any.fromFunction2(reduce))
    __obj.asInstanceOf[ConnectionResolver[TEdge, TState]]
  }
  @scala.inline
  implicit class ConnectionResolverOps[Self[tedge, tstate] <: ConnectionResolver[tedge, tstate], TEdge, TState] (val x: Self[TEdge, TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEdge, TState] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEdge, TState]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TEdge, TState]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TEdge, TState]) with Other]
    @scala.inline
    def withInitialize(value: () => TState): Self[TEdge, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReduce(value: (TState, ConnectionEvent[TEdge]) => TState): Self[TEdge, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

