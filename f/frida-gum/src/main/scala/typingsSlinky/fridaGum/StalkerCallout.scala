package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.StalkerScriptCallout
  - typingsSlinky.fridaGum.StalkerNativeCallout
*/
trait StalkerCallout extends js.Object

object StalkerCallout {
  @scala.inline
  implicit def apply(value: StalkerNativeCallout): StalkerCallout = value.asInstanceOf[StalkerCallout]
  @scala.inline
  implicit def apply(value: StalkerScriptCallout): StalkerCallout = value.asInstanceOf[StalkerCallout]
}

