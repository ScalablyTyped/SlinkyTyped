package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableEbsEncryptionByDefaultResult extends js.Object {
  /**
    * The updated status of encryption by default.
    */
  var EbsEncryptionByDefault: js.UndefOr[Boolean] = js.native
}

object DisableEbsEncryptionByDefaultResult {
  @scala.inline
  def apply(): DisableEbsEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableEbsEncryptionByDefaultResult]
  }
  @scala.inline
  implicit class DisableEbsEncryptionByDefaultResultOps[Self <: DisableEbsEncryptionByDefaultResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEbsEncryptionByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsEncryptionByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsEncryptionByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsEncryptionByDefault")(js.undefined)
        ret
    }
  }
  
}

