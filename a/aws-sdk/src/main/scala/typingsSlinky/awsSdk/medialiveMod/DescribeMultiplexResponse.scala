package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMultiplexResponse extends js.Object {
  /**
    * The unique arn of the multiplex.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * A list of availability zones for the multiplex.
    */
  var AvailabilityZones: js.UndefOr[listOfString] = js.native
  /**
    * A list of the multiplex output destinations.
    */
  var Destinations: js.UndefOr[listOfMultiplexOutputDestination] = js.native
  /**
    * The unique id of the multiplex.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Configuration for a multiplex event.
    */
  var MultiplexSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MultiplexSettings] = js.native
  /**
    * The name of the multiplex.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The number of currently healthy pipelines.
    */
  var PipelinesRunningCount: js.UndefOr[integer] = js.native
  /**
    * The number of programs in the multiplex.
    */
  var ProgramCount: js.UndefOr[integer] = js.native
  /**
    * The current state of the multiplex.
    */
  var State: js.UndefOr[MultiplexState] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Tags] = js.native
}

object DescribeMultiplexResponse {
  @scala.inline
  def apply(): DescribeMultiplexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMultiplexResponse]
  }
  @scala.inline
  implicit class DescribeMultiplexResponseOps[Self <: DescribeMultiplexResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZones(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinations(value: listOfMultiplexOutputDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destinations")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplexSettings(value: MultiplexSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplexSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelinesRunningCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PipelinesRunningCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelinesRunningCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PipelinesRunningCount")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgramCount")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: MultiplexState): Self = {
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

