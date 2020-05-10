package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserContextDataType extends js.Object {
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var EncodedData: js.UndefOr[StringType] = js.native
}

object UserContextDataType {
  @scala.inline
  def apply(): UserContextDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserContextDataType]
  }
  @scala.inline
  implicit class UserContextDataTypeOps[Self <: UserContextDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncodedData(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodedData")(js.undefined)
        ret
    }
  }
  
}

