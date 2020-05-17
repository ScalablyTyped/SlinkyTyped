package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.anon.Coll
import typingsSlinky.mongodb.anon.RemovedFields
import typingsSlinky.mongodb.anon.`3`
import typingsSlinky.mongodb.mongodbStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventUpdate[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  var documentKey: `3`[TSchema] = js.native
  var fullDocument: js.UndefOr[TSchema] = js.native
  var operationType: update = js.native
  var updateDescription: RemovedFields[TSchema] = js.native
}

object ChangeEventUpdate {
  @scala.inline
  def apply[TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `3`[TSchema],
    ns: Coll,
    operationType: update,
    updateDescription: RemovedFields[TSchema]
  ): ChangeEventUpdate[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], updateDescription = updateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventUpdate[TSchema]]
  }
  @scala.inline
  implicit class ChangeEventUpdateOps[Self[tschema] <: ChangeEventUpdate[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def withDocumentKey(value: `3`[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationType(value: update): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDescription(value: RemovedFields[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullDocument(value: TSchema): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullDocument: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDocument")(js.undefined)
        ret
    }
  }
  
}

