package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.Anon3
import typingsSlinky.mongodb.AnonColl
import typingsSlinky.mongodb.mongodbStrings.insert
import typingsSlinky.mongodb.mongodbStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventCR[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  var documentKey: Anon3[TSchema] = js.native
  var fullDocument: js.UndefOr[TSchema] = js.native
  var operationType: insert | replace = js.native
}

object ChangeEventCR {
  @scala.inline
  def apply[TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: Anon3[TSchema],
    ns: AnonColl,
    operationType: insert | replace
  ): ChangeEventCR[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventCR[TSchema]]
  }
  @scala.inline
  implicit class ChangeEventCROps[Self[tschema] <: ChangeEventCR[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def withDocumentKey(value: Anon3[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationType(value: insert | replace): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
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

