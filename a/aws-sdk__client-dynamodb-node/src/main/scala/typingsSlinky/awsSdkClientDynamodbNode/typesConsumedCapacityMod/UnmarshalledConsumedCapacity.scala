package typingsSlinky.awsSdkClientDynamodbNode.typesConsumedCapacityMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbNode.typesCapacityMod.UnmarshalledCapacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledConsumedCapacity extends ConsumedCapacity {
  /**
    * <p>The amount of throughput consumed on each global index affected by the operation.</p>
    */
  @JSName("GlobalSecondaryIndexes")
  var GlobalSecondaryIndexes_UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[UnmarshalledCapacity]] = js.native
  /**
    * <p>The amount of throughput consumed on each local index affected by the operation.</p>
    */
  @JSName("LocalSecondaryIndexes")
  var LocalSecondaryIndexes_UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[UnmarshalledCapacity]] = js.native
  /**
    * <p>The amount of throughput consumed on the table affected by the operation.</p>
    */
  @JSName("Table")
  var Table_UnmarshalledConsumedCapacity: js.UndefOr[UnmarshalledCapacity] = js.native
}

object UnmarshalledConsumedCapacity {
  @scala.inline
  def apply(): UnmarshalledConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledConsumedCapacity]
  }
  @scala.inline
  implicit class UnmarshalledConsumedCapacityOps[Self <: UnmarshalledConsumedCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalSecondaryIndexes(value: StringDictionary[UnmarshalledCapacity]): Self = {
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
    def withLocalSecondaryIndexes(value: StringDictionary[UnmarshalledCapacity]): Self = {
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
    def withTable(value: UnmarshalledCapacity): Self = {
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
  }
  
}

