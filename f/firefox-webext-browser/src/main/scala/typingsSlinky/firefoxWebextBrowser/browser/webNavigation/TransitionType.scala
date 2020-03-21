package typingsSlinky.firefoxWebextBrowser.browser.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* webNavigation types */
/**
  * Cause of the navigation. The same transition types as defined in the history API are used. These are the same
  * transition types as defined in the history API except with `"start_page"` in place of `"auto_toplevel"` (for
  * backwards compatibility).
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.link
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.typed
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_bookmark
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_subframe
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual_subframe
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.generated
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.start_page
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.form_submit
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reload
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword_generated
*/
trait TransitionType extends js.Object

object TransitionType {
  @scala.inline
  def auto_bookmark: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_bookmark = this.cast("auto_bookmark")
  @scala.inline
  def auto_subframe: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_subframe = this.cast("auto_subframe")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def form_submit: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.form_submit = this.cast("form_submit")
  @scala.inline
  def generated: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.generated = this.cast("generated")
  @scala.inline
  def keyword: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword = this.cast("keyword")
  @scala.inline
  def keyword_generated: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword_generated = this.cast("keyword_generated")
  @scala.inline
  def link: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.link = this.cast("link")
  @scala.inline
  def manual_subframe: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual_subframe = this.cast("manual_subframe")
  @scala.inline
  def reload: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reload = this.cast("reload")
  @scala.inline
  def start_page: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.start_page = this.cast("start_page")
  @scala.inline
  def typed: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.typed = this.cast("typed")
}

