package typingsSlinky.pulumiAws.eventDestinationMod

import typingsSlinky.pulumiAws.inputMod.ses.EventDestinationCloudwatchDestination
import typingsSlinky.pulumiAws.inputMod.ses.EventDestinationKinesisDestination
import typingsSlinky.pulumiAws.inputMod.ses.EventDestinationSnsDestination
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationArgs extends js.Object {
  /**
    * CloudWatch destination for the events
    */
  val cloudwatchDestinations: js.UndefOr[Input[js.Array[Input[EventDestinationCloudwatchDestination]]]] = js.native
  /**
    * The name of the configuration set
    */
  val configurationSetName: Input[String] = js.native
  /**
    * If true, the event destination will be enabled
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Send the events to a kinesis firehose destination
    */
  val kinesisDestination: js.UndefOr[Input[EventDestinationKinesisDestination]] = js.native
  /**
    * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
    */
  val matchingTypes: Input[js.Array[Input[String]]] = js.native
  /**
    * The name of the event destination
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Send the events to an SNS Topic destination
    */
  val snsDestination: js.UndefOr[Input[EventDestinationSnsDestination]] = js.native
}

object EventDestinationArgs {
  @scala.inline
  def apply(configurationSetName: Input[String], matchingTypes: Input[js.Array[Input[String]]]): EventDestinationArgs = {
    val __obj = js.Dynamic.literal(configurationSetName = configurationSetName.asInstanceOf[js.Any], matchingTypes = matchingTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationArgs]
  }
  @scala.inline
  implicit class EventDestinationArgsOps[Self <: EventDestinationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationSetName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchingTypes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudwatchDestinations(value: Input[js.Array[Input[EventDestinationCloudwatchDestination]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchDestinations")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisDestination(value: Input[EventDestinationKinesisDestination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisDestination")(js.undefined)
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
    def withSnsDestination(value: Input[EventDestinationSnsDestination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsDestination")(js.undefined)
        ret
    }
  }
  
}

