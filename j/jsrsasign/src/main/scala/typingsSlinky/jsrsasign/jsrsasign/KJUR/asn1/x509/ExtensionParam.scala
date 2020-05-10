package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionParam extends js.Object {
  var accessLocation: UriParam = js.native
  var accessMethod: ObjectIdentifierParam = js.native
}

object ExtensionParam {
  @scala.inline
  def apply(accessLocation: UriParam, accessMethod: ObjectIdentifierParam): ExtensionParam = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation.asInstanceOf[js.Any], accessMethod = accessMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionParam]
  }
  @scala.inline
  implicit class ExtensionParamOps[Self <: ExtensionParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessLocation(value: UriParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessMethod(value: ObjectIdentifierParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessMethod")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

