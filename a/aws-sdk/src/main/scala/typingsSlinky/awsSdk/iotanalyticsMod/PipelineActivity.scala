package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineActivity extends js.Object {
  /**
    * Adds other attributes based on existing attributes in the message.
    */
  var addAttributes: js.UndefOr[AddAttributesActivity] = js.native
  /**
    * Determines the source of the messages to be processed.
    */
  var channel: js.UndefOr[ChannelActivity] = js.native
  /**
    * Specifies where to store the processed message data.
    */
  var datastore: js.UndefOr[DatastoreActivity] = js.native
  /**
    * Adds data from the AWS IoT device registry to your message.
    */
  var deviceRegistryEnrich: js.UndefOr[DeviceRegistryEnrichActivity] = js.native
  /**
    * Adds information from the AWS IoT Device Shadows service to a message.
    */
  var deviceShadowEnrich: js.UndefOr[DeviceShadowEnrichActivity] = js.native
  /**
    * Filters a message based on its attributes.
    */
  var filter: js.UndefOr[FilterActivity] = js.native
  /**
    * Runs a Lambda function to modify the message.
    */
  var lambda: js.UndefOr[LambdaActivity] = js.native
  /**
    * Computes an arithmetic expression using the message's attributes and adds it to the message.
    */
  var math: js.UndefOr[MathActivity] = js.native
  /**
    * Removes attributes from a message.
    */
  var removeAttributes: js.UndefOr[RemoveAttributesActivity] = js.native
  /**
    * Creates a new message using only the specified attributes from the original message. 
    */
  var selectAttributes: js.UndefOr[SelectAttributesActivity] = js.native
}

object PipelineActivity {
  @scala.inline
  def apply(): PipelineActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineActivity]
  }
  @scala.inline
  implicit class PipelineActivityOps[Self <: PipelineActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAttributes(value: AddAttributesActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel(value: ChannelActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withDatastore(value: DatastoreActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatastore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastore")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceRegistryEnrich(value: DeviceRegistryEnrichActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceRegistryEnrich")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceRegistryEnrich: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceRegistryEnrich")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceShadowEnrich(value: DeviceShadowEnrichActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceShadowEnrich")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceShadowEnrich: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceShadowEnrich")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: FilterActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withLambda(value: LambdaActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambda: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(js.undefined)
        ret
    }
    @scala.inline
    def withMath(value: MathActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("math")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("math")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAttributes(value: RemoveAttributesActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAttributes(value: SelectAttributesActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAttributes")(js.undefined)
        ret
    }
  }
  
}

