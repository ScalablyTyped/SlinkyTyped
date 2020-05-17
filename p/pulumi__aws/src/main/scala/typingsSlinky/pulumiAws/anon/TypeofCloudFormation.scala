package typingsSlinky.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCloudFormation extends js.Object {
  val Types: this.type = js.native
}

object TypeofCloudFormation {
  @scala.inline
  def apply(Types: TypeofCloudFormation): TypeofCloudFormation = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCloudFormation]
  }
  @scala.inline
  implicit class TypeofCloudFormationOps[Self <: TypeofCloudFormation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: TypeofCloudFormation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

