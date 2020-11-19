package typingsSlinky.antdMobileRn.tabbarAndroidMod

import typingsSlinky.antdMobileRn.tabBarPropsTypeMod.TabBarProps
import typingsSlinky.antdMobileRn.tabBarStyleIndexNativeMod.ITabBarStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarNativeProps extends TabBarProps {
  
  @JSName("styles")
  var styles_TabBarNativeProps: js.UndefOr[ITabBarStyle] = js.native
}
object TabBarNativeProps {
  
  @scala.inline
  def apply(): TabBarNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarNativeProps]
  }
  
  @scala.inline
  implicit class TabBarNativePropsOps[Self <: TabBarNativeProps] (val x: Self) extends AnyVal {
    
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
    def setStyles(value: ITabBarStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
