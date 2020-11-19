package typingsSlinky.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apnsdevicetoken extends js.Object {
  
  var apns_device_token: js.UndefOr[String] = js.native
  
  var apns_environment: js.UndefOr[String] = js.native
}
object Apnsdevicetoken {
  
  @scala.inline
  def apply(): Apnsdevicetoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apnsdevicetoken]
  }
  
  @scala.inline
  implicit class ApnsdevicetokenOps[Self <: Apnsdevicetoken] (val x: Self) extends AnyVal {
    
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
    def setApns_device_token(value: String): Self = this.set("apns_device_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApns_device_token: Self = this.set("apns_device_token", js.undefined)
    
    @scala.inline
    def setApns_environment(value: String): Self = this.set("apns_environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApns_environment: Self = this.set("apns_environment", js.undefined)
  }
}
