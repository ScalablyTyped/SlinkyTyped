package typingsSlinky.bullArena.mod.BullArena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bullArena.mod.BullArena.PortHostConnectionOptions
  - typingsSlinky.bullArena.mod.BullArena.RedisUrlConnectionOptions
  - typingsSlinky.bullArena.mod.BullArena.RedisClientConnectionOptions
*/
trait ConnectionOptions extends js.Object

object ConnectionOptions {
  @scala.inline
  implicit def apply(value: PortHostConnectionOptions): ConnectionOptions = value.asInstanceOf[ConnectionOptions]
  @scala.inline
  implicit def apply(value: RedisClientConnectionOptions): ConnectionOptions = value.asInstanceOf[ConnectionOptions]
  @scala.inline
  implicit def apply(value: RedisUrlConnectionOptions): ConnectionOptions = value.asInstanceOf[ConnectionOptions]
}

