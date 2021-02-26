package typingsSlinky.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConnectionsOutput extends StObject {
  
  /**
    * A list of connections and the details for each connection, such as status, owner, and provider type.
    */
  var Connections: js.UndefOr[ConnectionList] = js.native
  
  /**
    * A token that can be used in the next ListConnections call. To view all items in the list, continue to call this operation with each subsequent token until no more nextToken values are returned.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.NextToken] = js.native
}
object ListConnectionsOutput {
  
  @scala.inline
  def apply(): ListConnectionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsOutput]
  }
  
  @scala.inline
  implicit class ListConnectionsOutputMutableBuilder[Self <: ListConnectionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: ConnectionList): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "Connections", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
