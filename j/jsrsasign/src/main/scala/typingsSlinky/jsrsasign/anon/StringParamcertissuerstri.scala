package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.StringParam & {  certissuer ? :string,   certsubject ? :string} */
@js.native
trait StringParamcertissuerstri extends js.Object {
  var certissuer: js.UndefOr[String] = js.native
  var certsubject: js.UndefOr[String] = js.native
  var str: String = js.native
}

object StringParamcertissuerstri {
  @scala.inline
  def apply(str: String): StringParamcertissuerstri = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParamcertissuerstri]
  }
  @scala.inline
  implicit class StringParamcertissuerstriOps[Self <: StringParamcertissuerstri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("str")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertissuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certissuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertissuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certissuer")(js.undefined)
        ret
    }
    @scala.inline
    def withCertsubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certsubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertsubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certsubject")(js.undefined)
        ret
    }
  }
  
}

