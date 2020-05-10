package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateItemDataRelationshipsTip extends js.Object {
  var data: js.UndefOr[CreateItemDataRelationshipsTipData] = js.native
}

object CreateItemDataRelationshipsTip {
  @scala.inline
  def apply(): CreateItemDataRelationshipsTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateItemDataRelationshipsTip]
  }
  @scala.inline
  implicit class CreateItemDataRelationshipsTipOps[Self <: CreateItemDataRelationshipsTip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: CreateItemDataRelationshipsTipData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

