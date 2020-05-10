package typingsSlinky.awsLambda.dynamodbStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBStreamEvent extends js.Object {
  var Records: js.Array[DynamoDBRecord] = js.native
}

object DynamoDBStreamEvent {
  @scala.inline
  def apply(Records: js.Array[DynamoDBRecord]): DynamoDBStreamEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBStreamEvent]
  }
  @scala.inline
  implicit class DynamoDBStreamEventOps[Self <: DynamoDBStreamEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecords(value: js.Array[DynamoDBRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

