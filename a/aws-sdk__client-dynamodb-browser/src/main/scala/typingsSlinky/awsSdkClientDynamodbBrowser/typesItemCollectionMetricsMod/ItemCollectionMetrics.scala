package typingsSlinky.awsSdkClientDynamodbBrowser.typesItemCollectionMetricsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemCollectionMetrics extends js.Object {
  /**
    * <p>The partition key value of the item collection. This value is the same as the partition key value of the item.</p>
    */
  var ItemCollectionKey: js.UndefOr[
    StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
  ] = js.native
  /**
    * <p>An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit.</p> <p>The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.</p>
    */
  var SizeEstimateRangeGB: js.UndefOr[js.Array[Double] | js.Iterable[Double]] = js.native
}

object ItemCollectionMetrics {
  @scala.inline
  def apply(): ItemCollectionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemCollectionMetrics]
  }
  @scala.inline
  implicit class ItemCollectionMetricsOps[Self <: ItemCollectionMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemCollectionKeyIterable(value: js.Iterable[js.Tuple2[String, AttributeValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCollectionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemCollectionKey(value: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCollectionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCollectionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCollectionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeEstimateRangeGBIterable(value: js.Iterable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeEstimateRangeGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeEstimateRangeGB(value: js.Array[Double] | js.Iterable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeEstimateRangeGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeEstimateRangeGB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeEstimateRangeGB")(js.undefined)
        ret
    }
  }
  
}

