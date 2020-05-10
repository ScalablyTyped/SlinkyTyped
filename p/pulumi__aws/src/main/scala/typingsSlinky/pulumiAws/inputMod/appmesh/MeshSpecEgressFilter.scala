package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshSpecEgressFilter extends js.Object {
  /**
    * The egress filter type. By default, the type is `DROP_ALL`.
    * Valid values are `ALLOW_ALL` and `DROP_ALL`.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object MeshSpecEgressFilter {
  @scala.inline
  def apply(): MeshSpecEgressFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshSpecEgressFilter]
  }
  @scala.inline
  implicit class MeshSpecEgressFilterOps[Self <: MeshSpecEgressFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

