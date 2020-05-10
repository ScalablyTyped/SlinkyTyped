package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing Cloud CDN configuration for a backend bucket.
  */
@js.native
trait SchemaBackendBucketCdnPolicy extends js.Object {
  /**
    * Maximum number of seconds the response to a signed URL request will be
    * considered fresh. After this time period, the response will be
    * revalidated before being served. Defaults to 1hr (3600s). When serving
    * responses to signed URL requests, Cloud CDN will internally behave as
    * though all responses from this backend had a &quot;Cache-Control: public,
    * max-age=[TTL]&quot; header, regardless of any existing Cache-Control
    * header. The actual headers served in responses will not be altered.
    */
  var signedUrlCacheMaxAgeSec: js.UndefOr[String] = js.native
  /**
    * [Output Only] Names of the keys for signing request URLs.
    */
  var signedUrlKeyNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaBackendBucketCdnPolicy {
  @scala.inline
  def apply(): SchemaBackendBucketCdnPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendBucketCdnPolicy]
  }
  @scala.inline
  implicit class SchemaBackendBucketCdnPolicyOps[Self <: SchemaBackendBucketCdnPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignedUrlCacheMaxAgeSec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedUrlCacheMaxAgeSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedUrlCacheMaxAgeSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedUrlCacheMaxAgeSec")(js.undefined)
        ret
    }
    @scala.inline
    def withSignedUrlKeyNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedUrlKeyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedUrlKeyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedUrlKeyNames")(js.undefined)
        ret
    }
  }
  
}

