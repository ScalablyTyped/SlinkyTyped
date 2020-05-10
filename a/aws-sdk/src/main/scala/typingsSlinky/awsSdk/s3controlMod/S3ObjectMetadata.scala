package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ObjectMetadata extends js.Object {
  /**
    * 
    */
  var CacheControl: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ContentDisposition: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ContentEncoding: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ContentLanguage: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ContentLength: js.UndefOr[S3ContentLength] = js.native
  /**
    * 
    */
  var ContentMD5: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ContentType: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var HttpExpiresDate: js.UndefOr[js.Date] = js.native
  /**
    * 
    */
  var RequesterCharged: js.UndefOr[Boolean] = js.native
  /**
    * 
    */
  var SSEAlgorithm: js.UndefOr[S3SSEAlgorithm] = js.native
  /**
    * 
    */
  var UserMetadata: js.UndefOr[S3UserMetadata] = js.native
}

object S3ObjectMetadata {
  @scala.inline
  def apply(): S3ObjectMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ObjectMetadata]
  }
  @scala.inline
  implicit class S3ObjectMetadataOps[Self <: S3ObjectMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheControl(value: NonEmptyMaxLength1024String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDisposition(value: NonEmptyMaxLength1024String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentDisposition")(js.undefined)
        ret
    }
    @scala.inline
    def withContentEncoding(value: NonEmptyMaxLength1024String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLanguage(value: NonEmptyMaxLength1024String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLength(value: S3ContentLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withContentMD5(value: NonEmptyMaxLength1024String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: NonEmptyMaxLength1024String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpExpiresDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpExpiresDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpExpiresDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpExpiresDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterCharged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterCharged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterCharged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterCharged")(js.undefined)
        ret
    }
    @scala.inline
    def withSSEAlgorithm(value: S3SSEAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMetadata(value: S3UserMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(js.undefined)
        ret
    }
  }
  
}

