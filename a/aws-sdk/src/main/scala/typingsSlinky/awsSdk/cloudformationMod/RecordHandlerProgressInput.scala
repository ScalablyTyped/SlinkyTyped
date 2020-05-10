package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordHandlerProgressInput extends js.Object {
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var BearerToken: ClientToken = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ClientRequestToken] = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var CurrentOperationStatus: js.UndefOr[OperationStatus] = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ErrorCode: js.UndefOr[HandlerErrorCode] = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var OperationStatus: typingsSlinky.awsSdk.cloudformationMod.OperationStatus = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ResourceModel: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ResourceModel] = js.native
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StatusMessage] = js.native
}

object RecordHandlerProgressInput {
  @scala.inline
  def apply(BearerToken: ClientToken, OperationStatus: OperationStatus): RecordHandlerProgressInput = {
    val __obj = js.Dynamic.literal(BearerToken = BearerToken.asInstanceOf[js.Any], OperationStatus = OperationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordHandlerProgressInput]
  }
  @scala.inline
  implicit class RecordHandlerProgressInputOps[Self <: RecordHandlerProgressInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBearerToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BearerToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationStatus(value: OperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentOperationStatus(value: OperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentOperationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentOperationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentOperationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: HandlerErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceModel(value: ResourceModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceModel")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: StatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
  }
  
}

