package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.anon.Coll
import typingsSlinky.mongodb.anon.RemovedFields
import typingsSlinky.mongodb.anon.`5`
import typingsSlinky.mongodb.mongodbStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEventUpdate[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  
  var documentKey: `5`[TSchema] = js.native
  
  var fullDocument: js.UndefOr[TSchema] = js.native
  
  var operationType: update = js.native
  
  var updateDescription: RemovedFields[TSchema] = js.native
}
object ChangeEventUpdate {
  
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: update,
    updateDescription: RemovedFields[TSchema]
  ): ChangeEventUpdate[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], updateDescription = updateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventUpdate[TSchema]]
  }
  
  @scala.inline
  implicit class ChangeEventUpdateOps[Self <: ChangeEventUpdate[_], TSchema /* <: StringDictionary[js.Any] */] (val x: Self with ChangeEventUpdate[TSchema]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocumentKey(value: `5`[TSchema]): Self = this.set("documentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationType(value: update): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDescription(value: RemovedFields[TSchema]): Self = this.set("updateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDocument(value: TSchema): Self = this.set("fullDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullDocument: Self = this.set("fullDocument", js.undefined)
  }
}
