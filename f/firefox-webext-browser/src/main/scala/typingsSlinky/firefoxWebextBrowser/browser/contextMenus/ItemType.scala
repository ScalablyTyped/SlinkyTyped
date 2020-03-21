package typingsSlinky.firefoxWebextBrowser.browser.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of menu item. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator
*/
trait ItemType extends js.Object

object ItemType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checkbox: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def normal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def radio: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio = this.cast("radio")
  @scala.inline
  def separator: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator = this.cast("separator")
}

