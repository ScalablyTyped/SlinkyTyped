package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data hosted at an external location. The data is to be downloaded by
  * Android Device Policy and verified against the hash.
  */
@js.native
trait SchemaExternalData extends js.Object {
  /**
    * The base-64 encoded SHA-256 hash of the content hosted at url. If the
    * content doesn&#39;t match this hash, Android Device Policy won&#39;t use
    * the data.
    */
  var sha256Hash: js.UndefOr[String] = js.native
  /**
    * The absolute URL to the data, which must use either the http or https
    * scheme. Android Device Policy doesn&#39;t provide any credentials in the
    * GET request, so the URL must be publicly accessible. Including a long,
    * random component in the URL may be used to prevent attackers from
    * discovering the URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaExternalData {
  @scala.inline
  def apply(): SchemaExternalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternalData]
  }
  @scala.inline
  implicit class SchemaExternalDataOps[Self <: SchemaExternalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha256Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha256Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

