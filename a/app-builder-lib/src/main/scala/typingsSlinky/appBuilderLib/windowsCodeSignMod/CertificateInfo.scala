package typingsSlinky.appBuilderLib.windowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateInfo extends js.Object {
  val bloodyMicrosoftSubjectDn: String = js.native
  val commonName: String = js.native
}

object CertificateInfo {
  @scala.inline
  def apply(bloodyMicrosoftSubjectDn: String, commonName: String): CertificateInfo = {
    val __obj = js.Dynamic.literal(bloodyMicrosoftSubjectDn = bloodyMicrosoftSubjectDn.asInstanceOf[js.Any], commonName = commonName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
  @scala.inline
  implicit class CertificateInfoOps[Self <: CertificateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBloodyMicrosoftSubjectDn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bloodyMicrosoftSubjectDn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

