package typingsSlinky.anser

import typingsSlinky.anser.anserBooleans.`true`
import typingsSlinky.anser.anserStrings.blink
import typingsSlinky.anser.anserStrings.bold
import typingsSlinky.anser.anserStrings.dim
import typingsSlinky.anser.anserStrings.hidden
import typingsSlinky.anser.anserStrings.italic
import typingsSlinky.anser.anserStrings.reverse
import typingsSlinky.anser.anserStrings.strikethrough
import typingsSlinky.anser.anserStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("anser", JSImport.Default)
  @js.native
  class default () extends Anser
  /* static members */
  object default {
    
    /**
      * This replaces ANSI terminal escape codes with SPAN tags that wrap the
      * content.
      *
      * This function only interprets ANSI SGR (Select Graphic Rendition) codes
      * that can be represented in HTML.
      * For example, cursor movement codes are ignored and hidden from output.
      * The default style uses colors that are very close to the prescribed
      * standard. The standard assumes that the text will have a black
      * background. These colors are set as inline styles on the SPAN tags.
      *
      * Another option is to set `use_classes: true` in the options argument.
      * This will instead set classes on the spans so the colors can be set via
      * CSS. The class names used are of the format `ansi-*-fg/bg` and
      * `ansi-bright-*-fg/bg` where `*` is the color name,
      * i.e black/red/green/yellow/blue/magenta/cyan/white.
      *
      * @param txt The input text.
      * @param options The options.
      * @returns The HTML output.
      */
    @JSImport("anser", "default.ansiToHtml")
    @js.native
    def ansiToHtml(txt: String): String = js.native
    @JSImport("anser", "default.ansiToHtml")
    @js.native
    def ansiToHtml(txt: String, options: AnserOptions): String = js.native
    
    /**
      * Converts ANSI input into JSON output.
      *
      * @param txt The input text.
      * @param options The options.
      * @returns The HTML output.
      */
    @JSImport("anser", "default.ansiToJson")
    @js.native
    def ansiToJson(txt: String): js.Array[AnserJsonEntry] = js.native
    @JSImport("anser", "default.ansiToJson")
    @js.native
    def ansiToJson(txt: String, options: AnserOptions): js.Array[AnserJsonEntry] = js.native
    
    /**
      * Converts ANSI input into text output.
      *
      * @param txt The input text.
      * @returns The text output.
      */
    @JSImport("anser", "default.ansiToText")
    @js.native
    def ansiToText(txt: String): String = js.native
    @JSImport("anser", "default.ansiToText")
    @js.native
    def ansiToText(txt: String, options: AnserOptions): String = js.native
    
    /**
      * Escape the input HTML.
      *
      * This does the minimum escaping of text to make it compliant with HTML.
      * In particular, the '&','<', and '>' characters are escaped. This should
      * be run prior to `ansiToHtml`.
      *
      * @param txt The input text (containing the ANSI snippets).
      * @returns The escaped html.
      */
    @JSImport("anser", "default.escapeForHtml")
    @js.native
    def escapeForHtml(txt: String): String = js.native
    
    /**
      * Adds the links in the HTML.
      *
      * This replaces any links in the text with anchor tags that display the
      * link. The links should have at least one whitespace character
      * surrounding it. Also, you should apply this after you have run
      * `ansiToHtml` on the text.
      *
      * @param txt The input text.
      * @returns The HTML containing the <a> tags (unescaped).
      */
    @JSImport("anser", "default.linkify")
    @js.native
    def linkify(txt: String): String = js.native
  }
  
  @js.native
  trait Anser extends StObject {
    
    /**
      * Converts ANSI input into HTML output.
      *
      * @param txt The input text.
      * @param options The options.
      * @returns The HTML output.
      */
    def ansiToHtml(txt: String): String = js.native
    def ansiToHtml(txt: String, options: AnserOptions): String = js.native
    
    /**
      * Converts ANSI input into HTML output.
      *
      * @param txt The input text.
      * @param options The options.
      * @returns The JSON output.
      */
    def ansiToJson(txt: String): js.Array[AnserJsonEntry] = js.native
    def ansiToJson(txt: String, options: AnserOptions): js.Array[AnserJsonEntry] = js.native
    
    /**
      * Converts ANSI input into HTML output.
      *
      * @param txt The input text.
      * @returns The text output.
      */
    def ansiToText(txt: String): String = js.native
    def ansiToText(txt: String, options: AnserOptions): String = js.native
    
    /**
      * Escapes the input text.
      *
      * @param txt The input text.
      * @returns The escpaed HTML output.
      */
    def escapeForHtml(txt: String): String = js.native
    
    /**
      * Adds HTML link elements.
      *
      * @param txt The input text.
      * @returns The HTML output containing link elements.
      */
    def linkify(txt: String): String = js.native
    
    def process(txt: String): String = js.native
    def process(txt: String, options: js.UndefOr[scala.Nothing], markup: Boolean): String = js.native
    def process(txt: String, options: AnserOptions): String = js.native
    def process(txt: String, options: AnserOptions, markup: Boolean): String = js.native
    /**
      * Processes the input.
      *
      * @param txt The input text.
      * @param options The options.
      * @param markup If false, the colors will not be parsed.
      */
    def process(txt: String, options: OptionsWithJson): js.Array[AnserJsonEntry] = js.native
    def process(txt: String, options: OptionsWithJson, markup: Boolean): js.Array[AnserJsonEntry] = js.native
    
    def processChunk(text: String): String = js.native
    def processChunk(text: String, options: js.UndefOr[scala.Nothing], markup: Boolean): String = js.native
    def processChunk(text: String, options: AnserOptions): String = js.native
    def processChunk(text: String, options: AnserOptions, markup: Boolean): String = js.native
    /**
      * Processes the current chunk of text.
      *
      * @param text The input text.
      * @param options The options.
      * @param markup If false, the colors will not be parsed.
      * @return The result (object if `json` is wanted back or string otherwise).
      */
    def processChunk(text: String, options: OptionsWithJson): AnserJsonEntry = js.native
    def processChunk(text: String, options: OptionsWithJson, markup: Boolean): AnserJsonEntry = js.native
    
    /**
      * Processes the current chunk into json output.
      *
      * @param text The input text.
      * @param options The options.
      * @param markup If false, the colors will not be parsed.
      * @return The JSON output.
      */
    def processChunkJson(text: String): AnserJsonEntry = js.native
    def processChunkJson(text: String, options: js.UndefOr[scala.Nothing], markup: Boolean): AnserJsonEntry = js.native
    def processChunkJson(text: String, options: AnserOptions): AnserJsonEntry = js.native
    def processChunkJson(text: String, options: AnserOptions, markup: Boolean): AnserJsonEntry = js.native
    
    /**
      * Sets up the palette.
      */
    def setupPalette(): Unit = js.native
  }
  
  @js.native
  trait AnserJsonEntry extends StObject {
    
    /** The background color. */
    var bg: String = js.native
    
    /** The background true color (if 16m color is enabled). */
    var bg_truecolor: String = js.native
    
    /** `true` if a carriageReturn \r was fount at end of line. */
    var clearLine: Boolean = js.native
    
    /** The text. */
    var content: String = js.native
    
    var decoration: Null | bold | dim | italic | underline | blink | reverse | hidden | strikethrough = js.native
    
    /** The foreground color. */
    var fg: String = js.native
    
    /** The foreground true color (if 16m color is enabled). */
    var fg_truecolor: String = js.native
    
    /** A function returning `true` if the content is empty, or `false` otherwise. */
    def isEmpty(): Boolean = js.native
    
    /** `true` if the colors were processed, `false` otherwise. */
    var was_processed: Boolean = js.native
  }
  object AnserJsonEntry {
    
    @scala.inline
    def apply(
      bg: String,
      bg_truecolor: String,
      clearLine: Boolean,
      content: String,
      fg: String,
      fg_truecolor: String,
      isEmpty: () => Boolean,
      was_processed: Boolean
    ): AnserJsonEntry = {
      val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], bg_truecolor = bg_truecolor.asInstanceOf[js.Any], clearLine = clearLine.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], fg = fg.asInstanceOf[js.Any], fg_truecolor = fg_truecolor.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), was_processed = was_processed.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnserJsonEntry]
    }
    
    @scala.inline
    implicit class AnserJsonEntryMutableBuilder[Self <: AnserJsonEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBg_truecolor(value: String): Self = StObject.set(x, "bg_truecolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearLine(value: Boolean): Self = StObject.set(x, "clearLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoration(value: bold | dim | italic | underline | blink | reverse | hidden | strikethrough): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationNull: Self = StObject.set(x, "decoration", null)
      
      @scala.inline
      def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFg_truecolor(value: String): Self = StObject.set(x, "fg_truecolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWas_processed(value: Boolean): Self = StObject.set(x, "was_processed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnserOptions extends StObject {
    
    /** If `true`, the result will be an object. */
    var json: js.UndefOr[Boolean] = js.native
    
    var remove_empty: js.UndefOr[Boolean] = js.native
    
    /** If `true`, HTML classes will be appended to the HTML output. */
    var use_classes: js.UndefOr[Boolean] = js.native
  }
  object AnserOptions {
    
    @scala.inline
    def apply(): AnserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnserOptions]
    }
    
    @scala.inline
    implicit class AnserOptionsMutableBuilder[Self <: AnserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setRemove_empty(value: Boolean): Self = StObject.set(x, "remove_empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove_emptyUndefined: Self = StObject.set(x, "remove_empty", js.undefined)
      
      @scala.inline
      def setUse_classes(value: Boolean): Self = StObject.set(x, "use_classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_classesUndefined: Self = StObject.set(x, "use_classes", js.undefined)
    }
  }
  
  /* Inlined anser.anser.AnserOptions & {  json :true} */
  @js.native
  trait OptionsWithJson extends StObject {
    
    /** If `true`, the result will be an object. */
    var json: js.UndefOr[Boolean] with `true` = js.native
    
    var remove_empty: js.UndefOr[Boolean] = js.native
    
    /** If `true`, HTML classes will be appended to the HTML output. */
    var use_classes: js.UndefOr[Boolean] = js.native
  }
  object OptionsWithJson {
    
    @scala.inline
    def apply(json: js.UndefOr[Boolean] with `true`): OptionsWithJson = {
      val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithJson]
    }
    
    @scala.inline
    implicit class OptionsWithJsonMutableBuilder[Self <: OptionsWithJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJson(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove_empty(value: Boolean): Self = StObject.set(x, "remove_empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove_emptyUndefined: Self = StObject.set(x, "remove_empty", js.undefined)
      
      @scala.inline
      def setUse_classes(value: Boolean): Self = StObject.set(x, "use_classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_classesUndefined: Self = StObject.set(x, "use_classes", js.undefined)
    }
  }
}
