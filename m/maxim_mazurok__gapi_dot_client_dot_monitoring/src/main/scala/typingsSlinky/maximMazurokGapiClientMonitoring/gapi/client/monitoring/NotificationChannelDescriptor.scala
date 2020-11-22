package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationChannelDescriptor extends js.Object {
  
  /** A human-readable description of the notification channel type. The description may include a description of the properties of the channel and pointers to external documentation. */
  var description: js.UndefOr[String] = js.native
  
  /** A human-readable name for the notification channel type. This form of the name is suitable for a user interface. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The set of labels that must be defined to identify a particular channel of the corresponding type. Each label includes a description for how that field should be populated. */
  var labels: js.UndefOr[js.Array[LabelDescriptor]] = js.native
  
  /** The product launch stage for channels of this type. */
  var launchStage: js.UndefOr[String] = js.native
  
  /**
    * The full REST resource name for this descriptor. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannelDescriptors/[TYPE] In the above, [TYPE] is the value of the type
    * field.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of notification channel, such as "email" and "sms". To view the full list of channels, see Channel descriptors
    * (https://cloud.google.com/monitoring/alerts/using-channels-api#ncd). Notification channel types are globally unique.
    */
  var `type`: js.UndefOr[String] = js.native
}
object NotificationChannelDescriptor {
  
  @scala.inline
  def apply(): NotificationChannelDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationChannelDescriptor]
  }
  
  @scala.inline
  implicit class NotificationChannelDescriptorOps[Self <: NotificationChannelDescriptor] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: LabelDescriptor*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[LabelDescriptor]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLaunchStage(value: String): Self = this.set("launchStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchStage: Self = this.set("launchStage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
