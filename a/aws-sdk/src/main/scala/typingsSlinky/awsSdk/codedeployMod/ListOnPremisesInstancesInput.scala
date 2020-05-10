package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOnPremisesInstancesInput extends js.Object {
  /**
    * An identifier returned from the previous list on-premises instances call. It can be used to return the next set of on-premises instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The registration status of the on-premises instances:   Deregistered: Include deregistered on-premises instances in the resulting list.   Registered: Include registered on-premises instances in the resulting list.  
    */
  var registrationStatus: js.UndefOr[RegistrationStatus] = js.native
  /**
    * The on-premises instance tags that are used to restrict the on-premises instance names returned.
    */
  var tagFilters: js.UndefOr[TagFilterList] = js.native
}

object ListOnPremisesInstancesInput {
  @scala.inline
  def apply(): ListOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOnPremisesInstancesInput]
  }
  @scala.inline
  implicit class ListOnPremisesInstancesInputOps[Self <: ListOnPremisesInstancesInput] (val x: Self) extends AnyVal {
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
    def withRegistrationStatus(value: RegistrationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTagFilters(value: TagFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFilters")(js.undefined)
        ret
    }
  }
  
}

