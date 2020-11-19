package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends js.Object {
  
  /** The status code, which should be an enum value of google.rpc.Code. */
  var code: js.UndefOr[Double] = js.native
  
  /**
    * A list of messages that carry the error details.  There is a common set of
    * message types for APIs to use.
    */
  var details: js.UndefOr[js.Array[Record[String, _]]] = js.native
  
  /**
    * A developer-facing error message, which should be in English. Any
    * user-facing error message should be localized and sent in the
    * google.rpc.Status.details field, or localized by the client.
    */
  var message: js.UndefOr[String] = js.native
}
object Status {
  
  @scala.inline
  def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: (Record[String, js.Any])*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[Record[String, _]]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
