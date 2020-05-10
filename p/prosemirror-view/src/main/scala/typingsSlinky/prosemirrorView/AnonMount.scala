package typingsSlinky.prosemirrorView

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMount extends js.Object {
  var mount: Node = js.native
}

object AnonMount {
  @scala.inline
  def apply(mount: Node): AnonMount = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMount]
  }
  @scala.inline
  implicit class AnonMountOps[Self <: AnonMount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMount(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

