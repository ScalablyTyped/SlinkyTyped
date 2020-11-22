package typingsSlinky.pullStream

import typingsSlinky.pullStream.mod.EndOrError
import typingsSlinky.pullStream.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pull-stream/sinks/drain", JSImport.Namespace)
@js.native
object drainMod extends js.Object {
  
  /**
    * Drain the stream, calling op on each `data`. Call `done` when stream is finished. If `op` returns `=== false`, abort the stream.
    */
  def apply[T](): Sink[T] = js.native
  def apply[T](op: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ EndOrError, _]): Sink[T] = js.native
  def apply[T](op: js.Function1[/* data */ T, _]): Sink[T] = js.native
  def apply[T](op: js.Function1[/* data */ T, _], cb: js.Function1[/* err */ EndOrError, _]): Sink[T] = js.native
}
