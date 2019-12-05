package typingsSlinky.parseDashMockdb.ParseMockDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.parseDashMockdb.parseDashMockdbStrings.beforeSave
  - typings.parseDashMockdb.parseDashMockdbStrings.beforeDelete
*/
trait HookType extends js.Object

object HookType {
  @scala.inline
  def beforeDelete: typingsSlinky.parseDashMockdb.parseDashMockdbStrings.beforeDelete = this.cast("beforeDelete")
  @scala.inline
  def beforeSave: typingsSlinky.parseDashMockdb.parseDashMockdbStrings.beforeSave = this.cast("beforeSave")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

