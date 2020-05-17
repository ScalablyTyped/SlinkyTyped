package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubjectAltName extends js.Object {
  var subjectAltName: ArrayParam[Dns] = js.native
}

object SubjectAltName {
  @scala.inline
  def apply(subjectAltName: ArrayParam[Dns]): SubjectAltName = {
    val __obj = js.Dynamic.literal(subjectAltName = subjectAltName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAltName]
  }
  @scala.inline
  implicit class SubjectAltNameOps[Self <: SubjectAltName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubjectAltName(value: ArrayParam[Dns]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectAltName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

