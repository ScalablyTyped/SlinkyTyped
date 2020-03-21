package typingsSlinky.mongorito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongorito", "DBRef")
@js.native
class DBRef protected ()
  extends typingsSlinky.mongodb.mod.DBRef {
  /**
    * @param namespace The collection name.
    * @param oid The reference ObjectId.
    * @param db Optional db name, if omitted the reference is local to the current db
    */
  def this(namespace: String, oid: typingsSlinky.bson.mod.ObjectId) = this()
  def this(namespace: String, oid: typingsSlinky.bson.mod.ObjectId, db: String) = this()
}

