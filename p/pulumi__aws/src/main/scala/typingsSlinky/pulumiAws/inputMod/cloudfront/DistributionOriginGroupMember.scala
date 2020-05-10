package typingsSlinky.pulumiAws.inputMod.cloudfront

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginGroupMember extends js.Object {
  /**
    * The unique identifier of the member origin
    */
  var originId: Input[String] = js.native
}

object DistributionOriginGroupMember {
  @scala.inline
  def apply(originId: Input[String]): DistributionOriginGroupMember = {
    val __obj = js.Dynamic.literal(originId = originId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginGroupMember]
  }
  @scala.inline
  implicit class DistributionOriginGroupMemberOps[Self <: DistributionOriginGroupMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

