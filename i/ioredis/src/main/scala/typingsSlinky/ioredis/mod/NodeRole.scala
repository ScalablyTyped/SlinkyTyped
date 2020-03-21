package typingsSlinky.ioredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ioredis.ioredisStrings.master
  - typingsSlinky.ioredis.ioredisStrings.slave
  - typingsSlinky.ioredis.ioredisStrings.all
*/
trait NodeRole extends js.Object

object NodeRole {
  @scala.inline
  def all: typingsSlinky.ioredis.ioredisStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def master: typingsSlinky.ioredis.ioredisStrings.master = this.cast("master")
  @scala.inline
  def slave: typingsSlinky.ioredis.ioredisStrings.slave = this.cast("slave")
}

