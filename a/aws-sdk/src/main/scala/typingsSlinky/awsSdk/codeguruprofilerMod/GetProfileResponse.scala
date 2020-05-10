package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProfileResponse extends js.Object {
  /**
    * The content encoding of the profile.
    */
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * The content type of the profile in the payload. It is either application/json or the default application/x-amzn-ion.
    */
  var contentType: String = js.native
  /**
    * Information about the profile.
    */
  var profile: AggregatedProfile = js.native
}

object GetProfileResponse {
  @scala.inline
  def apply(contentType: String, profile: AggregatedProfile): GetProfileResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProfileResponse]
  }
  @scala.inline
  implicit class GetProfileResponseOps[Self <: GetProfileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile(value: AggregatedProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEncoding")(js.undefined)
        ret
    }
  }
  
}

