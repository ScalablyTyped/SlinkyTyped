package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductViewAggregationValue extends js.Object {
  /**
    * An approximate count of the products that match the value.
    */
  var ApproximateCount: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ApproximateCount] = js.native
  /**
    * The value of the product view aggregation.
    */
  var Value: js.UndefOr[AttributeValue] = js.native
}

object ProductViewAggregationValue {
  @scala.inline
  def apply(): ProductViewAggregationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewAggregationValue]
  }
  @scala.inline
  implicit class ProductViewAggregationValueOps[Self <: ProductViewAggregationValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproximateCount(value: ApproximateCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproximateCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateCount")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: AttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

