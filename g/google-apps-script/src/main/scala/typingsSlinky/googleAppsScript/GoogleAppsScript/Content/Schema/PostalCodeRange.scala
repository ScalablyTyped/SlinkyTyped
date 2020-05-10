package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostalCodeRange extends js.Object {
  var postalCodeRangeBegin: js.UndefOr[String] = js.native
  var postalCodeRangeEnd: js.UndefOr[String] = js.native
}

object PostalCodeRange {
  @scala.inline
  def apply(): PostalCodeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalCodeRange]
  }
  @scala.inline
  implicit class PostalCodeRangeOps[Self <: PostalCodeRange] (val x: Self) extends AnyVal {
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

