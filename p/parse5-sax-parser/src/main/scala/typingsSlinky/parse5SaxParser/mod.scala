package typingsSlinky.parse5SaxParser

import typingsSlinky.node.streamMod.Transform
import typingsSlinky.parse5.mod.Attribute
import typingsSlinky.parse5.mod.Location
import typingsSlinky.parse5.mod.StartTagLocation
import typingsSlinky.parse5SaxParser.parse5SaxParserStrings.comment
import typingsSlinky.parse5SaxParser.parse5SaxParserStrings.doctype
import typingsSlinky.parse5SaxParser.parse5SaxParserStrings.endTag
import typingsSlinky.parse5SaxParser.parse5SaxParserStrings.startTag
import typingsSlinky.parse5SaxParser.parse5SaxParserStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Streaming [SAX](https://en.wikipedia.org/wiki/Simple_API_for_XML)-style HTML parser.
    * A [transform stream](https://nodejs.org/api/stream.html#stream_class_stream_transform)
    * (which means you can pipe *through* it, see example).
    *
    * ** NOTE:** This API is available only for Node.js.
    *
    * @example
    * ```js
    *
    * const parse5 = require('parse5');
    * const http = require('http');
    * const fs = require('fs');
    *
    * const file = fs.createWriteStream('/home/google.com.html');
    * const parser = new parse5.SAXParser();
    *
    * parser.on('text', text => {
    *    // Handle page text content
    *    ...
    * });
    *
    * http.get('http://google.com', res => {
    *    // SAXParser is the Transform stream, which means you can pipe
    *    // through it. So, you can analyze page content and, e.g., save it
    *    // to the file at the same time:
    *    res.pipe(parser).pipe(file);
    * });
    * ```
    */
  @JSImport("parse5-sax-parser", JSImport.Namespace)
  @js.native
  /**
    * @param options - Parsing options.
    */
  class ^ () extends SAXParser {
    def this(options: SAXParserOptions) = this()
  }
  
  @js.native
  trait CommentToken extends StObject {
    
    /**
      * Comment source code location info. Available if location info is enabled via {@link SAXParserOptions}.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.native
    
    /**
      * Comment text.
      */
    var text: String = js.native
  }
  object CommentToken {
    
    @scala.inline
    def apply(text: String): CommentToken = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentToken]
    }
    
    @scala.inline
    implicit class CommentTokenMutableBuilder[Self <: CommentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DoctypeToken extends StObject {
    
    /**
      * Document type name.
      */
    var name: String = js.native
    
    /**
      * Document type public identifier.
      */
    var publicId: String = js.native
    
    /**
      * Document type declaration source code location info. Available if location info is enabled via {@link SAXParserOptions}.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.native
    
    /**
      * Document type system identifier.
      */
    var systemId: String = js.native
  }
  object DoctypeToken {
    
    @scala.inline
    def apply(name: String, publicId: String, systemId: String): DoctypeToken = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DoctypeToken]
    }
    
    @scala.inline
    implicit class DoctypeTokenMutableBuilder[Self <: DoctypeToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      @scala.inline
      def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EndTagToken extends StObject {
    
    /**
      * End tag source code location info. Available if location info is enabled via {@link SAXParserOptions}.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.native
    
    /**
      * Tag name.
      */
    var tagName: String = js.native
  }
  object EndTagToken {
    
    @scala.inline
    def apply(tagName: String): EndTagToken = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndTagToken]
    }
    
    @scala.inline
    implicit class EndTagTokenMutableBuilder[Self <: EndTagToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Streaming [SAX](https://en.wikipedia.org/wiki/Simple_API_for_XML)-style HTML parser.
    * A [transform stream](https://nodejs.org/api/stream.html#stream_class_stream_transform)
    * (which means you can pipe *through* it, see example).
    *
    * ** NOTE:** This API is available only for Node.js.
    *
    * @example
    * ```js
    *
    * const parse5 = require('parse5');
    * const http = require('http');
    * const fs = require('fs');
    *
    * const file = fs.createWriteStream('/home/google.com.html');
    * const parser = new parse5.SAXParser();
    *
    * parser.on('text', text => {
    *    // Handle page text content
    *    ...
    * });
    *
    * http.get('http://google.com', res => {
    *    // SAXParser is the Transform stream, which means you can pipe
    *    // through it. So, you can analyze page content and, e.g., save it
    *    // to the file at the same time:
    *    res.pipe(parser).pipe(file);
    * });
    * ```
    */
  @js.native
  trait SAXParser extends Transform {
    
    /**
      * Raised when parser encounters a comment.
      *
      * @param listener.comment - Comment content.
      */
    @JSName("on")
    def on_comment(event: comment, listener: js.Function1[/* comment */ CommentToken, Unit]): this.type = js.native
    /**
      * Raised when parser encounters a [document type declaration](https://en.wikipedia.org/wiki/Document_type_declaration).
      *
      * @param listener.doctype - Document type token.
      */
    @JSName("on")
    def on_doctype(event: doctype, listener: js.Function1[/* doctype */ DoctypeToken, Unit]): this.type = js.native
    /**
      * Raised when parser encounters an end tag.
      *
      * @param listener.endTag - End tag token.
      */
    @JSName("on")
    def on_endTag(event: endTag, listener: js.Function1[/* endTag */ EndTagToken, Unit]): this.type = js.native
    /**
      * Raised when the parser encounters a start tag.
      *
      * @param listener.startTag - Start tag token.
      */
    @JSName("on")
    def on_startTag(event: startTag, listener: js.Function1[/* startTag */ StartTagToken, Unit]): this.type = js.native
    /**
      * Raised when parser encounters text content.
      *
      * @param listener.text - Text token.
      */
    @JSName("on")
    def on_text(event: text, listener: js.Function1[/* text */ TextToken, Unit]): this.type = js.native
    
    /**
      * Stops parsing. Useful if you want the parser to stop consuming CPU time once you've obtained the desired info
      * from the input stream. Doesn't prevent piping, so that data will flow through the parser as usual.
      *
      * @example
      * ```js
      *
      * const parse5 = require('parse5');
      * const http = require('http');
      * const fs = require('fs');
      *
      * const file = fs.createWriteStream('google.com.html');
      * const parser = new parse5.SAXParser();
      *
      * parser.on('doctype', (name, publicId, systemId) => {
      *    // Process doctype info ans stop parsing
      *    ...
      *    parser.stop();
      * });
      *
      * http.get('http://google.com', res => {
      *    // Despite the fact that parser.stop() was called whole
      *    // content of the page will be written to the file
      *    res.pipe(parser).pipe(file);
      * });
      * ```
      */
    def stop(): Unit = js.native
  }
  
  @js.native
  trait SAXParserOptions extends StObject {
    
    /**
      * Enables source code location information for the tokens.
      * When enabled, each token event handler will receive {@link Location} (or {@link StartTagLocation})
      * object as its last argument.
      */
    var sourceCodeLocationInfo: js.UndefOr[Boolean] = js.native
  }
  object SAXParserOptions {
    
    @scala.inline
    def apply(): SAXParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SAXParserOptions]
    }
    
    @scala.inline
    implicit class SAXParserOptionsMutableBuilder[Self <: SAXParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceCodeLocationInfo(value: Boolean): Self = StObject.set(x, "sourceCodeLocationInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocationInfoUndefined: Self = StObject.set(x, "sourceCodeLocationInfo", js.undefined)
    }
  }
  
  @js.native
  trait StartTagToken extends StObject {
    
    /**
      * List of attributes.
      */
    var attrs: js.Array[Attribute] = js.native
    
    /**
      * Indicates if the tag is self-closing.
      */
    var selfClosing: Boolean = js.native
    
    /**
      * Start tag source code location info. Available if location info is enabled via {@link SAXParserOptions}.
      */
    var sourceCodeLocation: js.UndefOr[StartTagLocation] = js.native
    
    /**
      * Tag name.
      */
    var tagName: String = js.native
  }
  object StartTagToken {
    
    @scala.inline
    def apply(attrs: js.Array[Attribute], selfClosing: Boolean, tagName: String): StartTagToken = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartTagToken]
    }
    
    @scala.inline
    implicit class StartTagTokenMutableBuilder[Self <: StartTagToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: js.Array[Attribute]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsVarargs(value: Attribute*): Self = StObject.set(x, "attrs", js.Array(value :_*))
      
      @scala.inline
      def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocation(value: StartTagLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextToken extends StObject {
    
    /**
      * Text content source code location info. Available if location info is enabled via {@link SAXParserOptions}.
      */
    var sourceCodeLocation: js.UndefOr[Location] = js.native
    
    /**
      * Text content.
      */
    var text: String = js.native
  }
  object TextToken {
    
    @scala.inline
    def apply(text: String): TextToken = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextToken]
    }
    
    @scala.inline
    implicit class TextTokenMutableBuilder[Self <: TextToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
