package typingsSlinky.realm.Realm.Sync

import typingsSlinky.realm.realmStrings.discard
import typingsSlinky.realm.realmStrings.manual
import typingsSlinky.realm.realmStrings.recover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.realm.realmStrings.discard
  - typingsSlinky.realm.realmStrings.manual
  - typingsSlinky.realm.realmStrings.recover
*/
trait ClientResyncMode extends js.Object

object ClientResyncMode {
  @scala.inline
  def Discard: discard = this.cast("discard")
  @scala.inline
  def Manual: manual = this.cast("manual")
  @scala.inline
  def Recover: recover = this.cast("recover")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

