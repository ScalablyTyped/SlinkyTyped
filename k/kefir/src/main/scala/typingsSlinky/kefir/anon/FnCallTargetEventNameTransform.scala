package typingsSlinky.kefir.anon

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.kefir.mod.Stream_
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallTargetEventNameTransform extends js.Object {
  
  def apply[T, S](target: Off, eventName: String): Stream_[T, S] = js.native
  def apply[T, S](target: Off, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def apply[T, S](target: EventEmitter, eventName: String): Stream_[T, S] = js.native
  def apply[T, S](target: EventEmitter, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
  def apply[T, S](target: EventTarget, eventName: String): Stream_[T, S] = js.native
  def apply[T, S](target: EventTarget, eventName: String, transform: js.Function1[/* value */ T, S]): Stream_[T, S] = js.native
}
