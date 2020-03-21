package typingsSlinky.angularCore

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.angularCore.mod.GlobalTargetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameGlobalTargetName extends js.Object {
  var name: GlobalTargetName
  var target: EventTarget
}

object AnonNameGlobalTargetName {
  @scala.inline
  def apply(name: GlobalTargetName, target: EventTarget): AnonNameGlobalTargetName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameGlobalTargetName]
  }
}

