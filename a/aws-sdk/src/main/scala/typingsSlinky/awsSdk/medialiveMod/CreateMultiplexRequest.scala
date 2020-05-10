package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMultiplexRequest extends js.Object {
  /**
    * A list of availability zones for the multiplex. You must specify exactly two.
    */
  var AvailabilityZones: listOfString = js.native
  /**
    * Configuration for a multiplex event.
    */
  var MultiplexSettings: typingsSlinky.awsSdk.medialiveMod.MultiplexSettings = js.native
  /**
    * Name of multiplex.
    */
  var Name: string = js.native
  /**
    * Unique request ID. This prevents retries from creating multiple
  resources.
    */
  var RequestId: string = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Tags] = js.native
}

object CreateMultiplexRequest {
  @scala.inline
  def apply(
    AvailabilityZones: listOfString,
    MultiplexSettings: MultiplexSettings,
    Name: string,
    RequestId: string
  ): CreateMultiplexRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], MultiplexSettings = MultiplexSettings.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiplexRequest]
  }
  @scala.inline
  implicit class CreateMultiplexRequestOps[Self <: CreateMultiplexRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiplexSettings(value: MultiplexSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
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

