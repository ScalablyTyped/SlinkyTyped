package typingsSlinky.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  */
@js.native
trait MultiObjectTask extends js.Object {
  var objectIDs: js.Array[String] = js.native
  var taskID: Double = js.native
}

object MultiObjectTask {
  @scala.inline
  def apply(objectIDs: js.Array[String], taskID: Double): MultiObjectTask = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiObjectTask]
  }
  @scala.inline
  implicit class MultiObjectTaskOps[Self <: MultiObjectTask] (val x: Self) extends AnyVal {
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
    def withTaskID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

