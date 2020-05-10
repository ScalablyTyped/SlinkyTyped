package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNodegroupRequest extends js.Object {
  /**
    * The name of the Amazon EKS cluster associated with the node group.
    */
  var clusterName: String = js.native
  /**
    * The name of the node group to describe.
    */
  var nodegroupName: String = js.native
}

object DescribeNodegroupRequest {
  @scala.inline
  def apply(clusterName: String, nodegroupName: String): DescribeNodegroupRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodegroupRequest]
  }
  @scala.inline
  implicit class DescribeNodegroupRequestOps[Self <: DescribeNodegroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodegroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodegroupName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

