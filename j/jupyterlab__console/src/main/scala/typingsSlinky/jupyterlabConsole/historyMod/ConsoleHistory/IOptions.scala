package typingsSlinky.jupyterlabConsole.historyMod.ConsoleHistory

import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The initialization options for a console history object.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The client session used by the foreign handler.
    */
  var sessionContext: ISessionContext = js.native
}
object IOptions {
  
  @scala.inline
  def apply(sessionContext: ISessionContext): IOptions = {
    val __obj = js.Dynamic.literal(sessionContext = sessionContext.asInstanceOf[js.Any])
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
    def setSessionContext(value: ISessionContext): Self = this.set("sessionContext", value.asInstanceOf[js.Any])
  }
}
