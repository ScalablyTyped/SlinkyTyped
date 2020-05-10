package typingsSlinky.pulumiAws.linkAggregationGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkAggregationGroupState extends js.Object {
  /**
    * The ARN of the LAG.
    * * `jumboFrameCapable` -Indicates whether jumbo frames (9001 MTU) are supported.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The bandwidth of the individual physical connections bundled by the LAG. Available values: 1Gbps, 10Gbps. Case sensitive.
    */
  val connectionsBandwidth: js.UndefOr[Input[String]] = js.native
  /**
    * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
    */
  val hasLogicalRedundancy: js.UndefOr[Input[String]] = js.native
  val jumboFrameCapable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
    */
  val location: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the LAG.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LinkAggregationGroupState {
  @scala.inline
  def apply(): LinkAggregationGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAggregationGroupState]
  }
  @scala.inline
  implicit class LinkAggregationGroupStateOps[Self <: LinkAggregationGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionsBandwidth(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionsBandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionsBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionsBandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withForceDestroy(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withHasLogicalRedundancy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLogicalRedundancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasLogicalRedundancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLogicalRedundancy")(js.undefined)
        ret
    }
    @scala.inline
    def withJumboFrameCapable(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumboFrameCapable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJumboFrameCapable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumboFrameCapable")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

