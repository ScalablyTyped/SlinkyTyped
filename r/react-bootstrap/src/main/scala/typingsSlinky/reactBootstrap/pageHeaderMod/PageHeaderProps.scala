package typingsSlinky.reactBootstrap.pageHeaderMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageHeaderProps
  extends AllHTMLAttributes[PageHeader]
     with ClassAttributes[PageHeader] {
  
  var bsClass: js.UndefOr[String] = js.native
}
object PageHeaderProps {
  
  @scala.inline
  def apply(): PageHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHeaderProps]
  }
  
  @scala.inline
  implicit class PageHeaderPropsOps[Self <: PageHeaderProps] (val x: Self) extends AnyVal {
    
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
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
  }
}
