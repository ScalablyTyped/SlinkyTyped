package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventTypesRequest extends js.Object {
  
  /**
    * The maximum number of objects to return for the request.
    */
  var maxResults: js.UndefOr[eventTypesMaxResults] = js.native
  
  /**
    * The name.
    */
  var name: js.UndefOr[identifier] = js.native
  
  /**
    * The next token for the subsequent request.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object GetEventTypesRequest {
  
  @scala.inline
  def apply(): GetEventTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventTypesRequest]
  }
  
  @scala.inline
  implicit class GetEventTypesRequestOps[Self <: GetEventTypesRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: eventTypesMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setName(value: identifier): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
