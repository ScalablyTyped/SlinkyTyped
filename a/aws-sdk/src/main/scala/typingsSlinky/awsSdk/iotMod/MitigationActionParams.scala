package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MitigationActionParams extends js.Object {
  /**
    * Parameters to define a mitigation action that moves devices associated with a certificate to one or more specified thing groups, typically for quarantine.
    */
  var addThingsToThingGroupParams: js.UndefOr[AddThingsToThingGroupParams] = js.native
  /**
    * Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
    */
  var enableIoTLoggingParams: js.UndefOr[EnableIoTLoggingParams] = js.native
  /**
    * Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom actions in response to the Amazon SNS messages.
    */
  var publishFindingToSnsParams: js.UndefOr[PublishFindingToSnsParams] = js.native
  /**
    * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
    */
  var replaceDefaultPolicyVersionParams: js.UndefOr[ReplaceDefaultPolicyVersionParams] = js.native
  /**
    * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
    */
  var updateCACertificateParams: js.UndefOr[UpdateCACertificateParams] = js.native
  /**
    * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
    */
  var updateDeviceCertificateParams: js.UndefOr[UpdateDeviceCertificateParams] = js.native
}

object MitigationActionParams {
  @scala.inline
  def apply(): MitigationActionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MitigationActionParams]
  }
  @scala.inline
  implicit class MitigationActionParamsOps[Self <: MitigationActionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddThingsToThingGroupParams(value: AddThingsToThingGroupParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addThingsToThingGroupParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddThingsToThingGroupParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addThingsToThingGroupParams")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableIoTLoggingParams(value: EnableIoTLoggingParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIoTLoggingParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableIoTLoggingParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIoTLoggingParams")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishFindingToSnsParams(value: PublishFindingToSnsParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishFindingToSnsParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishFindingToSnsParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishFindingToSnsParams")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceDefaultPolicyVersionParams(value: ReplaceDefaultPolicyVersionParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceDefaultPolicyVersionParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceDefaultPolicyVersionParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceDefaultPolicyVersionParams")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateCACertificateParams(value: UpdateCACertificateParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCACertificateParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateCACertificateParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCACertificateParams")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDeviceCertificateParams(value: UpdateDeviceCertificateParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDeviceCertificateParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDeviceCertificateParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDeviceCertificateParams")(js.undefined)
        ret
    }
  }
  
}

