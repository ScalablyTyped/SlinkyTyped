package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Ad extensions
@js.native
trait AccountExtensions extends js.Object {
  def callouts(): AdWordsSelector[Callout] = js.native
  def message(): AdWordsSelector[Message] = js.native
  def mobileApps(): AdWordsSelector[MobileApp] = js.native
  def reviews(): AdWordsSelector[Review] = js.native
  def sitelinks(): AdWordsSelector[Sitelink] = js.native
  def snippets(): AdWordsSelector[Snippet] = js.native
}

object AccountExtensions {
  @scala.inline
  def apply(
    callouts: () => AdWordsSelector[Callout],
    message: () => AdWordsSelector[Message],
    mobileApps: () => AdWordsSelector[MobileApp],
    reviews: () => AdWordsSelector[Review],
    sitelinks: () => AdWordsSelector[Sitelink],
    snippets: () => AdWordsSelector[Snippet]
  ): AccountExtensions = {
    val __obj = js.Dynamic.literal(callouts = js.Any.fromFunction0(callouts), message = js.Any.fromFunction0(message), mobileApps = js.Any.fromFunction0(mobileApps), reviews = js.Any.fromFunction0(reviews), sitelinks = js.Any.fromFunction0(sitelinks), snippets = js.Any.fromFunction0(snippets))
    __obj.asInstanceOf[AccountExtensions]
  }
  @scala.inline
  implicit class AccountExtensionsOps[Self <: AccountExtensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallouts(value: () => AdWordsSelector[Callout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callouts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMessage(value: () => AdWordsSelector[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMobileApps(value: () => AdWordsSelector[MobileApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileApps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReviews(value: () => AdWordsSelector[Review]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviews")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSitelinks(value: () => AdWordsSelector[Sitelink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sitelinks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSnippets(value: () => AdWordsSelector[Snippet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippets")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

