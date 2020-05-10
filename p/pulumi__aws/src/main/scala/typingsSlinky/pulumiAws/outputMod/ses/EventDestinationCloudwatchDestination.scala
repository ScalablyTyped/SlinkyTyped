package typingsSlinky.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationCloudwatchDestination extends js.Object {
  /**
    * The default value for the event
    */
  var defaultValue: String = js.native
  /**
    * The name for the dimension
    */
  var dimensionName: String = js.native
  /**
    * The source for the value. It can be either `"messageTag"` or `"emailHeader"`
    */
  var valueSource: String = js.native
}

object EventDestinationCloudwatchDestination {
  @scala.inline
  def apply(defaultValue: String, dimensionName: String, valueSource: String): EventDestinationCloudwatchDestination = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], dimensionName = dimensionName.asInstanceOf[js.Any], valueSource = valueSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationCloudwatchDestination]
  }
  @scala.inline
  implicit class EventDestinationCloudwatchDestinationOps[Self <: EventDestinationCloudwatchDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

