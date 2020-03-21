package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.fridaGumStrings.readonly
  - typingsSlinky.fridaGum.fridaGumStrings.readwrite
  - typingsSlinky.fridaGum.fridaGumStrings.create
*/
trait SqliteOpenFlag extends js.Object

object SqliteOpenFlag {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typingsSlinky.fridaGum.fridaGumStrings.create = this.cast("create")
  @scala.inline
  def readonly: typingsSlinky.fridaGum.fridaGumStrings.readonly = this.cast("readonly")
  @scala.inline
  def readwrite: typingsSlinky.fridaGum.fridaGumStrings.readwrite = this.cast("readwrite")
}

