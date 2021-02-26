package typingsSlinky.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCreatedArtifactsResult extends StObject {
  
  /**
    * List of created artifacts up to the maximum number of results specified in the request.
    */
  var CreatedArtifactList: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.CreatedArtifactList] = js.native
  
  /**
    * If there are more created artifacts than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListCreatedArtifactsResult {
  
  @scala.inline
  def apply(): ListCreatedArtifactsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreatedArtifactsResult]
  }
  
  @scala.inline
  implicit class ListCreatedArtifactsResultMutableBuilder[Self <: ListCreatedArtifactsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedArtifactList(value: CreatedArtifactList): Self = StObject.set(x, "CreatedArtifactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedArtifactListUndefined: Self = StObject.set(x, "CreatedArtifactList", js.undefined)
    
    @scala.inline
    def setCreatedArtifactListVarargs(value: CreatedArtifact*): Self = StObject.set(x, "CreatedArtifactList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
