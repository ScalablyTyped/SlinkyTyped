package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters to the transform
  */
@js.native
trait StructureMapGroupRuleTargetParameter extends BackboneElement {
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueId'.
    */
  var _valueId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  /**
    * Parameter value - variable or literal
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Parameter value - variable or literal
    */
  var valueDecimal: js.UndefOr[decimal] = js.native
  /**
    * Parameter value - variable or literal
    */
  var valueId: js.UndefOr[id] = js.native
  /**
    * Parameter value - variable or literal
    */
  var valueInteger: js.UndefOr[integer] = js.native
  /**
    * Parameter value - variable or literal
    */
  var valueString: js.UndefOr[String] = js.native
}

object StructureMapGroupRuleTargetParameter {
  @scala.inline
  def apply(): StructureMapGroupRuleTargetParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructureMapGroupRuleTargetParameter]
  }
  @scala.inline
  implicit class StructureMapGroupRuleTargetParameterOps[Self <: StructureMapGroupRuleTargetParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_valueBoolean(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueDecimal(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueId")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueInteger(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueInteger")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueString")(js.undefined)
        ret
    }
    @scala.inline
    def withValueBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDecimal(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withValueId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueId")(js.undefined)
        ret
    }
    @scala.inline
    def withValueInteger(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInteger")(js.undefined)
        ret
    }
    @scala.inline
    def withValueString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(js.undefined)
        ret
    }
  }
  
}

