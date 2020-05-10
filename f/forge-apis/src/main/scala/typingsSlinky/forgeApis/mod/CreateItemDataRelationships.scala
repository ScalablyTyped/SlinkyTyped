package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateItemDataRelationships extends js.Object {
  var parent: js.UndefOr[CreateStorageDataRelationshipsTarget] = js.native
  var tip: js.UndefOr[CreateItemDataRelationshipsTip] = js.native
}

object CreateItemDataRelationships {
  @scala.inline
  def apply(): CreateItemDataRelationships = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateItemDataRelationships]
  }
  @scala.inline
  implicit class CreateItemDataRelationshipsOps[Self <: CreateItemDataRelationships] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: CreateStorageDataRelationshipsTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withTip(value: CreateItemDataRelationshipsTip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip")(js.undefined)
        ret
    }
  }
  
}

