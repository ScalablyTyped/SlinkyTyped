package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTypeOutput extends js.Object {
  /**
    * The identifier for this registration request. Use this registration token when calling  DescribeTypeRegistration , which returns information about the status and IDs of the type registration. 
    */
  var RegistrationToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.RegistrationToken] = js.native
}

object RegisterTypeOutput {
  @scala.inline
  def apply(): RegisterTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTypeOutput]
  }
  @scala.inline
  implicit class RegisterTypeOutputOps[Self <: RegisterTypeOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistrationToken(value: RegistrationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationToken")(js.undefined)
        ret
    }
  }
  
}

