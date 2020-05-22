package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.Coll
import typingsSlinky.mongodb.anon.RemovedFields
import typingsSlinky.mongodb.anon.Uid
import typingsSlinky.mongodb.anon.`3`
import typingsSlinky.mongodb.mongodbStrings.delete
import typingsSlinky.mongodb.mongodbStrings.drop
import typingsSlinky.mongodb.mongodbStrings.dropDatabase
import typingsSlinky.mongodb.mongodbStrings.insert
import typingsSlinky.mongodb.mongodbStrings.invalidate
import typingsSlinky.mongodb.mongodbStrings.rename
import typingsSlinky.mongodb.mongodbStrings.replace
import typingsSlinky.mongodb.mongodbStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mod.ChangeEventCR[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventUpdate[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventDelete[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventRename[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventOther[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventInvalidate[TSchema]
*/
trait ChangeEvent[TSchema /* <: js.Object */] extends js.Object

object ChangeEvent {
  @scala.inline
  def ChangeEventOther[TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    ns: Coll,
    operationType: drop | dropDatabase,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventRename[TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    ns: Coll,
    operationType: rename,
    to: Coll,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventCR[TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `3`[TSchema],
    ns: Coll,
    operationType: insert | replace,
    fullDocument: TSchema = null,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (fullDocument != null) __obj.updateDynamic("fullDocument")(fullDocument.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventDelete[TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `3`[TSchema],
    ns: Coll,
    operationType: delete,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventUpdate[TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `3`[TSchema],
    ns: Coll,
    operationType: update,
    updateDescription: RemovedFields[TSchema],
    fullDocument: TSchema = null,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], updateDescription = updateDescription.asInstanceOf[js.Any])
    if (fullDocument != null) __obj.updateDynamic("fullDocument")(fullDocument.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventInvalidate[TSchema](_id: ResumeToken, clusterTime: typingsSlinky.bson.mod.Timestamp, operationType: invalidate): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
}

