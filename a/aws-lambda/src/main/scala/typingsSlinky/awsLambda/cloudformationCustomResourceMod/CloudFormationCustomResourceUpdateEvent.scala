package typingsSlinky.awsLambda.cloudformationCustomResourceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.AnonDictKey
import typingsSlinky.awsLambda.awsLambdaStrings.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationCustomResourceUpdateEvent
  extends CloudFormationCustomResourceEventCommon
     with CloudFormationCustomResourceEvent {
  var OldResourceProperties: StringDictionary[js.Any] = js.native
  var PhysicalResourceId: String = js.native
  var RequestType: Update = js.native
}

object CloudFormationCustomResourceUpdateEvent {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    OldResourceProperties: StringDictionary[js.Any],
    PhysicalResourceId: String,
    RequestId: String,
    RequestType: Update,
    ResourceProperties: AnonDictKey,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceUpdateEvent = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], OldResourceProperties = OldResourceProperties.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceUpdateEvent]
  }
  @scala.inline
  implicit class CloudFormationCustomResourceUpdateEventOps[Self <: CloudFormationCustomResourceUpdateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOldResourceProperties(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldResourceProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysicalResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestType(value: Update): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

