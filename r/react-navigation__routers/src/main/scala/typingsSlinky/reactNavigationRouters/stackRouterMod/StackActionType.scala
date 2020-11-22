package typingsSlinky.reactNavigationRouters.stackRouterMod

import typingsSlinky.reactNavigationRouters.anon.Count
import typingsSlinky.reactNavigationRouters.anon.Name
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.POP
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.POP_TO_TOP
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.PUSH
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.REPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigationRouters.anon.PayloadSource
  - typingsSlinky.reactNavigationRouters.anon.TargetType
  - typingsSlinky.reactNavigationRouters.anon.PayloadSourceTarget
  - typingsSlinky.reactNavigationRouters.anon.SourceTargetType
*/
trait StackActionType extends js.Object
object StackActionType {
  
  @scala.inline
  def PayloadSource(payload: Name, `type`: REPLACE): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def TargetType(payload: Name, `type`: PUSH): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def PayloadSourceTarget(payload: Count, `type`: POP): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def SourceTargetType(`type`: POP_TO_TOP): StackActionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
}
