package typingsSlinky.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetails extends js.Object {
  /** Optional. Whether to check the content settings for an incognito session. (default false)  */
  var incognito: js.UndefOr[Boolean] = js.native
  /** The primary URL for which the content setting should be retrieved. Note that the meaning of a primary URL depends on the content type. */
  var primaryUrl: String = js.native
  /** Optional. A more specific identifier of the type of content for which the settings should be retrieved.  */
  var resourceIdentifier: js.UndefOr[typingsSlinky.chrome.chrome.contentSettings.ResourceIdentifier] = js.native
  /** Optional. The secondary URL for which the content setting should be retrieved. Defaults to the primary URL. Note that the meaning of a secondary URL depends on the content type, and not all content types use secondary URLs.  */
  var secondaryUrl: js.UndefOr[String] = js.native
}

object GetDetails {
  @scala.inline
  def apply(primaryUrl: String): GetDetails = {
    val __obj = js.Dynamic.literal(primaryUrl = primaryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetails]
  }
  @scala.inline
  implicit class GetDetailsOps[Self <: GetDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimaryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncognito(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncognito: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIdentifier(value: typingsSlinky.chrome.chrome.contentSettings.ResourceIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryUrl")(js.undefined)
        ret
    }
  }
  
}

