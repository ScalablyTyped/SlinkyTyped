package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.realm.realmStrings.reportIndefinitely
  - typings.realm.realmStrings.forCurrentlyOutstandingWork
*/
trait ProgressMode extends js.Object

object ProgressMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forCurrentlyOutstandingWork: typingsSlinky.realm.realmStrings.forCurrentlyOutstandingWork = this.cast("forCurrentlyOutstandingWork")
  @scala.inline
  def reportIndefinitely: typingsSlinky.realm.realmStrings.reportIndefinitely = this.cast("reportIndefinitely")
}

