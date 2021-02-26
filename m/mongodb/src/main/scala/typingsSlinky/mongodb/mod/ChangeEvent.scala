package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.Coll
import typingsSlinky.mongodb.anon.RemovedFields
import typingsSlinky.mongodb.anon.`5`
import typingsSlinky.mongodb.mongodbStrings.delete
import typingsSlinky.mongodb.mongodbStrings.drop
import typingsSlinky.mongodb.mongodbStrings.dropDatabase
import typingsSlinky.mongodb.mongodbStrings.insert
import typingsSlinky.mongodb.mongodbStrings.invalidate
import typingsSlinky.mongodb.mongodbStrings.rename
import typingsSlinky.mongodb.mongodbStrings.replace
import typingsSlinky.mongodb.mongodbStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mod.ChangeEventCR[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventUpdate[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventDelete[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventRename[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventOther[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventInvalidate[TSchema]
*/
trait ChangeEvent[TSchema /* <: js.Object */] extends StObject
object ChangeEvent {
  
  @scala.inline
  def ChangeEventCR[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: insert | replace
  ): typingsSlinky.mongodb.mod.ChangeEventCR[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.ChangeEventCR[TSchema]]
  }
  
  @scala.inline
  def ChangeEventDelete[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: delete
  ): typingsSlinky.mongodb.mod.ChangeEventDelete[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.ChangeEventDelete[TSchema]]
  }
  
  @scala.inline
  def ChangeEventInvalidate[TSchema /* <: js.Object */](_id: ResumeToken, clusterTime: typingsSlinky.bson.mod.Timestamp, operationType: invalidate): typingsSlinky.mongodb.mod.ChangeEventInvalidate[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.ChangeEventInvalidate[TSchema]]
  }
  
  @scala.inline
  def ChangeEventOther[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    ns: Coll,
    operationType: drop | dropDatabase
  ): typingsSlinky.mongodb.mod.ChangeEventOther[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.ChangeEventOther[TSchema]]
  }
  
  @scala.inline
  def ChangeEventRename[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    ns: Coll,
    operationType: rename,
    to: Coll
  ): typingsSlinky.mongodb.mod.ChangeEventRename[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.ChangeEventRename[TSchema]]
  }
  
  @scala.inline
  def ChangeEventUpdate[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: update,
    updateDescription: RemovedFields[TSchema]
  ): typingsSlinky.mongodb.mod.ChangeEventUpdate[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], updateDescription = updateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.ChangeEventUpdate[TSchema]]
  }
}
