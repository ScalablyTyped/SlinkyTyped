package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElectionsQueryRequest extends js.Object {
  
  var contextParams: js.UndefOr[ContextParams] = js.native
}
object ElectionsQueryRequest {
  
  @scala.inline
  def apply(): ElectionsQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElectionsQueryRequest]
  }
  
  @scala.inline
  implicit class ElectionsQueryRequestOps[Self <: ElectionsQueryRequest] (val x: Self) extends AnyVal {
    
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
    def setContextParams(value: ContextParams): Self = this.set("contextParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextParams: Self = this.set("contextParams", js.undefined)
  }
}
