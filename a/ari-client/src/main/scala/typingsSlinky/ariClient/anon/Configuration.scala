package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var configuration: String = js.native
  
  var logChannelName: String = js.native
}
object Configuration {
  
  @scala.inline
  def apply(configuration: String, logChannelName: String): Configuration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], logChannelName = logChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: String): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogChannelName(value: String): Self = this.set("logChannelName", value.asInstanceOf[js.Any])
  }
}
