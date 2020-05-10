package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilter extends js.Object {
  /**
    * The description of the Traffic Mirror filter.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Information about the egress rules that are associated with the Traffic Mirror filter.
    */
  var EgressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList] = js.native
  /**
    * Information about the ingress rules that are associated with the Traffic Mirror filter.
    */
  var IngressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList] = js.native
  /**
    * The network service traffic that is associated with the Traffic Mirror filter.
    */
  var NetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.native
  /**
    * The tags assigned to the Traffic Mirror filter.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.native
}

object TrafficMirrorFilter {
  @scala.inline
  def apply(): TrafficMirrorFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilter]
  }
  @scala.inline
  implicit class TrafficMirrorFilterOps[Self <: TrafficMirrorFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEgressFilterRules(value: TrafficMirrorFilterRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressFilterRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgressFilterRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressFilterRules")(js.undefined)
        ret
    }
    @scala.inline
    def withIngressFilterRules(value: TrafficMirrorFilterRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngressFilterRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngressFilterRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngressFilterRules")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkServices(value: TrafficMirrorNetworkServiceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkServices")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficMirrorFilterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficMirrorFilterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilterId")(js.undefined)
        ret
    }
  }
  
}

