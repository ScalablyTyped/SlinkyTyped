package typingsSlinky.awsLambda.cloudformationCustomResourceMod

import typingsSlinky.awsLambda.AnonDictKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationCustomResourceEventCommon extends js.Object {
  var LogicalResourceId: String = js.native
  var RequestId: String = js.native
  var ResourceProperties: AnonDictKey = js.native
  var ResourceType: String = js.native
  var ResponseURL: String = js.native
  var ServiceToken: String = js.native
  var StackId: String = js.native
}

object CloudFormationCustomResourceEventCommon {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    RequestId: String,
    ResourceProperties: AnonDictKey,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceEventCommon = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceEventCommon]
  }
  @scala.inline
  implicit class CloudFormationCustomResourceEventCommonOps[Self <: CloudFormationCustomResourceEventCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogicalResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceProperties(value: AnonDictKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

