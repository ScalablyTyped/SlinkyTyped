package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.anon.Coll
import typingsSlinky.mongodb.mongodbStrings.rename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventRename[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  var operationType: rename = js.native
  var to: Coll = js.native
}

object ChangeEventRename {
  @scala.inline
  def apply[TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    ns: Coll,
    operationType: rename,
    to: Coll
  ): ChangeEventRename[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventRename[TSchema]]
  }
  @scala.inline
  implicit class ChangeEventRenameOps[Self[tschema] <: ChangeEventRename[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def withOperationType(value: rename): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Coll): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

