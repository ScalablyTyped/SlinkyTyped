package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumanLoopActivationConfig extends StObject {
  
  /**
    * Container structure for defining under what conditions SageMaker creates a human loop.
    */
  var HumanLoopActivationConditionsConfig: typingsSlinky.awsSdk.sagemakerMod.HumanLoopActivationConditionsConfig = js.native
}
object HumanLoopActivationConfig {
  
  @scala.inline
  def apply(HumanLoopActivationConditionsConfig: HumanLoopActivationConditionsConfig): HumanLoopActivationConfig = {
    val __obj = js.Dynamic.literal(HumanLoopActivationConditionsConfig = HumanLoopActivationConditionsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopActivationConfig]
  }
  
  @scala.inline
  implicit class HumanLoopActivationConfigMutableBuilder[Self <: HumanLoopActivationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanLoopActivationConditionsConfig(value: HumanLoopActivationConditionsConfig): Self = StObject.set(x, "HumanLoopActivationConditionsConfig", value.asInstanceOf[js.Any])
  }
}
