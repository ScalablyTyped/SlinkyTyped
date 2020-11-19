package typingsSlinky.antdMobile.listPropsTypeMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPropsType extends js.Object {
  
  var renderFooter: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.native
  
  var renderHeader: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.native
}
object ListPropsType {
  
  @scala.inline
  def apply(): ListPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPropsType]
  }
  
  @scala.inline
  implicit class ListPropsTypeOps[Self <: ListPropsType] (val x: Self) extends AnyVal {
    
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
    def setRenderFooterReactElement(value: ReactElement): Self = this.set("renderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFooterFunction0(value: () => ReactElement): Self = this.set("renderFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderFooter(value: js.Function0[ReactElement] | ReactElement): Self = this.set("renderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderFooter: Self = this.set("renderFooter", js.undefined)
    
    @scala.inline
    def setRenderHeaderReactElement(value: ReactElement): Self = this.set("renderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderHeaderFunction0(value: () => ReactElement): Self = this.set("renderHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderHeader(value: js.Function0[ReactElement] | ReactElement): Self = this.set("renderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderHeader: Self = this.set("renderHeader", js.undefined)
  }
}
