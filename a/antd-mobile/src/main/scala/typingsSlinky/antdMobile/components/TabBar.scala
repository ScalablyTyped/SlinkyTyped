package typingsSlinky.antdMobile.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.antdMobileStrings.bottom
import typingsSlinky.antdMobile.antdMobileStrings.top
import typingsSlinky.antdMobile.tabBarMod.AntTabbarProps
import typingsSlinky.antdMobile.tabBarPropsTypeMod.TabBarItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBar {
  
  object Item {
    
    @scala.inline
    def apply(title: String): SharedBuilder_TabBarItemProps_2089191354[typingsSlinky.antdMobile.mod.TabBar.Item] = {
      val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      new SharedBuilder_TabBarItemProps_2089191354[typingsSlinky.antdMobile.mod.TabBar.Item](js.Array(this.component, __props.asInstanceOf[TabBarItemProps]))
    }
    
    @JSImport("antd-mobile", "TabBar.Item")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: TabBarItemProps): SharedBuilder_TabBarItemProps_2089191354[typingsSlinky.antdMobile.mod.TabBar.Item] = new SharedBuilder_TabBarItemProps_2089191354[typingsSlinky.antdMobile.mod.TabBar.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd-mobile", "TabBar")
  @js.native
  val component: js.Object = js.native
  
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
    def placeholder(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholderReactElement(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
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
  
  implicit def make(companion: TabBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AntTabbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
