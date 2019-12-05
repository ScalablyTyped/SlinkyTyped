package typingsSlinky.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteResultUpsertedIdObject extends js.Object {
  var _id: typingsSlinky.bson.bsonMod.ObjectId
  var index: scala.Double
}

object BulkWriteResultUpsertedIdObject {
  @scala.inline
  def apply(_id: typingsSlinky.bson.bsonMod.ObjectId, index: scala.Double): BulkWriteResultUpsertedIdObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BulkWriteResultUpsertedIdObject]
  }
}

