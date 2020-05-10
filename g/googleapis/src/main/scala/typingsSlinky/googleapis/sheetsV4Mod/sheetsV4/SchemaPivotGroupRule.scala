package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An optional setting on a PivotGroup that defines buckets for the values in
  * the source data column rather than breaking out each individual value. Only
  * one PivotGroup with a group rule may be added for each column in the source
  * data, though on any given column you may add both a PivotGroup that has a
  * rule and a PivotGroup that does not.
  */
@js.native
trait SchemaPivotGroupRule extends js.Object {
  /**
    * A DateTimeRule.
    */
  var dateTimeRule: js.UndefOr[SchemaDateTimeRule] = js.native
  /**
    * A HistogramRule.
    */
  var histogramRule: js.UndefOr[SchemaHistogramRule] = js.native
  /**
    * A ManualRule.
    */
  var manualRule: js.UndefOr[SchemaManualRule] = js.native
}

object SchemaPivotGroupRule {
  @scala.inline
  def apply(): SchemaPivotGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotGroupRule]
  }
  @scala.inline
  implicit class SchemaPivotGroupRuleOps[Self <: SchemaPivotGroupRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTimeRule(value: SchemaDateTimeRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRule")(js.undefined)
        ret
    }
    @scala.inline
    def withHistogramRule(value: SchemaHistogramRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogramRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistogramRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogramRule")(js.undefined)
        ret
    }
    @scala.inline
    def withManualRule(value: SchemaManualRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRule")(js.undefined)
        ret
    }
  }
  
}

