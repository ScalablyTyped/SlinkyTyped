package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.mongodbStrings.invalidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventInvalidate[TSchema /* <: StringDictionary[js.Any] */] extends ChangeEvent[TSchema] {
  var _id: ResumeToken
  var clusterTime: typingsSlinky.bson.mod.Timestamp
  var operationType: invalidate
}

object ChangeEventInvalidate {
  @scala.inline
  def apply[TSchema](_id: ResumeToken, clusterTime: typingsSlinky.bson.mod.Timestamp, operationType: invalidate): ChangeEventInvalidate[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventInvalidate[TSchema]]
  }
}

