package typingsSlinky.antDesignReactNative.anon

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.mount
import typingsSlinky.antDesignReactNative.portalHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenKey extends Operation {
  var children: TagMod[Any]
  var key: Double
  var `type`: mount
}

object ChildrenKey {
  @scala.inline
  def apply(key: Double, `type`: mount, children: TagMod[Any] = null): ChildrenKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenKey]
  }
}

