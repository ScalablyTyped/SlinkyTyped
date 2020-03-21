package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.realm.realmStrings.download
  - typingsSlinky.realm.realmStrings.upload
*/
trait ProgressDirection extends js.Object

object ProgressDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def download: typingsSlinky.realm.realmStrings.download = this.cast("download")
  @scala.inline
  def upload: typingsSlinky.realm.realmStrings.upload = this.cast("upload")
}

