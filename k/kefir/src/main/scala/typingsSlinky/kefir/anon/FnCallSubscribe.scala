package typingsSlinky.kefir.anon

import typingsSlinky.kefir.mod.Emitter
import typingsSlinky.kefir.mod.Stream_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallSubscribe extends js.Object {
  def apply[T, S](subscribe: js.Function1[/* emitter */ Emitter[T, S], js.Function | Unit]): Stream_[T, S] = js.native
}

