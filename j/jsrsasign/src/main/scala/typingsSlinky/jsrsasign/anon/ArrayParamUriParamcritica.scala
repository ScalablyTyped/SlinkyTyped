package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.ArrayParam<jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam> & {  critical ? :boolean} */
@js.native
trait ArrayParamUriParamcritica extends js.Object {
  var array: js.Array[UriParam] = js.native
  var critical: js.UndefOr[Boolean] = js.native
}

object ArrayParamUriParamcritica {
  @scala.inline
  def apply(array: js.Array[UriParam]): ArrayParamUriParamcritica = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayParamUriParamcritica]
  }
  @scala.inline
  implicit class ArrayParamUriParamcriticaOps[Self <: ArrayParamUriParamcritica] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: js.Array[UriParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCritical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(js.undefined)
        ret
    }
  }
  
}

