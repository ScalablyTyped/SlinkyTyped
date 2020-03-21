package typingsSlinky.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebase.firebaseStrings.desc
  - typingsSlinky.firebase.firebaseStrings.asc
*/
trait OrderByDirection extends js.Object

object OrderByDirection {
  @scala.inline
  def asc: typingsSlinky.firebase.firebaseStrings.asc = this.cast("asc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: typingsSlinky.firebase.firebaseStrings.desc = this.cast("desc")
}

