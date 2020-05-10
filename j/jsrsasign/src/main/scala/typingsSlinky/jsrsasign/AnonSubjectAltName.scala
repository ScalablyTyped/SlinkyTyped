package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSubjectAltName extends js.Object {
  var subjectAltName: ArrayParam[AnonDns] = js.native
}

object AnonSubjectAltName {
  @scala.inline
  def apply(subjectAltName: ArrayParam[AnonDns]): AnonSubjectAltName = {
    val __obj = js.Dynamic.literal(subjectAltName = subjectAltName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubjectAltName]
  }
  @scala.inline
  implicit class AnonSubjectAltNameOps[Self <: AnonSubjectAltName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubjectAltName(value: ArrayParam[AnonDns]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectAltName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

