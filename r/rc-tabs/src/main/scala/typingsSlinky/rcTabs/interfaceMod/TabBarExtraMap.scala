package typingsSlinky.rcTabs.interfaceMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<rc-tabs.rc-tabs/es/interface.TabBarExtraPosition, react.react.ReactNode>> */
@js.native
trait TabBarExtraMap extends js.Object {
  
  var left: js.UndefOr[ReactElement] = js.native
  
  var right: js.UndefOr[ReactElement] = js.native
}
object TabBarExtraMap {
  
  @scala.inline
  def apply(): TabBarExtraMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarExtraMap]
  }
  
  @scala.inline
  implicit class TabBarExtraMapOps[Self <: TabBarExtraMap] (val x: Self) extends AnyVal {
    
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
    def setLeftReactElement(value: ReactElement): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: ReactElement): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRightReactElement(value: ReactElement): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: ReactElement): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
  }
}
