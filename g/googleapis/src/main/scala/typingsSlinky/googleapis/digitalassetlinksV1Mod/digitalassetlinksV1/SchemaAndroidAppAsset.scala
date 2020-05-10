package typingsSlinky.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes an android app asset.
  */
@js.native
trait SchemaAndroidAppAsset extends js.Object {
  /**
    * Because there is no global enforcement of package name uniqueness, we
    * also require a signing certificate, which in combination with the package
    * name uniquely identifies an app.  Some apps&#39; signing keys are
    * rotated, so they may be signed by different keys over time.  We treat
    * these as distinct assets, since we use (package name, cert) as the unique
    * ID.  This should not normally pose any problems as both versions of the
    * app will make the same or similar statements. Other assets making
    * statements about the app will have to be updated when a key is rotated,
    * however.  (Note that the syntaxes for publishing and querying for
    * statements contain syntactic sugar to easily let you specify apps that
    * are known by multiple certificates.) REQUIRED
    */
  var certificate: js.UndefOr[SchemaCertificateInfo] = js.native
  /**
    * Android App assets are naturally identified by their Java package name.
    * For example, the Google Maps app uses the package name
    * `com.google.android.apps.maps`. REQUIRED
    */
  var packageName: js.UndefOr[String] = js.native
}

object SchemaAndroidAppAsset {
  @scala.inline
  def apply(): SchemaAndroidAppAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidAppAsset]
  }
  @scala.inline
  implicit class SchemaAndroidAppAssetOps[Self <: SchemaAndroidAppAsset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: SchemaCertificateInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(js.undefined)
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
  }
  
}

