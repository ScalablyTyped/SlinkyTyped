package typingsSlinky.googleapis.resellerV1Mod.resellerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for resellernotify getwatchdetails response.
  */
@js.native
trait SchemaResellernotifyGetwatchdetailsResponse extends js.Object {
  
  /**
    * List of registered service accounts.
    */
  var serviceAccountEmailAddresses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Topic name of the PubSub
    */
  var topicName: js.UndefOr[String] = js.native
}
object SchemaResellernotifyGetwatchdetailsResponse {
  
  @scala.inline
  def apply(): SchemaResellernotifyGetwatchdetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResellernotifyGetwatchdetailsResponse]
  }
  
  @scala.inline
  implicit class SchemaResellernotifyGetwatchdetailsResponseOps[Self <: SchemaResellernotifyGetwatchdetailsResponse] (val x: Self) extends AnyVal {
    
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
    def setServiceAccountEmailAddressesVarargs(value: String*): Self = this.set("serviceAccountEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setServiceAccountEmailAddresses(value: js.Array[String]): Self = this.set("serviceAccountEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountEmailAddresses: Self = this.set("serviceAccountEmailAddresses", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
  }
}
