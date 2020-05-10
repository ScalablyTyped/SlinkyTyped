package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNodeAssociationStatusResponse extends js.Object {
  /**
    * Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). 
    */
  var EngineAttributes: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.EngineAttributes] = js.native
  /**
    * The status of the association or disassociation request.   Possible values:     SUCCESS: The association or disassociation succeeded.     FAILED: The association or disassociation failed.     IN_PROGRESS: The association or disassociation is still in progress.   
    */
  var NodeAssociationStatus: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.NodeAssociationStatus] = js.native
}

object DescribeNodeAssociationStatusResponse {
  @scala.inline
  def apply(): DescribeNodeAssociationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNodeAssociationStatusResponse]
  }
  @scala.inline
  implicit class DescribeNodeAssociationStatusResponseOps[Self <: DescribeNodeAssociationStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngineAttributes(value: EngineAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeAssociationStatus(value: NodeAssociationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeAssociationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeAssociationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeAssociationStatus")(js.undefined)
        ret
    }
  }
  
}

