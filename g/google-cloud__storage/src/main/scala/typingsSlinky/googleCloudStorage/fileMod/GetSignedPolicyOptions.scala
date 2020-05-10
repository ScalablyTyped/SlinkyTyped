package typingsSlinky.googleCloudStorage.fileMod

import typingsSlinky.googleCloudStorage.AnonMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSignedPolicyOptions extends js.Object {
  var acl: js.UndefOr[String] = js.native
  var contentLengthRange: js.UndefOr[AnonMax] = js.native
  @JSName("equals")
  var equals_FGetSignedPolicyOptions: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
  var expires: String | Double | js.Date = js.native
  var startsWith: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
  var successRedirect: js.UndefOr[String] = js.native
  var successStatus: js.UndefOr[String] = js.native
}

object GetSignedPolicyOptions {
  @scala.inline
  def apply(expires: String | Double | js.Date): GetSignedPolicyOptions = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignedPolicyOptions]
  }
  @scala.inline
  implicit class GetSignedPolicyOptionsOps[Self <: GetSignedPolicyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiresDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLengthRange(value: AnonMax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLengthRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLengthRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLengthRange")(js.undefined)
        ret
    }
    @scala.inline
    def withEquals(value: js.Array[js.Array[String] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
    @scala.inline
    def withStartsWith(value: js.Array[js.Array[String] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartsWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsWith")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessRedirect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successStatus")(js.undefined)
        ret
    }
  }
  
}

