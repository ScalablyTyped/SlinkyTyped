package typingsSlinky.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofEC2InstanceConnect extends js.Object {
  val Types: this.type = js.native
}

object TypeofEC2InstanceConnect {
  @scala.inline
  def apply(Types: TypeofEC2InstanceConnect): TypeofEC2InstanceConnect = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofEC2InstanceConnect]
  }
  @scala.inline
  implicit class TypeofEC2InstanceConnectOps[Self <: TypeofEC2InstanceConnect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: TypeofEC2InstanceConnect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

