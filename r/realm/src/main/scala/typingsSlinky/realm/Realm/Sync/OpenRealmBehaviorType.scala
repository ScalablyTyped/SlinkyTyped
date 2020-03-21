package typingsSlinky.realm.Realm.Sync

import typingsSlinky.realm.realmStrings.downloadBeforeOpen
import typingsSlinky.realm.realmStrings.openImmediately
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.realm.realmStrings.downloadBeforeOpen
  - typingsSlinky.realm.realmStrings.openImmediately
*/
trait OpenRealmBehaviorType extends js.Object

object OpenRealmBehaviorType {
  @scala.inline
  def DownloadBeforeOpen: downloadBeforeOpen = this.cast("downloadBeforeOpen")
  @scala.inline
  def OpenImmediately: openImmediately = this.cast("openImmediately")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

