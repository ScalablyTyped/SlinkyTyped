package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListObjectParentPathsResponse extends js.Object {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * Returns the path to the ObjectIdentifiers that are associated with the directory.
    */
  var PathToObjectIdentifiersList: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.PathToObjectIdentifiersList] = js.native
}
object BatchListObjectParentPathsResponse {
  
  @scala.inline
  def apply(): BatchListObjectParentPathsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListObjectParentPathsResponse]
  }
  
  @scala.inline
  implicit class BatchListObjectParentPathsResponseOps[Self <: BatchListObjectParentPathsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPathToObjectIdentifiersListVarargs(value: PathToObjectIdentifiers*): Self = this.set("PathToObjectIdentifiersList", js.Array(value :_*))
    
    @scala.inline
    def setPathToObjectIdentifiersList(value: PathToObjectIdentifiersList): Self = this.set("PathToObjectIdentifiersList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathToObjectIdentifiersList: Self = this.set("PathToObjectIdentifiersList", js.undefined)
  }
}
