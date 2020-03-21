package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.managed
  - typingsSlinky.chromeApps.chromeAppsStrings.unmanaged
*/
trait ManagedObject extends js.Object

object ManagedObject {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def managed: typingsSlinky.chromeApps.chromeAppsStrings.managed = this.cast("managed")
  @scala.inline
  def unmanaged: typingsSlinky.chromeApps.chromeAppsStrings.unmanaged = this.cast("unmanaged")
}

