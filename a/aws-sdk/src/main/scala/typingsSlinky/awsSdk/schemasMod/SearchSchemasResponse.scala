package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSchemasResponse extends js.Object {
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * An array of SearchSchemaSummary information.
    */
  var Schemas: js.UndefOr[listOfSearchSchemaSummary] = js.native
}
object SearchSchemasResponse {
  
  @scala.inline
  def apply(): SearchSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSchemasResponse]
  }
  
  @scala.inline
  implicit class SearchSchemasResponseOps[Self <: SearchSchemasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: SearchSchemaSummary*): Self = this.set("Schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: listOfSearchSchemaSummary): Self = this.set("Schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemas: Self = this.set("Schemas", js.undefined)
  }
}
