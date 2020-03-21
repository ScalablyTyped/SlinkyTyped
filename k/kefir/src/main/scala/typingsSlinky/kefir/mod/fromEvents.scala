package typingsSlinky.kefir.mod

import typingsSlinky.kefir.AnonOff
import typingsSlinky.node.NodeJS.EventEmitter
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "fromEvents")
@js.native
object fromEvents extends js.Object {
  def apply[T, S](target: AnonOff, eventName: String): Stream_[T, S] = js.native
  def apply[T, S](target: AnonOff, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def apply[T, S](target: EventEmitter, eventName: String): Stream_[T, S] = js.native
  def apply[T, S](target: EventEmitter, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def apply[T, S](target: EventTarget, eventName: String): Stream_[T, S] = js.native
  def apply[T, S](target: EventTarget, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
}

