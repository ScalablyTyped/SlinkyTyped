package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApplicationResourceLifecycleMessage extends js.Object {
  
  /**
    * The name of the application.
    */
  var ApplicationName: typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  
  /**
    * The lifecycle configuration.
    */
  var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig = js.native
}
object UpdateApplicationResourceLifecycleMessage {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, ResourceLifecycleConfig: ApplicationResourceLifecycleConfig): UpdateApplicationResourceLifecycleMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], ResourceLifecycleConfig = ResourceLifecycleConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationResourceLifecycleMessage]
  }
  
  @scala.inline
  implicit class UpdateApplicationResourceLifecycleMessageOps[Self <: UpdateApplicationResourceLifecycleMessage] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLifecycleConfig(value: ApplicationResourceLifecycleConfig): Self = this.set("ResourceLifecycleConfig", value.asInstanceOf[js.Any])
  }
}
