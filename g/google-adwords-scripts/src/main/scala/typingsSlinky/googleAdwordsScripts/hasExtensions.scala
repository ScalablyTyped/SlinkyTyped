package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasExtensions extends js.Object {
  def addCallout(calloutExtension: Callout): AdWordsOperation[Callout] = js.native
  def addMessage(messageExtension: Message): AdWordsOperation[Message] = js.native
  def addMobileApp(mobileAppExtension: MobileApp): AdWordsOperation[MobileApp] = js.native
  def addPhoneNumber(phoneNumberExtension: PhoneNumber): AdWordsOperation[PhoneNumber] = js.native
  def addReview(reviewExtension: Review): AdWordsOperation[Review] = js.native
  def addSitelink(sitelinkExtension: Sitelink): AdWordsOperation[Sitelink] = js.native
  def addSnippet(snippetExtension: Snippet): AdWordsOperation[Snippet] = js.native
  def removeCallout(calloutExtension: Callout): Unit = js.native
  def removeMessage(messageExtension: Message): Unit = js.native
  def removeMobileApp(mobileAppExtension: MobileApp): Unit = js.native
  def removePhoneNumber(phoneNumberExtension: PhoneNumber): Unit = js.native
  def removeReview(reviewExtension: Review): Unit = js.native
  def removeSitelink(sitelinkExtension: Sitelink): Unit = js.native
  def removeSnippet(snippetExtension: Snippet): Unit = js.native
}

object hasExtensions {
  @scala.inline
  def apply(
    addCallout: Callout => AdWordsOperation[Callout],
    addMessage: Message => AdWordsOperation[Message],
    addMobileApp: MobileApp => AdWordsOperation[MobileApp],
    addPhoneNumber: PhoneNumber => AdWordsOperation[PhoneNumber],
    addReview: Review => AdWordsOperation[Review],
    addSitelink: Sitelink => AdWordsOperation[Sitelink],
    addSnippet: Snippet => AdWordsOperation[Snippet],
    removeCallout: Callout => Unit,
    removeMessage: Message => Unit,
    removeMobileApp: MobileApp => Unit,
    removePhoneNumber: PhoneNumber => Unit,
    removeReview: Review => Unit,
    removeSitelink: Sitelink => Unit,
    removeSnippet: Snippet => Unit
  ): hasExtensions = {
    val __obj = js.Dynamic.literal(addCallout = js.Any.fromFunction1(addCallout), addMessage = js.Any.fromFunction1(addMessage), addMobileApp = js.Any.fromFunction1(addMobileApp), addPhoneNumber = js.Any.fromFunction1(addPhoneNumber), addReview = js.Any.fromFunction1(addReview), addSitelink = js.Any.fromFunction1(addSitelink), addSnippet = js.Any.fromFunction1(addSnippet), removeCallout = js.Any.fromFunction1(removeCallout), removeMessage = js.Any.fromFunction1(removeMessage), removeMobileApp = js.Any.fromFunction1(removeMobileApp), removePhoneNumber = js.Any.fromFunction1(removePhoneNumber), removeReview = js.Any.fromFunction1(removeReview), removeSitelink = js.Any.fromFunction1(removeSitelink), removeSnippet = js.Any.fromFunction1(removeSnippet))
    __obj.asInstanceOf[hasExtensions]
  }
  @scala.inline
  implicit class hasExtensionsOps[Self <: hasExtensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCallout(value: Callout => AdWordsOperation[Callout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCallout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddMessage(value: Message => AdWordsOperation[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddMobileApp(value: MobileApp => AdWordsOperation[MobileApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMobileApp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddPhoneNumber(value: PhoneNumber => AdWordsOperation[PhoneNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPhoneNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddReview(value: Review => AdWordsOperation[Review]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addReview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddSitelink(value: Sitelink => AdWordsOperation[Sitelink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSitelink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddSnippet(value: Snippet => AdWordsOperation[Snippet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSnippet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveCallout(value: Callout => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCallout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveMessage(value: Message => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveMobileApp(value: MobileApp => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMobileApp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovePhoneNumber(value: PhoneNumber => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePhoneNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveReview(value: Review => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeReview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveSitelink(value: Sitelink => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSitelink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveSnippet(value: Snippet => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSnippet")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

