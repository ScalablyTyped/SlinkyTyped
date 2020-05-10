package typingsSlinky.reduxLittleRouter.mod

import typingsSlinky.reduxLittleRouter.AnonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait RouterActions extends js.Object

object RouterActions {
  @scala.inline
  def LocationChangedAction(payload: Location, `type`: /* "ROUTER_LOCATION_CHANGED" */ String): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoBackAction(`type`: /* "ROUTER_GO_BACK" */ String): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def PushAction(payload: Location, `type`: /* "ROUTER_PUSH" */ String): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def ReplaceRoutesAction(payload: AnonOptions, `type`: /* "ROUTER_REPLACE_ROUTES" */ String): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def UnblockAction(`type`: /* "ROUTER_UNBLOCK" */ String): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def BlockAction(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String,
    `type`: /* "ROUTER_BLOCK" */ String
  ): RouterActions = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction2(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoAction(payload: Double, `type`: /* "ROUTER_GO" */ String): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def ReplaceAction(payload: Location, `type`: /* "ROUTER_REPLACE" */ String): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoForwardAction(`type`: /* "ROUTER_GO_FORWARD" */ String): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
}

