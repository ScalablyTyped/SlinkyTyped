package typingsSlinky.rmcPullToRefresh.propsTypeMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indicator extends js.Object {
  
  var activate: js.UndefOr[ReactElement] = js.native
  
  var deactivate: js.UndefOr[ReactElement] = js.native
  
  var finish: js.UndefOr[ReactElement] = js.native
  
  var release: js.UndefOr[ReactElement] = js.native
}
object Indicator {
  
  @scala.inline
  def apply(): Indicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indicator]
  }
  
  @scala.inline
  implicit class IndicatorOps[Self <: Indicator] (val x: Self) extends AnyVal {
    
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
    def setActivateReactElement(value: ReactElement): Self = this.set("activate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivate(value: ReactElement): Self = this.set("activate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    
    @scala.inline
    def setDeactivateReactElement(value: ReactElement): Self = this.set("deactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactivate(value: ReactElement): Self = this.set("deactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeactivate: Self = this.set("deactivate", js.undefined)
    
    @scala.inline
    def setFinishReactElement(value: ReactElement): Self = this.set("finish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinish(value: ReactElement): Self = this.set("finish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinish: Self = this.set("finish", js.undefined)
    
    @scala.inline
    def setReleaseReactElement(value: ReactElement): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: ReactElement): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
  }
}
