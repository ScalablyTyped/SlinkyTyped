package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOnPremisesInstancesOutput extends js.Object {
  /**
    * The list of matching on-premises instance names.
    */
  var instanceNames: js.UndefOr[InstanceNameList] = js.native
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list on-premises instances call to return the next set of on-premises instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListOnPremisesInstancesOutput {
  @scala.inline
  def apply(): ListOnPremisesInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOnPremisesInstancesOutput]
  }
  @scala.inline
  implicit class ListOnPremisesInstancesOutputOps[Self <: ListOnPremisesInstancesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceNames(value: InstanceNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceNames")(js.undefined)
        ret
    }
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
  }
  
}

