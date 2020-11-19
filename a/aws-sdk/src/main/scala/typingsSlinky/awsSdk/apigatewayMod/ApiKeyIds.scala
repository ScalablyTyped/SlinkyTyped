package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiKeyIds extends js.Object {
  
  /**
    * A list of all the ApiKey identifiers.
    */
  var ids: js.UndefOr[ListOfString] = js.native
  
  /**
    * A list of warning messages.
    */
  var warnings: js.UndefOr[ListOfString] = js.native
}
object ApiKeyIds {
  
  @scala.inline
  def apply(): ApiKeyIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeyIds]
  }
  
  @scala.inline
  implicit class ApiKeyIdsOps[Self <: ApiKeyIds] (val x: Self) extends AnyVal {
    
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
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: ListOfString): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: ListOfString): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
