package typingsSlinky.reactBootstrap.clearfixMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearfixProps
  extends AllHTMLAttributes[Clearfix]
     with ClassAttributes[Clearfix] {
  
  var bsClass: js.UndefOr[String] = js.native
  
  var componentClass: js.UndefOr[ReactType[_]] = js.native
  
  var visibleLgBlock: js.UndefOr[Boolean] = js.native
  
  var visibleMdBlock: js.UndefOr[Boolean] = js.native
  
  var visibleSmBlock: js.UndefOr[Boolean] = js.native
  
  var visibleXsBlock: js.UndefOr[Boolean] = js.native
}
object ClearfixProps {
  
  @scala.inline
  def apply(): ClearfixProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearfixProps]
  }
  
  @scala.inline
  implicit class ClearfixPropsOps[Self <: ClearfixProps] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentClassComponentClass(value: ReactComponentClass[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentClass(value: ReactType[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
    
    @scala.inline
    def setVisibleLgBlock(value: Boolean): Self = this.set("visibleLgBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleLgBlock: Self = this.set("visibleLgBlock", js.undefined)
    
    @scala.inline
    def setVisibleMdBlock(value: Boolean): Self = this.set("visibleMdBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleMdBlock: Self = this.set("visibleMdBlock", js.undefined)
    
    @scala.inline
    def setVisibleSmBlock(value: Boolean): Self = this.set("visibleSmBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleSmBlock: Self = this.set("visibleSmBlock", js.undefined)
    
    @scala.inline
    def setVisibleXsBlock(value: Boolean): Self = this.set("visibleXsBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleXsBlock: Self = this.set("visibleXsBlock", js.undefined)
  }
}
