package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalLimit extends js.Object {
  /**
    *  Name of Additional Limit is specific to a given InstanceType and for each of it's  InstanceRole  etc.  Attributes and their details:   MaximumNumberOfDataNodesSupported This attribute will be present in Master node only to specify how much data nodes upto which given  ESPartitionInstanceType  can support as master node. MaximumNumberOfDataNodesWithoutMasterNode This attribute will be present in Data node only to specify how much data nodes of given  ESPartitionInstanceType  upto which you don't need any master nodes to govern them.  
    */
  var LimitName: js.UndefOr[typingsSlinky.awsSdk.esMod.LimitName] = js.native
  /**
    *  Value for given  AdditionalLimit$LimitName  . 
    */
  var LimitValues: js.UndefOr[LimitValueList] = js.native
}

object AdditionalLimit {
  @scala.inline
  def apply(): AdditionalLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalLimit]
  }
  @scala.inline
  implicit class AdditionalLimitOps[Self <: AdditionalLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimitName(value: LimitName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitName")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitValues(value: LimitValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitValues")(js.undefined)
        ret
    }
  }
  
}

