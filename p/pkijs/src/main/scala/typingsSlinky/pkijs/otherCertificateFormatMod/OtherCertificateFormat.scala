package typingsSlinky.pkijs.otherCertificateFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherCertificateFormat extends js.Object {
  var otherCert: js.Any = js.native
  var otherCertFormat: String = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object OtherCertificateFormat {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    otherCert: js.Any,
    otherCertFormat: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherCertificateFormat = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), otherCert = otherCert.asInstanceOf[js.Any], otherCertFormat = otherCertFormat.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OtherCertificateFormat]
  }
  @scala.inline
  implicit class OtherCertificateFormatOps[Self <: OtherCertificateFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOtherCert(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherCertFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherCertFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

