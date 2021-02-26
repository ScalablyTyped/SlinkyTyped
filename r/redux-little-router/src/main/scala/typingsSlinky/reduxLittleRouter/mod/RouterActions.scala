package typingsSlinky.reduxLittleRouter.mod

import typingsSlinky.reduxLittleRouter.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxLittleRouter.mod.LocationChangedAction
  - typingsSlinky.reduxLittleRouter.mod.PushAction
  - typingsSlinky.reduxLittleRouter.mod.ReplaceAction
  - typingsSlinky.reduxLittleRouter.mod.GoAction
  - typingsSlinky.reduxLittleRouter.mod.GoBackAction
  - typingsSlinky.reduxLittleRouter.mod.GoForwardAction
  - typingsSlinky.reduxLittleRouter.mod.BlockAction
  - typingsSlinky.reduxLittleRouter.mod.UnblockAction
  - typingsSlinky.reduxLittleRouter.mod.ReplaceRoutesAction
*/
trait RouterActions extends StObject
object RouterActions {
  
  @scala.inline
  def BlockAction(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String,
    `type`: /* "ROUTER_BLOCK" */ String
  ): typingsSlinky.reduxLittleRouter.mod.BlockAction = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction2(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reduxLittleRouter.mod.BlockAction]
  }
  
  @scala.inline
  def GoAction(payload: Double, `type`: /* "ROUTER_GO" */ String): typingsSlinky.reduxLittleRouter.mod.GoAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reduxLittleRouter.mod.GoAction]
  }
  
  @scala.inline
  def GoBackAction(`type`: /* "ROUTER_GO_BACK" */ String): typingsSlinky.reduxLittleRouter.mod.GoBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reduxLittleRouter.mod.GoBackAction]
  }
  
  @scala.inline
  def GoForwardAction(`type`: /* "ROUTER_GO_FORWARD" */ String): typingsSlinky.reduxLittleRouter.mod.GoForwardAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reduxLittleRouter.mod.GoForwardAction]
  }
  
  @scala.inline
  def LocationChangedAction(payload: Location, `type`: /* "ROUTER_LOCATION_CHANGED" */ String): typingsSlinky.reduxLittleRouter.mod.LocationChangedAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reduxLittleRouter.mod.LocationChangedAction]
  }
  
  @scala.inline
  def PushAction(payload: Location, `type`: /* "ROUTER_PUSH" */ String): typingsSlinky.reduxLittleRouter.mod.PushAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reduxLittleRouter.mod.PushAction]
  }
  
  @scala.inline
  def ReplaceAction(payload: Location, `type`: /* "ROUTER_REPLACE" */ String): typingsSlinky.reduxLittleRouter.mod.ReplaceAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reduxLittleRouter.mod.ReplaceAction]
  }
  
  @scala.inline
  def ReplaceRoutesAction(payload: Options, `type`: /* "ROUTER_REPLACE_ROUTES" */ String): typingsSlinky.reduxLittleRouter.mod.ReplaceRoutesAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reduxLittleRouter.mod.ReplaceRoutesAction]
  }
  
  @scala.inline
  def UnblockAction(`type`: /* "ROUTER_UNBLOCK" */ String): typingsSlinky.reduxLittleRouter.mod.UnblockAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reduxLittleRouter.mod.UnblockAction]
  }
}
