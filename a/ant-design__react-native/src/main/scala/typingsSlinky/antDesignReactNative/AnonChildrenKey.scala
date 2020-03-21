package typingsSlinky.antDesignReactNative

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.mount
import typingsSlinky.antDesignReactNative.portalHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenKey extends Operation {
  var children: TagMod[Any]
  var key: Double
  var `type`: mount
}

object AnonChildrenKey {
  @scala.inline
  def apply(children: TagMod[Any], key: Double, `type`: mount): AnonChildrenKey = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenKey]
  }
}

