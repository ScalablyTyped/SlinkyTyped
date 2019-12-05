package typingsSlinky.atAntDashDesignReactDashNative

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.update
import typingsSlinky.atAntDashDesignReactDashNative.libPortalPortalDashHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenKeyType extends Operation {
  var children: TagMod[Any]
  var key: Double
  var `type`: update
}

object Anon_ChildrenKeyType {
  @scala.inline
  def apply(children: TagMod[Any], key: Double, `type`: update): Anon_ChildrenKeyType = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenKeyType]
  }
}

