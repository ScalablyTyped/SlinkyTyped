package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupVersion extends js.Object {
  /**
    * The ARN of the connector definition version for this group.
    */
  var ConnectorDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the core definition version for this group.
    */
  var CoreDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the device definition version for this group.
    */
  var DeviceDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the function definition version for this group.
    */
  var FunctionDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the logger definition version for this group.
    */
  var LoggerDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the resource definition version for this group.
    */
  var ResourceDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the subscription definition version for this group.
    */
  var SubscriptionDefinitionVersionArn: js.UndefOr[string] = js.native
}

object GroupVersion {
  @scala.inline
  def apply(): GroupVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupVersion]
  }
  @scala.inline
  implicit class GroupVersionOps[Self <: GroupVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectorDefinitionVersionArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectorDefinitionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorDefinitionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectorDefinitionVersionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCoreDefinitionVersionArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoreDefinitionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreDefinitionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoreDefinitionVersionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceDefinitionVersionArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceDefinitionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceDefinitionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceDefinitionVersionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionDefinitionVersionArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionDefinitionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionDefinitionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionDefinitionVersionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggerDefinitionVersionArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggerDefinitionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggerDefinitionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggerDefinitionVersionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceDefinitionVersionArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceDefinitionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceDefinitionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceDefinitionVersionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionDefinitionVersionArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionDefinitionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionDefinitionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionDefinitionVersionArn")(js.undefined)
        ret
    }
  }
  
}

