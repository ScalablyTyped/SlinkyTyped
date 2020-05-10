package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppDetails extends js.Object {
  /** The user-visible support email for this app. */
  var contactEmail: js.UndefOr[String] = js.native
  /** The user-visible support telephone number for this app. */
  var contactPhone: js.UndefOr[String] = js.native
  /** The user-visible website for this app. */
  var contactWebsite: js.UndefOr[String] = js.native
  /** Default language code, in BCP 47 format (eg "en-US"). */
  var defaultLanguage: js.UndefOr[String] = js.native
}

object AppDetails {
  @scala.inline
  def apply(): AppDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppDetails]
  }
  @scala.inline
  implicit class AppDetailsOps[Self <: AppDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withContactPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPhone")(js.undefined)
        ret
    }
    @scala.inline
    def withContactWebsite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactWebsite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactWebsite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactWebsite")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(js.undefined)
        ret
    }
  }
  
}

