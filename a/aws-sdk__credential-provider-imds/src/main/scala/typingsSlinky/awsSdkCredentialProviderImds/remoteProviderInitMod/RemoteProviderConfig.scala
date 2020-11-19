package typingsSlinky.awsSdkCredentialProviderImds.remoteProviderInitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteProviderConfig extends js.Object {
  
  /**
    * The maximum number of times the HTTP connection should be retried
    */
  var maxRetries: Double = js.native
  
  /**
    * The connection timeout (in milliseconds)
    */
  var timeout: Double = js.native
}
object RemoteProviderConfig {
  
  @scala.inline
  def apply(maxRetries: Double, timeout: Double): RemoteProviderConfig = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteProviderConfig]
  }
  
  @scala.inline
  implicit class RemoteProviderConfigOps[Self <: RemoteProviderConfig] (val x: Self) extends AnyVal {
    
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
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
