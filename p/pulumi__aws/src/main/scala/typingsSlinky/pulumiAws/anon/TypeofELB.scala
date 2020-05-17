package typingsSlinky.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofELB extends js.Object {
  val Types: this.type = js.native
}

object TypeofELB {
  @scala.inline
  def apply(Types: TypeofELB): TypeofELB = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofELB]
  }
  @scala.inline
  implicit class TypeofELBOps[Self <: TypeofELB] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: TypeofELB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

