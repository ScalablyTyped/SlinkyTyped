package typingsSlinky.expressBunyanLogger

import typingsSlinky.bunyan.mod.LogLevel
import typingsSlinky.bunyan.mod.Serializers
import typingsSlinky.bunyan.mod.Stream
import typingsSlinky.bunyan.mod.^
import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-bunyan-logger", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-bunyan-logger", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("express-bunyan-logger", "errorLogger")
  @js.native
  def errorLogger(): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-bunyan-logger", "errorLogger")
  @js.native
  def errorLogger(options: Options): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  type FormatFunction = js.Function1[/* meta */ js.Any, String]
  
  type IncludesFunction = js.Function2[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    js.Any
  ]
  
  type LevelFunction = js.Function3[/* status */ Double, /* err */ js.Error | Null, /* meta */ js.Any, String]
  
  /* Inlined parent std.Partial<bunyan.bunyan.LoggerOptions> */
  @js.native
  trait Options extends StObject {
    
    var excludes: js.UndefOr[js.Array[String]] = js.native
    
    var format: js.UndefOr[String | FormatFunction] = js.native
    
    var genReqId: js.UndefOr[RequestIdGenFunction] = js.native
    
    var immediate: js.UndefOr[Boolean] = js.native
    
    var includesFn: js.UndefOr[IncludesFunction] = js.native
    
    var level: js.UndefOr[LogLevel] = js.native
    
    var levelFn: js.UndefOr[LevelFunction] = js.native
    
    var logger: js.UndefOr[^] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var obfuscate: js.UndefOr[js.Array[String]] = js.native
    
    var obfuscatePlaceholder: js.UndefOr[String] = js.native
    
    var parseUA: js.UndefOr[Boolean] = js.native
    
    var serializers: js.UndefOr[Serializers] = js.native
    
    var src: js.UndefOr[Boolean] = js.native
    
    var stream: js.UndefOr[WritableStream] = js.native
    
    var streams: js.UndefOr[js.Array[Stream]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      @scala.inline
      def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: String | FormatFunction): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: /* meta */ js.Any => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGenReqId(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String): Self = StObject.set(x, "genReqId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenReqIdUndefined: Self = StObject.set(x, "genReqId", js.undefined)
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      @scala.inline
      def setIncludesFn(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => js.Any
      ): Self = StObject.set(x, "includesFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIncludesFnUndefined: Self = StObject.set(x, "includesFn", js.undefined)
      
      @scala.inline
      def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelFn(value: (/* status */ Double, /* err */ js.Error | Null, /* meta */ js.Any) => String): Self = StObject.set(x, "levelFn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLevelFnUndefined: Self = StObject.set(x, "levelFn", js.undefined)
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setLogger(value: ^): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setObfuscate(value: js.Array[String]): Self = StObject.set(x, "obfuscate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObfuscatePlaceholder(value: String): Self = StObject.set(x, "obfuscatePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObfuscatePlaceholderUndefined: Self = StObject.set(x, "obfuscatePlaceholder", js.undefined)
      
      @scala.inline
      def setObfuscateUndefined: Self = StObject.set(x, "obfuscate", js.undefined)
      
      @scala.inline
      def setObfuscateVarargs(value: String*): Self = StObject.set(x, "obfuscate", js.Array(value :_*))
      
      @scala.inline
      def setParseUA(value: Boolean): Self = StObject.set(x, "parseUA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUAUndefined: Self = StObject.set(x, "parseUA", js.undefined)
      
      @scala.inline
      def setSerializers(value: Serializers): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      @scala.inline
      def setSrc(value: Boolean): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setStreams(value: js.Array[Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      @scala.inline
      def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "streams", js.Array(value :_*))
    }
  }
  
  type RequestIdGenFunction = js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], String]
}
