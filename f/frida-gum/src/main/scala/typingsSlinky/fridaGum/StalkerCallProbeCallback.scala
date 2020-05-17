package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.StalkerScriptCallProbeCallback
  - typingsSlinky.fridaGum.StalkerNativeCallProbeCallback
*/
trait StalkerCallProbeCallback extends js.Object

object StalkerCallProbeCallback {
  @scala.inline
  implicit def apply(value: StalkerNativeCallProbeCallback): StalkerCallProbeCallback = value.asInstanceOf[StalkerCallProbeCallback]
  @scala.inline
  implicit def apply(value: StalkerScriptCallProbeCallback): StalkerCallProbeCallback = value.asInstanceOf[StalkerCallProbeCallback]
}

