package typingsSlinky.antDesignReactNative.anon

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.update
import typingsSlinky.antDesignReactNative.portalHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyType extends Operation {
  var children: TagMod[Any]
  var key: Double
  var `type`: update
}

object KeyType {
  @scala.inline
  def apply(key: Double, `type`: update, children: TagMod[Any] = null): KeyType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyType]
  }
}

