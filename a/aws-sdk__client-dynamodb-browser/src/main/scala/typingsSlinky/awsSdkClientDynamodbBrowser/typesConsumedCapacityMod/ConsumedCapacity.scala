package typingsSlinky.awsSdkClientDynamodbBrowser.typesConsumedCapacityMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbBrowser.typesCapacityMod.Capacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumedCapacity extends js.Object {
  /**
    * <p>The total number of capacity units consumed by the operation.</p>
    */
  var CapacityUnits: js.UndefOr[Double] = js.native
  /**
    * <p>The amount of throughput consumed on each global index affected by the operation.</p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[StringDictionary[Capacity] | (js.Iterable[js.Tuple2[String, Capacity]])] = js.native
  /**
    * <p>The amount of throughput consumed on each local index affected by the operation.</p>
    */
  var LocalSecondaryIndexes: js.UndefOr[StringDictionary[Capacity] | (js.Iterable[js.Tuple2[String, Capacity]])] = js.native
  /**
    * <p>The amount of throughput consumed on the table affected by the operation.</p>
    */
  var Table: js.UndefOr[Capacity] = js.native
  /**
    * <p>The name of the table that was affected by the operation.</p>
    */
  var TableName: js.UndefOr[String] = js.native
}

object ConsumedCapacity {
  @scala.inline
  def apply(): ConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumedCapacity]
  }
  @scala.inline
  implicit class ConsumedCapacityOps[Self <: ConsumedCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalSecondaryIndexesIterable(value: js.Iterable[js.Tuple2[String, Capacity]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalSecondaryIndexes(value: StringDictionary[Capacity] | (js.Iterable[js.Tuple2[String, Capacity]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalSecondaryIndexesIterable(value: js.Iterable[js.Tuple2[String, Capacity]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalSecondaryIndexes(value: StringDictionary[Capacity] | (js.Iterable[js.Tuple2[String, Capacity]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: Capacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
        ret
    }
  }
  
}

