package typingsSlinky.awsSdkClientDynamodbNode.typesPointInTimeRecoverySpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointInTimeRecoverySpecification extends js.Object {
  /**
    * <p>Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.</p>
    */
  var PointInTimeRecoveryEnabled: Boolean = js.native
}

object PointInTimeRecoverySpecification {
  @scala.inline
  def apply(PointInTimeRecoveryEnabled: Boolean): PointInTimeRecoverySpecification = {
    val __obj = js.Dynamic.literal(PointInTimeRecoveryEnabled = PointInTimeRecoveryEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoverySpecification]
  }
  @scala.inline
  implicit class PointInTimeRecoverySpecificationOps[Self <: PointInTimeRecoverySpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointInTimeRecoveryEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PointInTimeRecoveryEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

