package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.anon.Coll
import typingsSlinky.mongodb.anon.`5`
import typingsSlinky.mongodb.mongodbStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEventDelete[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  
  var documentKey: `5`[TSchema] = js.native
  
  var operationType: delete = js.native
}
object ChangeEventDelete {
  
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: delete
  ): ChangeEventDelete[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventDelete[TSchema]]
  }
  
  @scala.inline
  implicit class ChangeEventDeleteOps[Self <: ChangeEventDelete[_], TSchema /* <: StringDictionary[js.Any] */] (val x: Self with ChangeEventDelete[TSchema]) extends AnyVal {
    
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
    def setOperationType(value: delete): Self = this.set("operationType", value.asInstanceOf[js.Any])
  }
}
