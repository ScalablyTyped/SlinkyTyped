package typingsSlinky.atAntDashDesignReactDashNative.libPortalPortalDashHostMod

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.mount
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.unmount
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAntDashDesignReactDashNative.Anon_ChildrenKey
  - typings.atAntDashDesignReactDashNative.Anon_ChildrenKeyType
  - typings.atAntDashDesignReactDashNative.Anon_KeyType
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  def Anon_ChildrenKey(children: TagMod[Any], key: Double, `type`: mount): Operation = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def Anon_ChildrenKeyType(children: TagMod[Any], key: Double, `type`: update): Operation = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def Anon_KeyType(key: Double, `type`: unmount): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

