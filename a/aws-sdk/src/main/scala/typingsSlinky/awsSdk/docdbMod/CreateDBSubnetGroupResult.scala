package typingsSlinky.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBSubnetGroupResult extends js.Object {
  var DBSubnetGroup: js.UndefOr[typingsSlinky.awsSdk.docdbMod.DBSubnetGroup] = js.native
}

object CreateDBSubnetGroupResult {
  @scala.inline
  def apply(): CreateDBSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBSubnetGroupResult]
  }
  @scala.inline
  implicit class CreateDBSubnetGroupResultOps[Self <: CreateDBSubnetGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBSubnetGroup(value: DBSubnetGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSubnetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroup")(js.undefined)
        ret
    }
  }
  
}

