package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentManagedActionsResult extends js.Object {
  /**
    * A list of upcoming and in-progress managed actions.
    */
  var ManagedActions: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ManagedActions] = js.native
}

object DescribeEnvironmentManagedActionsResult {
  @scala.inline
  def apply(): DescribeEnvironmentManagedActionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentManagedActionsResult]
  }
  @scala.inline
  implicit class DescribeEnvironmentManagedActionsResultOps[Self <: DescribeEnvironmentManagedActionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManagedActions(value: ManagedActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedActions")(js.undefined)
        ret
    }
  }
  
}

