package typingsSlinky.firebaseAdmin.admin.auth

import typingsSlinky.firebaseAdmin.AnonBundleId
import typingsSlinky.firebaseAdmin.AnonInstallApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the interface that defines the required continue/state URL with
  * optional Android and iOS bundle identifiers.
  */
@js.native
trait ActionCodeSettings extends js.Object {
  /**
    * Defines the Android package name. This will try to open the link in an
    * android app if it is installed. If `installApp` is passed, it specifies
    * whether to install the Android app if the device supports it and the app is
    * not already installed. If this field is provided without a `packageName`, an
    * error is thrown explaining that the `packageName` must be provided in
    * conjunction with this field. If `minimumVersion` is specified, and an older
    * version of the app is installed, the user is taken to the Play Store to
    * upgrade the app.
    */
  var android: js.UndefOr[AnonInstallApp] = js.native
  /**
    * Defines the dynamic link domain to use for the current link if it is to be
    * opened using Firebase Dynamic Links, as multiple dynamic link domains can be
    * configured per project. This field provides the ability to explicitly choose
    * configured per project. This fields provides the ability explicitly choose
    * one. If none is provided, the oldest domain is used by default.
    */
  var dynamicLinkDomain: js.UndefOr[String] = js.native
  /**
    * Whether to open the link via a mobile app or a browser.
    * The default is false. When set to true, the action code link is sent
    * as a Universal Link or Android App Link and is opened by the app if
    * installed. In the false case, the code is sent to the web widget first
    * and then redirects to the app if installed.
    */
  var handleCodeInApp: js.UndefOr[Boolean] = js.native
  /**
    * Defines the iOS bundle ID. This will try to open the link in an iOS app if it
    * is installed.
    */
  var iOS: js.UndefOr[AnonBundleId] = js.native
  /**
    * Defines the link continue/state URL, which has different meanings in
    * different contexts:
    * <ul>
    * <li>When the link is handled in the web action widgets, this is the deep
    *     link in the `continueUrl` query parameter.</li>
    * <li>When the link is handled in the app directly, this is the `continueUrl`
    *     query parameter in the deep link of the Dynamic Link.</li>
    * </ul>
    */
  var url: String = js.native
}

object ActionCodeSettings {
  @scala.inline
  def apply(url: String): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
  @scala.inline
  implicit class ActionCodeSettingsOps[Self <: ActionCodeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroid(value: AnonInstallApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(js.undefined)
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
    def withHandleCodeInApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleCodeInApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleCodeInApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleCodeInApp")(js.undefined)
        ret
    }
    @scala.inline
    def withIOS(value: AnonBundleId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOS")(js.undefined)
        ret
    }
  }
  
}

