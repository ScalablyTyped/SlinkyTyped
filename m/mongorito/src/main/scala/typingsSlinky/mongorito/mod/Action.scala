package typingsSlinky.mongorito.mod

import typingsSlinky.mongorito.AnonArgs
import typingsSlinky.mongorito.mod.ActionTypes.CALL
import typingsSlinky.mongorito.mod.ActionTypes.CREATE
import typingsSlinky.mongorito.mod.ActionTypes.CREATED
import typingsSlinky.mongorito.mod.ActionTypes.CREATE_INDEX
import typingsSlinky.mongorito.mod.ActionTypes.DROP_INDEX
import typingsSlinky.mongorito.mod.ActionTypes.GET
import typingsSlinky.mongorito.mod.ActionTypes.INCREMENT
import typingsSlinky.mongorito.mod.ActionTypes.LIST_INDEXES
import typingsSlinky.mongorito.mod.ActionTypes.QUERY
import typingsSlinky.mongorito.mod.ActionTypes.REFRESH
import typingsSlinky.mongorito.mod.ActionTypes.REFRESHED
import typingsSlinky.mongorito.mod.ActionTypes.REMOVE
import typingsSlinky.mongorito.mod.ActionTypes.REMOVED
import typingsSlinky.mongorito.mod.ActionTypes.SAVE
import typingsSlinky.mongorito.mod.ActionTypes.SET
import typingsSlinky.mongorito.mod.ActionTypes.UNSET
import typingsSlinky.mongorito.mod.ActionTypes.UPDATE
import typingsSlinky.mongorito.mod.ActionTypes.UPDATED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongorito.mod.GetAction
  - typingsSlinky.mongorito.mod.SetAction
  - typingsSlinky.mongorito.mod.UnsetAction
  - typingsSlinky.mongorito.mod.RefreshAction
  - typingsSlinky.mongorito.mod.RefreshedAction
  - typingsSlinky.mongorito.mod.SaveAction
  - typingsSlinky.mongorito.mod.CreateAction
  - typingsSlinky.mongorito.mod.CreatedAction
  - typingsSlinky.mongorito.mod.UpdateAction
  - typingsSlinky.mongorito.mod.UpdatedAction
  - typingsSlinky.mongorito.mod.RemoveAction
  - typingsSlinky.mongorito.mod.RemovedAction
  - typingsSlinky.mongorito.mod.IncrementAction
  - typingsSlinky.mongorito.mod.CreateIndexAction
  - typingsSlinky.mongorito.mod.DropIndexAction
  - typingsSlinky.mongorito.mod.ListIndexesAction
  - typingsSlinky.mongorito.mod.QueryAction
  - typingsSlinky.mongorito.mod.CallAction
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def UpdatedAction(fields: js.Object, `type`: UPDATED): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def UnsetAction(keys: String | js.Array[String], `type`: UNSET): Action = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RefreshedAction(fields: js.Object, `type`: REFRESHED): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RemoveAction(`type`: REMOVE): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RemovedAction(`type`: REMOVED): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CreatedAction(id: js.Object, `type`: CREATED): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def DropIndexAction(args: js.Array[_], `type`: DROP_INDEX): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CallAction(args: js.Array[AnonArgs], method: String, `type`: CALL): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def GetAction(`type`: GET): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RefreshAction(`type`: REFRESH): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def SaveAction(fields: js.Object, `type`: SAVE): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def UpdateAction(fields: js.Object, `type`: UPDATE): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CreateAction(id: js.Object, `type`: CREATE): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def IncrementAction(fields: js.Object, `type`: INCREMENT): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def ListIndexesAction(args: js.Array[_], `type`: LIST_INDEXES): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def QueryAction(method: String, query: js.Array[AnonArgs], `type`: QUERY): Action = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CreateIndexAction(args: js.Array[_], `type`: CREATE_INDEX): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def SetAction(fields: js.Object, `type`: SET): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

