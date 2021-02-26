package typingsSlinky.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAgentVersionsResult extends StObject {
  
  /**
    * The agent versions for the specified stack or configuration manager. Note that this value is the complete version number, not the abbreviated number used by the console.
    */
  var AgentVersions: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.AgentVersions] = js.native
}
object DescribeAgentVersionsResult {
  
  @scala.inline
  def apply(): DescribeAgentVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentVersionsResult]
  }
  
  @scala.inline
  implicit class DescribeAgentVersionsResultMutableBuilder[Self <: DescribeAgentVersionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentVersions(value: AgentVersions): Self = StObject.set(x, "AgentVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentVersionsUndefined: Self = StObject.set(x, "AgentVersions", js.undefined)
    
    @scala.inline
    def setAgentVersionsVarargs(value: AgentVersion*): Self = StObject.set(x, "AgentVersions", js.Array(value :_*))
  }
}
