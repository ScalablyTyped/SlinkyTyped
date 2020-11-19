package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationStatesRequest extends js.Object {
  
  /**
    * The configurationIds from the Application Discovery Service that uniquely identifies your applications.
    */
  var ApplicationIds: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ApplicationIds] = js.native
  
  /**
    * Maximum number of results to be returned per page.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.MaxResults] = js.native
  
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListApplicationStatesRequest {
  
  @scala.inline
  def apply(): ListApplicationStatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationStatesRequest]
  }
  
  @scala.inline
  implicit class ListApplicationStatesRequestOps[Self <: ListApplicationStatesRequest] (val x: Self) extends AnyVal {
    
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
    def setApplicationIdsVarargs(value: ApplicationId*): Self = this.set("ApplicationIds", js.Array(value :_*))
    
    @scala.inline
    def setApplicationIds(value: ApplicationIds): Self = this.set("ApplicationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationIds: Self = this.set("ApplicationIds", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
