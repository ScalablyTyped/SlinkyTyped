package typingsSlinky.markdownIt

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.markdownIt.libMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("markdown-it/lib/renderer", JSImport.Namespace)
  @js.native
  class ^ () extends Renderer
  
  type RenderRule = js.Function5[
    /* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
    /* idx */ Double, 
    /* options */ Options, 
    /* env */ js.Any, 
    /* self */ Renderer, 
    String
  ]
  
  @js.native
  trait RenderRuleRecord
    extends /* type */ StringDictionary[js.UndefOr[RenderRule]] {
    
    var code_block: js.UndefOr[RenderRule] = js.native
    
    var code_inline: js.UndefOr[RenderRule] = js.native
    
    var fence: js.UndefOr[RenderRule] = js.native
    
    var hardbreak: js.UndefOr[RenderRule] = js.native
    
    var html_block: js.UndefOr[RenderRule] = js.native
    
    var html_inline: js.UndefOr[RenderRule] = js.native
    
    var image: js.UndefOr[RenderRule] = js.native
    
    var softbreak: js.UndefOr[RenderRule] = js.native
    
    var text: js.UndefOr[RenderRule] = js.native
  }
  object RenderRuleRecord {
    
    @scala.inline
    def apply(): RenderRuleRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderRuleRecord]
    }
    
    @scala.inline
    implicit class RenderRuleRecordMutableBuilder[Self <: RenderRuleRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode_block(
        value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "code_block", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCode_blockUndefined: Self = StObject.set(x, "code_block", js.undefined)
      
      @scala.inline
      def setCode_inline(
        value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "code_inline", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCode_inlineUndefined: Self = StObject.set(x, "code_inline", js.undefined)
      
      @scala.inline
      def setFence(
        value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "fence", js.Any.fromFunction5(value))
      
      @scala.inline
      def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
      
      @scala.inline
      def setHardbreak(
        value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "hardbreak", js.Any.fromFunction5(value))
      
      @scala.inline
      def setHardbreakUndefined: Self = StObject.set(x, "hardbreak", js.undefined)
      
      @scala.inline
      def setHtml_block(
        value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "html_block", js.Any.fromFunction5(value))
      
      @scala.inline
      def setHtml_blockUndefined: Self = StObject.set(x, "html_block", js.undefined)
      
      @scala.inline
      def setHtml_inline(
        value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "html_inline", js.Any.fromFunction5(value))
      
      @scala.inline
      def setHtml_inlineUndefined: Self = StObject.set(x, "html_inline", js.undefined)
      
      @scala.inline
      def setImage(
        value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "image", js.Any.fromFunction5(value))
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setSoftbreak(
        value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "softbreak", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSoftbreakUndefined: Self = StObject.set(x, "softbreak", js.undefined)
      
      @scala.inline
      def setText(
        value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "text", js.Any.fromFunction5(value))
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait Renderer extends StObject {
    
    /**
      * Takes token stream and generates HTML. Probably, you will never need to call
      * this method directly.
      *
      * @param tokens list on block tokens to renter
      * @param options params of parser instance
      * @param env additional data from parsed input (references, for example)
      */
    def render(tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^], options: Options, env: js.Any): String = js.native
    
    /**
      * Render token attributes to string.
      */
    def renderAttrs(token: typingsSlinky.markdownIt.tokenMod.^): String = js.native
    
    /**
      * The same as [[Renderer.render]], but for single token of `inline` type.
      *
      * @param tokens list on block tokens to renter
      * @param options params of parser instance
      * @param env additional data from parsed input (references, for example)
      */
    def renderInline(tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^], options: Options, env: js.Any): String = js.native
    
    /**
      * Special kludge for image `alt` attributes to conform CommonMark spec.
      * Don't try to use it! Spec requires to show `alt` content with stripped markup,
      * instead of simple escaping.
      *
      * @param tokens list on block tokens to renter
      * @param options params of parser instance
      * @param env additional data from parsed input (references, for example)
      */
    def renderInlineAsText(tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^], options: Options, env: js.Any): String = js.native
    
    /**
      * Default token renderer. Can be overriden by custom function
      * in [[Renderer#rules]].
      *
      * @param tokens list of tokens
      * @param idx token index to render
      * @param options params of parser instance
      */
    def renderToken(tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^], idx: Double, options: Options): String = js.native
    
    /**
      * Contains render rules for tokens. Can be updated and extended.
      *
      * ##### Example
      *
      * ```javascript
      * var md = require('markdown-it')();
      *
      * md.renderer.rules.strong_open  = function () { return '<b>'; };
      * md.renderer.rules.strong_close = function () { return '</b>'; };
      *
      * var result = md.renderInline(...);
      * ```
      *
      * Each rule is called as independent static function with fixed signature:
      *
      * ```javascript
      * function my_token_render(tokens, idx, options, env, renderer) {
      *   // ...
      *   return renderedHTML;
      * }
      * ```
      *
      * See [source code](https://github.com/markdown-it/markdown-it/blob/master/lib/renderer.js)
      * for more details and examples.
      */
    var rules: RenderRuleRecord = js.native
  }
  object Renderer {
    
    @scala.inline
    def apply(
      render: (js.Array[typingsSlinky.markdownIt.tokenMod.^], Options, js.Any) => String,
      renderAttrs: typingsSlinky.markdownIt.tokenMod.^ => String,
      renderInline: (js.Array[typingsSlinky.markdownIt.tokenMod.^], Options, js.Any) => String,
      renderInlineAsText: (js.Array[typingsSlinky.markdownIt.tokenMod.^], Options, js.Any) => String,
      renderToken: (js.Array[typingsSlinky.markdownIt.tokenMod.^], Double, Options) => String,
      rules: RenderRuleRecord
    ): Renderer = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction3(render), renderAttrs = js.Any.fromFunction1(renderAttrs), renderInline = js.Any.fromFunction3(renderInline), renderInlineAsText = js.Any.fromFunction3(renderInlineAsText), renderToken = js.Any.fromFunction3(renderToken), rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Renderer]
    }
    
    @scala.inline
    implicit class RendererMutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: (js.Array[typingsSlinky.markdownIt.tokenMod.^], Options, js.Any) => String): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderAttrs(value: typingsSlinky.markdownIt.tokenMod.^ => String): Self = StObject.set(x, "renderAttrs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderInline(value: (js.Array[typingsSlinky.markdownIt.tokenMod.^], Options, js.Any) => String): Self = StObject.set(x, "renderInline", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderInlineAsText(value: (js.Array[typingsSlinky.markdownIt.tokenMod.^], Options, js.Any) => String): Self = StObject.set(x, "renderInlineAsText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderToken(value: (js.Array[typingsSlinky.markdownIt.tokenMod.^], Double, Options) => String): Self = StObject.set(x, "renderToken", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRules(value: RenderRuleRecord): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
}
