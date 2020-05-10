package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrinterContact extends js.Object {
  var `contact-name`: js.UndefOr[String] = js.native
  var `contact-uri`: js.UndefOr[String] = js.native
  var `contact-vcard`: js.UndefOr[js.Array[String]] = js.native
}

object PrinterContact {
  @scala.inline
  def apply(): PrinterContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterContact]
  }
  @scala.inline
  implicit class PrinterContactOps[Self <: PrinterContact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withContact-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContact-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withContact-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContact-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withContact-vcard`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact-vcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContact-vcard`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact-vcard")(js.undefined)
        ret
    }
  }
  
}

