package typingsSlinky.antdMobile.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.tabBarPropsTypeMod.TabIcon
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TabBarItemProps_2089191354[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def badge(value: String | Double): this.type = set("badge", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dot(value: Boolean): this.type = set("dot", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icon(value: TabIcon): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedIcon(value: TabIcon): this.type = set("selectedIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedIconReactElement(value: ReactElement): this.type = set("selectedIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
