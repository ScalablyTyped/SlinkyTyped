package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallToRemoteAccessSessionResult extends js.Object {
  /**
    * An app to upload or that has been uploaded.
    */
  var appUpload: js.UndefOr[Upload] = js.native
}

object InstallToRemoteAccessSessionResult {
  @scala.inline
  def apply(): InstallToRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallToRemoteAccessSessionResult]
  }
  @scala.inline
  implicit class InstallToRemoteAccessSessionResultOps[Self <: InstallToRemoteAccessSessionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppUpload(value: Upload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUpload")(js.undefined)
        ret
    }
  }
  
}

