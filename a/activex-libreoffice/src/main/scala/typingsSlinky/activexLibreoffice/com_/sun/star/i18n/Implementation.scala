package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link Implementation} name details returned in a sequence by {@link XLocaleData.getCollatorImplementations()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait Implementation extends js.Object {
  var isDefault: Boolean = js.native
  var unoID: String = js.native
}

object Implementation {
  @scala.inline
  def apply(isDefault: Boolean, unoID: String): Implementation = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], unoID = unoID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Implementation]
  }
  @scala.inline
  implicit class ImplementationOps[Self <: Implementation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnoID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unoID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

