package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepLink extends js.Object {
  var appUrl: js.UndefOr[String] = js.native
  var fallbackUrl: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var mobileApp: js.UndefOr[MobileApp] = js.native
  var remarketingListIds: js.UndefOr[js.Array[String]] = js.native
}

object DeepLink {
  @scala.inline
  def apply(): DeepLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepLink]
  }
  @scala.inline
  implicit class DeepLinkOps[Self <: DeepLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackUrl")(js.undefined)
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
    def withMobileApp(value: MobileApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileApp")(js.undefined)
        ret
    }
    @scala.inline
    def withRemarketingListIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarketingListIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemarketingListIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarketingListIds")(js.undefined)
        ret
    }
  }
  
}

