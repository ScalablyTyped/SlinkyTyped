package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClientAdsensehost.anon.BackupOption
import typingsSlinky.gapiClientAdsensehost.anon.MarkupLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdUnit extends js.Object {
  /** Identity code of this ad unit, not necessarily unique across ad clients. */
  var code: js.UndefOr[String] = js.native
  /** Settings specific to content ads (AFC) and highend mobile content ads (AFMC - deprecated). */
  var contentAdsSettings: js.UndefOr[BackupOption] = js.native
  /** Custom style information specific to this ad unit. */
  var customStyle: js.UndefOr[AdStyle] = js.native
  /** Unique identifier of this ad unit. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[String] = js.native
  /** Kind of resource this is, in this case adsensehost#adUnit. */
  var kind: js.UndefOr[String] = js.native
  /** Settings specific to WAP mobile content ads (AFMC - deprecated). */
  var mobileContentAdsSettings: js.UndefOr[MarkupLanguage] = js.native
  /** Name of this ad unit. */
  var name: js.UndefOr[String] = js.native
  /**
    * Status of this ad unit. Possible values are:
    * NEW: Indicates that the ad unit was created within the last seven days and does not yet have any activity associated with it.
    *
    * ACTIVE: Indicates that there has been activity on this ad unit in the last seven days.
    *
    * INACTIVE: Indicates that there has been no activity on this ad unit in the last seven days.
    */
  var status: js.UndefOr[String] = js.native
}

object AdUnit {
  @scala.inline
  def apply(): AdUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdUnit]
  }
  @scala.inline
  implicit class AdUnitOps[Self <: AdUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withContentAdsSettings(value: BackupOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAdsSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentAdsSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAdsSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStyle(value: AdStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileContentAdsSettings(value: MarkupLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileContentAdsSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileContentAdsSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileContentAdsSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

