package typingsSlinky.dojo.dojox.validate.regexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/regexp.ca.html
  *
  *
  */
@js.native
trait ca extends js.Object {
  /**
    * String regular Express to match Canadain Postal Codes
    *
    */
  def postalCode(): String = js.native
  /**
    * a regular expression to match Canadian Province Abbreviations
    *
    */
  def province(): String = js.native
}

object ca {
  @scala.inline
  def apply(postalCode: () => String, province: () => String): ca = {
    val __obj = js.Dynamic.literal(postalCode = js.Any.fromFunction0(postalCode), province = js.Any.fromFunction0(province))
    __obj.asInstanceOf[ca]
  }
  @scala.inline
  implicit class caOps[Self <: ca] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostalCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProvince(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

