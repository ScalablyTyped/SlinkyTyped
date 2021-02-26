package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectionsFilter extends StObject {
  
  /**
    * The type of connections to return. Currently, SFTP is not supported.
    */
  var ConnectionType: js.UndefOr[typingsSlinky.awsSdk.glueMod.ConnectionType] = js.native
  
  /**
    * A criteria string that must match the criteria recorded in the connection definition for that connection definition to be returned.
    */
  var MatchCriteria: js.UndefOr[typingsSlinky.awsSdk.glueMod.MatchCriteria] = js.native
}
object GetConnectionsFilter {
  
  @scala.inline
  def apply(): GetConnectionsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionsFilter]
  }
  
  @scala.inline
  implicit class GetConnectionsFilterMutableBuilder[Self <: GetConnectionsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionType(value: ConnectionType): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTypeUndefined: Self = StObject.set(x, "ConnectionType", js.undefined)
    
    @scala.inline
    def setMatchCriteria(value: MatchCriteria): Self = StObject.set(x, "MatchCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCriteriaUndefined: Self = StObject.set(x, "MatchCriteria", js.undefined)
    
    @scala.inline
    def setMatchCriteriaVarargs(value: NameString*): Self = StObject.set(x, "MatchCriteria", js.Array(value :_*))
  }
}
