package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information reported about an installed app.
  */
@js.native
trait SchemaApplicationReport extends js.Object {
  /**
    * The source of the package.
    */
  var applicationSource: js.UndefOr[String] = js.native
  /**
    * The display name of the app.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * List of app events. The most recent 20 events are stored in the list.
    */
  var events: js.UndefOr[js.Array[SchemaApplicationEvent]] = js.native
  /**
    * The package name of the app that installed this app.
    */
  var installerPackageName: js.UndefOr[String] = js.native
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * The SHA-256 hash of the app&#39;s APK file, which can be used to verify
    * the app hasn&#39;t been modified. Each byte of the hash value is
    * represented as a two-digit hexadecimal number.
    */
  var packageSha256Hash: js.UndefOr[String] = js.native
  /**
    * The SHA-1 hash of each android.content.pm.Signature
    * (https://developer.android.com/reference/android/content/pm/Signature.html)
    * associated with the app package. Each byte of each hash value is
    * represented as a two-digit hexadecimal number.
    */
  var signingKeyCertFingerprints: js.UndefOr[js.Array[String]] = js.native
  /**
    * Application state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The app version code, which can be used to determine whether one version
    * is more recent than another.
    */
  var versionCode: js.UndefOr[Double] = js.native
  /**
    * The app version as displayed to the user.
    */
  var versionName: js.UndefOr[String] = js.native
}

object SchemaApplicationReport {
  @scala.inline
  def apply(): SchemaApplicationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationReport]
  }
  @scala.inline
  implicit class SchemaApplicationReportOps[Self <: SchemaApplicationReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[SchemaApplicationEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallerPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallerPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerPackageName")(js.undefined)
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
    def withPackageSha256Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageSha256Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageSha256Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageSha256Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningKeyCertFingerprints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingKeyCertFingerprints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningKeyCertFingerprints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingKeyCertFingerprints")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
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

