package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Trusted App Ids Resource object in Directory API.
  */
@js.native
trait SchemaTrustedAppId extends js.Object {
  /**
    * Android package name.
    */
  var androidPackageName: js.UndefOr[String] = js.native
  /**
    * SHA1 signature of the app certificate.
    */
  var certificateHashSHA1: js.UndefOr[String] = js.native
  /**
    * SHA256 signature of the app certificate.
    */
  var certificateHashSHA256: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a trusted AppId.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaTrustedAppId {
  @scala.inline
  def apply(): SchemaTrustedAppId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrustedAppId]
  }
  @scala.inline
  implicit class SchemaTrustedAppIdOps[Self <: SchemaTrustedAppId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidPackageName")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateHashSHA1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateHashSHA1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateHashSHA1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateHashSHA1")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateHashSHA256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateHashSHA256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateHashSHA256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateHashSHA256")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
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
  }
  
}

