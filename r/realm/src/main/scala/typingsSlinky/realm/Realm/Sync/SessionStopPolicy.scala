package typingsSlinky.realm.Realm.Sync

import typingsSlinky.realm.realmStrings.`after-upload`
import typingsSlinky.realm.realmStrings.immediately
import typingsSlinky.realm.realmStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.realm.realmStrings.`after-upload`
  - typings.realm.realmStrings.immediately
  - typings.realm.realmStrings.never
*/
trait SessionStopPolicy extends js.Object

object SessionStopPolicy {
  @scala.inline
  def AfterUpload: `after-upload` = this.cast("after-upload")
  @scala.inline
  def Immediately: immediately = this.cast("immediately")
  @scala.inline
  def Never: never = this.cast("never")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

