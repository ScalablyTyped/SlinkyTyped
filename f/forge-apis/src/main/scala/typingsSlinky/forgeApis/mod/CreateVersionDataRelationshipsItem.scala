package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVersionDataRelationshipsItem extends js.Object {
  var data: js.UndefOr[CreateVersionDataRelationshipsItemData] = js.native
}

object CreateVersionDataRelationshipsItem {
  @scala.inline
  def apply(): CreateVersionDataRelationshipsItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVersionDataRelationshipsItem]
  }
  @scala.inline
  implicit class CreateVersionDataRelationshipsItemOps[Self <: CreateVersionDataRelationshipsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: CreateVersionDataRelationshipsItemData): Self = {
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

