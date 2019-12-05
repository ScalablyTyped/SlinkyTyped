package typingsSlinky.kefir

import typingsSlinky.kefir.kefirMod.Emitter
import typingsSlinky.kefir.kefirMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Emitter extends js.Object {
  def apply[T, S](interval: Double, handler: js.Function1[/* emitter */ Emitter[T, S], Unit]): Stream[T, S] = js.native
}

