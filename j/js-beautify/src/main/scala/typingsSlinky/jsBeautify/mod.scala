package typingsSlinky.jsBeautify

import typingsSlinky.jsBeautify.jsBeautifyStrings.`after-newline`
import typingsSlinky.jsBeautify.jsBeautifyStrings.`aligned-multiple`
import typingsSlinky.jsBeautify.jsBeautifyStrings.`before-newline`
import typingsSlinky.jsBeautify.jsBeautifyStrings.`end-expand`
import typingsSlinky.jsBeautify.jsBeautifyStrings.`force-aligned`
import typingsSlinky.jsBeautify.jsBeautifyStrings.`force-expand-multiline`
import typingsSlinky.jsBeautify.jsBeautifyStrings.`preserve-aligned`
import typingsSlinky.jsBeautify.jsBeautifyStrings.`preserve-inline`
import typingsSlinky.jsBeautify.jsBeautifyStrings.`preserve-newline`
import typingsSlinky.jsBeautify.jsBeautifyStrings.auto
import typingsSlinky.jsBeautify.jsBeautifyStrings.collapse
import typingsSlinky.jsBeautify.jsBeautifyStrings.expand
import typingsSlinky.jsBeautify.jsBeautifyStrings.force
import typingsSlinky.jsBeautify.jsBeautifyStrings.keep
import typingsSlinky.jsBeautify.jsBeautifyStrings.none
import typingsSlinky.jsBeautify.jsBeautifyStrings.normal
import typingsSlinky.jsBeautify.jsBeautifyStrings.preserve
import typingsSlinky.jsBeautify.jsBeautifyStrings.separate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-beautify", JSImport.Namespace)
  @js.native
  def apply(js_source_text: String): String = js.native
  @JSImport("js-beautify", JSImport.Namespace)
  @js.native
  def apply(js_source_text: String, options: JSBeautifyOptions): String = js.native
  
  @JSImport("js-beautify", "css")
  @js.native
  def css(js_source_text: String): String = js.native
  @JSImport("js-beautify", "css")
  @js.native
  def css(js_source_text: String, options: CSSBeautifyOptions): String = js.native
  
  @JSImport("js-beautify", "css_beautify")
  @js.native
  def cssBeautify(js_source_text: String): String = js.native
  @JSImport("js-beautify", "css_beautify")
  @js.native
  def cssBeautify(js_source_text: String, options: CSSBeautifyOptions): String = js.native
  
  @JSImport("js-beautify", "html")
  @js.native
  def html(js_source_text: String): String = js.native
  @JSImport("js-beautify", "html")
  @js.native
  def html(js_source_text: String, options: HTMLBeautifyOptions): String = js.native
  
  @JSImport("js-beautify", "html_beautify")
  @js.native
  def htmlBeautify(js_source_text: String): String = js.native
  @JSImport("js-beautify", "html_beautify")
  @js.native
  def htmlBeautify(js_source_text: String, options: HTMLBeautifyOptions): String = js.native
  
  @JSImport("js-beautify", "js_beautify")
  @js.native
  def jsBeautify(js_source_text: String): String = js.native
  @JSImport("js-beautify", "js_beautify")
  @js.native
  def jsBeautify(js_source_text: String, options: JSBeautifyOptions): String = js.native
  
  @JSImport("js-beautify", "js")
  @js.native
  def js_(js_source_text: String): String = js.native
  @JSImport("js-beautify", "js")
  @js.native
  def js_(js_source_text: String, options: JSBeautifyOptions): String = js.native
  
  @js.native
  trait CSSBeautifyOptions extends CoreBeautifyOptions {
    
    var newline_between_rules: js.UndefOr[Boolean] = js.native
    
    var selector_separator_newline: js.UndefOr[Boolean] = js.native
    
    var space_around_combinator: js.UndefOr[Boolean] = js.native
    
    var space_around_selector_separator: js.UndefOr[Boolean] = js.native
  }
  object CSSBeautifyOptions {
    
    @scala.inline
    def apply(): CSSBeautifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSBeautifyOptions]
    }
    
    @scala.inline
    implicit class CSSBeautifyOptionsMutableBuilder[Self <: CSSBeautifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewline_between_rules(value: Boolean): Self = StObject.set(x, "newline_between_rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewline_between_rulesUndefined: Self = StObject.set(x, "newline_between_rules", js.undefined)
      
      @scala.inline
      def setSelector_separator_newline(value: Boolean): Self = StObject.set(x, "selector_separator_newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector_separator_newlineUndefined: Self = StObject.set(x, "selector_separator_newline", js.undefined)
      
      @scala.inline
      def setSpace_around_combinator(value: Boolean): Self = StObject.set(x, "space_around_combinator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_around_combinatorUndefined: Self = StObject.set(x, "space_around_combinator", js.undefined)
      
      @scala.inline
      def setSpace_around_selector_separator(value: Boolean): Self = StObject.set(x, "space_around_selector_separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_around_selector_separatorUndefined: Self = StObject.set(x, "space_around_selector_separator", js.undefined)
    }
  }
  
  @js.native
  trait CoreBeautifyOptions extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var end_with_newline: js.UndefOr[Boolean] = js.native
    
    var eol: js.UndefOr[String] = js.native
    
    var indent_char: js.UndefOr[String] = js.native
    
    var indent_empty_lines: js.UndefOr[Boolean] = js.native
    
    var indent_level: js.UndefOr[Double] = js.native
    
    var indent_size: js.UndefOr[Double] = js.native
    
    var indent_with_tabs: js.UndefOr[Boolean] = js.native
    
    var max_preserve_newlines: js.UndefOr[Double] = js.native
    
    var preserve_newlines: js.UndefOr[Boolean] = js.native
    
    var templating: js.UndefOr[js.Array[String]] = js.native
    
    var wrap_line_length: js.UndefOr[Double] = js.native
  }
  object CoreBeautifyOptions {
    
    @scala.inline
    def apply(): CoreBeautifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreBeautifyOptions]
    }
    
    @scala.inline
    implicit class CoreBeautifyOptionsMutableBuilder[Self <: CoreBeautifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEnd_with_newline(value: Boolean): Self = StObject.set(x, "end_with_newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd_with_newlineUndefined: Self = StObject.set(x, "end_with_newline", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setIndent_char(value: String): Self = StObject.set(x, "indent_char", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_charUndefined: Self = StObject.set(x, "indent_char", js.undefined)
      
      @scala.inline
      def setIndent_empty_lines(value: Boolean): Self = StObject.set(x, "indent_empty_lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_empty_linesUndefined: Self = StObject.set(x, "indent_empty_lines", js.undefined)
      
      @scala.inline
      def setIndent_level(value: Double): Self = StObject.set(x, "indent_level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_levelUndefined: Self = StObject.set(x, "indent_level", js.undefined)
      
      @scala.inline
      def setIndent_size(value: Double): Self = StObject.set(x, "indent_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_sizeUndefined: Self = StObject.set(x, "indent_size", js.undefined)
      
      @scala.inline
      def setIndent_with_tabs(value: Boolean): Self = StObject.set(x, "indent_with_tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_with_tabsUndefined: Self = StObject.set(x, "indent_with_tabs", js.undefined)
      
      @scala.inline
      def setMax_preserve_newlines(value: Double): Self = StObject.set(x, "max_preserve_newlines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_preserve_newlinesUndefined: Self = StObject.set(x, "max_preserve_newlines", js.undefined)
      
      @scala.inline
      def setPreserve_newlines(value: Boolean): Self = StObject.set(x, "preserve_newlines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserve_newlinesUndefined: Self = StObject.set(x, "preserve_newlines", js.undefined)
      
      @scala.inline
      def setTemplating(value: js.Array[String]): Self = StObject.set(x, "templating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatingUndefined: Self = StObject.set(x, "templating", js.undefined)
      
      @scala.inline
      def setTemplatingVarargs(value: String*): Self = StObject.set(x, "templating", js.Array(value :_*))
      
      @scala.inline
      def setWrap_line_length(value: Double): Self = StObject.set(x, "wrap_line_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap_line_lengthUndefined: Self = StObject.set(x, "wrap_line_length", js.undefined)
    }
  }
  
  @js.native
  trait HTMLBeautifyOptions extends CoreBeautifyOptions {
    
    var content_unformatted: js.UndefOr[js.Array[String]] = js.native
    
    var extra_liners: js.UndefOr[js.Array[String]] = js.native
    
    var indent_body_inner_html: js.UndefOr[Boolean] = js.native
    
    var indent_handlebars: js.UndefOr[Boolean] = js.native
    
    var indent_head_inner_html: js.UndefOr[Boolean] = js.native
    
    var indent_inner_html: js.UndefOr[Boolean] = js.native
    
    var indent_scripts: js.UndefOr[normal | keep | separate] = js.native
    
    var `inline`: js.UndefOr[js.Array[String]] = js.native
    
    var unformatted: js.UndefOr[js.Array[String]] = js.native
    
    var unformatted_content_delimiter: js.UndefOr[String] = js.native
    
    var void_elements: js.UndefOr[js.Array[String]] = js.native
    
    var wrap_attributes: js.UndefOr[
        auto | force | `force-aligned` | `force-expand-multiline` | `aligned-multiple` | preserve | `preserve-aligned`
      ] = js.native
    
    var wrap_attributes_indent_size: js.UndefOr[Double] = js.native
  }
  object HTMLBeautifyOptions {
    
    @scala.inline
    def apply(): HTMLBeautifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLBeautifyOptions]
    }
    
    @scala.inline
    implicit class HTMLBeautifyOptionsMutableBuilder[Self <: HTMLBeautifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent_unformatted(value: js.Array[String]): Self = StObject.set(x, "content_unformatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_unformattedUndefined: Self = StObject.set(x, "content_unformatted", js.undefined)
      
      @scala.inline
      def setContent_unformattedVarargs(value: String*): Self = StObject.set(x, "content_unformatted", js.Array(value :_*))
      
      @scala.inline
      def setExtra_liners(value: js.Array[String]): Self = StObject.set(x, "extra_liners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtra_linersUndefined: Self = StObject.set(x, "extra_liners", js.undefined)
      
      @scala.inline
      def setExtra_linersVarargs(value: String*): Self = StObject.set(x, "extra_liners", js.Array(value :_*))
      
      @scala.inline
      def setIndent_body_inner_html(value: Boolean): Self = StObject.set(x, "indent_body_inner_html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_body_inner_htmlUndefined: Self = StObject.set(x, "indent_body_inner_html", js.undefined)
      
      @scala.inline
      def setIndent_handlebars(value: Boolean): Self = StObject.set(x, "indent_handlebars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_handlebarsUndefined: Self = StObject.set(x, "indent_handlebars", js.undefined)
      
      @scala.inline
      def setIndent_head_inner_html(value: Boolean): Self = StObject.set(x, "indent_head_inner_html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_head_inner_htmlUndefined: Self = StObject.set(x, "indent_head_inner_html", js.undefined)
      
      @scala.inline
      def setIndent_inner_html(value: Boolean): Self = StObject.set(x, "indent_inner_html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_inner_htmlUndefined: Self = StObject.set(x, "indent_inner_html", js.undefined)
      
      @scala.inline
      def setIndent_scripts(value: normal | keep | separate): Self = StObject.set(x, "indent_scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_scriptsUndefined: Self = StObject.set(x, "indent_scripts", js.undefined)
      
      @scala.inline
      def setInline(value: js.Array[String]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInlineVarargs(value: String*): Self = StObject.set(x, "inline", js.Array(value :_*))
      
      @scala.inline
      def setUnformatted(value: js.Array[String]): Self = StObject.set(x, "unformatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnformattedUndefined: Self = StObject.set(x, "unformatted", js.undefined)
      
      @scala.inline
      def setUnformattedVarargs(value: String*): Self = StObject.set(x, "unformatted", js.Array(value :_*))
      
      @scala.inline
      def setUnformatted_content_delimiter(value: String): Self = StObject.set(x, "unformatted_content_delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnformatted_content_delimiterUndefined: Self = StObject.set(x, "unformatted_content_delimiter", js.undefined)
      
      @scala.inline
      def setVoid_elements(value: js.Array[String]): Self = StObject.set(x, "void_elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoid_elementsUndefined: Self = StObject.set(x, "void_elements", js.undefined)
      
      @scala.inline
      def setVoid_elementsVarargs(value: String*): Self = StObject.set(x, "void_elements", js.Array(value :_*))
      
      @scala.inline
      def setWrap_attributes(
        value: auto | force | `force-aligned` | `force-expand-multiline` | `aligned-multiple` | preserve | `preserve-aligned`
      ): Self = StObject.set(x, "wrap_attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap_attributesUndefined: Self = StObject.set(x, "wrap_attributes", js.undefined)
      
      @scala.inline
      def setWrap_attributes_indent_size(value: Double): Self = StObject.set(x, "wrap_attributes_indent_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap_attributes_indent_sizeUndefined: Self = StObject.set(x, "wrap_attributes_indent_size", js.undefined)
    }
  }
  
  @js.native
  trait JSBeautifyOptions extends CoreBeautifyOptions {
    
    var brace_style: js.UndefOr[collapse | expand | `end-expand` | none | `preserve-inline`] = js.native
    
    var break_chained_methods: js.UndefOr[Boolean] = js.native
    
    var comma_first: js.UndefOr[Boolean] = js.native
    
    var e4x: js.UndefOr[Boolean] = js.native
    
    var jslint_happy: js.UndefOr[Boolean] = js.native
    
    var keep_array_indentation: js.UndefOr[Boolean] = js.native
    
    var operator_position: js.UndefOr[`before-newline` | `after-newline` | `preserve-newline`] = js.native
    
    var space_after_anon_function: js.UndefOr[Boolean] = js.native
    
    var space_after_named_function: js.UndefOr[Boolean] = js.native
    
    var space_before_conditional: js.UndefOr[Boolean] = js.native
    
    var space_in_empty_paren: js.UndefOr[Boolean] = js.native
    
    var space_in_paren: js.UndefOr[Boolean] = js.native
    
    var test_output_raw: js.UndefOr[Boolean] = js.native
    
    var unescape_strings: js.UndefOr[Boolean] = js.native
    
    var unindent_chained_methods: js.UndefOr[Boolean] = js.native
  }
  object JSBeautifyOptions {
    
    @scala.inline
    def apply(): JSBeautifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSBeautifyOptions]
    }
    
    @scala.inline
    implicit class JSBeautifyOptionsMutableBuilder[Self <: JSBeautifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrace_style(value: collapse | expand | `end-expand` | none | `preserve-inline`): Self = StObject.set(x, "brace_style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrace_styleUndefined: Self = StObject.set(x, "brace_style", js.undefined)
      
      @scala.inline
      def setBreak_chained_methods(value: Boolean): Self = StObject.set(x, "break_chained_methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreak_chained_methodsUndefined: Self = StObject.set(x, "break_chained_methods", js.undefined)
      
      @scala.inline
      def setComma_first(value: Boolean): Self = StObject.set(x, "comma_first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComma_firstUndefined: Self = StObject.set(x, "comma_first", js.undefined)
      
      @scala.inline
      def setE4x(value: Boolean): Self = StObject.set(x, "e4x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE4xUndefined: Self = StObject.set(x, "e4x", js.undefined)
      
      @scala.inline
      def setJslint_happy(value: Boolean): Self = StObject.set(x, "jslint_happy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJslint_happyUndefined: Self = StObject.set(x, "jslint_happy", js.undefined)
      
      @scala.inline
      def setKeep_array_indentation(value: Boolean): Self = StObject.set(x, "keep_array_indentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_array_indentationUndefined: Self = StObject.set(x, "keep_array_indentation", js.undefined)
      
      @scala.inline
      def setOperator_position(value: `before-newline` | `after-newline` | `preserve-newline`): Self = StObject.set(x, "operator_position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator_positionUndefined: Self = StObject.set(x, "operator_position", js.undefined)
      
      @scala.inline
      def setSpace_after_anon_function(value: Boolean): Self = StObject.set(x, "space_after_anon_function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_after_anon_functionUndefined: Self = StObject.set(x, "space_after_anon_function", js.undefined)
      
      @scala.inline
      def setSpace_after_named_function(value: Boolean): Self = StObject.set(x, "space_after_named_function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_after_named_functionUndefined: Self = StObject.set(x, "space_after_named_function", js.undefined)
      
      @scala.inline
      def setSpace_before_conditional(value: Boolean): Self = StObject.set(x, "space_before_conditional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_before_conditionalUndefined: Self = StObject.set(x, "space_before_conditional", js.undefined)
      
      @scala.inline
      def setSpace_in_empty_paren(value: Boolean): Self = StObject.set(x, "space_in_empty_paren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_in_empty_parenUndefined: Self = StObject.set(x, "space_in_empty_paren", js.undefined)
      
      @scala.inline
      def setSpace_in_paren(value: Boolean): Self = StObject.set(x, "space_in_paren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_in_parenUndefined: Self = StObject.set(x, "space_in_paren", js.undefined)
      
      @scala.inline
      def setTest_output_raw(value: Boolean): Self = StObject.set(x, "test_output_raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTest_output_rawUndefined: Self = StObject.set(x, "test_output_raw", js.undefined)
      
      @scala.inline
      def setUnescape_strings(value: Boolean): Self = StObject.set(x, "unescape_strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnescape_stringsUndefined: Self = StObject.set(x, "unescape_strings", js.undefined)
      
      @scala.inline
      def setUnindent_chained_methods(value: Boolean): Self = StObject.set(x, "unindent_chained_methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnindent_chained_methodsUndefined: Self = StObject.set(x, "unindent_chained_methods", js.undefined)
    }
  }
}
