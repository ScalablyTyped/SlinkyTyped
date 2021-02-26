package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SessionAffinityConfig represents the configurations of session affinity.
  */
@js.native
trait SessionAffinityConfig extends StObject {
  
  /**
    * clientIP contains the configurations of Client IP based session affinity.
    */
  var clientIP: js.UndefOr[Input[ClientIPConfig]] = js.native
}
object SessionAffinityConfig {
  
  @scala.inline
  def apply(): SessionAffinityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionAffinityConfig]
  }
  
  @scala.inline
  implicit class SessionAffinityConfigMutableBuilder[Self <: SessionAffinityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientIP(value: Input[ClientIPConfig]): Self = StObject.set(x, "clientIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIPUndefined: Self = StObject.set(x, "clientIP", js.undefined)
  }
}
