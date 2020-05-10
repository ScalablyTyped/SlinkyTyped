package typingsSlinky.polymer.mod._Global_.polymer

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventApi extends js.Object {
  var localTarget: EventTarget = js.native
  var path: js.Array[Node] = js.native
  var rootTarget: EventTarget = js.native
}

object EventApi {
  @scala.inline
  def apply(localTarget: EventTarget, path: js.Array[Node], rootTarget: EventTarget): EventApi = {
    val __obj = js.Dynamic.literal(localTarget = localTarget.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rootTarget = rootTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventApi]
  }
  @scala.inline
  implicit class EventApiOps[Self <: EventApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootTarget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

