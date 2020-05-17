package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vcard extends js.Object {
  /** The street address of the entity. */
  var adr: js.UndefOr[VcardAddress] = js.native
  /** An email address that can be used to reach the contact. */
  var email: js.UndefOr[VcardTypedText] = js.native
  /** The full name of the contact person. For example: John A. Smith. */
  var fn: js.UndefOr[String] = js.native
  /** The organization associated with the registering entity. */
  @JSName("org")
  var org_ : js.UndefOr[VcardTypedText] = js.native
  /** A telephone number that can be used to call the contact. */
  var tel: js.UndefOr[VcardTelephone] = js.native
}

object Vcard {
  @scala.inline
  def apply(): Vcard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vcard]
  }
  @scala.inline
  implicit class VcardOps[Self <: Vcard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdr(value: VcardAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adr")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: VcardTypedText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.undefined)
        ret
    }
    @scala.inline
    def withOrg_(value: VcardTypedText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrg_ : Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(js.undefined)
        ret
    }
    @scala.inline
    def withTel(value: VcardTelephone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tel")(js.undefined)
        ret
    }
  }
  
}

