package typingsSlinky.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VertexRequest extends js.Object {
  var p: js.Any = js.native
  var u: String = js.native
}

object VertexRequest {
  @scala.inline
  def apply(p: js.Any, u: String): VertexRequest = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexRequest]
  }
  @scala.inline
  implicit class VertexRequestOps[Self <: VertexRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withP(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

