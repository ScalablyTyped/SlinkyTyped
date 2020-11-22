package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdNumbers.`1`
import typingsSlinky.antd.antdNumbers.`2`
import typingsSlinky.antd.antdNumbers.`3`
import typingsSlinky.antd.antdNumbers.`4`
import typingsSlinky.antd.antdNumbers.`5`
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Typography {
  
  @JSImport("antd", "Typography")
  @js.native
  object component extends js.Object
  
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
  
  def withProps(p: PropsWithChildren[TypographyProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Typography.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Text {
    
    @JSImport("antd", "Typography.Text")
    @js.native
    object component extends js.Object
    
    def withProps(p: TextProps): SharedBuilder_TextProps601591556 = new SharedBuilder_TextProps601591556(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Text.type): SharedBuilder_TextProps601591556 = new SharedBuilder_TextProps601591556(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Link {
    
    @JSImport("antd", "Typography.Link")
    @js.native
    object component extends js.Object
    
    def withProps(p: LinkProps with RefAttributes[HTMLElement]): SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Link.type): SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes783260929[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Title {
    
    @JSImport("antd", "Typography.Title")
    @js.native
    object component extends js.Object
    
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
      def level(value: `1` | `2` | `3` | `4` | `5`): this.type = set("level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mark(value: Boolean): this.type = set("mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `type`(value: BaseType): this.type = set("type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: TitleProps): typingsSlinky.antd.components.Typography.Title.Builder = new typingsSlinky.antd.components.Typography.Title.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Title.type): typingsSlinky.antd.components.Typography.Title.Builder = new typingsSlinky.antd.components.Typography.Title.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Paragraph {
    
    @JSImport("antd", "Typography.Paragraph")
    @js.native
    object component extends js.Object
    
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
    
    def withProps(p: BlockProps): typingsSlinky.antd.components.Typography.Paragraph.Builder = new typingsSlinky.antd.components.Typography.Paragraph.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Paragraph.type): typingsSlinky.antd.components.Typography.Paragraph.Builder = new typingsSlinky.antd.components.Typography.Paragraph.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
}
