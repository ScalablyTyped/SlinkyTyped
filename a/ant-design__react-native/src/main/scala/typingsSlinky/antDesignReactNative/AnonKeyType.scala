package typingsSlinky.antDesignReactNative

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.update
import typingsSlinky.antDesignReactNative.portalHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyType extends Operation {
  var children: TagMod[Any]
  var key: Double
  var `type`: update
}

object AnonKeyType {
  @scala.inline
  def apply(children: TagMod[Any], key: Double, `type`: update): AnonKeyType = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyType]
  }
}

