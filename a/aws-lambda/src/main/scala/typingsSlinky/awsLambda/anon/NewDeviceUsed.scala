package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.commonMod.StringMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewDeviceUsed extends js.Object {
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var newDeviceUsed: Boolean = js.native
  
  var userAttributes: StringMap = js.native
}
object NewDeviceUsed {
  
  @scala.inline
  def apply(newDeviceUsed: Boolean, userAttributes: StringMap): NewDeviceUsed = {
    val __obj = js.Dynamic.literal(newDeviceUsed = newDeviceUsed.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDeviceUsed]
  }
  
  @scala.inline
  implicit class NewDeviceUsedOps[Self <: NewDeviceUsed] (val x: Self) extends AnyVal {
    
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
    def setNewDeviceUsed(value: Boolean): Self = this.set("newDeviceUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = this.set("clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientMetadata: Self = this.set("clientMetadata", js.undefined)
  }
}
