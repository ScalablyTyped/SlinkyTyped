package typingsSlinky.helmet.xFrameOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XFrameOptionsOptions extends js.Object {
  
  var action: js.UndefOr[String] = js.native
}
object XFrameOptionsOptions {
  
  @scala.inline
  def apply(): XFrameOptionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XFrameOptionsOptions]
  }
  
  @scala.inline
  implicit class XFrameOptionsOptionsOps[Self <: XFrameOptionsOptions] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
  }
}
