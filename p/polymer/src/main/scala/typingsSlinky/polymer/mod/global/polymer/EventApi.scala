package typingsSlinky.polymer.mod.global.polymer

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventApi extends js.Object {
  var localTarget: EventTarget
  var path: js.Array[Node]
  var rootTarget: EventTarget
}

object EventApi {
  @scala.inline
  def apply(localTarget: EventTarget, path: js.Array[Node], rootTarget: EventTarget): EventApi = {
    val __obj = js.Dynamic.literal(localTarget = localTarget.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rootTarget = rootTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventApi]
  }
}

