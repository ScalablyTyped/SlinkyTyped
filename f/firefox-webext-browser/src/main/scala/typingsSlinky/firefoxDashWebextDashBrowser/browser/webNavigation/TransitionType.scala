package typingsSlinky.firefoxDashWebextDashBrowser.browser.webNavigation

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
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.link
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.typed
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.auto_bookmark
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.auto_subframe
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.manual_subframe
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.generated
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.start_page
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.form_submit
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.reload
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.keyword
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.keyword_generated
*/
trait TransitionType extends js.Object

object TransitionType {
  @scala.inline
  def auto_bookmark: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.auto_bookmark = this.cast("auto_bookmark")
  @scala.inline
  def auto_subframe: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.auto_subframe = this.cast("auto_subframe")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def form_submit: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.form_submit = this.cast("form_submit")
  @scala.inline
  def generated: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.generated = this.cast("generated")
  @scala.inline
  def keyword: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.keyword = this.cast("keyword")
  @scala.inline
  def keyword_generated: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.keyword_generated = this.cast("keyword_generated")
  @scala.inline
  def link: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.link = this.cast("link")
  @scala.inline
  def manual_subframe: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.manual_subframe = this.cast("manual_subframe")
  @scala.inline
  def reload: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.reload = this.cast("reload")
  @scala.inline
  def start_page: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.start_page = this.cast("start_page")
  @scala.inline
  def typed: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.typed = this.cast("typed")
}

