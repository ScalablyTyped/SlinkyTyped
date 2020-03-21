package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.realm.realmStrings.none
  - typingsSlinky.realm.realmStrings.read
  - typingsSlinky.realm.realmStrings.write
  - typingsSlinky.realm.realmStrings.admin
*/
trait AccessLevel extends js.Object

object AccessLevel {
  @scala.inline
  def admin: typingsSlinky.realm.realmStrings.admin = this.cast("admin")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.realm.realmStrings.none = this.cast("none")
  @scala.inline
  def read: typingsSlinky.realm.realmStrings.read = this.cast("read")
  @scala.inline
  def write: typingsSlinky.realm.realmStrings.write = this.cast("write")
}

