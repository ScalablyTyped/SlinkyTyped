package typingsSlinky.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccountEmailDomain extends js.Object {
  var accountEmailDomain: js.UndefOr[String] = js.native
  var enableFacebookSharing: js.UndefOr[Boolean] = js.native
  var enableGiftSubscriptions: js.UndefOr[Boolean] = js.native
  var enableGoogle: js.UndefOr[Boolean] = js.native
  var enableLinkedInSharing: js.UndefOr[Boolean] = js.native
  var enablePublicNotebooks: js.UndefOr[Boolean] = js.native
  var enableSharedNotebooks: js.UndefOr[Boolean] = js.native
  var enableSingleNoteSharing: js.UndefOr[Boolean] = js.native
  var enableSponsoredAccounts: js.UndefOr[Boolean] = js.native
  var enableSupportTickets: js.UndefOr[Boolean] = js.native
  var enableTwitterSharing: js.UndefOr[Boolean] = js.native
  var marketingUrl: js.UndefOr[String] = js.native
  var serviceHost: js.UndefOr[String] = js.native
  var supportUrl: js.UndefOr[String] = js.native
}

object AnonAccountEmailDomain {
  @scala.inline
  def apply(): AnonAccountEmailDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAccountEmailDomain]
  }
  @scala.inline
  implicit class AnonAccountEmailDomainOps[Self <: AnonAccountEmailDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountEmailDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountEmailDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountEmailDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountEmailDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFacebookSharing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFacebookSharing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFacebookSharing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFacebookSharing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGiftSubscriptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGiftSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGiftSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGiftSubscriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGoogle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGoogle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGoogle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGoogle")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLinkedInSharing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinkedInSharing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLinkedInSharing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinkedInSharing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePublicNotebooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePublicNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePublicNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePublicNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSharedNotebooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSharedNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSharedNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSharedNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSingleNoteSharing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSingleNoteSharing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSingleNoteSharing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSingleNoteSharing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSponsoredAccounts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSponsoredAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSponsoredAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSponsoredAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSupportTickets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSupportTickets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSupportTickets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSupportTickets")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTwitterSharing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTwitterSharing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTwitterSharing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTwitterSharing")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceHost")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportUrl")(js.undefined)
        ret
    }
  }
  
}

