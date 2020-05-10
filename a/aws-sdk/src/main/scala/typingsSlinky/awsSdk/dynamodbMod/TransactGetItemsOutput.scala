package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactGetItemsOutput extends js.Object {
  /**
    * If the ReturnConsumedCapacity value was TOTAL, this is an array of ConsumedCapacity objects, one for each table addressed by TransactGetItem objects in the TransactItems parameter. These ConsumedCapacity objects report the read-capacity units consumed by the TransactGetItems call in that table.
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.native
  /**
    * An ordered array of up to 25 ItemResponse objects, each of which corresponds to the TransactGetItem object in the same position in the TransactItems array. Each ItemResponse object contains a Map of the name-value pairs that are the projected attributes of the requested item. If a requested item could not be retrieved, the corresponding ItemResponse object is Null, or if the requested item has no projected attributes, the corresponding ItemResponse object is an empty Map. 
    */
  var Responses: js.UndefOr[ItemResponseList] = js.native
}

object TransactGetItemsOutput {
  @scala.inline
  def apply(): TransactGetItemsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactGetItemsOutput]
  }
  @scala.inline
  implicit class TransactGetItemsOutputOps[Self <: TransactGetItemsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumedCapacity(value: ConsumedCapacityMultiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumedCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withResponses(value: ItemResponseList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Responses")(js.undefined)
        ret
    }
  }
  
}

