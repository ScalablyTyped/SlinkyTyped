package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBundle extends js.Object {
  /**
    * A sha1 hash of the upload payload, encoded as a hex string and matching
    * the output of the sha1sum command.
    */
  var sha1: js.UndefOr[String] = js.native
  /**
    * A sha256 hash of the upload payload, encoded as a hex string and matching
    * the output of the sha256sum command.
    */
  var sha256: js.UndefOr[String] = js.native
  /**
    * The version code of the Android App Bundle. As specified in the Android
    * App Bundle&#39;s base module APK manifest file.
    */
  var versionCode: js.UndefOr[Double] = js.native
}

object SchemaBundle {
  @scala.inline
  def apply(): SchemaBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBundle]
  }
  @scala.inline
  implicit class SchemaBundleOps[Self <: SchemaBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1")(js.undefined)
        ret
    }
    @scala.inline
    def withSha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(js.undefined)
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
  }
  
}

