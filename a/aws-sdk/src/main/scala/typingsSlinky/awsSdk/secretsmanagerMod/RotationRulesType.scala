package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotationRulesType extends js.Object {
  /**
    * Specifies the number of days between automatic scheduled rotations of the secret. Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards the top of the hour and influenced by a variety of factors that help distribute load.
    */
  var AutomaticallyAfterDays: js.UndefOr[AutomaticallyRotateAfterDaysType] = js.native
}

object RotationRulesType {
  @scala.inline
  def apply(): RotationRulesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationRulesType]
  }
  @scala.inline
  implicit class RotationRulesTypeOps[Self <: RotationRulesType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticallyAfterDays(value: AutomaticallyRotateAfterDaysType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticallyAfterDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticallyAfterDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticallyAfterDays")(js.undefined)
        ret
    }
  }
  
}

