package typingsSlinky.antDesignProLayout.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.ClassName
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WrapContent {
  
  @JSImport("@ant-design/pro-layout/lib/WrapContent", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentHeight(value: Double | String): this.type = set("contentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isChildrenLayout(value: Boolean): this.type = set("isChildrenLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def location(value: js.Any): this.type = set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClassName): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: WrapContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
