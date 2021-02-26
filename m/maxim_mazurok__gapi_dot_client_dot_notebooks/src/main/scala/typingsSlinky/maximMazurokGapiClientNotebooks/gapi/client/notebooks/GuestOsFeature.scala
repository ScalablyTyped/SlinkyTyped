package typingsSlinky.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GuestOsFeature extends StObject {
  
  /**
    * The ID of a supported feature. Read Enabling guest operating system features to see a list of available options. Valid values: FEATURE_TYPE_UNSPECIFIED MULTI_IP_SUBNET SECURE_BOOT
    * UEFI_COMPATIBLE VIRTIO_SCSI_MULTIQUEUE WINDOWS
    */
  var `type`: js.UndefOr[String] = js.native
}
object GuestOsFeature {
  
  @scala.inline
  def apply(): GuestOsFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuestOsFeature]
  }
  
  @scala.inline
  implicit class GuestOsFeatureMutableBuilder[Self <: GuestOsFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
