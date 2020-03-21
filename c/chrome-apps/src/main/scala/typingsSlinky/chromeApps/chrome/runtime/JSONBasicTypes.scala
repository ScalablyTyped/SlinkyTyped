package typingsSlinky.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// For chrome managed storage
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.integer
  - typingsSlinky.chromeApps.chromeAppsStrings.string
  - typingsSlinky.chromeApps.chromeAppsStrings.number
*/
trait JSONBasicTypes extends js.Object

object JSONBasicTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typingsSlinky.chromeApps.chromeAppsStrings.integer = this.cast("integer")
  @scala.inline
  def number: typingsSlinky.chromeApps.chromeAppsStrings.number = this.cast("number")
  @scala.inline
  def string: typingsSlinky.chromeApps.chromeAppsStrings.string = this.cast("string")
}

