package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTypedLinkFacetAttributesResponse extends js.Object {
  
  /**
    * An ordered set of attributes associate with the typed link.
    */
  var Attributes: js.UndefOr[TypedLinkAttributeDefinitionList] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
}
object ListTypedLinkFacetAttributesResponse {
  
  @scala.inline
  def apply(): ListTypedLinkFacetAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypedLinkFacetAttributesResponse]
  }
  
  @scala.inline
  implicit class ListTypedLinkFacetAttributesResponseOps[Self <: ListTypedLinkFacetAttributesResponse] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: TypedLinkAttributeDefinition*): Self = this.set("Attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: TypedLinkAttributeDefinitionList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
