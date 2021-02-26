package typingsSlinky.pino

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pino.mod.LogEvent
import typingsSlinky.pino.mod.LogFn
import typingsSlinky.pino.mod.WriteFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AsObject extends StObject {
    
    /**
      * The `asObject` option will create a pino-like log object instead of passing all arguments to a console
      * method. When `write` is set, `asObject` will always be true.
      *
      * @example
      * pino.info('hi') // creates and logs {msg: 'hi', level: 30, time: <ts>}
      */
    var asObject: js.UndefOr[Boolean] = js.native
    
    /**
      * The serializers provided to `pino` are ignored by default in the browser, including the standard
      * serializers provided with Pino. Since the default destination for log messages is the console, values
      * such as `Error` objects are enhanced for inspection, which they otherwise wouldn't be if the Error
      * serializer was enabled. We can turn all serializers on or we can selectively enable them via an array.
      *
      * When `serialize` is `true` the standard error serializer is also enabled (see
      * {@link https://github.com/pinojs/pino/blob/master/docs/api.md#pino-stdserializers}). This is a global
      * serializer which will apply to any `Error` objects passed to the logger methods.
      *
      * If `serialize` is an array the standard error serializer is also automatically enabled, it can be
      * explicitly disabled by including a string in the serialize array: `!stdSerializers.err` (see example).
      *
      * The `serialize` array also applies to any child logger serializers (see
      * {@link https://github.com/pinojs/pino/blob/master/docs/api.md#bindingsserializers-object} for how to
      * set child-bound serializers).
      *
      * Unlike server pino the serializers apply to every object passed to the logger method, if the `asObject`
      * option is `true`, this results in the serializers applying to the first object (as in server pino).
      *
      * For more info on serializers see
      * {@link https://github.com/pinojs/pino/blob/master/docs/api.md#serializers-object}.
      *
      * @example
      * const pino = require('pino')({
      *   browser: {
      *     serialize: true
      *   }
      * })
      *
      * @example
      * const pino = require('pino')({
      *   serializers: {
      *     custom: myCustomSerializer,
      *     another: anotherSerializer
      *   },
      *   browser: {
      *     serialize: ['custom']
      *   }
      * })
      * // following will apply myCustomSerializer to the custom property,
      * // but will not apply anotherSerializer to another key
      * pino.info({custom: 'a', another: 'b'})
      *
      * @example
      * const pino = require('pino')({
      *   serializers: {
      *     custom: myCustomSerializer,
      *     another: anotherSerializer
      *   },
      *   browser: {
      *     serialize: ['!stdSerializers.err', 'custom'] //will not serialize Errors, will serialize `custom` keys
      *   }
      * })
      */
    var serialize: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    /**
      * Options for transmission of logs.
      *
      * @example
      * const pino = require('pino')({
      *   browser: {
      *     transmit: {
      *       level: 'warn',
      *       send: function (level, logEvent) {
      *         if (level === 'warn') {
      *           // maybe send the logEvent to a separate endpoint
      *           // or maybe analyse the messages further before sending
      *         }
      *         // we could also use the `logEvent.level.value` property to determine
      *         // numerical value
      *         if (logEvent.level.value >= 50) { // covers error and fatal
      *
      *           // send the logEvent somewhere
      *         }
      *       }
      *     }
      *   }
      * })
      */
    var transmit: js.UndefOr[Level] = js.native
    
    /**
      * Instead of passing log messages to `console.log` they can be passed to a supplied function. If `write` is
      * set to a single function, all logging objects are passed to this function. If `write` is an object, it
      * can have methods that correspond to the levels. When a message is logged at a given level, the
      * corresponding method is called. If a method isn't present, the logging falls back to using the `console`.
      *
      * @example
      * const pino = require('pino')({
      *   browser: {
      *     write: (o) => {
      *       // do something with o
      *     }
      *   }
      * })
      *
      * @example
      * const pino = require('pino')({
      *   browser: {
      *     write: {
      *       info: function (o) {
      *         //process info log object
      *       },
      *       error: function (o) {
      *         //process error log object
      *       }
      *     }
      *   }
      * })
      */
    var write: js.UndefOr[WriteFn | DictlogLevel] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(): AsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsObject(value: Boolean): Self = StObject.set(x, "asObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsObjectUndefined: Self = StObject.set(x, "asObject", js.undefined)
      
      @scala.inline
      def setSerialize(value: Boolean | js.Array[String]): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      @scala.inline
      def setSerializeVarargs(value: String*): Self = StObject.set(x, "serialize", js.Array(value :_*))
      
      @scala.inline
      def setTransmit(value: Level): Self = StObject.set(x, "transmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransmitUndefined: Self = StObject.set(x, "transmit", js.undefined)
      
      @scala.inline
      def setWrite(value: WriteFn | DictlogLevel): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteFunction1(value: /* o */ js.Object => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  @js.native
  trait Bindings extends StObject {
    
    /**
      * Changes the shape of the bindings.
      * The default shape is { pid, hostname }.
      * The function takes a single argument, the bindings object.
      * It will be called every time a child logger is created.
      */
    var bindings: js.UndefOr[js.Function1[/* bindings */ typingsSlinky.pino.mod.Bindings, js.Object]] = js.native
    
    /**
      * Changes the shape of the log level.
      * The default shape is { level: number }.
      * The function takes two arguments, the label of the level (e.g. 'info') and the numeric value (e.g. 30).
      */
    var level: js.UndefOr[js.Function2[/* level */ String, /* number */ Double, js.Object]] = js.native
    
    /**
      * Changes the shape of the log object.
      * This function will be called every time one of the log methods (such as .info) is called.
      * All arguments passed to the log method, except the message, will be pass to this function.
      * By default it does not change the shape of the log object.
      */
    var log: js.UndefOr[js.Function1[/* object */ js.Object, js.Object]] = js.native
  }
  object Bindings {
    
    @scala.inline
    def apply(): Bindings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bindings]
    }
    
    @scala.inline
    implicit class BindingsMutableBuilder[Self <: Bindings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindings(value: /* bindings */ typingsSlinky.pino.mod.Bindings => js.Object): Self = StObject.set(x, "bindings", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
      
      @scala.inline
      def setLevel(value: (/* level */ String, /* number */ Double) => js.Object): Self = StObject.set(x, "level", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setLog(value: /* object */ js.Object => js.Object): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    }
  }
  
  @js.native
  trait DictlogLevel extends /* logLevel */ StringDictionary[WriteFn] {
    
    var debug: js.UndefOr[WriteFn] = js.native
    
    var error: js.UndefOr[WriteFn] = js.native
    
    var fatal: js.UndefOr[WriteFn] = js.native
    
    var info: js.UndefOr[WriteFn] = js.native
    
    var trace: js.UndefOr[WriteFn] = js.native
    
    var warn: js.UndefOr[WriteFn] = js.native
  }
  object DictlogLevel {
    
    @scala.inline
    def apply(): DictlogLevel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictlogLevel]
    }
    
    @scala.inline
    implicit class DictlogLevelMutableBuilder[Self <: DictlogLevel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: /* o */ js.Object => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setError(value: /* o */ js.Object => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFatal(value: /* o */ js.Object => Unit): Self = StObject.set(x, "fatal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      @scala.inline
      def setInfo(value: /* o */ js.Object => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setTrace(value: /* o */ js.Object => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      @scala.inline
      def setWarn(value: /* o */ js.Object => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    var label: String = js.native
    
    var value: Double = js.native
  }
  object Label {
    
    @scala.inline
    def apply(label: String, value: Double): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Level extends StObject {
    
    /**
      * Specifies the minimum level (inclusive) of when the `send` function should be called, if not supplied
      * the `send` function will be called based on the main logging `level` (set via `options.level`,
      * defaulting to `info`).
      */
    var level: js.UndefOr[typingsSlinky.pino.mod.Level | String] = js.native
    
    /**
      * Remotely record log messages.
      *
      * @description Called after writing the log message.
      */
    def send(level: typingsSlinky.pino.mod.Level, logEvent: LogEvent): Unit = js.native
  }
  object Level {
    
    @scala.inline
    def apply(send: (typingsSlinky.pino.mod.Level, LogEvent) => Unit): Level = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: typingsSlinky.pino.mod.Level | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setSend(value: (typingsSlinky.pino.mod.Level, LogEvent) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait LogMethod extends StObject {
    
    /**
      * Allows for manipulating the parameters passed to logger methods. The signature for this hook is
      * logMethod (args, method) {}, where args is an array of the arguments that were passed to the
      * log method and method is the log method itself. This hook must invoke the method function by
      * using apply, like so: method.apply(this, newArgumentsArray).
      */
    var logMethod: js.UndefOr[js.Function2[/* args */ js.Array[_], /* method */ LogFn, Unit]] = js.native
  }
  object LogMethod {
    
    @scala.inline
    def apply(): LogMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogMethod]
    }
    
    @scala.inline
    implicit class LogMethodMutableBuilder[Self <: LogMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogMethod(value: (/* args */ js.Array[_], /* method */ LogFn) => Unit): Self = StObject.set(x, "logMethod", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLogMethodUndefined: Self = StObject.set(x, "logMethod", js.undefined)
    }
  }
}
