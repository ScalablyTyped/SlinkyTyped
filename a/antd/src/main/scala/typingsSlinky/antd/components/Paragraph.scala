package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.paragraphMod.SkeletonParagraphProps
import typingsSlinky.antd.paragraphMod.widthUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Paragraph {
  
  @JSImport("antd/lib/skeleton/Paragraph", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widthVarargs(value: widthUnit*): this.type = set("width", js.Array(value :_*))
    
    @scala.inline
    def width(value: widthUnit | js.Array[widthUnit]): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SkeletonParagraphProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Paragraph.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
