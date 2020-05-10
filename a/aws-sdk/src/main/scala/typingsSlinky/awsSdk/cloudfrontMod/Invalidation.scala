package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invalidation extends js.Object {
  /**
    * The date and time the invalidation request was first made. 
    */
  var CreateTime: js.Date = js.native
  /**
    * The identifier for the invalidation request. For example: IDFDVBD632BHDS5.
    */
  var Id: String = js.native
  /**
    * The current invalidation information for the batch request. 
    */
  var InvalidationBatch: typingsSlinky.awsSdk.cloudfrontMod.InvalidationBatch = js.native
  /**
    * The status of the invalidation request. When the invalidation batch is finished, the status is Completed.
    */
  var Status: String = js.native
}

object Invalidation {
  @scala.inline
  def apply(CreateTime: js.Date, Id: String, InvalidationBatch: InvalidationBatch, Status: String): Invalidation = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InvalidationBatch = InvalidationBatch.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invalidation]
  }
  @scala.inline
  implicit class InvalidationOps[Self <: Invalidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidationBatch(value: InvalidationBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidationBatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

