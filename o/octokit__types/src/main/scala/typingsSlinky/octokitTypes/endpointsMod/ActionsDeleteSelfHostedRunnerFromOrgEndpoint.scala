package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsDeleteSelfHostedRunnerFromOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * Unique identifier of the self-hosted runner.
    */
  var runner_id: Double = js.native
}
object ActionsDeleteSelfHostedRunnerFromOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, runner_id: Double): ActionsDeleteSelfHostedRunnerFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(runner_id = runner_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteSelfHostedRunnerFromOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsDeleteSelfHostedRunnerFromOrgEndpointMutableBuilder[Self <: ActionsDeleteSelfHostedRunnerFromOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
