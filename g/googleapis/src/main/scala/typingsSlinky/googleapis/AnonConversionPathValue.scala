package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConversionPathValue extends js.Object {
  var conversionPathValue: js.UndefOr[js.Array[AnonInteractionType]] = js.native
  var primitiveValue: js.UndefOr[String] = js.native
}

object AnonConversionPathValue {
  @scala.inline
  def apply(): AnonConversionPathValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConversionPathValue]
  }
  @scala.inline
  implicit class AnonConversionPathValueOps[Self <: AnonConversionPathValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversionPathValue(value: js.Array[AnonInteractionType]): Self = {
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

