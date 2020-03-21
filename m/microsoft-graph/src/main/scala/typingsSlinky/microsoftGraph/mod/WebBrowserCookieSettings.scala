package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.browserDefault
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.blockAlways
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.allowCurrentWebSite
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.allowFromWebsitesVisited
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.allowAlways
*/
trait WebBrowserCookieSettings extends js.Object

object WebBrowserCookieSettings {
  @scala.inline
  def allowAlways: typingsSlinky.microsoftGraph.microsoftGraphStrings.allowAlways = this.cast("allowAlways")
  @scala.inline
  def allowCurrentWebSite: typingsSlinky.microsoftGraph.microsoftGraphStrings.allowCurrentWebSite = this.cast("allowCurrentWebSite")
  @scala.inline
  def allowFromWebsitesVisited: typingsSlinky.microsoftGraph.microsoftGraphStrings.allowFromWebsitesVisited = this.cast("allowFromWebsitesVisited")
  @scala.inline
  def blockAlways: typingsSlinky.microsoftGraph.microsoftGraphStrings.blockAlways = this.cast("blockAlways")
  @scala.inline
  def browserDefault: typingsSlinky.microsoftGraph.microsoftGraphStrings.browserDefault = this.cast("browserDefault")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

