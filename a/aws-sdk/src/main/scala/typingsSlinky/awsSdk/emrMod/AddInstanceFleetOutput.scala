package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddInstanceFleetOutput extends js.Object {
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleetId: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceFleetId] = js.native
}

object AddInstanceFleetOutput {
  @scala.inline
  def apply(): AddInstanceFleetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddInstanceFleetOutput]
  }
  @scala.inline
  implicit class AddInstanceFleetOutputOps[Self <: AddInstanceFleetOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterArn(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterId(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceFleetId(value: InstanceFleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetId")(js.undefined)
        ret
    }
  }
  
}

