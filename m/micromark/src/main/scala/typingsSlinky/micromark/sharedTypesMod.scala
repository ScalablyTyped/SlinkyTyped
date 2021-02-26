package typingsSlinky.micromark

import typingsSlinky.micromark.codesMod.Code
import typingsSlinky.micromark.micromarkStrings.Carriagereturn
import typingsSlinky.micromark.micromarkStrings.CarriagereturnLinefeed
import typingsSlinky.micromark.micromarkStrings.Linefeed
import typingsSlinky.micromark.micromarkStrings.`null`
import typingsSlinky.micromark.micromarkStrings.content
import typingsSlinky.micromark.micromarkStrings.flow
import typingsSlinky.micromark.micromarkStrings.string
import typingsSlinky.micromark.micromarkStrings.text
import typingsSlinky.micromark.typesMod.Type
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedTypesMod {
  
  @js.native
  trait Buffer extends StObject {
    
    def toString(encoding: BufferEncoding): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.micromark.micromarkStrings.ascii
    - typingsSlinky.micromark.micromarkStrings.utf8
    - typingsSlinky.micromark.micromarkStrings.`utf-8`
    - typingsSlinky.micromark.micromarkStrings.utf16le
    - typingsSlinky.micromark.micromarkStrings.ucs2
    - typingsSlinky.micromark.micromarkStrings.`ucs-2`
    - typingsSlinky.micromark.micromarkStrings.base64
    - typingsSlinky.micromark.micromarkStrings.latin1
    - typingsSlinky.micromark.micromarkStrings.binary
    - typingsSlinky.micromark.micromarkStrings.hex
  */
  trait BufferEncoding extends StObject
  object BufferEncoding {
    
    @scala.inline
    def ascii: typingsSlinky.micromark.micromarkStrings.ascii = "ascii".asInstanceOf[typingsSlinky.micromark.micromarkStrings.ascii]
    
    @scala.inline
    def base64: typingsSlinky.micromark.micromarkStrings.base64 = "base64".asInstanceOf[typingsSlinky.micromark.micromarkStrings.base64]
    
    @scala.inline
    def binary: typingsSlinky.micromark.micromarkStrings.binary = "binary".asInstanceOf[typingsSlinky.micromark.micromarkStrings.binary]
    
    @scala.inline
    def hex: typingsSlinky.micromark.micromarkStrings.hex = "hex".asInstanceOf[typingsSlinky.micromark.micromarkStrings.hex]
    
    @scala.inline
    def latin1: typingsSlinky.micromark.micromarkStrings.latin1 = "latin1".asInstanceOf[typingsSlinky.micromark.micromarkStrings.latin1]
    
    @scala.inline
    def `ucs-2`: typingsSlinky.micromark.micromarkStrings.`ucs-2` = "ucs-2".asInstanceOf[typingsSlinky.micromark.micromarkStrings.`ucs-2`]
    
    @scala.inline
    def ucs2: typingsSlinky.micromark.micromarkStrings.ucs2 = "ucs2".asInstanceOf[typingsSlinky.micromark.micromarkStrings.ucs2]
    
    @scala.inline
    def `utf-8`: typingsSlinky.micromark.micromarkStrings.`utf-8` = "utf-8".asInstanceOf[typingsSlinky.micromark.micromarkStrings.`utf-8`]
    
    @scala.inline
    def utf16le: typingsSlinky.micromark.micromarkStrings.utf16le = "utf16le".asInstanceOf[typingsSlinky.micromark.micromarkStrings.utf16le]
    
    @scala.inline
    def utf8: typingsSlinky.micromark.micromarkStrings.utf8 = "utf8".asInstanceOf[typingsSlinky.micromark.micromarkStrings.utf8]
  }
  
  type Chunk = NonNullable[Code] | String
  
  type CodeAsKey = NonNullable[Code] | `null`
  
  type CodeCheck = js.Function1[/* code */ Code, Boolean]
  
  type Compile = js.Function1[/* slice */ js.Array[Event], String]
  
  @js.native
  trait CompileOptions extends StObject {
    
    // Whether to allow embedded HTML (`boolean`, default: `false`).
    //
    var allowDangerousHtml: js.UndefOr[Boolean] = js.native
    
    // Whether to allow potentially dangerous protocols in links and images (`boolean`,
    // default: `false`).
    // URLs relative to the current protocol are always allowed (such as, `image.jpg`).
    // For links, the allowed protocols are `http`, `https`, `irc`, `ircs`, `mailto`,
    // and `xmpp`.
    // For images, the allowed protocols are `http` and `https`.
    //
    var allowDangerousProtocol: js.UndefOr[Boolean] = js.native
    
    // Value to use for line endings not in `doc` (`string`, default: first line
    // ending or `'\n'`).
    //
    // Generally, micromark copies line endings (`'\r'`, `'\n'`, `'\r\n'`) in the
    // markdown document over to the compiled HTML.
    // In some cases, such as `> a`, CommonMark requires that extra line endings are
    // added: `<blockquote>\n<p>a</p>\n</blockquote>`.
    //
    var defaultLineEnding: js.UndefOr[Carriagereturn | Linefeed | CarriagereturnLinefeed] = js.native
    
    // Array of HTML extensions
    //
    var htmlExtensions: js.UndefOr[js.Array[HtmlExtension]] = js.native
  }
  object CompileOptions {
    
    @scala.inline
    def apply(): CompileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompileOptions]
    }
    
    @scala.inline
    implicit class CompileOptionsMutableBuilder[Self <: CompileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDangerousHtml(value: Boolean): Self = StObject.set(x, "allowDangerousHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDangerousHtmlUndefined: Self = StObject.set(x, "allowDangerousHtml", js.undefined)
      
      @scala.inline
      def setAllowDangerousProtocol(value: Boolean): Self = StObject.set(x, "allowDangerousProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDangerousProtocolUndefined: Self = StObject.set(x, "allowDangerousProtocol", js.undefined)
      
      @scala.inline
      def setDefaultLineEnding(value: Carriagereturn | Linefeed | CarriagereturnLinefeed): Self = StObject.set(x, "defaultLineEnding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLineEndingUndefined: Self = StObject.set(x, "defaultLineEnding", js.undefined)
      
      @scala.inline
      def setHtmlExtensions(value: js.Array[HtmlExtension]): Self = StObject.set(x, "htmlExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlExtensionsUndefined: Self = StObject.set(x, "htmlExtensions", js.undefined)
      
      @scala.inline
      def setHtmlExtensionsVarargs(value: HtmlExtension*): Self = StObject.set(x, "htmlExtensions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Construct extends StObject {
    
    var concrete: js.UndefOr[Boolean] = js.native
    
    var interruptible: js.UndefOr[Boolean] = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    var partial: js.UndefOr[Boolean] = js.native
    
    var resolve: js.UndefOr[Resolve] = js.native
    
    var resolveAll: js.UndefOr[Resolve] = js.native
    
    var resolveTo: js.UndefOr[Resolve] = js.native
    
    def tokenize(context: Tokenizer, effects: Effects): State = js.native
    @JSName("tokenize")
    var tokenize_Original: Tokenize = js.native
  }
  
  @js.native
  trait Effects extends StObject {
    
    def attempt(constructInfo: js.Array[Construct], returnState: State): js.Function1[/* code */ Code, Unit] = js.native
    def attempt(constructInfo: js.Array[Construct], returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit] = js.native
    /**
      * Attempt deals with several values, and tries to parse according to those values.
      * If a value resulted in `ok`, it worked, the tokens that were made are used,
      * and `returnState` is switched to.
      * If the result is `nok`, the attempt failed,
      * so we revert to the original state, and `bogusState` is used.
      */
    def attempt(constructInfo: Construct, returnState: State): js.Function1[/* code */ Code, Unit] = js.native
    def attempt(constructInfo: Construct, returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit] = js.native
    def attempt(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], returnState: State): js.Function1[/* code */ Code, Unit] = js.native
    def attempt(
      constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]],
      returnState: State,
      bogusState: State
    ): js.Function1[/* code */ Code, Unit] = js.native
    
    def check(constructInfo: js.Array[Construct], ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
    def check(constructInfo: js.Array[Construct], ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
    def check(constructInfo: Construct, ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
    def check(constructInfo: Construct, ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
    def check(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
    def check(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
    
    /**
      * Consume deals with a character, and moves to the next
      */
    def consume(code: Double): Unit = js.native
    
    /**
      * Enter and exit define where tokens start and end
      */
    def enter(`type`: Type): Token = js.native
    
    /**
      * Enter and exit define where tokens start and end
      */
    def exit(`type`: Type): Token = js.native
    
    def interrupt(constructInfo: js.Array[Construct], ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
    def interrupt(constructInfo: js.Array[Construct], ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
    /**
      * Interrupt is used for stuff right after a line of content.
      */
    def interrupt(constructInfo: Construct, ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
    def interrupt(constructInfo: Construct, ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
    def interrupt(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
    def interrupt(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
    
    def `lazy`(constructInfo: js.Array[Construct], ok: Okay): Unit = js.native
    def `lazy`(constructInfo: js.Array[Construct], ok: Okay, nok: NotOkay): Unit = js.native
    /**
      * Lazy is used for lines that were not properly preceded by the container.
      */
    def `lazy`(constructInfo: Construct, ok: Okay): Unit = js.native
    def `lazy`(constructInfo: Construct, ok: Okay, nok: NotOkay): Unit = js.native
    def `lazy`(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay): Unit = js.native
    def `lazy`(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay, nok: NotOkay): Unit = js.native
  }
  
  type Event = js.Tuple3[String, Token, Tokenizer]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.micromark.anon.Enter
    - typingsSlinky.micromark.anon.Exit
  */
  trait HtmlExtension extends StObject
  object HtmlExtension {
    
    @scala.inline
    def Enter(enter: Record[Type, js.Function0[Unit]]): typingsSlinky.micromark.anon.Enter = {
      val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.micromark.anon.Enter]
    }
    
    @scala.inline
    def Exit(exit: Record[Type, js.Function0[Unit]]): typingsSlinky.micromark.anon.Exit = {
      val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.micromark.anon.Exit]
    }
  }
  
  type NotOkay = State
  
  type Okay = State
  
  type Options = ParseOptions with CompileOptions
  
  @js.native
  trait ParseOptions extends StObject {
    
    // Array of syntax extensions
    //
    var extensions: js.UndefOr[js.Array[SyntaxExtension]] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: js.Array[SyntaxExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: SyntaxExtension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Parser extends StObject {
    
    var constructs: Record[CodeAsKey, Construct | js.Array[Construct]] = js.native
    
    def content(from: Point): Tokenizer = js.native
    
    var defined: js.Array[String] = js.native
    
    def document(from: Point): Tokenizer = js.native
    
    def flow(from: Point): Tokenizer = js.native
    
    def string(from: Point): Tokenizer = js.native
    
    def text(from: Point): Tokenizer = js.native
  }
  object Parser {
    
    @scala.inline
    def apply(
      constructs: Record[CodeAsKey, Construct | js.Array[Construct]],
      content: Point => Tokenizer,
      defined: js.Array[String],
      document: Point => Tokenizer,
      flow: Point => Tokenizer,
      string: Point => Tokenizer,
      text: Point => Tokenizer
    ): Parser = {
      val __obj = js.Dynamic.literal(constructs = constructs.asInstanceOf[js.Any], content = js.Any.fromFunction1(content), defined = defined.asInstanceOf[js.Any], document = js.Any.fromFunction1(document), flow = js.Any.fromFunction1(flow), string = js.Any.fromFunction1(string), text = js.Any.fromFunction1(text))
      __obj.asInstanceOf[Parser]
    }
    
    @scala.inline
    implicit class ParserMutableBuilder[Self <: Parser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstructs(value: Record[CodeAsKey, Construct | js.Array[Construct]]): Self = StObject.set(x, "constructs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: Point => Tokenizer): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefined(value: js.Array[String]): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinedVarargs(value: String*): Self = StObject.set(x, "defined", js.Array(value :_*))
      
      @scala.inline
      def setDocument(value: Point => Tokenizer): Self = StObject.set(x, "document", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlow(value: Point => Tokenizer): Self = StObject.set(x, "flow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setString(value: Point => Tokenizer): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
      
      @scala.inline
      def setText(value: Point => Tokenizer): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Point extends StObject {
    
    var _bufferIndex: js.UndefOr[Double] = js.native
    
    var _index: js.UndefOr[Double] = js.native
    
    var column: Double = js.native
    
    var line: Double = js.native
    
    var offset: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(column: Double, line: Double, offset: Double): Point = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bufferIndex(value: Double): Self = StObject.set(x, "_bufferIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bufferIndexUndefined: Self = StObject.set(x, "_bufferIndex", js.undefined)
      
      @scala.inline
      def set_index(value: Double): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_indexUndefined: Self = StObject.set(x, "_index", js.undefined)
    }
  }
  
  type Resolve = js.Function2[/* events */ js.Array[Event], /* context */ Tokenizer, js.Array[Event]]
  
  type State = js.Function1[
    /* code */ Double, 
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias micromark.micromark/dist/shared-types.State */ js.Object) | Unit
  ]
  
  @js.native
  trait SyntaxExtension extends StObject {
    
    var contentInitial: js.UndefOr[Record[CodeAsKey, Construct | js.Array[Construct]]] = js.native
    
    var document: js.UndefOr[Record[CodeAsKey, Construct | js.Array[Construct]]] = js.native
    
    var flow: js.UndefOr[Record[CodeAsKey, Construct | js.Array[Construct]]] = js.native
    
    var flowInitial: js.UndefOr[Record[CodeAsKey, Construct | js.Array[Construct]]] = js.native
    
    var string: js.UndefOr[Record[CodeAsKey, Construct | js.Array[Construct]]] = js.native
    
    var text: js.UndefOr[Record[CodeAsKey, Construct | js.Array[Construct]]] = js.native
  }
  object SyntaxExtension {
    
    @scala.inline
    def apply(): SyntaxExtension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyntaxExtension]
    }
    
    @scala.inline
    implicit class SyntaxExtensionMutableBuilder[Self <: SyntaxExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentInitial(value: Record[CodeAsKey, Construct | js.Array[Construct]]): Self = StObject.set(x, "contentInitial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentInitialUndefined: Self = StObject.set(x, "contentInitial", js.undefined)
      
      @scala.inline
      def setDocument(value: Record[CodeAsKey, Construct | js.Array[Construct]]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      @scala.inline
      def setFlow(value: Record[CodeAsKey, Construct | js.Array[Construct]]): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowInitial(value: Record[CodeAsKey, Construct | js.Array[Construct]]): Self = StObject.set(x, "flowInitial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowInitialUndefined: Self = StObject.set(x, "flowInitial", js.undefined)
      
      @scala.inline
      def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
      
      @scala.inline
      def setString(value: Record[CodeAsKey, Construct | js.Array[Construct]]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setText(value: Record[CodeAsKey, Construct | js.Array[Construct]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait Token extends StObject {
    
    /**
      * Close and open are also used in attention:
      * depending on the characters before and after sequences (**),
      * the sequence can open, close, both, or none
      */
    var _close: js.UndefOr[Boolean] = js.native
    
    /**
      * Close and open are also used in attention:
      * depending on the characters before and after sequences (**),
      * the sequence can open, close, both, or none
      */
    var _open: js.UndefOr[Boolean] = js.native
    
    /**
      * Used when dealing with linked tokens. A child tokenizer is needed to tokenize them, which is stored on those tokens
      */
    var _tokenizer: js.UndefOr[Tokenizer] = js.native
    
    /**
      * Declares a token as having content of a certain type.
      * Because markdown requires to first parse containers, flow, content completely,
      * and then later go on to phrasing and such, it needs to be declared somewhere on the tokens.
      */
    var contentType: js.UndefOr[flow | content | string | text] = js.native
    
    var end: Point = js.native
    
    var next: js.UndefOr[Token] = js.native
    
    var previous: js.UndefOr[Token] = js.native
    
    var start: Point = js.native
    
    var `type`: Type = js.native
  }
  object Token {
    
    @scala.inline
    def apply(end: Point, start: Point, `type`: Type): Token = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: flow | content | string | text): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: Token): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPrevious(value: Token): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      @scala.inline
      def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_close(value: Boolean): Self = StObject.set(x, "_close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_closeUndefined: Self = StObject.set(x, "_close", js.undefined)
      
      @scala.inline
      def set_open(value: Boolean): Self = StObject.set(x, "_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_openUndefined: Self = StObject.set(x, "_open", js.undefined)
      
      @scala.inline
      def set_tokenizer(value: Tokenizer): Self = StObject.set(x, "_tokenizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tokenizerUndefined: Self = StObject.set(x, "_tokenizer", js.undefined)
    }
  }
  
  type Tokenize = js.Function2[/* context */ Tokenizer, /* effects */ Effects, State]
  
  @js.native
  trait Tokenizer extends StObject {
    
    def defineSkip(value: Point): Unit = js.native
    
    var events: js.Array[Event] = js.native
    
    def now(): Point = js.native
    
    var parser: Parser = js.native
    
    var previous: Code = js.native
    
    def sliceSerialize(token: Token): String = js.native
    
    def sliceStream(token: Token): js.Array[Chunk] = js.native
    
    def write(slice: js.Array[Chunk]): js.Array[Event] = js.native
  }
  object Tokenizer {
    
    @scala.inline
    def apply(
      defineSkip: Point => Unit,
      events: js.Array[Event],
      now: () => Point,
      parser: Parser,
      sliceSerialize: Token => String,
      sliceStream: Token => js.Array[Chunk],
      write: js.Array[Chunk] => js.Array[Event]
    ): Tokenizer = {
      val __obj = js.Dynamic.literal(defineSkip = js.Any.fromFunction1(defineSkip), events = events.asInstanceOf[js.Any], now = js.Any.fromFunction0(now), parser = parser.asInstanceOf[js.Any], sliceSerialize = js.Any.fromFunction1(sliceSerialize), sliceStream = js.Any.fromFunction1(sliceStream), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Tokenizer]
    }
    
    @scala.inline
    implicit class TokenizerMutableBuilder[Self <: Tokenizer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefineSkip(value: Point => Unit): Self = StObject.set(x, "defineSkip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setNow(value: () => Point): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParser(value: Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevious(value: Code): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousNull: Self = StObject.set(x, "previous", null)
      
      @scala.inline
      def setSliceSerialize(value: Token => String): Self = StObject.set(x, "sliceSerialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSliceStream(value: Token => js.Array[Chunk]): Self = StObject.set(x, "sliceStream", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(value: js.Array[Chunk] => js.Array[Event]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TokenizerThis extends StObject {
    
    var containerState: js.UndefOr[Record[String, _]] = js.native
    
    var events: js.Array[Event] = js.native
    
    var interrupt: js.UndefOr[Boolean] = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
  }
  object TokenizerThis {
    
    @scala.inline
    def apply(events: js.Array[Event]): TokenizerThis = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizerThis]
    }
    
    @scala.inline
    implicit class TokenizerThisMutableBuilder[Self <: TokenizerThis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerState(value: Record[String, _]): Self = StObject.set(x, "containerState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStateUndefined: Self = StObject.set(x, "containerState", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setInterrupt(value: Boolean): Self = StObject.set(x, "interrupt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterruptUndefined: Self = StObject.set(x, "interrupt", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    }
  }
}
