package typingsSlinky.relayRuntime.relayNetworkTypesMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.File
  - typingsSlinky.std.Blob
*/
trait Uploadable extends js.Object

object Uploadable {
  @scala.inline
  implicit def apply(value: Blob): Uploadable = value.asInstanceOf[Uploadable]
  @scala.inline
  implicit def apply(value: File): Uploadable = value.asInstanceOf[Uploadable]
}

