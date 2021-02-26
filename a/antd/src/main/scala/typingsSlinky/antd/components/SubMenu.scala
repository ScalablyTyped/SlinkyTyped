package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.subMenuMod.SubMenuProps
import typingsSlinky.antd.subMenuMod.TitleEventEntity
import typingsSlinky.antd.subMenuMod.default
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SubMenu {
  
  @JSImport("antd/lib/menu/SubMenu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def level(value: Double): this.type = set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTitleClick(value: /* e */ TitleEventEntity => Unit): this.type = set("onTitleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTitleMouseEnter(value: /* e */ TitleEventEntity => Unit): this.type = set("onTitleMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTitleMouseLeave(value: /* e */ TitleEventEntity => Unit): this.type = set("onTitleMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupOffset(value: js.Tuple2[Double, Double]): this.type = set("popupOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootPrefixCls(value: String): this.type = set("rootPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SubMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SubMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
