package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asn1params extends js.Object {
  var asn1params: js.UndefOr[ASN1Object] = js.native
  var name: String = js.native
  var paramempty: js.UndefOr[Boolean] = js.native
}

object Asn1params {
  @scala.inline
  def apply(name: String): Asn1params = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asn1params]
  }
  @scala.inline
  implicit class Asn1paramsOps[Self <: Asn1params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsn1params(value: ASN1Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asn1params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsn1params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asn1params")(js.undefined)
        ret
    }
    @scala.inline
    def withParamempty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramempty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamempty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramempty")(js.undefined)
        ret
    }
  }
  
}

