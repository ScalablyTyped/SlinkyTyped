package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.mongodbStrings.invalidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventInvalidate[TSchema /* <: StringDictionary[js.Any] */] extends ChangeEvent[TSchema] {
  var _id: ResumeToken = js.native
  var clusterTime: typingsSlinky.bson.mod.Timestamp = js.native
  var operationType: invalidate = js.native
}

object ChangeEventInvalidate {
  @scala.inline
  def apply[TSchema](_id: ResumeToken, clusterTime: typingsSlinky.bson.mod.Timestamp, operationType: invalidate): ChangeEventInvalidate[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventInvalidate[TSchema]]
  }
  @scala.inline
  implicit class ChangeEventInvalidateOps[Self[tschema] <: ChangeEventInvalidate[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def with_id(value: ResumeToken): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterTime(value: typingsSlinky.bson.mod.Timestamp): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationType(value: invalidate): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

