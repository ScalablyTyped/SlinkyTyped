package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.baseMod.BaseType
import typingsSlinky.antd.baseMod.BlockProps
import typingsSlinky.antd.baseMod.CopyConfig
import typingsSlinky.antd.baseMod.EditConfig
import typingsSlinky.antd.baseMod.EllipsisConfig
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Paragraph {
  
  @JSImport("antd/lib/typography/Paragraph", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def code(value: Boolean): this.type = set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def copyable(value: Boolean | CopyConfig): this.type = set("copyable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete(value: Boolean): this.type = set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editable(value: Boolean | EditConfig): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ellipsis(value: Boolean | EllipsisConfig): this.type = set("ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mark(value: Boolean): this.type = set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strong(value: Boolean): this.type = set("strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: BaseType): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Paragraph.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BlockProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
