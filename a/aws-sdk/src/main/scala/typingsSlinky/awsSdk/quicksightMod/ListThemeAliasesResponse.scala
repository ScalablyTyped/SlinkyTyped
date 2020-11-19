package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThemeAliasesResponse extends js.Object {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  
  /**
    * A structure containing the list of the theme's aliases.
    */
  var ThemeAliasList: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ThemeAliasList] = js.native
}
object ListThemeAliasesResponse {
  
  @scala.inline
  def apply(): ListThemeAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThemeAliasesResponse]
  }
  
  @scala.inline
  implicit class ListThemeAliasesResponseOps[Self <: ListThemeAliasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setThemeAliasListVarargs(value: ThemeAlias*): Self = this.set("ThemeAliasList", js.Array(value :_*))
    
    @scala.inline
    def setThemeAliasList(value: ThemeAliasList): Self = this.set("ThemeAliasList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeAliasList: Self = this.set("ThemeAliasList", js.undefined)
  }
}
