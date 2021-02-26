package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserDefinedFunctionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the function to be updated is located. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database where the function to be updated is located.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A FunctionInput object that redefines the function in the Data Catalog.
    */
  var FunctionInput: UserDefinedFunctionInput = js.native
  
  /**
    * The name of the function.
    */
  var FunctionName: NameString = js.native
}
object UpdateUserDefinedFunctionRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, FunctionInput: UserDefinedFunctionInput, FunctionName: NameString): UpdateUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionInput = FunctionInput.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserDefinedFunctionRequest]
  }
  
  @scala.inline
  implicit class UpdateUserDefinedFunctionRequestMutableBuilder[Self <: UpdateUserDefinedFunctionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionInput(value: UserDefinedFunctionInput): Self = StObject.set(x, "FunctionInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionName(value: NameString): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
  }
}
