package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimulationApplicationConfig extends js.Object {
  
  /**
    * The application information for the simulation application.
    */
  var application: Arn = js.native
  
  /**
    * The version of the simulation application.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
  
  /**
    * The launch configuration for the simulation application.
    */
  var launchConfig: LaunchConfig = js.native
}
object SimulationApplicationConfig {
  
  @scala.inline
  def apply(application: Arn, launchConfig: LaunchConfig): SimulationApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], launchConfig = launchConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationApplicationConfig]
  }
  
  @scala.inline
  implicit class SimulationApplicationConfigOps[Self <: SimulationApplicationConfig] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Arn): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchConfig(value: LaunchConfig): Self = this.set("launchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersion(value: Version): Self = this.set("applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationVersion: Self = this.set("applicationVersion", js.undefined)
  }
}
