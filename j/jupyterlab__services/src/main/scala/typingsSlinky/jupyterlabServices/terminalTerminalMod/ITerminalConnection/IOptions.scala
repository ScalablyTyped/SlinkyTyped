package typingsSlinky.jupyterlabServices.terminalTerminalMod.ITerminalConnection

import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.jupyterlabServices.terminalRestapiMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  /**
    * Terminal model.
    */
  var model: IModel = js.native
  
  /**
    * The server settings.
    */
  var serverSettings: js.UndefOr[ISettings] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(model: IModel): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setModel(value: IModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSettings(value: ISettings): Self = this.set("serverSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSettings: Self = this.set("serverSettings", js.undefined)
  }
}
