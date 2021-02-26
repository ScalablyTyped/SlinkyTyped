package typingsSlinky.morgan

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.morgan.morganStrings.combined
import typingsSlinky.morgan.morganStrings.common
import typingsSlinky.morgan.morganStrings.dev
import typingsSlinky.morgan.morganStrings.short
import typingsSlinky.morgan.morganStrings.tiny
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /***
    * Create a new morgan logger middleware function using the given format and
    * options. The format argument may be a string of a predefined name (see below
    * for the names), or a string of a format string containing defined tokens.
    * @param format
    * @param options
    */
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: String): Handler[Request, Response] = js.native
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: String, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Create a new morgan logger middleware function using the given format and
    * options. The format argument may be a custom format function which adheres to
    * the signature.
    * @param format
    * @param options
    */
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: FormatFn[Request, Response]): Handler[Request, Response] = js.native
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: FormatFn[Request, Response], options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Standard Apache combined log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"
    * @param format
    * @param options
    */
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: combined): Handler[Request, Response] = js.native
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: combined, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Standard Apache common log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length]
    * @param format
    * @param options
    */
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: common): Handler[Request, Response] = js.native
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: common, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Concise output colored by response status for development use. The :status
    * token will be colored red for server error codes, yellow for client error
    * codes, cyan for redirection codes, and uncolored for all other codes.
    * :method :url :status :response-time ms - :res[content-length]
    * @param format
    * @param options
    */
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: dev): Handler[Request, Response] = js.native
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: dev, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * Shorter than default, also including response time.
    * :remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms
    * @param format
    * @param options
    */
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: short): Handler[Request, Response] = js.native
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: short, options: Options[Request, Response]): Handler[Request, Response] = js.native
  /***
    * The minimal output.
    * :method :url :status :res[content-length] - :response-time ms
    * @param format
    * @param options
    */
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: tiny): Handler[Request, Response] = js.native
  @JSImport("morgan", JSImport.Namespace)
  @js.native
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: tiny, options: Options[Request, Response]): Handler[Request, Response] = js.native
  
  /**
    * Compile a format string in token notation into a format function.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  @JSImport("morgan", "compile")
  @js.native
  def compile[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](format: String): FormatFn[Request, Response] = js.native
  
  /**
    * Define a named custom format by specifying a format string in token
    * notation.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  @JSImport("morgan", "format")
  @js.native
  def format[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](name: String, fmt: String): Morgan[Request, Response] = js.native
  /**
    * Define a named custom format by specifying a format function.
    */
  @JSImport("morgan", "format")
  @js.native
  def format[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](name: String, fmt: FormatFn[Request, Response]): Morgan[Request, Response] = js.native
  
  /**
    * Define a custom token which can be used in custom morgan logging formats.
    */
  @JSImport("morgan", "token")
  @js.native
  def token[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](name: String, callback: TokenCallbackFn[Request, Response]): Morgan[Request, Response] = js.native
  
  type FormatFn[Request /* <: IncomingMessage */, Response /* <: ServerResponse */] = js.Function3[
    /* tokens */ TokenIndexer[Request, Response], 
    /* req */ Request, 
    /* res */ Response, 
    js.UndefOr[String | Null]
  ]
  
  type Handler[Request /* <: IncomingMessage */, Response /* <: ServerResponse */] = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* callback */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
    Unit
  ]
  
  /**
    * Public interface of morgan logger.
    */
  @js.native
  trait Morgan[Request /* <: IncomingMessage */, Response /* <: ServerResponse */] extends StObject {
    
    /***
      * Create a new morgan logger middleware function using the given format
      * and options. The format argument may be a string of a predefined name
      * (see below for the names), or a string of a format string containing
      * defined tokens.
      * @param format
      * @param options
      */
    def apply(format: String): Handler[Request, Response] = js.native
    def apply(format: String, options: Options[Request, Response]): Handler[Request, Response] = js.native
    /***
      * Create a new morgan logger middleware function using the given format
      * and options. The format argument may be a custom format function
      * which adheres to the signature.
      * @param format
      * @param options
      */
    def apply(format: FormatFn[Request, Response]): Handler[Request, Response] = js.native
    def apply(format: FormatFn[Request, Response], options: Options[Request, Response]): Handler[Request, Response] = js.native
    /***
      * Standard Apache combined log output.
      * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"
      * @param format
      * @param options
      */
    def apply(format: combined): Handler[Request, Response] = js.native
    def apply(format: combined, options: Options[Request, Response]): Handler[Request, Response] = js.native
    /***
      * Standard Apache common log output.
      * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length]
      * @param format
      * @param options
      */
    def apply(format: common): Handler[Request, Response] = js.native
    def apply(format: common, options: Options[Request, Response]): Handler[Request, Response] = js.native
    /**
      * Concise output colored by response status for development use. The
      * :status token will be colored red for server error codes, yellow for
      * client error codes, cyan for redirection codes, and uncolored for
      * all other codes.
      * :method :url :status :response-time ms - :res[content-length]
      */
    def apply(format: dev): Handler[Request, Response] = js.native
    def apply(format: dev, options: Options[Request, Response]): Handler[Request, Response] = js.native
    /***
      * Shorter than default, also including response time.
      * :remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms
      * @param format
      * @param options
      */
    def apply(format: short): Handler[Request, Response] = js.native
    def apply(format: short, options: Options[Request, Response]): Handler[Request, Response] = js.native
    /***
      * The minimal output.
      * :method :url :status :res[content-length] - :response-time ms
      * @param format
      * @param options
      */
    def apply(format: tiny): Handler[Request, Response] = js.native
    def apply(format: tiny, options: Options[Request, Response]): Handler[Request, Response] = js.native
    
    /**
      * Compile a format string in token notation into a format function.
      */
    def compile(format: String): FormatFn[Request, Response] = js.native
    
    /**
      * Define a named custom format by specifying a format string in token
      * notation.
      */
    def format(name: String, fmt: String): Morgan[Request, Response] = js.native
    /**
      * Define a named custom format by specifying a format function.
      */
    def format(name: String, fmt: FormatFn[Request, Response]): Morgan[Request, Response] = js.native
    
    /**
      * Define a custom token which can be used in custom morgan logging
      * formats.
      */
    def token(name: String, callback: TokenCallbackFn[Request, Response]): Morgan[Request, Response] = js.native
  }
  
  /***
    * Morgan accepts these properties in the options object.
    */
  @js.native
  trait Options[Request /* <: IncomingMessage */, Response /* <: ServerResponse */] extends StObject {
    
    /***
      * Buffer duration before writing logs to the stream, defaults to false.
      * When set to true, defaults to 1000 ms.
      * @deprecated
      */
    var buffer: js.UndefOr[Boolean] = js.native
    
    /***
      * Write log line on request instead of response. This means that a
      * requests will be logged even if the server crashes, but data from the
      * response cannot be logged (like the response code).
      */
    var immediate: js.UndefOr[Boolean] = js.native
    
    /***
      * Function to determine if logging is skipped, defaults to false. This
      * function will be called as skip(req, res).
      */
    var skip: js.UndefOr[js.Function2[/* req */ Request, /* res */ Response, Boolean]] = js.native
    
    /***
      * Output stream for writing log lines, defaults to process.stdout.
      * @param str
      */
    var stream: js.UndefOr[StreamOptions] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](): Options[Request, Response] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Request, Response]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_, _], Request /* <: IncomingMessage */, Response /* <: ServerResponse */] (val x: Self with (Options[Request, Response])) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      @scala.inline
      def setSkip(value: (/* req */ Request, /* res */ Response) => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setStream(value: StreamOptions): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  @js.native
  trait StreamOptions extends StObject {
    
    /**
      * Output stream for writing log lines.
      */
    def write(str: String): Unit = js.native
  }
  object StreamOptions {
    
    @scala.inline
    def apply(write: String => Unit): StreamOptions = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[StreamOptions]
    }
    
    @scala.inline
    implicit class StreamOptionsMutableBuilder[Self <: StreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  type TokenCallbackFn[Request /* <: IncomingMessage */, Response /* <: ServerResponse */] = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* arg */ js.UndefOr[String | Double | Boolean], 
    js.UndefOr[String]
  ]
  
  type TokenIndexer[Request /* <: IncomingMessage */, Response /* <: ServerResponse */] = StringDictionary[TokenCallbackFn[Request, Response]]
}
