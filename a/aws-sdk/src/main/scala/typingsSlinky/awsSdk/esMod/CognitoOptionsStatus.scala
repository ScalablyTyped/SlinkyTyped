package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoOptionsStatus extends js.Object {
  /**
    * Specifies the Cognito options for the specified Elasticsearch domain.
    */
  var Options: CognitoOptions = js.native
  /**
    * Specifies the status of the Cognito options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}

object CognitoOptionsStatus {
  @scala.inline
  def apply(Options: CognitoOptions, Status: OptionStatus): CognitoOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoOptionsStatus]
  }
  @scala.inline
  implicit class CognitoOptionsStatusOps[Self <: CognitoOptionsStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: CognitoOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: OptionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

