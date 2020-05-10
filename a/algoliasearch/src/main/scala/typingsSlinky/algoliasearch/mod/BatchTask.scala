package typingsSlinky.algoliasearch.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  */
@js.native
trait BatchTask extends js.Object {
  var objectIDs: js.Array[String] = js.native
  var taskID: Record[String, Double] = js.native
}

object BatchTask {
  @scala.inline
  def apply(objectIDs: js.Array[String], taskID: Record[String, Double]): BatchTask = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchTask]
  }
  @scala.inline
  implicit class BatchTaskOps[Self <: BatchTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectIDs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskID(value: Record[String, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

