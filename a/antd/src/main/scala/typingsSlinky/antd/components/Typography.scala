package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.baseMod.BaseType
import typingsSlinky.antd.baseMod.BlockProps
import typingsSlinky.antd.baseMod.CopyConfig
import typingsSlinky.antd.baseMod.EditConfig
import typingsSlinky.antd.baseMod.EllipsisConfig
import typingsSlinky.antd.linkMod.LinkProps
import typingsSlinky.antd.textMod.TextProps
import typingsSlinky.antd.typographyTitleMod.TitleProps
import typingsSlinky.antd.typographyTypographyMod.TypographyProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Typography {
  
  object Link {
    
    @JSImport("antd", "Typography.Link")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Link.type): SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: LinkProps with RefAttributes[HTMLElement]): SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Paragraph {
    
    @JSImport("antd", "Typography.Paragraph")
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
    
    implicit def make(companion: Paragraph.type): typingsSlinky.antd.components.Typography.Paragraph.Builder = new typingsSlinky.antd.components.Typography.Paragraph.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BlockProps): typingsSlinky.antd.components.Typography.Paragraph.Builder = new typingsSlinky.antd.components.Typography.Paragraph.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Text {
    
    @JSImport("antd", "Typography.Text")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Text.type): SharedBuilder_TextProps601591556 = new SharedBuilder_TextProps601591556(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TextProps): SharedBuilder_TextProps601591556 = new SharedBuilder_TextProps601591556(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("antd", "Typography.Title")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Title.type): SharedBuilder_TitleProps500649929 = new SharedBuilder_TitleProps500649929(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TitleProps): SharedBuilder_TitleProps500649929 = new SharedBuilder_TitleProps500649929(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Typography")
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
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Typography.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[TypographyProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
