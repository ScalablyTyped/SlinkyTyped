package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDimension
  *
  * Note: Either qDef or qLibraryId must be set, but not both.
  * Note: If the dimension is set in the hypercube and not in the library, this dimension cannot be shared with other objects.
  * Note: A dimension that is set in the library can be used by many objects.
  */
@js.native
trait INxDimension extends js.Object {
  /**
    * List of attribute dimensions.
    */
  var qAttributeDimensions: js.UndefOr[js.Array[INxAttrDimDef]] = js.native
  /**
    * List of attribute expressions.
    */
  var qAttributeExpressions: js.UndefOr[js.Array[INxAttrExprDef]] = js.native
  /**
    * Specifies a calculation condition, which must be fulfilled for the dimension to be calculated.
    * If the calculation condition is not met, the dimension is excluded from the calculation.
    * This property is optional. By default, there is no calculation condition.
    */
  var qCalcCond: js.UndefOr[IValueExpr] = js.native
  /**
    * Refers to a dimension stored in the hypercube.
    */
  var qDef: INxInlineDimensionDef = js.native
  /**
    * no / empty docu
    */
  var qIncludeElemValue: js.UndefOr[Boolean] = js.native
  /**
    * Refers to a dimension stored in the library.
    */
  var qLibraryId: js.UndefOr[String] = js.native
  /**
    * If set to true, no null values are returned.
    */
  var qNullSuppression: js.UndefOr[Boolean] = js.native
  /**
    * This property is used when some dimension limits are set.
    * Label of the Others group. The default label is Others.
    * Example:
    * "qOtherLabel":"=<label>"
    *               or
    * "qOtherLabel":{"qExpr":"=<label>"}
    *               Where
    * <label> is the label of the Others group.
    */
  var qOtherLabel: js.UndefOr[IStringExpressionContainer] = js.native
  /**
    * Sets the dimension limits. Each dimension of a hypercube is configured separately.
    * Defines if some values (grouped as Others) should be grouped together in the visualization.
    * For example in a pie chart all values lower than 200 could be grouped together.
    */
  var qOtherTotalSpec: js.UndefOr[IOtherTotalSpecProp] = js.native
  /**
    * If set to true, all dimension values are shown.
    */
  var qShowAll: js.UndefOr[Boolean] = js.native
   // ?Nicht in Doku
  /**
    * no / empty docu
    */
  var qShowTotal: js.UndefOr[Boolean] = js.native
  /**
    * If this property is set, the total of the calculated values is returned.
    * The default label is Total.
    * Example:
    * "qTotalLabel":"=<label>"
    *               or
    * "qTotalLabel":{"qExpr":"=<label>"}
    *               Where
    * <label> is the label of the Totalgroup.
    */
  var qTotalLabel: js.UndefOr[IStringExpressionContainer] = js.native
}

object INxDimension {
  @scala.inline
  def apply(qDef: INxInlineDimensionDef): INxDimension = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDimension]
  }
  @scala.inline
  implicit class INxDimensionOps[Self <: INxDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDef(value: INxInlineDimensionDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAttributeDimensions(value: js.Array[INxAttrDimDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttributeDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQAttributeDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttributeDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withQAttributeExpressions(value: js.Array[INxAttrExprDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttributeExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQAttributeExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttributeExpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withQCalcCond(value: IValueExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCalcCond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQCalcCond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCalcCond")(js.undefined)
        ret
    }
    @scala.inline
    def withQIncludeElemValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIncludeElemValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIncludeElemValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIncludeElemValue")(js.undefined)
        ret
    }
    @scala.inline
    def withQLibraryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLibraryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQLibraryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLibraryId")(js.undefined)
        ret
    }
    @scala.inline
    def withQNullSuppression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNullSuppression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQNullSuppression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNullSuppression")(js.undefined)
        ret
    }
    @scala.inline
    def withQOtherLabel(value: IStringExpressionContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQOtherLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withQOtherTotalSpec(value: IOtherTotalSpecProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherTotalSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQOtherTotalSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherTotalSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withQShowAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQShowAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowAll")(js.undefined)
        ret
    }
    @scala.inline
    def withQShowTotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQShowTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withQTotalLabel(value: IStringExpressionContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTotalLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQTotalLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTotalLabel")(js.undefined)
        ret
    }
  }
  
}

