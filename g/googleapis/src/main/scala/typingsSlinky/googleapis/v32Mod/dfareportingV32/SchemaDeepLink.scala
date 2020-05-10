package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a landing page deep link.
  */
@js.native
trait SchemaDeepLink extends js.Object {
  /**
    * The URL of the mobile app being linked to.
    */
  var appUrl: js.UndefOr[String] = js.native
  /**
    * The fallback URL. This URL will be served to users who do not have the
    * mobile app installed.
    */
  var fallbackUrl: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#deepLink&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The mobile app targeted by this deep link.
    */
  var mobileApp: js.UndefOr[SchemaMobileApp] = js.native
  /**
    * Ads served to users on these remarketing lists will use this deep link.
    * Applicable when mobileApp.directory is APPLE_APP_STORE.
    */
  var remarketingListIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaDeepLink {
  @scala.inline
  def apply(): SchemaDeepLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeepLink]
  }
  @scala.inline
  implicit class SchemaDeepLinkOps[Self <: SchemaDeepLink] (val x: Self) extends AnyVal {
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
    def withMobileApp(value: SchemaMobileApp): Self = {
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

