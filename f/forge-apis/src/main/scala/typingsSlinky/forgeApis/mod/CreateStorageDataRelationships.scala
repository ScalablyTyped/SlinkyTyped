package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStorageDataRelationships extends js.Object {
  var target: js.UndefOr[CreateStorageDataRelationshipsTarget] = js.native
}

object CreateStorageDataRelationships {
  @scala.inline
  def apply(): CreateStorageDataRelationships = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorageDataRelationships]
  }
  @scala.inline
  implicit class CreateStorageDataRelationshipsOps[Self <: CreateStorageDataRelationships] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: CreateStorageDataRelationshipsTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

