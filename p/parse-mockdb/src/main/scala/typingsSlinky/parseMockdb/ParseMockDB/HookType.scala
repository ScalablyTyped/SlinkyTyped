package typingsSlinky.parseMockdb.ParseMockDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.parseMockdb.parseMockdbStrings.beforeSave
  - typingsSlinky.parseMockdb.parseMockdbStrings.beforeDelete
*/
trait HookType extends js.Object

object HookType {
  @scala.inline
  def beforeDelete: typingsSlinky.parseMockdb.parseMockdbStrings.beforeDelete = this.cast("beforeDelete")
  @scala.inline
  def beforeSave: typingsSlinky.parseMockdb.parseMockdbStrings.beforeSave = this.cast("beforeSave")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

