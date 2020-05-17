package typingsSlinky.activexLibreoffice.com_.sun.star.security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** struct contains a single entry within a Subject Alternative Name Extension of a X509 certificate. */
@js.native
trait CertAltNameEntry extends js.Object {
  /**
    * defines the type of the value . With this information you can determine how to interprete the Any value.
    * @see com.sun.star.security.ExtAltNameType
    */
  var Type: ExtAltNameType = js.native
  /** stores the value of entry. */
  var Value: js.Any = js.native
}

object CertAltNameEntry {
  @scala.inline
  def apply(Type: ExtAltNameType, Value: js.Any): CertAltNameEntry = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertAltNameEntry]
  }
  @scala.inline
  implicit class CertAltNameEntryOps[Self <: CertAltNameEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ExtAltNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

