package typingsSlinky.chromeApps.chrome.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.local
  - typingsSlinky.chromeApps.chromeAppsStrings.sync
  - typingsSlinky.chromeApps.chromeAppsStrings.managed
*/
trait StorageAreas extends js.Object

object StorageAreas {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def local: typingsSlinky.chromeApps.chromeAppsStrings.local = this.cast("local")
  @scala.inline
  def managed: typingsSlinky.chromeApps.chromeAppsStrings.managed = this.cast("managed")
  @scala.inline
  def sync: typingsSlinky.chromeApps.chromeAppsStrings.sync = this.cast("sync")
}

