package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionPathValue extends js.Object {
  /** A conversion path dimension value, containing a list of interactions with their attributes. */
  var conversionPathValue: js.UndefOr[js.Array[InteractionType]] = js.native
  /** A primitive dimension value. A primitive metric value. */
  var primitiveValue: js.UndefOr[String] = js.native
}

object ConversionPathValue {
  @scala.inline
  def apply(): ConversionPathValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionPathValue]
  }
  @scala.inline
  implicit class ConversionPathValueOps[Self <: ConversionPathValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversionPathValue(value: js.Array[InteractionType]): Self = {
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

