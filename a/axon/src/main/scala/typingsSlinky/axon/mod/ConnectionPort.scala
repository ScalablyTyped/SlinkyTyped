package typingsSlinky.axon.mod

import typingsSlinky.axon.anon.Hostname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.axon.anon.Hostname
*/
trait ConnectionPort extends js.Object

object ConnectionPort {
  @scala.inline
  implicit def apply(value: Double): ConnectionPort = value.asInstanceOf[ConnectionPort]
  @scala.inline
  implicit def apply(value: Hostname): ConnectionPort = value.asInstanceOf[ConnectionPort]
  @scala.inline
  implicit def apply(value: String): ConnectionPort = value.asInstanceOf[ConnectionPort]
}

