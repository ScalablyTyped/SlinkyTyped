package typingsSlinky.realm.Realm.Sync

import typingsSlinky.realm.realmStrings.delete_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.realm.realmStrings.available
  - typingsSlinky.realm.realmStrings.change
  - typingsSlinky.realm.realmStrings.delete_
*/
trait RealmListenerEventName extends js.Object

object RealmListenerEventName {
  @scala.inline
  def available: typingsSlinky.realm.realmStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsSlinky.realm.realmStrings.change = this.cast("change")
  @scala.inline
  def delete: delete_ = this.cast("delete")
}

