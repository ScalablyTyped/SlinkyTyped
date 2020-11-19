package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.ellipsisMod.EllipsisProps
import typingsSlinky.antDesignPro.ellipsisMod.EllipsisTooltipProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ellipsis {
  
  @JSImport("ant-design-pro", "Ellipsis")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.mod.Ellipsis] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullWidthRecognition(value: Boolean): this.type = set("fullWidthRecognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def length(value: Double): this.type = set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lines(value: Double): this.type = set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: Boolean | EllipsisTooltipProps): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EllipsisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Ellipsis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
