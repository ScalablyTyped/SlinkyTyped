package typingsSlinky.maximMazurokGapiClientAdmin.gapi.client.admin

import typingsSlinky.maximMazurokGapiClientAdmin.anon.ApplicationName
import typingsSlinky.maximMazurokGapiClientAdmin.anon.CallerType
import typingsSlinky.maximMazurokGapiClientAdmin.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activity extends js.Object {
  
  /** User doing the action. */
  var actor: js.UndefOr[CallerType] = js.native
  
  /** ETag of the entry. */
  var etag: js.UndefOr[String] = js.native
  
  /** Activity events in the report. */
  var events: js.UndefOr[js.Array[Name]] = js.native
  
  /** Unique identifier for each activity record. */
  var id: js.UndefOr[ApplicationName] = js.native
  
  /**
    * IP address of the user doing the action. This is the Internet Protocol (IP) address of the user when logging into G Suite which may or may not reflect the user's physical location.
    * For example, the IP address can be the user's proxy server's address or a virtual private network (VPN) address. The API supports IPv4 and IPv6.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /** The type of API resource. For an activity report, the value is audit#activity. */
  var kind: js.UndefOr[String] = js.native
  
  /** This is the domain that is affected by the report's event. For example domain of Admin console or the Drive application's document owner. */
  var ownerDomain: js.UndefOr[String] = js.native
}
object Activity {
  
  @scala.inline
  def apply(): Activity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    
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
    def setActor(value: CallerType): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Name*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[Name]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setId(value: ApplicationName): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setOwnerDomain(value: String): Self = this.set("ownerDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerDomain: Self = this.set("ownerDomain", js.undefined)
  }
}
