package typingsSlinky.antdMobileRn.listItemNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BriefProps
  extends typingsSlinky.antdMobileRn.listPropsTypeMod.BriefProps {
  
  var styles: js.UndefOr[typingsSlinky.antdMobileRn.anon.Brief] = js.native
}
object BriefProps {
  
  @scala.inline
  def apply(): BriefProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BriefProps]
  }
  
  @scala.inline
  implicit class BriefPropsOps[Self <: BriefProps] (val x: Self) extends AnyVal {
    
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
    def setStyles(value: typingsSlinky.antdMobileRn.anon.Brief): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
