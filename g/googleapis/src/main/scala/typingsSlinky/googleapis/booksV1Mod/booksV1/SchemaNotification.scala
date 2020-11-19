package typingsSlinky.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNotification extends js.Object {
  
  var body: js.UndefOr[String] = js.native
  
  /**
    * The list of crm experiment ids.
    */
  var crmExperimentIds: js.UndefOr[js.Array[String]] = js.native
  
  var doc_id: js.UndefOr[String] = js.native
  
  var doc_type: js.UndefOr[String] = js.native
  
  var dont_show_notification: js.UndefOr[Boolean] = js.native
  
  var iconUrl: js.UndefOr[String] = js.native
  
  var is_document_mature: js.UndefOr[Boolean] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  
  var notificationGroup: js.UndefOr[String] = js.native
  
  var notification_type: js.UndefOr[String] = js.native
  
  var pcampaign_id: js.UndefOr[String] = js.native
  
  var reason: js.UndefOr[String] = js.native
  
  var show_notification_settings_action: js.UndefOr[Boolean] = js.native
  
  var targetUrl: js.UndefOr[String] = js.native
  
  var timeToExpireMs: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SchemaNotification {
  
  @scala.inline
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  @scala.inline
  implicit class SchemaNotificationOps[Self <: SchemaNotification] (val x: Self) extends AnyVal {
    
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
    def setCrmExperimentIdsVarargs(value: String*): Self = this.set("crmExperimentIds", js.Array(value :_*))
    
    @scala.inline
    def setCrmExperimentIds(value: js.Array[String]): Self = this.set("crmExperimentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrmExperimentIds: Self = this.set("crmExperimentIds", js.undefined)
    
    @scala.inline
    def setDoc_id(value: String): Self = this.set("doc_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc_id: Self = this.set("doc_id", js.undefined)
    
    @scala.inline
    def setDoc_type(value: String): Self = this.set("doc_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc_type: Self = this.set("doc_type", js.undefined)
    
    @scala.inline
    def setDont_show_notification(value: Boolean): Self = this.set("dont_show_notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDont_show_notification: Self = this.set("dont_show_notification", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setIs_document_mature(value: Boolean): Self = this.set("is_document_mature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_document_mature: Self = this.set("is_document_mature", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNotificationGroup(value: String): Self = this.set("notificationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationGroup: Self = this.set("notificationGroup", js.undefined)
    
    @scala.inline
    def setNotification_type(value: String): Self = this.set("notification_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification_type: Self = this.set("notification_type", js.undefined)
    
    @scala.inline
    def setPcampaign_id(value: String): Self = this.set("pcampaign_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePcampaign_id: Self = this.set("pcampaign_id", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setShow_notification_settings_action(value: Boolean): Self = this.set("show_notification_settings_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow_notification_settings_action: Self = this.set("show_notification_settings_action", js.undefined)
    
    @scala.inline
    def setTargetUrl(value: String): Self = this.set("targetUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetUrl: Self = this.set("targetUrl", js.undefined)
    
    @scala.inline
    def setTimeToExpireMs(value: String): Self = this.set("timeToExpireMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToExpireMs: Self = this.set("timeToExpireMs", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
