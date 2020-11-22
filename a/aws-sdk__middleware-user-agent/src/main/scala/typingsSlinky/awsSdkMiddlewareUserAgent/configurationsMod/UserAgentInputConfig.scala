package typingsSlinky.awsSdkMiddlewareUserAgent.configurationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentInputConfig extends js.Object {
  
  /**
    * The custom user agent header that would be appended to default one
    */
  var customUserAgent: js.UndefOr[String] = js.native
}
object UserAgentInputConfig {
  
  @scala.inline
  def apply(): UserAgentInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentInputConfig]
  }
  
  @scala.inline
  implicit class UserAgentInputConfigOps[Self <: UserAgentInputConfig] (val x: Self) extends AnyVal {
    
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
    def setCustomUserAgent(value: String): Self = this.set("customUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomUserAgent: Self = this.set("customUserAgent", js.undefined)
  }
}
