package typingsSlinky.kefir

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.kefir.mod.Stream_
import typingsSlinky.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallTargetEventNameTransform extends js.Object {
  def apply[T, S](target: AnonOff, eventName: String): Stream_[T, S] = js.native
  def apply[T, S](target: AnonOff, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def apply[T, S](target: EventEmitter, eventName: String): Stream_[T, S] = js.native
  def apply[T, S](target: EventEmitter, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def apply[T, S](target: EventTarget, eventName: String): Stream_[T, S] = js.native
  def apply[T, S](target: EventTarget, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
}

