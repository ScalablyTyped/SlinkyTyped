package typingsSlinky.reduxLittleRouter.mod

import typingsSlinky.reduxLittleRouter.AnonOptions
import typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_BLOCK
import typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_GO
import typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_GO_BACK
import typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_GO_FORWARD
import typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_LOCATION_CHANGED
import typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_PUSH
import typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_REPLACE
import typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_REPLACE_ROUTES
import typingsSlinky.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_UNBLOCK
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
  def LocationChangedAction(payload: Location, `type`: ROUTER_LOCATION_CHANGED): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoBackAction(`type`: ROUTER_GO_BACK): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def PushAction(payload: Location, `type`: ROUTER_PUSH): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def ReplaceRoutesAction(payload: AnonOptions, `type`: ROUTER_REPLACE_ROUTES): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def UnblockAction(`type`: ROUTER_UNBLOCK): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def BlockAction(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String,
    `type`: ROUTER_BLOCK
  ): RouterActions = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction2(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoAction(payload: Double, `type`: ROUTER_GO): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def ReplaceAction(payload: Location, `type`: ROUTER_REPLACE): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoForwardAction(`type`: ROUTER_GO_FORWARD): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
}

