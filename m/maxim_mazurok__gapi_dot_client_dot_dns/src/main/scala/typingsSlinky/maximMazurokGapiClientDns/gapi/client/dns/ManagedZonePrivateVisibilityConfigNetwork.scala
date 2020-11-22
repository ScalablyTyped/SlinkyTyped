package typingsSlinky.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZonePrivateVisibilityConfigNetwork extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  /** The fully qualified URL of the VPC network to bind to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network} */
  var networkUrl: js.UndefOr[String] = js.native
}
object ManagedZonePrivateVisibilityConfigNetwork {
  
  @scala.inline
  def apply(): ManagedZonePrivateVisibilityConfigNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZonePrivateVisibilityConfigNetwork]
  }
  
  @scala.inline
  implicit class ManagedZonePrivateVisibilityConfigNetworkOps[Self <: ManagedZonePrivateVisibilityConfigNetwork] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNetworkUrl(value: String): Self = this.set("networkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUrl: Self = this.set("networkUrl", js.undefined)
  }
}
