package typingsSlinky.rmcTrigger.lazyRenderBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILazyRenderBoxProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var hiddenClassName: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object ILazyRenderBoxProps {
  
  @scala.inline
  def apply(): ILazyRenderBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILazyRenderBoxProps]
  }
  
  @scala.inline
  implicit class ILazyRenderBoxPropsOps[Self <: ILazyRenderBoxProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setHiddenClassName(value: String): Self = this.set("hiddenClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenClassName: Self = this.set("hiddenClassName", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
