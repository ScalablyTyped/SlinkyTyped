package typingsSlinky.antDesignIcons.components

import org.scalajs.dom.raw.SVGSVGElement
import slinky.web.SyntheticMouseEvent
import slinky.web.svg.svg.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignIcons.iconBaseMod.IconProps
import typingsSlinky.antDesignIconsSvg.typesMod.IconDefinition
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconBase {
  
  @JSImport("@ant-design/icons/es/components/IconBase", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusable(value: String): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[SVGSVGElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def primaryColor(value: String): this.type = set("primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondaryColor(value: String): this.type = set("secondaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(icon: IconDefinition): Builder = {
    val __props = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
}
