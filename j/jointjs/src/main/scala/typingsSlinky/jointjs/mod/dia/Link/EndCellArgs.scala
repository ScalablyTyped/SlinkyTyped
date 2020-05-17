package typingsSlinky.jointjs.mod.dia.Link

import typingsSlinky.jointjs.mod.anchors.AnchorJSON
import typingsSlinky.jointjs.mod.connectionPoints.ConnectionPointJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndCellArgs extends js.Object {
  var anchor: js.UndefOr[AnchorJSON] = js.native
  var connectionPoint: js.UndefOr[ConnectionPointJSON] = js.native
  var magnet: js.UndefOr[String] = js.native
  var port: js.UndefOr[String] = js.native
  var priority: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[String] = js.native
}

object EndCellArgs {
  @scala.inline
  def apply(): EndCellArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndCellArgs]
  }
  @scala.inline
  implicit class EndCellArgsOps[Self <: EndCellArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: AnchorJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionPoint(value: ConnectionPointJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMagnet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagnet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnet")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

