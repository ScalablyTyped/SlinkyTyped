package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallToRemoteAccessSessionRequest extends js.Object {
  /**
    * The ARN of the app about which you are requesting information.
    */
  var appArn: AmazonResourceName = js.native
  /**
    * The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
    */
  var remoteAccessSessionArn: AmazonResourceName = js.native
}

object InstallToRemoteAccessSessionRequest {
  @scala.inline
  def apply(appArn: AmazonResourceName, remoteAccessSessionArn: AmazonResourceName): InstallToRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], remoteAccessSessionArn = remoteAccessSessionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallToRemoteAccessSessionRequest]
  }
  @scala.inline
  implicit class InstallToRemoteAccessSessionRequestOps[Self <: InstallToRemoteAccessSessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteAccessSessionArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccessSessionArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

