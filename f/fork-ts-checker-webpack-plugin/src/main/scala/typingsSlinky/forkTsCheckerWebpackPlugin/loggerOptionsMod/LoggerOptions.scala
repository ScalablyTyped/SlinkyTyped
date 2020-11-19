package typingsSlinky.forkTsCheckerWebpackPlugin.loggerOptionsMod

import typingsSlinky.forkTsCheckerWebpackPlugin.loggerFactoryMod.LoggerType
import typingsSlinky.forkTsCheckerWebpackPlugin.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerOptions extends js.Object {
  
  var infrastructure: js.UndefOr[LoggerType | Logger] = js.native
  
  var issues: js.UndefOr[LoggerType | Logger] = js.native
}
object LoggerOptions {
  
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  
  @scala.inline
  implicit class LoggerOptionsOps[Self <: LoggerOptions] (val x: Self) extends AnyVal {
    
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
    def setInfrastructure(value: LoggerType | Logger): Self = this.set("infrastructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfrastructure: Self = this.set("infrastructure", js.undefined)
    
    @scala.inline
    def setIssues(value: LoggerType | Logger): Self = this.set("issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssues: Self = this.set("issues", js.undefined)
  }
}
