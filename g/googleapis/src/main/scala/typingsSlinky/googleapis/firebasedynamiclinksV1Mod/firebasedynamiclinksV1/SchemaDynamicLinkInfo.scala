package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a Dynamic Link.
  */
@js.native
trait SchemaDynamicLinkInfo extends js.Object {
  /**
    * Parameters used for tracking. See all tracking parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var analyticsInfo: js.UndefOr[SchemaAnalyticsInfo] = js.native
  /**
    * Android related information. See Android related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var androidInfo: js.UndefOr[SchemaAndroidInfo] = js.native
  /**
    * Desktop related information. See desktop related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var desktopInfo: js.UndefOr[SchemaDesktopInfo] = js.native
  /**
    * E.g. https://maps.app.goo.gl, https://maps.page.link, https://g.co/maps
    * More examples can be found in description of getNormalizedUriPrefix in
    * j/c/g/firebase/dynamiclinks/uri/DdlDomain.java  Will fallback to
    * dynamic_link_domain is this field is missing
    */
  var domainUriPrefix: js.UndefOr[String] = js.native
  /**
    * Dynamic Links domain that the project owns, e.g. abcd.app.goo.gl [Learn
    * more](https://firebase.google.com/docs/dynamic-links/android/receive) on
    * how to set up Dynamic Link domain associated with your Firebase project.
    * Required if missing domain_uri_prefix.
    */
  var dynamicLinkDomain: js.UndefOr[String] = js.native
  /**
    * iOS related information. See iOS related parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    */
  var iosInfo: js.UndefOr[SchemaIosInfo] = js.native
  /**
    * The link your app will open, You can specify any URL your app can handle.
    * This link must be a well-formatted URL, be properly URL-encoded, and use
    * the HTTP or HTTPS scheme. See &#39;link&#39; parameters in the
    * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
    * Required.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * Information of navigation behavior of a Firebase Dynamic Links.
    */
  var navigationInfo: js.UndefOr[SchemaNavigationInfo] = js.native
  /**
    * Parameters for social meta tag params. Used to set meta tag data for link
    * previews on social sites.
    */
  var socialMetaTagInfo: js.UndefOr[SchemaSocialMetaTagInfo] = js.native
}

object SchemaDynamicLinkInfo {
  @scala.inline
  def apply(): SchemaDynamicLinkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicLinkInfo]
  }
  @scala.inline
  implicit class SchemaDynamicLinkInfoOps[Self <: SchemaDynamicLinkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyticsInfo(value: SchemaAnalyticsInfo): Self = {
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
    def withAndroidInfo(value: SchemaAndroidInfo): Self = {
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
    def withDesktopInfo(value: SchemaDesktopInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainUriPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainUriPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainUriPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainUriPrefix")(js.undefined)
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
    def withIosInfo(value: SchemaIosInfo): Self = {
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
    def withNavigationInfo(value: SchemaNavigationInfo): Self = {
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
    def withSocialMetaTagInfo(value: SchemaSocialMetaTagInfo): Self = {
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

