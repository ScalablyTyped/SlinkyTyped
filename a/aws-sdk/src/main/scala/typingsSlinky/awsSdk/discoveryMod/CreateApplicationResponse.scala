package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationResponse extends js.Object {
  
  /**
    * Configuration ID of an application to be created.
    */
  var configurationId: js.UndefOr[String] = js.native
}
object CreateApplicationResponse {
  
  @scala.inline
  def apply(): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  @scala.inline
  implicit class CreateApplicationResponseOps[Self <: CreateApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigurationId(value: String): Self = this.set("configurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationId: Self = this.set("configurationId", js.undefined)
  }
}
