package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTypedLinkFacetNamesResponse extends js.Object {
  
  /**
    * The names of typed link facets that exist within the schema.
    */
  var FacetNames: js.UndefOr[TypedLinkNameList] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
}
object ListTypedLinkFacetNamesResponse {
  
  @scala.inline
  def apply(): ListTypedLinkFacetNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypedLinkFacetNamesResponse]
  }
  
  @scala.inline
  implicit class ListTypedLinkFacetNamesResponseOps[Self <: ListTypedLinkFacetNamesResponse] (val x: Self) extends AnyVal {
    
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
    def setFacetNamesVarargs(value: TypedLinkName*): Self = this.set("FacetNames", js.Array(value :_*))
    
    @scala.inline
    def setFacetNames(value: TypedLinkNameList): Self = this.set("FacetNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetNames: Self = this.set("FacetNames", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
