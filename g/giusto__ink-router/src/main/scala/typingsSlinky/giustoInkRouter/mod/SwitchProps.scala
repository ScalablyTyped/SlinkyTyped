package typingsSlinky.giustoInkRouter.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchProps extends js.Object {
  
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
  
  var notFound: js.UndefOr[js.Function0[_] | ReactComponentClass[_]] = js.native
}
object SwitchProps {
  
  @scala.inline
  def apply(): SwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchProps]
  }
  
  @scala.inline
  implicit class SwitchPropsOps[Self <: SwitchProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: ReactElement | js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setNotFoundFunctionComponent(value: ReactComponentClass[_]): Self = this.set("notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundFunction0(value: () => _): Self = this.set("notFound", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotFoundComponentClass(value: ReactComponentClass[_]): Self = this.set("notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFound(value: js.Function0[_] | ReactComponentClass[_]): Self = this.set("notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFound: Self = this.set("notFound", js.undefined)
  }
}
