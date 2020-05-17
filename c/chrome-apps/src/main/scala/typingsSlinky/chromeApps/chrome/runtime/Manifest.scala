package typingsSlinky.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chrome.runtime.ValidKioskManifest
  - typingsSlinky.chromeApps.chrome.runtime.ValidNonKioskManifest
  - typingsSlinky.chromeApps.chrome.runtime.InvalidManifest
*/
trait Manifest extends js.Object

object Manifest {
  @scala.inline
  implicit def apply(value: InvalidManifest): Manifest = value.asInstanceOf[Manifest]
  @scala.inline
  implicit def apply(value: ValidKioskManifest): Manifest = value.asInstanceOf[Manifest]
  @scala.inline
  implicit def apply(value: ValidNonKioskManifest): Manifest = value.asInstanceOf[Manifest]
}

