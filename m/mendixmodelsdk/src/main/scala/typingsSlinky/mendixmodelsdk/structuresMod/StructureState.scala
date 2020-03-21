package typingsSlinky.mendixmodelsdk.structuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.`new`
  - typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.attached
  - typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.detached
  - typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.deleted
*/
trait StructureState extends js.Object

object StructureState {
  @scala.inline
  def attached: typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.attached = this.cast("attached")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deleted: typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.deleted = this.cast("deleted")
  @scala.inline
  def detached: typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.detached = this.cast("detached")
  @scala.inline
  def `new`: typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.`new` = this.cast("new")
}

