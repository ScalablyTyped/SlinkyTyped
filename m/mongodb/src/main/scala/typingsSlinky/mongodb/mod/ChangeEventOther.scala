package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.anon.Coll
import typingsSlinky.mongodb.mongodbStrings.drop
import typingsSlinky.mongodb.mongodbStrings.dropDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventOther[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  var operationType: drop | dropDatabase = js.native
}

object ChangeEventOther {
  @scala.inline
  def apply[TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    ns: Coll,
    operationType: drop | dropDatabase
  ): ChangeEventOther[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventOther[TSchema]]
  }
  @scala.inline
  implicit class ChangeEventOtherOps[Self[tschema] <: ChangeEventOther[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def withOperationType(value: drop | dropDatabase): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

