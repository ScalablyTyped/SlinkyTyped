package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshSpec extends js.Object {
  var egressFilter: js.UndefOr[MeshSpecEgressFilter] = js.native
}

object MeshSpec {
  @scala.inline
  def apply(): MeshSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshSpec]
  }
  @scala.inline
  implicit class MeshSpecOps[Self <: MeshSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEgressFilter(value: MeshSpecEgressFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egressFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgressFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egressFilter")(js.undefined)
        ret
    }
  }
  
}

