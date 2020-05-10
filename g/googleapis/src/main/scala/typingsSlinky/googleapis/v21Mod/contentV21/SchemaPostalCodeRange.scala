package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPostalCodeRange extends js.Object {
  /**
    * A postal code or a pattern of the form prefix* denoting the inclusive
    * lower bound of the range defining the area. Examples values:
    * &quot;94108&quot;, &quot;9410*&quot;, &quot;9*&quot;. Required.
    */
  var postalCodeRangeBegin: js.UndefOr[String] = js.native
  /**
    * A postal code or a pattern of the form prefix* denoting the inclusive
    * upper bound of the range defining the area. It must have the same length
    * as postalCodeRangeBegin: if postalCodeRangeBegin is a postal code then
    * postalCodeRangeEnd must be a postal code too; if postalCodeRangeBegin is
    * a pattern then postalCodeRangeEnd must be a pattern with the same prefix
    * length. Optional: if not set, then the area is defined as being all the
    * postal codes matching postalCodeRangeBegin.
    */
  var postalCodeRangeEnd: js.UndefOr[String] = js.native
}

object SchemaPostalCodeRange {
  @scala.inline
  def apply(): SchemaPostalCodeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodeRange]
  }
  @scala.inline
  implicit class SchemaPostalCodeRangeOps[Self <: SchemaPostalCodeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostalCodeRangeBegin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeRangeBegin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodeRangeBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeRangeBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCodeRangeEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeRangeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodeRangeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeRangeEnd")(js.undefined)
        ret
    }
  }
  
}

