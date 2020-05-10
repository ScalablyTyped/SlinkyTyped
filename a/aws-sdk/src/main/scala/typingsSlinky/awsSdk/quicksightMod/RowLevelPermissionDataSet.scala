package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowLevelPermissionDataSet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the permission dataset.
    */
  var Arn: typingsSlinky.awsSdk.quicksightMod.Arn = js.native
  /**
    * Permission policy.
    */
  var PermissionPolicy: RowLevelPermissionPolicy = js.native
}

object RowLevelPermissionDataSet {
  @scala.inline
  def apply(Arn: Arn, PermissionPolicy: RowLevelPermissionPolicy): RowLevelPermissionDataSet = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], PermissionPolicy = PermissionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowLevelPermissionDataSet]
  }
  @scala.inline
  implicit class RowLevelPermissionDataSetOps[Self <: RowLevelPermissionDataSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissionPolicy(value: RowLevelPermissionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

