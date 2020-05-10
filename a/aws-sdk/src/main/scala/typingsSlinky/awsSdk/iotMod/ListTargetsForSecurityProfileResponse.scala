package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTargetsForSecurityProfileResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The thing groups to which the security profile is attached.
    */
  var securityProfileTargets: js.UndefOr[SecurityProfileTargets] = js.native
}

object ListTargetsForSecurityProfileResponse {
  @scala.inline
  def apply(): ListTargetsForSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsForSecurityProfileResponse]
  }
  @scala.inline
  implicit class ListTargetsForSecurityProfileResponseOps[Self <: ListTargetsForSecurityProfileResponse] (val x: Self) extends AnyVal {
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
    def withSecurityProfileTargets(value: SecurityProfileTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityProfileTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileTargets")(js.undefined)
        ret
    }
  }
  
}

