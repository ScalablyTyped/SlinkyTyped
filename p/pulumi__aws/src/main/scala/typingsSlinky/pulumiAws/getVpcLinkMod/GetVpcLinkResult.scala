package typingsSlinky.pulumiAws.getVpcLinkMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcLinkResult extends js.Object {
  /**
    * The description of the VPC link.
    */
  val description: String = js.native
  /**
    * Set to the ID of the found API Gateway VPC Link.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * The status of the VPC link.
    */
  val status: String = js.native
  /**
    * The status message of the VPC link.
    */
  val statusMessage: String = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
    */
  val targetArns: js.Array[String] = js.native
}

object GetVpcLinkResult {
  @scala.inline
  def apply(
    description: String,
    id: String,
    name: String,
    status: String,
    statusMessage: String,
    tags: StringDictionary[js.Any],
    targetArns: js.Array[String]
  ): GetVpcLinkResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], targetArns = targetArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcLinkResult]
  }
  @scala.inline
  implicit class GetVpcLinkResultOps[Self <: GetVpcLinkResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetArns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetArns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

