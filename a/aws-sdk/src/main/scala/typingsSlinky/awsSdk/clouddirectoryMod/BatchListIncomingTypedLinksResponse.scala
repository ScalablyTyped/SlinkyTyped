package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListIncomingTypedLinksResponse extends js.Object {
  
  /**
    * Returns one or more typed link specifiers as output.
    */
  var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
}
object BatchListIncomingTypedLinksResponse {
  
  @scala.inline
  def apply(): BatchListIncomingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListIncomingTypedLinksResponse]
  }
  
  @scala.inline
  implicit class BatchListIncomingTypedLinksResponseOps[Self <: BatchListIncomingTypedLinksResponse] (val x: Self) extends AnyVal {
    
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
    def setLinkSpecifiersVarargs(value: TypedLinkSpecifier*): Self = this.set("LinkSpecifiers", js.Array(value :_*))
    
    @scala.inline
    def setLinkSpecifiers(value: TypedLinkSpecifierList): Self = this.set("LinkSpecifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkSpecifiers: Self = this.set("LinkSpecifiers", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
