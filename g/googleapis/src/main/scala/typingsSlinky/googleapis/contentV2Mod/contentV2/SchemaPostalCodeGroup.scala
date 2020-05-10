package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPostalCodeGroup extends js.Object {
  /**
    * The CLDR territory code of the country the postal code group applies to.
    * Required.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The name of the postal code group, referred to in headers. Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A range of postal codes. Required.
    */
  var postalCodeRanges: js.UndefOr[js.Array[SchemaPostalCodeRange]] = js.native
}

object SchemaPostalCodeGroup {
  @scala.inline
  def apply(): SchemaPostalCodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodeGroup]
  }
  @scala.inline
  implicit class SchemaPostalCodeGroupOps[Self <: SchemaPostalCodeGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCodeRanges(value: js.Array[SchemaPostalCodeRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodeRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeRanges")(js.undefined)
        ret
    }
  }
  
}

