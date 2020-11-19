package typingsSlinky.antDesignReactNative.tabBarPropsTypeMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ImageURISource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarItemProps extends js.Object {
  
  var badge: js.UndefOr[String | Double] = js.native
  
  var icon: js.UndefOr[TabBarIcon] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var selectedIcon: js.UndefOr[TabBarIcon] = js.native
  
  var title: String = js.native
}
object TabBarItemProps {
  
  @scala.inline
  def apply(title: String): TabBarItemProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarItemProps]
  }
  
  @scala.inline
  implicit class TabBarItemPropsOps[Self <: TabBarItemProps] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadge(value: String | Double): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconVarargs(value: ImageURISource*): Self = this.set("icon", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: TabBarIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSelectedIconReactElement(value: ReactElement): Self = this.set("selectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconVarargs(value: ImageURISource*): Self = this.set("selectedIcon", js.Array(value :_*))
    
    @scala.inline
    def setSelectedIcon(value: TabBarIcon): Self = this.set("selectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIcon: Self = this.set("selectedIcon", js.undefined)
  }
}
