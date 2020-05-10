package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsAdExtensions extends AdGroupExtensions {
  def newCalloutBuilder(): CalloutBuilder[Callout] = js.native
  def newMessageBuilder(): MessageBuilder[Message] = js.native
  def newMobileAppBuilder(): MobileAppBuilder[MobileApp] = js.native
  def newPhoneNumberBuilder(): PhoneNumberBuilder[PhoneNumber] = js.native
  def newReviewBuilder(): ReviewBuilder[Review] = js.native
  def newSitelinkBuilder(): SitelinkBuilder[Sitelink] = js.native
  def newSnippetBuilder(): SnippetBuilder[Snippet] = js.native
}

object AdWordsAdExtensions {
  @scala.inline
  def apply(
    callouts: () => AdWordsSelector[Callout],
    message: () => AdWordsSelector[Message],
    mobileApps: () => AdWordsSelector[MobileApp],
    newCalloutBuilder: () => CalloutBuilder[Callout],
    newMessageBuilder: () => MessageBuilder[Message],
    newMobileAppBuilder: () => MobileAppBuilder[MobileApp],
    newPhoneNumberBuilder: () => PhoneNumberBuilder[PhoneNumber],
    newReviewBuilder: () => ReviewBuilder[Review],
    newSitelinkBuilder: () => SitelinkBuilder[Sitelink],
    newSnippetBuilder: () => SnippetBuilder[Snippet],
    phoneNumbers: () => AdWordsSelector[PhoneNumber],
    reviews: () => AdWordsSelector[Review],
    sitelinks: () => AdWordsSelector[Sitelink],
    snippets: () => AdWordsSelector[Snippet]
  ): AdWordsAdExtensions = {
    val __obj = js.Dynamic.literal(callouts = js.Any.fromFunction0(callouts), message = js.Any.fromFunction0(message), mobileApps = js.Any.fromFunction0(mobileApps), newCalloutBuilder = js.Any.fromFunction0(newCalloutBuilder), newMessageBuilder = js.Any.fromFunction0(newMessageBuilder), newMobileAppBuilder = js.Any.fromFunction0(newMobileAppBuilder), newPhoneNumberBuilder = js.Any.fromFunction0(newPhoneNumberBuilder), newReviewBuilder = js.Any.fromFunction0(newReviewBuilder), newSitelinkBuilder = js.Any.fromFunction0(newSitelinkBuilder), newSnippetBuilder = js.Any.fromFunction0(newSnippetBuilder), phoneNumbers = js.Any.fromFunction0(phoneNumbers), reviews = js.Any.fromFunction0(reviews), sitelinks = js.Any.fromFunction0(sitelinks), snippets = js.Any.fromFunction0(snippets))
    __obj.asInstanceOf[AdWordsAdExtensions]
  }
  @scala.inline
  implicit class AdWordsAdExtensionsOps[Self <: AdWordsAdExtensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewCalloutBuilder(value: () => CalloutBuilder[Callout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCalloutBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMessageBuilder(value: () => MessageBuilder[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMessageBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMobileAppBuilder(value: () => MobileAppBuilder[MobileApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMobileAppBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPhoneNumberBuilder(value: () => PhoneNumberBuilder[PhoneNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPhoneNumberBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewReviewBuilder(value: () => ReviewBuilder[Review]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newReviewBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSitelinkBuilder(value: () => SitelinkBuilder[Sitelink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSitelinkBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSnippetBuilder(value: () => SnippetBuilder[Snippet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSnippetBuilder")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

