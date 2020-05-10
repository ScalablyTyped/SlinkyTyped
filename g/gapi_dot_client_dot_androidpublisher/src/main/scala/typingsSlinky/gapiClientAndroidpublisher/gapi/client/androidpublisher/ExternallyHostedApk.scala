package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternallyHostedApk extends js.Object {
  /** The application label. */
  var applicationLabel: js.UndefOr[String] = js.native
  /** A certificate (or array of certificates if a certificate-chain is used) used to signed this APK, represented as a base64 encoded byte array. */
  var certificateBase64s: js.UndefOr[js.Array[String]] = js.native
  /** The URL at which the APK is hosted. This must be an https URL. */
  var externallyHostedUrl: js.UndefOr[String] = js.native
  /** The SHA1 checksum of this APK, represented as a base64 encoded byte array. */
  var fileSha1Base64: js.UndefOr[String] = js.native
  /** The SHA256 checksum of this APK, represented as a base64 encoded byte array. */
  var fileSha256Base64: js.UndefOr[String] = js.native
  /** The file size in bytes of this APK. */
  var fileSize: js.UndefOr[String] = js.native
  /** The icon image from the APK, as a base64 encoded byte array. */
  var iconBase64: js.UndefOr[String] = js.native
  /** The maximum SDK supported by this APK (optional). */
  var maximumSdk: js.UndefOr[Double] = js.native
  /** The minimum SDK targeted by this APK. */
  var minimumSdk: js.UndefOr[Double] = js.native
  /** The native code environments supported by this APK (optional). */
  var nativeCodes: js.UndefOr[js.Array[String]] = js.native
  /** The package name. */
  var packageName: js.UndefOr[String] = js.native
  /** The features required by this APK (optional). */
  var usesFeatures: js.UndefOr[js.Array[String]] = js.native
  /** The permissions requested by this APK. */
  var usesPermissions: js.UndefOr[js.Array[ExternallyHostedApkUsesPermission]] = js.native
  /** The version code of this APK. */
  var versionCode: js.UndefOr[Double] = js.native
  /** The version name of this APK. */
  var versionName: js.UndefOr[String] = js.native
}

object ExternallyHostedApk {
  @scala.inline
  def apply(): ExternallyHostedApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternallyHostedApk]
  }
  @scala.inline
  implicit class ExternallyHostedApkOps[Self <: ExternallyHostedApk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateBase64s(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateBase64s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateBase64s: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateBase64s")(js.undefined)
        ret
    }
    @scala.inline
    def withExternallyHostedUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externallyHostedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternallyHostedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externallyHostedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSha1Base64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSha1Base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSha1Base64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSha1Base64")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSha256Base64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSha256Base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSha256Base64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSha256Base64")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIconBase64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconBase64")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumSdk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSdk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumSdk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSdk")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumSdk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSdk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumSdk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSdk")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeCodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
    @scala.inline
    def withUsesFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsesFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withUsesPermissions(value: js.Array[ExternallyHostedApkUsesPermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsesPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionName")(js.undefined)
        ret
    }
  }
  
}

