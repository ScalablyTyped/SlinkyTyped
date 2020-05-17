package typingsSlinky.ioredis.mod

import typingsSlinky.ioredis.anon.Ip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * slaves * / js.Array[typingsSlinky.ioredis.mod.AddressFromResponse], 
typingsSlinky.ioredis.mod.AddressFromResponse | scala.Null]
  - js.Array[typingsSlinky.ioredis.anon.Ip]
  - typingsSlinky.ioredis.anon.Ip
*/
trait PreferredSlaves extends js.Object

object PreferredSlaves {
  @scala.inline
  implicit def apply(value: js.Array[Ip]): PreferredSlaves = value.asInstanceOf[PreferredSlaves]
  @scala.inline
  implicit def apply(value: js.Function1[/* slaves */ js.Array[AddressFromResponse], AddressFromResponse | Null]): PreferredSlaves = value.asInstanceOf[PreferredSlaves]
  @scala.inline
  implicit def apply(value: Ip): PreferredSlaves = value.asInstanceOf[PreferredSlaves]
}

