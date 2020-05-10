package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSigningProfilesResponse extends js.Object {
  /**
    * Value for specifying the next set of paginated results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of profiles that are available in the AWS account. This includes profiles with the status of CANCELED if the includeCanceled parameter is set to true.
    */
  var profiles: js.UndefOr[SigningProfiles] = js.native
}

object ListSigningProfilesResponse {
  @scala.inline
  def apply(): ListSigningProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningProfilesResponse]
  }
  @scala.inline
  implicit class ListSigningProfilesResponseOps[Self <: ListSigningProfilesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withProfiles(value: SigningProfiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(js.undefined)
        ret
    }
  }
  
}

