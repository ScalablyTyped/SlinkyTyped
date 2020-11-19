package typingsSlinky.ringbufferjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ringbufferjs", JSImport.Namespace)
@js.native
class ^[T] protected () extends RingBuffer[T] {
  def this(capacity: Double) = this()
  def this(capacity: Double, evictedCB: js.Function1[/* element */ T, _]) = this()
}
