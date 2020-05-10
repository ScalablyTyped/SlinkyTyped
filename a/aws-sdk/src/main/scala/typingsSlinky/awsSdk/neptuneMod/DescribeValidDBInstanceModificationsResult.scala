package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeValidDBInstanceModificationsResult extends js.Object {
  var ValidDBInstanceModificationsMessage: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.ValidDBInstanceModificationsMessage] = js.native
}

object DescribeValidDBInstanceModificationsResult {
  @scala.inline
  def apply(): DescribeValidDBInstanceModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeValidDBInstanceModificationsResult]
  }
  @scala.inline
  implicit class DescribeValidDBInstanceModificationsResultOps[Self <: DescribeValidDBInstanceModificationsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidDBInstanceModificationsMessage(value: ValidDBInstanceModificationsMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidDBInstanceModificationsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidDBInstanceModificationsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidDBInstanceModificationsMessage")(js.undefined)
        ret
    }
  }
  
}

