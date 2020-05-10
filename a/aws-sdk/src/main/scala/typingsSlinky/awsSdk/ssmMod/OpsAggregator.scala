package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsAggregator extends js.Object {
  /**
    * Either a Range or Count aggregator for limiting an OpsItem summary.
    */
  var AggregatorType: js.UndefOr[OpsAggregatorType] = js.native
  /**
    * A nested aggregator for viewing counts of OpsItems.
    */
  var Aggregators: js.UndefOr[OpsAggregatorList] = js.native
  /**
    * The name of an OpsItem attribute on which to limit the count of OpsItems.
    */
  var AttributeName: js.UndefOr[OpsDataAttributeName] = js.native
  /**
    * The aggregator filters.
    */
  var Filters: js.UndefOr[OpsFilterList] = js.native
  /**
    * The data type name to use for viewing counts of OpsItems.
    */
  var TypeName: js.UndefOr[OpsDataTypeName] = js.native
  /**
    * The aggregator value.
    */
  var Values: js.UndefOr[OpsAggregatorValueMap] = js.native
}

object OpsAggregator {
  @scala.inline
  def apply(): OpsAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsAggregator]
  }
  @scala.inline
  implicit class OpsAggregatorOps[Self <: OpsAggregator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatorType(value: OpsAggregatorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregatorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregatorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggregatorType")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregators(value: OpsAggregatorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregators")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeName(value: OpsDataAttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: OpsFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeName(value: OpsDataTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: OpsAggregatorValueMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(js.undefined)
        ret
    }
  }
  
}

