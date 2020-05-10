package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxMeasure
  *
  * Note: Either qDef or qLibraryId must be set, but not both.
  * Note: If the measure is set in the hypercube and not in the library, this measure cannot be shared with other objects.
  * Note: A measure that is set in the library can be used by many objects.
  * Note: expressions are complementary expressions associated to a measure.
  *
  * For example, you can decide to change the background color of a visualization depending on the values of the measure.
  * Attribute expressions do not affect the layout of an object. The sorting order is unchanged.
  */
@js.native
trait INxMeasure extends js.Object {
  /**
    * List of attribute dimensions.
    */
  var qAttributeDimensions: js.UndefOr[js.Array[INxAttrDimDef]] = js.native
  /**
    * List of attribute expressions.
    */
  var qAttributeExpressions: js.UndefOr[js.Array[INxAttrExprDef]] = js.native
  /**
    * Specifies a calculation condition, which must be fulfilled for the measure to be calculated.
    * If the calculation condition is not met, the measure is excluded from the calculation.
    * This property is optional. By default, there is no calculation condition.
    */
  var qCalcCond: js.UndefOr[IValueExpr] = js.native
  /**
    * Refers to a measure stored in the hypercube.
    */
  var qDef: INxInlineMeasureDef = js.native
  /**
    * Refers to a measure stored in the library.
    */
  var qLibraryId: js.UndefOr[String] = js.native
  /**
    * Defines the sort criteria.
    * This property is optional. The default value is sort by ascending alphabetic order.
    */
  var qSortBy: js.UndefOr[ISortCriteria] = js.native
}

object INxMeasure {
  @scala.inline
  def apply(qDef: INxInlineMeasureDef): INxMeasure = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMeasure]
  }
  @scala.inline
  implicit class INxMeasureOps[Self <: INxMeasure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDef(value: INxInlineMeasureDef): Self = {
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
    def withQSortBy(value: ISortCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortBy")(js.undefined)
        ret
    }
  }
  
}

