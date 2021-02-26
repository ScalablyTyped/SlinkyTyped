package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.GET
import typingsSlinky.octokitTypes.octokitTypesStrings.`SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashbranches-where-head`
import typingsSlinky.octokitTypes.requestHeadersMod.RequestHeaders
import typingsSlinky.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposListBranchesForHeadCommitRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: GET = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: `SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashbranches-where-head` = js.native
}
object ReposListBranchesForHeadCommitRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: GET,
    request: RequestRequestOptions,
    url: `SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashbranches-where-head`
  ): ReposListBranchesForHeadCommitRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListBranchesForHeadCommitRequestOptions]
  }
  
  @scala.inline
  implicit class ReposListBranchesForHeadCommitRequestOptionsMutableBuilder[Self <: ReposListBranchesForHeadCommitRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: `SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashbranches-where-head`
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
