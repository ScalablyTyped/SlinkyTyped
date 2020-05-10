package typingsSlinky.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailOptions extends js.Object {
  /**
    * Numerical threshold at which an email address is considered invalid
    */
  var errorLevel: js.UndefOr[Double | Boolean] = js.native
  /**
    * Number of atoms required for the domain. Be careful since some domains, such as io, directly allow email.
    */
  var minDomainAtoms: js.UndefOr[Double] = js.native
  /**
    * Specifies a list of acceptable TLDs.
    */
  var tldWhitelist: js.UndefOr[js.Array[String] | js.Object] = js.native
}

object EmailOptions {
  @scala.inline
  def apply(): EmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOptions]
  }
  @scala.inline
  implicit class EmailOptionsOps[Self <: EmailOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorLevel(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDomainAtoms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDomainAtoms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDomainAtoms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDomainAtoms")(js.undefined)
        ret
    }
    @scala.inline
    def withTldWhitelist(value: js.Array[String] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tldWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTldWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tldWhitelist")(js.undefined)
        ret
    }
  }
  
}

