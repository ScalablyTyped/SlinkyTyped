package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootDBInstanceResult extends js.Object {
  var DBInstance: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.DBInstance] = js.native
}

object RebootDBInstanceResult {
  @scala.inline
  def apply(): RebootDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootDBInstanceResult]
  }
  @scala.inline
  implicit class RebootDBInstanceResultOps[Self <: RebootDBInstanceResult] (val x: Self) extends AnyVal {
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

