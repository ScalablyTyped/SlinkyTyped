package typingsSlinky.antdMobile.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.antdMobileStrings.bottom
import typingsSlinky.antdMobile.antdMobileStrings.top
import typingsSlinky.antdMobile.tabBarMod.AntTabbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBar {
  
  @JSImport("antd-mobile", "TabBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.TabBar] {
    
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def barTintColor(value: String): this.type = set("barTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noRenderContent(value: Boolean): this.type = set("noRenderContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholderReactElement(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prerenderingSiblingsNumber(value: Double): this.type = set("prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarPosition(value: top | bottom): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unselectedTintColor(value: String): this.type = set("unselectedTintColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AntTabbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TabBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
