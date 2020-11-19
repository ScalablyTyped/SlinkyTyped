package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConnectionResponse extends js.Object {
  
  /**
    * The connection that is being deleted.
    */
  var Connection: js.UndefOr[typingsSlinky.awsSdk.dmsMod.Connection] = js.native
}
object DeleteConnectionResponse {
  
  @scala.inline
  def apply(): DeleteConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConnectionResponse]
  }
  
  @scala.inline
  implicit class DeleteConnectionResponseOps[Self <: DeleteConnectionResponse] (val x: Self) extends AnyVal {
    
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
    def setConnection(value: Connection): Self = this.set("Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("Connection", js.undefined)
  }
}
