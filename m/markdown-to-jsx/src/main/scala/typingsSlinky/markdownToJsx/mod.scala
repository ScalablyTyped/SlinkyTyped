package typingsSlinky.markdownToJsx

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.markdownToJsx.anon.Dictkey
import typingsSlinky.react.mod.Attributes
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("markdown-to-jsx", JSImport.Default)
  @js.native
  class default ()
    extends Component[MarkdownProps, js.Object, js.Any]
  
  @JSImport("markdown-to-jsx", "compiler")
  @js.native
  def compiler(markdown: String): ReactElement = js.native
  @JSImport("markdown-to-jsx", "compiler")
  @js.native
  def compiler(markdown: String, options: MarkdownOptions): ReactElement = js.native
  
  type ComponentOverride[P, S] = String | ReactComponentClass[P] | (typingsSlinky.markdownToJsx.anon.Component[P, S])
  
  type Markdown = ReactComponentClass[MarkdownProps]
  
  @js.native
  trait MarkdownOptions extends StObject {
    
    /** Custom React.createElement behavior. */
    var createElement: js.UndefOr[
        js.Function3[
          /* type */ ReactComponentClass[js.Object] | String, 
          /* props */ js.UndefOr[(Attributes with js.Object) | Null], 
          /* repeated */ ReactElement, 
          ReactElement
        ]
      ] = js.native
    
    /** By default, raw HTML is parsed to JSX. This behavior can be disabled with this option. */
    var disableParsingRawHTML: js.UndefOr[Boolean] = js.native
    
    /** Force all input strings to use block layout. */
    var forceBlock: js.UndefOr[Boolean] = js.native
    
    /** Force all input strings to use inline layout. */
    var forceInline: js.UndefOr[Boolean] = js.native
    
    /** Override named html codes that should be converted to unicode characters. */
    var namedCodesToUnicode: js.UndefOr[Record[String, String]] = js.native
    
    /** Override representation of any HTML tag or custom component. */
    var overrides: js.UndefOr[Dictkey] = js.native
    
    /** Custom function to generate an HTML id from headings. */
    var slugify: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  }
  object MarkdownOptions {
    
    @scala.inline
    def apply(): MarkdownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkdownOptions]
    }
    
    @scala.inline
    implicit class MarkdownOptionsMutableBuilder[Self <: MarkdownOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateElement(
        value: (/* type */ ReactComponentClass[js.Object] | String, /* props */ js.UndefOr[(Attributes with js.Object) | Null], /* repeated */ ReactElement) => ReactElement
      ): Self = StObject.set(x, "createElement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateElementUndefined: Self = StObject.set(x, "createElement", js.undefined)
      
      @scala.inline
      def setDisableParsingRawHTML(value: Boolean): Self = StObject.set(x, "disableParsingRawHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableParsingRawHTMLUndefined: Self = StObject.set(x, "disableParsingRawHTML", js.undefined)
      
      @scala.inline
      def setForceBlock(value: Boolean): Self = StObject.set(x, "forceBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceBlockUndefined: Self = StObject.set(x, "forceBlock", js.undefined)
      
      @scala.inline
      def setForceInline(value: Boolean): Self = StObject.set(x, "forceInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceInlineUndefined: Self = StObject.set(x, "forceInline", js.undefined)
      
      @scala.inline
      def setNamedCodesToUnicode(value: Record[String, String]): Self = StObject.set(x, "namedCodesToUnicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedCodesToUnicodeUndefined: Self = StObject.set(x, "namedCodesToUnicode", js.undefined)
      
      @scala.inline
      def setOverrides(value: Dictkey): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSlugify(value: /* text */ String => String): Self = StObject.set(x, "slugify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlugifyUndefined: Self = StObject.set(x, "slugify", js.undefined)
    }
  }
  
  @js.native
  trait MarkdownProps extends HTMLAttributes[HTMLElement] {
    
    @JSName("children")
    var children_MarkdownProps: String = js.native
    
    var options: js.UndefOr[MarkdownOptions] = js.native
  }
  object MarkdownProps {
    
    @scala.inline
    def apply(children: String): MarkdownProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkdownProps]
    }
    
    @scala.inline
    implicit class MarkdownPropsMutableBuilder[Self <: MarkdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: MarkdownOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
