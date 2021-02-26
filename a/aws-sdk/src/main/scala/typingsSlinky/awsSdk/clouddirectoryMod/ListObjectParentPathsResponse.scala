package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListObjectParentPathsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * Returns the path to the ObjectIdentifiers that are associated with the directory.
    */
  var PathToObjectIdentifiersList: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.PathToObjectIdentifiersList] = js.native
}
object ListObjectParentPathsResponse {
  
  @scala.inline
  def apply(): ListObjectParentPathsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectParentPathsResponse]
  }
  
  @scala.inline
  implicit class ListObjectParentPathsResponseMutableBuilder[Self <: ListObjectParentPathsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPathToObjectIdentifiersList(value: PathToObjectIdentifiersList): Self = StObject.set(x, "PathToObjectIdentifiersList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathToObjectIdentifiersListUndefined: Self = StObject.set(x, "PathToObjectIdentifiersList", js.undefined)
    
    @scala.inline
    def setPathToObjectIdentifiersListVarargs(value: PathToObjectIdentifiers*): Self = StObject.set(x, "PathToObjectIdentifiersList", js.Array(value :_*))
  }
}
