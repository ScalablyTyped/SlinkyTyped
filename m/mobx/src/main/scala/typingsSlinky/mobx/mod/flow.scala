package typingsSlinky.mobx.mod

import typingsSlinky.mobx.flowMod.CancellablePromise
import typingsSlinky.std.AsyncGenerator
import typingsSlinky.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "flow")
@js.native
object flow extends js.Object {
  def apply[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, (Generator[_, R, _]) | (AsyncGenerator[_, R, _])]): js.Function1[/* args */ Args, CancellablePromise[R]] = js.native
}

