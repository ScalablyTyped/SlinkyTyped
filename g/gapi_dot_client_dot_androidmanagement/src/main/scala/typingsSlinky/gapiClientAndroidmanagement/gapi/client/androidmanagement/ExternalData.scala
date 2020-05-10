package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalData extends js.Object {
  /** The base-64 encoded SHA-256 hash of the content hosted at url. If the content does not match this hash, Android Device Policy will not use the data. */
  var sha256Hash: js.UndefOr[String] = js.native
  /**
    * The absolute URL to the data, which must use either the http or https scheme. Android Device Policy does not provide any credentials in the GET
    * request, so the URL must be publicly accessible. Including a long, random component in the URL may be used to prevent attackers from discovering the
    * URL.
    */
  var url: js.UndefOr[String] = js.native
}

object ExternalData {
  @scala.inline
  def apply(): ExternalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalData]
  }
  @scala.inline
  implicit class ExternalDataOps[Self <: ExternalData] (val x: Self) extends AnyVal {
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

