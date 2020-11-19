package typingsSlinky.reachRouter.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationProviderProps extends js.Object {
  
  var children: js.UndefOr[ReactElement | LocationProviderRenderFn] = js.native
  
  var history: js.UndefOr[History] = js.native
}
object LocationProviderProps {
  
  @scala.inline
  def apply(): LocationProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationProviderProps]
  }
  
  @scala.inline
  implicit class LocationProviderPropsOps[Self <: LocationProviderProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenFunction1(value: /* context */ LocationContext => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactElement | LocationProviderRenderFn): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setHistory(value: History): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
  }
}
