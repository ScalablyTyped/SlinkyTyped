package typingsSlinky.antDesignReactNative.portalHostMod

import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.mount
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.unmount
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antDesignReactNative.anon.ChildrenKey
  - typingsSlinky.antDesignReactNative.anon.KeyType
  - typingsSlinky.antDesignReactNative.anon.KeyNumber
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  def ChildrenKey(key: Double, `type`: mount): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def KeyType(key: Double, `type`: update): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def KeyNumber(key: Double, `type`: unmount): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

