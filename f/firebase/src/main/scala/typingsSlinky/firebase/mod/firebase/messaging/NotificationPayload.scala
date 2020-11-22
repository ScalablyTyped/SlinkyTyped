package typingsSlinky.firebase.mod.firebase.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationPayload extends js.Object {
  
  /**
    * The body of a notification.
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * The URL of the image that is shown with the notification. See
    * {@link https://firebase.google.com/docs/reference/fcm/rest/v1/projects.messages#notification
    * `notification.image`} for supported image format.
    */
  var image: js.UndefOr[String] = js.native
  
  /**
    * The title of a notification.
    */
  var title: js.UndefOr[String] = js.native
}
object NotificationPayload {
  
  @scala.inline
  def apply(): NotificationPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationPayload]
  }
  
  @scala.inline
  implicit class NotificationPayloadOps[Self <: NotificationPayload] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
