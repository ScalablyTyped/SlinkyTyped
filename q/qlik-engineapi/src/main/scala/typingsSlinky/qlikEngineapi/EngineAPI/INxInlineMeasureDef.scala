package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxInlineMeasureDef...
  */
@js.native
trait INxInlineMeasureDef extends js.Object {
  /**
    * - 0 means no accumulation
    * - 1 means full accumulation (each y-value accumulates all previous y-values of the expression)
    * - = 2 means accumulate as many steps as the qAccumulate value
    * >> This parameter is optional.
    * >> Default is 0.
    */
  var qAccumulate: js.UndefOr[Double] = js.native
  /**
    * Index of the active expression in a cyclic measure. The indexing starts from 0.
    * This parameter is optional.
    * >> The default value is 0.
    */
  var qActiveExpression: js.UndefOr[Double] = js.native
  /**
    * Aggregate function.
    * For more information on the aggregate function syntax, see the section Working with Qlik Sense
    * on the online help portal.
    * The default value is 0 (Sum of rows)
    * >> This parameter is optional.
    */
  var qAggrFunc: js.UndefOr[String] = js.native
  /**
    * If set to true, the sum of rows total should be used rather than real expression total.
    * This parameter is optional and applies to straight tables.
    * If using the Qlik Sense interface, it means that the total mode is set to Expression Total.
    * >> Default is false.
    */
  var qBrutalSum: js.UndefOr[Boolean] = js.native
  /**
    * Definition of the expression in the measure.
    * Example: Sum (OrderTotal)
    * >> This parameter is mandatory.
    */
  var qDef: String = js.native
  /**
    * Description of the measure.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qDescription: js.UndefOr[String] = js.native
  /**
    * Array of expressions. This parameter is used in case of cyclic measures (qGrouping is C).
    * List of the expressions in the cyclic group.
    */
  var qExpressions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Default value is no grouping.
    * >> This parameter is optional.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.native
  /**
    * Name of the measure.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qLabel: js.UndefOr[String] = js.native
  /**
    * Label expression.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qLabelExpression: js.UndefOr[String] = js.native
  /**
    * Format of the field.
    * >> This parameter is optional.
    */
  var qNumFormat: js.UndefOr[IFieldAttributes] = js.native
  /**
    * If set to true, percentage values are returned instead of absolute numbers.
    * >> This parameter is optional.
    * >> Default is false.
    */
  var qRelative: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: js.UndefOr[Boolean] = js.native
  /**
    * Name connected to the measure that is used for search purposes.
    * >> This parameter is optional.
    * A measure can have several tags.
    */
  var qTags: js.UndefOr[js.Array[String]] = js.native
}

object INxInlineMeasureDef {
  @scala.inline
  def apply(qDef: String): INxInlineMeasureDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxInlineMeasureDef]
  }
  @scala.inline
  implicit class INxInlineMeasureDefOps[Self <: INxInlineMeasureDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAccumulate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAccumulate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQAccumulate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAccumulate")(js.undefined)
        ret
    }
    @scala.inline
    def withQActiveExpression(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qActiveExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQActiveExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qActiveExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withQAggrFunc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAggrFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQAggrFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAggrFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withQBrutalSum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBrutalSum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQBrutalSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBrutalSum")(js.undefined)
        ret
    }
    @scala.inline
    def withQDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withQExpressions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withQGrouping(value: NxGrpType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withQLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withQLabelExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLabelExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQLabelExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLabelExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withQNumFormat(value: IFieldAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQNumFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withQRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRelative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRelative")(js.undefined)
        ret
    }
    @scala.inline
    def withQReverseSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReverseSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQReverseSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReverseSort")(js.undefined)
        ret
    }
    @scala.inline
    def withQTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTags")(js.undefined)
        ret
    }
  }
  
}

