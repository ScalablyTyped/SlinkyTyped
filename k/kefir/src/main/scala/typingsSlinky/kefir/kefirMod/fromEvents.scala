package typingsSlinky.kefir.kefirMod

import typingsSlinky.kefir.Anon_Off
import typingsSlinky.node.NodeJS.EventEmitter
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "fromEvents")
@js.native
object fromEvents extends js.Object {
  def apply[T, S](target: Anon_Off, eventName: String): Stream[T, S] = js.native
  def apply[T, S](target: Anon_Off, eventName: String, transform: js.Function1[/* value */ T, S]): Stream[T, S] = js.native
  def apply[T, S](target: EventEmitter, eventName: String): Stream[T, S] = js.native
  def apply[T, S](target: EventEmitter, eventName: String, transform: js.Function1[/* value */ T, S]): Stream[T, S] = js.native
  def apply[T, S](target: EventTarget, eventName: String): Stream[T, S] = js.native
  def apply[T, S](target: EventTarget, eventName: String, transform: js.Function1[/* value */ T, S]): Stream[T, S] = js.native
}

