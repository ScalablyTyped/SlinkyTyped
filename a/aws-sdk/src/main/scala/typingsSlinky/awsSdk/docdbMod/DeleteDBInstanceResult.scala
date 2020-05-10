package typingsSlinky.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBInstanceResult extends js.Object {
  var DBInstance: js.UndefOr[typingsSlinky.awsSdk.docdbMod.DBInstance] = js.native
}

object DeleteDBInstanceResult {
  @scala.inline
  def apply(): DeleteDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBInstanceResult]
  }
  @scala.inline
  implicit class DeleteDBInstanceResultOps[Self <: DeleteDBInstanceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBInstance(value: DBInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstance")(js.undefined)
        ret
    }
  }
  
}

