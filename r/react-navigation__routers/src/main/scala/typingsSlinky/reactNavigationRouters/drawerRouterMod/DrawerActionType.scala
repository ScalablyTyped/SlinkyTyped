package typingsSlinky.reactNavigationRouters.drawerRouterMod

import typingsSlinky.reactNavigationRouters.anon.NameParams
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.CLOSE_DRAWER
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.JUMP_TO
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.OPEN_DRAWER
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.TOGGLE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigationRouters.tabRouterMod.TabActionType
  - typingsSlinky.reactNavigationRouters.anon.SourceTarget
*/
trait DrawerActionType extends js.Object
object DrawerActionType {
  
  @scala.inline
  def TabActionType(payload: NameParams, `type`: JUMP_TO): DrawerActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerActionType]
  }
  
  @scala.inline
  def SourceTarget(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): DrawerActionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerActionType]
  }
}
