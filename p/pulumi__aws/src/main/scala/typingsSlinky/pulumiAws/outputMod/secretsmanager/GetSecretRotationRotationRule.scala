package typingsSlinky.pulumiAws.outputMod.secretsmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecretRotationRotationRule extends js.Object {
  
  var automaticallyAfterDays: Double = js.native
}
object GetSecretRotationRotationRule {
  
  @scala.inline
  def apply(automaticallyAfterDays: Double): GetSecretRotationRotationRule = {
    val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretRotationRotationRule]
  }
  
  @scala.inline
  implicit class GetSecretRotationRotationRuleOps[Self <: GetSecretRotationRotationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutomaticallyAfterDays(value: Double): Self = this.set("automaticallyAfterDays", value.asInstanceOf[js.Any])
  }
}
