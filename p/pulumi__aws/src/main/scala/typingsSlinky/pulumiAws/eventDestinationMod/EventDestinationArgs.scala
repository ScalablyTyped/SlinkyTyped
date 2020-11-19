package typingsSlinky.pulumiAws.eventDestinationMod

import typingsSlinky.pulumiAws.inputMod.ses.EventDestinationCloudwatchDestination
import typingsSlinky.pulumiAws.inputMod.ses.EventDestinationKinesisDestination
import typingsSlinky.pulumiAws.inputMod.ses.EventDestinationSnsDestination
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigurationSetName(value: Input[String]): Self = this.set("configurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingTypesVarargs(value: Input[String]*): Self = this.set("matchingTypes", js.Array(value :_*))
    
    @scala.inline
    def setMatchingTypes(value: Input[js.Array[Input[String]]]): Self = this.set("matchingTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchDestinationsVarargs(value: Input[EventDestinationCloudwatchDestination]*): Self = this.set("cloudwatchDestinations", js.Array(value :_*))
    
    @scala.inline
    def setCloudwatchDestinations(value: Input[js.Array[Input[EventDestinationCloudwatchDestination]]]): Self = this.set("cloudwatchDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchDestinations: Self = this.set("cloudwatchDestinations", js.undefined)
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setKinesisDestination(value: Input[EventDestinationKinesisDestination]): Self = this.set("kinesisDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisDestination: Self = this.set("kinesisDestination", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSnsDestination(value: Input[EventDestinationSnsDestination]): Self = this.set("snsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsDestination: Self = this.set("snsDestination", js.undefined)
  }
}
