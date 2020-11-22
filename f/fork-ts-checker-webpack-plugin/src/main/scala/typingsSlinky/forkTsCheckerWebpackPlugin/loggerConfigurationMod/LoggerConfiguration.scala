package typingsSlinky.forkTsCheckerWebpackPlugin.loggerConfigurationMod

import typingsSlinky.forkTsCheckerWebpackPlugin.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerConfiguration extends js.Object {
  
  var devServer: Boolean = js.native
  
  var infrastructure: Logger = js.native
  
  var issues: Logger = js.native
}
object LoggerConfiguration {
  
  @scala.inline
  def apply(devServer: Boolean, infrastructure: Logger, issues: Logger): LoggerConfiguration = {
    val __obj = js.Dynamic.literal(devServer = devServer.asInstanceOf[js.Any], infrastructure = infrastructure.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerConfiguration]
  }
  
  @scala.inline
  implicit class LoggerConfigurationOps[Self <: LoggerConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDevServer(value: Boolean): Self = this.set("devServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfrastructure(value: Logger): Self = this.set("infrastructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues(value: Logger): Self = this.set("issues", value.asInstanceOf[js.Any])
  }
}
