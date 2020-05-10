package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAwsSdkVersion extends js.Object {
  var awsSdkVersion: String = js.native
  var clientId: String = js.native
}

object AnonAwsSdkVersion {
  @scala.inline
  def apply(awsSdkVersion: String, clientId: String): AnonAwsSdkVersion = {
    val __obj = js.Dynamic.literal(awsSdkVersion = awsSdkVersion.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAwsSdkVersion]
  }
  @scala.inline
  implicit class AnonAwsSdkVersionOps[Self <: AnonAwsSdkVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsSdkVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsSdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

