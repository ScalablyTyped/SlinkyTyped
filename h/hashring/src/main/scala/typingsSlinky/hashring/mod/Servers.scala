package typingsSlinky.hashring.mod

import typingsSlinky.hashring.anon.PartialServerConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.std.Record[java.lang.String, typingsSlinky.hashring.anon.PartialServerConfig]
*/
trait Servers extends js.Object

object Servers {
  @scala.inline
  implicit def apply(value: js.Array[String]): Servers = value.asInstanceOf[Servers]
  @scala.inline
  implicit def apply(value: Record[String, PartialServerConfig]): Servers = value.asInstanceOf[Servers]
  @scala.inline
  implicit def apply(value: String): Servers = value.asInstanceOf[Servers]
}

