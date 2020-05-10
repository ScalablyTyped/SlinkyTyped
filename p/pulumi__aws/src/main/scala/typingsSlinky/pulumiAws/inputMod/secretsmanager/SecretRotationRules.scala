package typingsSlinky.pulumiAws.inputMod.secretsmanager

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretRotationRules extends js.Object {
  /**
    * Specifies the number of days between automatic scheduled rotations of the secret.
    */
  var automaticallyAfterDays: Input[Double] = js.native
}

object SecretRotationRules {
  @scala.inline
  def apply(automaticallyAfterDays: Input[Double]): SecretRotationRules = {
    val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretRotationRules]
  }
  @scala.inline
  implicit class SecretRotationRulesOps[Self <: SecretRotationRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticallyAfterDays(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticallyAfterDays")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

