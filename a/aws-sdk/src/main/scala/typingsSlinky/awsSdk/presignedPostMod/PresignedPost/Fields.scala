package typingsSlinky.awsSdk.presignedPostMod.PresignedPost

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields
  extends /**
  * Additional keys that must be included in the form to be submitted. This
  * will include signature metadata as well as any fields provided to
  * s3.createPresignedPost
  */
/* key */ StringDictionary[String] {
  /**
    * A base64-encoded policy detailing what constitutes an acceptable POST
    * upload. Composed of the conditions and expiration provided to
    * s3.createPresignedPost
    */
  var Policy: String = js.native
  /**
    * A hex-encoded HMAC of the POST policy, signed with the credentials
    * provided to the S3 client.
    */
  var `X-Amz-Signature`: String = js.native
}

object Fields {
  @scala.inline
  def apply(Policy: String, `X-Amz-Signature`: String): Fields = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    __obj.updateDynamic("X-Amz-Signature")(`X-Amz-Signature`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-Amz-Signature`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-Amz-Signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

