package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ClientIPConfig represents the configurations of Client IP based session affinity.
  */
@js.native
trait ClientIPConfig extends StObject {
  
  /**
    * timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).
    */
  var timeoutSeconds: Double = js.native
}
object ClientIPConfig {
  
  @scala.inline
  def apply(timeoutSeconds: Double): ClientIPConfig = {
    val __obj = js.Dynamic.literal(timeoutSeconds = timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientIPConfig]
  }
  
  @scala.inline
  implicit class ClientIPConfigMutableBuilder[Self <: ClientIPConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
  }
}
