package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserDefinedFunctionsRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the functions to be retrieved are located. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database where the functions are located. If none is provided, functions from all the databases across the catalog will be returned.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  
  /**
    * The maximum number of functions to return in one response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * An optional function-name pattern string that filters the function definitions returned.
    */
  var Pattern: NameString = js.native
}
object GetUserDefinedFunctionsRequest {
  
  @scala.inline
  def apply(Pattern: NameString): GetUserDefinedFunctionsRequest = {
    val __obj = js.Dynamic.literal(Pattern = Pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserDefinedFunctionsRequest]
  }
  
  @scala.inline
  implicit class GetUserDefinedFunctionsRequestMutableBuilder[Self <: GetUserDefinedFunctionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPattern(value: NameString): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
  }
}
