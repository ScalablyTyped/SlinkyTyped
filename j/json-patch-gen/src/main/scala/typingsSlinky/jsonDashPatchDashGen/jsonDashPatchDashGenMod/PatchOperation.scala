package typingsSlinky.jsonDashPatchDashGen.jsonDashPatchDashGenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.replace
  - typings.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.add
  - typings.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.remove
*/
trait PatchOperation extends js.Object

object PatchOperation {
  @scala.inline
  def add: typingsSlinky.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def remove: typingsSlinky.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.remove = this.cast("remove")
  @scala.inline
  def replace: typingsSlinky.jsonDashPatchDashGen.jsonDashPatchDashGenStrings.replace = this.cast("replace")
}

