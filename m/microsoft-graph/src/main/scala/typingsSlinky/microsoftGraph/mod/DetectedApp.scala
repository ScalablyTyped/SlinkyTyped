package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectedApp extends Entity {
  
  // The number of devices that have installed this application
  var deviceCount: js.UndefOr[Double] = js.native
  
  // Name of the discovered application. Read-only
  var displayName: js.UndefOr[String] = js.native
  
  // The devices that have the discovered application installed
  var managedDevices: js.UndefOr[js.Array[ManagedDevice]] = js.native
  
  // Discovered application size in bytes. Read-only
  var sizeInByte: js.UndefOr[Double] = js.native
  
  // Version of the discovered application. Read-only
  var version: js.UndefOr[String] = js.native
}
object DetectedApp {
  
  @scala.inline
  def apply(): DetectedApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedApp]
  }
  
  @scala.inline
  implicit class DetectedAppOps[Self <: DetectedApp] (val x: Self) extends AnyVal {
    
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
    def setDeviceCount(value: Double): Self = this.set("deviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCount: Self = this.set("deviceCount", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setManagedDevicesVarargs(value: ManagedDevice*): Self = this.set("managedDevices", js.Array(value :_*))
    
    @scala.inline
    def setManagedDevices(value: js.Array[ManagedDevice]): Self = this.set("managedDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedDevices: Self = this.set("managedDevices", js.undefined)
    
    @scala.inline
    def setSizeInByte(value: Double): Self = this.set("sizeInByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeInByte: Self = this.set("sizeInByte", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
