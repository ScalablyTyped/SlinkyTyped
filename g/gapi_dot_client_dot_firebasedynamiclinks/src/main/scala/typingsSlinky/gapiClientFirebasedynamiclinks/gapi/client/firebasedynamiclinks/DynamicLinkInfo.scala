package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicLinkInfo extends js.Object {
  /**
    * Parameters used for tracking. See all tracking parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var analyticsInfo: js.UndefOr[AnalyticsInfo] = js.native
  /**
    * Android related information. See Android related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var androidInfo: js.UndefOr[AndroidInfo] = js.native
  /**
    * Dynamic Links domain that the project owns, e.g. abcd.app.goo.gl
    * [Learn more](https://firebase.google.com/docs/dynamic-links/android/receive)
    * on how to set up Dynamic Link domain associated with your Firebase project.
    *
    * Required.
    */
  var dynamicLinkDomain: js.UndefOr[String] = js.native
  /**
    * iOS related information. See iOS related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var iosInfo: js.UndefOr[IosInfo] = js.native
  /**
    * The link your app will open, You can specify any URL your app can handle.
    * This link must be a well-formatted URL, be properly URL-encoded, and use
    * the HTTP or HTTPS scheme. See 'link' parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    *
    * Required.
    */
  var link: js.UndefOr[String] = js.native
  /** Information of navigation behavior of a Firebase Dynamic Links. */
  var navigationInfo: js.UndefOr[NavigationInfo] = js.native
  /**
    * Parameters for social meta tag params.
    * Used to set meta tag data for link previews on social sites.
    */
  var socialMetaTagInfo: js.UndefOr[SocialMetaTagInfo] = js.native
}

object DynamicLinkInfo {
  @scala.inline
  def apply(): DynamicLinkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicLinkInfo]
  }
  @scala.inline
  implicit class DynamicLinkInfoOps[Self <: DynamicLinkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyticsInfo(value: AnalyticsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyticsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidInfo(value: AndroidInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicLinkDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicLinkDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicLinkDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicLinkDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withIosInfo(value: IosInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationInfo(value: NavigationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSocialMetaTagInfo(value: SocialMetaTagInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialMetaTagInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocialMetaTagInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialMetaTagInfo")(js.undefined)
        ret
    }
  }
  
}

