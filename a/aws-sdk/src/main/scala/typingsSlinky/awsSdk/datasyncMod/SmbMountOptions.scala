package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmbMountOptions extends js.Object {
  /**
    * The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a version, DataSync defaults to AUTOMATIC. That is, DataSync automatically selects a version based on negotiation with the SMB server.
    */
  var Version: js.UndefOr[SmbVersion] = js.native
}

object SmbMountOptions {
  @scala.inline
  def apply(): SmbMountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmbMountOptions]
  }
  @scala.inline
  implicit class SmbMountOptionsOps[Self <: SmbMountOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersion(value: SmbVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

