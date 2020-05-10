package typingsSlinky.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChamferableBodyDefinition extends IBodyDefinition {
  var chamfer: js.UndefOr[IChamfer] = js.native
}

object IChamferableBodyDefinition {
  @scala.inline
  def apply(): IChamferableBodyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChamferableBodyDefinition]
  }
  @scala.inline
  implicit class IChamferableBodyDefinitionOps[Self <: IChamferableBodyDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChamfer(value: IChamfer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChamfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamfer")(js.undefined)
        ret
    }
  }
  
}

