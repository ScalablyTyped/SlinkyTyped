package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSecurityProfilesForTargetResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of security profiles and their associated targets.
    */
  var securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings] = js.native
}

object ListSecurityProfilesForTargetResponse {
  @scala.inline
  def apply(): ListSecurityProfilesForTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityProfilesForTargetResponse]
  }
  @scala.inline
  implicit class ListSecurityProfilesForTargetResponseOps[Self <: ListSecurityProfilesForTargetResponse] (val x: Self) extends AnyVal {
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
    def withSecurityProfileTargetMappings(value: SecurityProfileTargetMappings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileTargetMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityProfileTargetMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileTargetMappings")(js.undefined)
        ret
    }
  }
  
}

