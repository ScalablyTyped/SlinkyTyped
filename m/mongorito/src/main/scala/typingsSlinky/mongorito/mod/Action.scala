package typingsSlinky.mongorito.mod

import typingsSlinky.mongorito.anon.Args
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Action extends StObject
object Action {
  
  @scala.inline
  def CallAction(args: js.Array[Args], method: String, `type`: CALL): typingsSlinky.mongorito.mod.CallAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.CallAction]
  }
  
  @scala.inline
  def CreateAction(id: js.Object, `type`: CREATE): typingsSlinky.mongorito.mod.CreateAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.CreateAction]
  }
  
  @scala.inline
  def CreateIndexAction(args: js.Array[_], `type`: CREATE_INDEX): typingsSlinky.mongorito.mod.CreateIndexAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.CreateIndexAction]
  }
  
  @scala.inline
  def CreatedAction(id: js.Object, `type`: CREATED): typingsSlinky.mongorito.mod.CreatedAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.CreatedAction]
  }
  
  @scala.inline
  def DropIndexAction(args: js.Array[_], `type`: DROP_INDEX): typingsSlinky.mongorito.mod.DropIndexAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.DropIndexAction]
  }
  
  @scala.inline
  def GetAction(`type`: GET): typingsSlinky.mongorito.mod.GetAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.GetAction]
  }
  
  @scala.inline
  def IncrementAction(fields: js.Object, `type`: INCREMENT): typingsSlinky.mongorito.mod.IncrementAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.IncrementAction]
  }
  
  @scala.inline
  def ListIndexesAction(args: js.Array[_], `type`: LIST_INDEXES): typingsSlinky.mongorito.mod.ListIndexesAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.ListIndexesAction]
  }
  
  @scala.inline
  def QueryAction(method: String, query: js.Array[Args], `type`: QUERY): typingsSlinky.mongorito.mod.QueryAction = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.QueryAction]
  }
  
  @scala.inline
  def RefreshAction(`type`: REFRESH): typingsSlinky.mongorito.mod.RefreshAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.RefreshAction]
  }
  
  @scala.inline
  def RefreshedAction(fields: js.Object, `type`: REFRESHED): typingsSlinky.mongorito.mod.RefreshedAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.RefreshedAction]
  }
  
  @scala.inline
  def RemoveAction(`type`: REMOVE): typingsSlinky.mongorito.mod.RemoveAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.RemoveAction]
  }
  
  @scala.inline
  def RemovedAction(`type`: REMOVED): typingsSlinky.mongorito.mod.RemovedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.RemovedAction]
  }
  
  @scala.inline
  def SaveAction(fields: js.Object, `type`: SAVE): typingsSlinky.mongorito.mod.SaveAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.SaveAction]
  }
  
  @scala.inline
  def SetAction(fields: js.Object, `type`: SET): typingsSlinky.mongorito.mod.SetAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.SetAction]
  }
  
  @scala.inline
  def UnsetAction(keys: String | js.Array[String], `type`: UNSET): typingsSlinky.mongorito.mod.UnsetAction = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.UnsetAction]
  }
  
  @scala.inline
  def UpdateAction(fields: js.Object, `type`: UPDATE): typingsSlinky.mongorito.mod.UpdateAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.UpdateAction]
  }
  
  @scala.inline
  def UpdatedAction(fields: js.Object, `type`: UPDATED): typingsSlinky.mongorito.mod.UpdatedAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongorito.mod.UpdatedAction]
  }
}
