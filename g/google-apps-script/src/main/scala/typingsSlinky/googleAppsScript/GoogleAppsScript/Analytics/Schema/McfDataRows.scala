package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait McfDataRows extends js.Object {
  var conversionPathValue: js.UndefOr[js.Array[McfDataRowsConversionPathValue]] = js.native
  var primitiveValue: js.UndefOr[String] = js.native
}

object McfDataRows {
  @scala.inline
  def apply(): McfDataRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[McfDataRows]
  }
  @scala.inline
  implicit class McfDataRowsOps[Self <: McfDataRows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversionPathValue(value: js.Array[McfDataRowsConversionPathValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionPathValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionPathValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionPathValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimitiveValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitiveValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimitiveValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitiveValue")(js.undefined)
        ret
    }
  }
  
}

