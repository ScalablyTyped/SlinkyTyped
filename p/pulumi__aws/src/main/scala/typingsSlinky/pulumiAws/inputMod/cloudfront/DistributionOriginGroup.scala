package typingsSlinky.pulumiAws.inputMod.cloudfront

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginGroup extends js.Object {
  /**
    * The failover criteria for when to failover to the secondary origin
    */
  var failoverCriteria: Input[DistributionOriginGroupFailoverCriteria] = js.native
  /**
    * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
    */
  var members: Input[js.Array[Input[DistributionOriginGroupMember]]] = js.native
  /**
    * The unique identifier of the member origin
    */
  var originId: Input[String] = js.native
}

object DistributionOriginGroup {
  @scala.inline
  def apply(
    failoverCriteria: Input[DistributionOriginGroupFailoverCriteria],
    members: Input[js.Array[Input[DistributionOriginGroupMember]]],
    originId: Input[String]
  ): DistributionOriginGroup = {
    val __obj = js.Dynamic.literal(failoverCriteria = failoverCriteria.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginGroup]
  }
  @scala.inline
  implicit class DistributionOriginGroupOps[Self <: DistributionOriginGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailoverCriteria(value: Input[DistributionOriginGroupFailoverCriteria]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers(value: Input[js.Array[Input[DistributionOriginGroupMember]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

