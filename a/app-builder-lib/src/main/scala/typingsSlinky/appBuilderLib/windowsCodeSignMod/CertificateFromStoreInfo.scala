package typingsSlinky.appBuilderLib.windowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateFromStoreInfo extends js.Object {
  var isLocalMachineStore: Boolean = js.native
  var store: String = js.native
  var subject: String = js.native
  var thumbprint: String = js.native
}

object CertificateFromStoreInfo {
  @scala.inline
  def apply(isLocalMachineStore: Boolean, store: String, subject: String, thumbprint: String): CertificateFromStoreInfo = {
    val __obj = js.Dynamic.literal(isLocalMachineStore = isLocalMachineStore.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateFromStoreInfo]
  }
  @scala.inline
  implicit class CertificateFromStoreInfoOps[Self <: CertificateFromStoreInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLocalMachineStore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocalMachineStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbprint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

