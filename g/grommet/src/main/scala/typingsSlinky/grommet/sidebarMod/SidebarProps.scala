package typingsSlinky.grommet.sidebarMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarProps extends js.Object {
  
  var footer: js.UndefOr[ReactElement] = js.native
  
  var header: js.UndefOr[ReactElement] = js.native
}
object SidebarProps {
  
  @scala.inline
  def apply(): SidebarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidebarProps]
  }
  
  @scala.inline
  implicit class SidebarPropsOps[Self <: SidebarProps] (val x: Self) extends AnyVal {
    
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
    def setFooterReactElement(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeaderReactElement(value: ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
}
