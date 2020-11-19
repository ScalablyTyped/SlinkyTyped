package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.last_write_win_
import typingsSlinky.chromeApps.chromeAppsStrings.manual__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LASTWRITEWIN extends js.Object {
  
  var LAST_WRITE_WIN: last_write_win_ = js.native
  
  var MANUAL: manual__ = js.native
}
object LASTWRITEWIN {
  
  @scala.inline
  def apply(LAST_WRITE_WIN: last_write_win_, MANUAL: manual__): LASTWRITEWIN = {
    val __obj = js.Dynamic.literal(LAST_WRITE_WIN = LAST_WRITE_WIN.asInstanceOf[js.Any], MANUAL = MANUAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[LASTWRITEWIN]
  }
  
  @scala.inline
  implicit class LASTWRITEWINOps[Self <: LASTWRITEWIN] (val x: Self) extends AnyVal {
    
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
    def setLAST_WRITE_WIN(value: last_write_win_): Self = this.set("LAST_WRITE_WIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMANUAL(value: manual__): Self = this.set("MANUAL", value.asInstanceOf[js.Any])
  }
}
