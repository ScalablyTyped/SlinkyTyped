package typingsSlinky.kefir

import typingsSlinky.kefir.kefirMod.Emitter
import typingsSlinky.kefir.kefirMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_EmitterSubscribe extends js.Object {
  def apply[T, S](subscribe: js.Function1[/* emitter */ Emitter[T, S], js.Function | Unit]): Stream[T, S] = js.native
}

