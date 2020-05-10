package typingsSlinky.grommet.diagramMod

import typingsSlinky.grommet.AnonAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramProps extends js.Object {
  var connections: js.Array[AnonAnchor] = js.native
}

object DiagramProps {
  @scala.inline
  def apply(connections: js.Array[AnonAnchor]): DiagramProps = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramProps]
  }
  @scala.inline
  implicit class DiagramPropsOps[Self <: DiagramProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnections(value: js.Array[AnonAnchor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

