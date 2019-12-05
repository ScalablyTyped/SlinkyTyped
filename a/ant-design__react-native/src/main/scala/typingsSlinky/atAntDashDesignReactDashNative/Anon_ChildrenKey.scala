package typingsSlinky.atAntDashDesignReactDashNative

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.mount
import typingsSlinky.atAntDashDesignReactDashNative.libPortalPortalDashHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenKey extends Operation {
  var children: TagMod[Any]
  var key: Double
  var `type`: mount
}

object Anon_ChildrenKey {
  @scala.inline
  def apply(children: TagMod[Any], key: Double, `type`: mount): Anon_ChildrenKey = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenKey]
  }
}

