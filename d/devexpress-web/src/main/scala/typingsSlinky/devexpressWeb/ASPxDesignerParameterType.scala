package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxDesignerParameterType extends js.Object {
  var defaultVal: js.Any = js.native
  var displayValue: String = js.native
  var specifics: String = js.native
  var value: String = js.native
  def valueConverter(`val`: js.Any): js.Any = js.native
}

object ASPxDesignerParameterType {
  @scala.inline
  def apply(
    defaultVal: js.Any,
    displayValue: String,
    specifics: String,
    value: String,
    valueConverter: js.Any => js.Any
  ): ASPxDesignerParameterType = {
    val __obj = js.Dynamic.literal(defaultVal = defaultVal.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any], specifics = specifics.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueConverter = js.Any.fromFunction1(valueConverter))
    __obj.asInstanceOf[ASPxDesignerParameterType]
  }
  @scala.inline
  implicit class ASPxDesignerParameterTypeOps[Self <: ASPxDesignerParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultVal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecifics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specifics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueConverter(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueConverter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

