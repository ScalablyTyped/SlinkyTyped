package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.nodeForge.mod.asn1.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateField extends CertificateFieldOptions {
  var extensions: js.UndefOr[js.Array[_]] = js.native
  var value: js.UndefOr[js.Array[_] | String] = js.native
  var valueConstructed: js.UndefOr[Boolean] = js.native
  var valueTagClass: js.UndefOr[Class] = js.native
}

object CertificateField {
  @scala.inline
  def apply(): CertificateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateField]
  }
  @scala.inline
  implicit class CertificateFieldOps[Self <: CertificateField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueConstructed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueConstructed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueConstructed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueConstructed")(js.undefined)
        ret
    }
    @scala.inline
    def withValueTagClass(value: Class): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTagClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueTagClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTagClass")(js.undefined)
        ret
    }
  }
  
}

