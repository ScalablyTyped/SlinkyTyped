package typingsSlinky.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerAgentInfo extends StObject {
  
  /**
    * Number of active discovery agents.
    */
  var activeAgents: Integer = js.native
  
  /**
    * Number of blacklisted discovery agents.
    */
  var blackListedAgents: Integer = js.native
  
  /**
    * Number of healthy discovery agents
    */
  var healthyAgents: Integer = js.native
  
  /**
    * Number of discovery agents with status SHUTDOWN.
    */
  var shutdownAgents: Integer = js.native
  
  /**
    * Total number of discovery agents.
    */
  var totalAgents: Integer = js.native
  
  /**
    * Number of unhealthy discovery agents.
    */
  var unhealthyAgents: Integer = js.native
  
  /**
    * Number of unknown discovery agents.
    */
  var unknownAgents: Integer = js.native
}
object CustomerAgentInfo {
  
  @scala.inline
  def apply(
    activeAgents: Integer,
    blackListedAgents: Integer,
    healthyAgents: Integer,
    shutdownAgents: Integer,
    totalAgents: Integer,
    unhealthyAgents: Integer,
    unknownAgents: Integer
  ): CustomerAgentInfo = {
    val __obj = js.Dynamic.literal(activeAgents = activeAgents.asInstanceOf[js.Any], blackListedAgents = blackListedAgents.asInstanceOf[js.Any], healthyAgents = healthyAgents.asInstanceOf[js.Any], shutdownAgents = shutdownAgents.asInstanceOf[js.Any], totalAgents = totalAgents.asInstanceOf[js.Any], unhealthyAgents = unhealthyAgents.asInstanceOf[js.Any], unknownAgents = unknownAgents.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerAgentInfo]
  }
  
  @scala.inline
  implicit class CustomerAgentInfoMutableBuilder[Self <: CustomerAgentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveAgents(value: Integer): Self = StObject.set(x, "activeAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackListedAgents(value: Integer): Self = StObject.set(x, "blackListedAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthyAgents(value: Integer): Self = StObject.set(x, "healthyAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutdownAgents(value: Integer): Self = StObject.set(x, "shutdownAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAgents(value: Integer): Self = StObject.set(x, "totalAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyAgents(value: Integer): Self = StObject.set(x, "unhealthyAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownAgents(value: Integer): Self = StObject.set(x, "unknownAgents", value.asInstanceOf[js.Any])
  }
}
