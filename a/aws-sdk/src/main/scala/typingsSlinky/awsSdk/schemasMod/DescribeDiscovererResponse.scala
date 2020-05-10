package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDiscovererResponse extends js.Object {
  /**
    * The description of the discoverer.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The ARN of the discoverer.
    */
  var DiscovererArn: js.UndefOr[string] = js.native
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.native
  /**
    * The ARN of the event bus.
    */
  var SourceArn: js.UndefOr[string] = js.native
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.native
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.schemasMod.Tags] = js.native
}

object DescribeDiscovererResponse {
  @scala.inline
  def apply(): DescribeDiscovererResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDiscovererResponse]
  }
  @scala.inline
  implicit class DescribeDiscovererResponseOps[Self <: DescribeDiscovererResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: string): Self = {
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
    def withDiscovererArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscovererArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscovererArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscovererArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscovererId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscovererId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscovererId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscovererId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: DiscovererState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
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
  }
  
}

