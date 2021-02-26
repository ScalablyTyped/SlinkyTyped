package typingsSlinky.logProcessErrors

import typingsSlinky.logProcessErrors.anon.PartialRecordExceptionTyp
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.`node-tap`
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.ava
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.jasmine
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.mocha
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.tape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Log Process Errors
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#logprocesserrorsoptions
    */
  @JSImport("log-process-errors", JSImport.Namespace)
  @js.native
  def apply(): js.Function0[Unit] = js.native
  @JSImport("log-process-errors", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Function0[Unit] = js.native
  
  /**
    * Exception type.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.logProcessErrors.logProcessErrorsStrings.uncaughtException
    - typingsSlinky.logProcessErrors.logProcessErrorsStrings.unhandledRejection
    - typingsSlinky.logProcessErrors.logProcessErrorsStrings.rejectionHandled
    - typingsSlinky.logProcessErrors.logProcessErrorsStrings.multipleResolves
    - typingsSlinky.logProcessErrors.logProcessErrorsStrings.warning
  */
  trait ExceptionType extends StObject
  object ExceptionType {
    
    @scala.inline
    def multipleResolves: typingsSlinky.logProcessErrors.logProcessErrorsStrings.multipleResolves = "multipleResolves".asInstanceOf[typingsSlinky.logProcessErrors.logProcessErrorsStrings.multipleResolves]
    
    @scala.inline
    def rejectionHandled: typingsSlinky.logProcessErrors.logProcessErrorsStrings.rejectionHandled = "rejectionHandled".asInstanceOf[typingsSlinky.logProcessErrors.logProcessErrorsStrings.rejectionHandled]
    
    @scala.inline
    def uncaughtException: typingsSlinky.logProcessErrors.logProcessErrorsStrings.uncaughtException = "uncaughtException".asInstanceOf[typingsSlinky.logProcessErrors.logProcessErrorsStrings.uncaughtException]
    
    @scala.inline
    def unhandledRejection: typingsSlinky.logProcessErrors.logProcessErrorsStrings.unhandledRejection = "unhandledRejection".asInstanceOf[typingsSlinky.logProcessErrors.logProcessErrorsStrings.unhandledRejection]
    
    @scala.inline
    def warning: typingsSlinky.logProcessErrors.logProcessErrorsStrings.warning = "warning".asInstanceOf[typingsSlinky.logProcessErrors.logProcessErrorsStrings.warning]
  }
  
  /**
    * Log level
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.logProcessErrors.logProcessErrorsStrings.debug
    - typingsSlinky.logProcessErrors.logProcessErrorsStrings.info
    - typingsSlinky.logProcessErrors.logProcessErrorsStrings.warn
    - typingsSlinky.logProcessErrors.logProcessErrorsStrings.error
    - typingsSlinky.logProcessErrors.logProcessErrorsStrings.silent
    - typingsSlinky.logProcessErrors.logProcessErrorsStrings.default
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def default: typingsSlinky.logProcessErrors.logProcessErrorsStrings.default = "default".asInstanceOf[typingsSlinky.logProcessErrors.logProcessErrorsStrings.default]
    
    @scala.inline
    def debug: typingsSlinky.logProcessErrors.logProcessErrorsStrings.debug = "debug".asInstanceOf[typingsSlinky.logProcessErrors.logProcessErrorsStrings.debug]
    
    @scala.inline
    def error: typingsSlinky.logProcessErrors.logProcessErrorsStrings.error = "error".asInstanceOf[typingsSlinky.logProcessErrors.logProcessErrorsStrings.error]
    
    @scala.inline
    def info: typingsSlinky.logProcessErrors.logProcessErrorsStrings.info = "info".asInstanceOf[typingsSlinky.logProcessErrors.logProcessErrorsStrings.info]
    
    @scala.inline
    def silent: typingsSlinky.logProcessErrors.logProcessErrorsStrings.silent = "silent".asInstanceOf[typingsSlinky.logProcessErrors.logProcessErrorsStrings.silent]
    
    @scala.inline
    def warn: typingsSlinky.logProcessErrors.logProcessErrorsStrings.warn = "warn".asInstanceOf[typingsSlinky.logProcessErrors.logProcessErrorsStrings.warn]
  }
  
  /**
    * log-process-errors constructor options.
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * Whether or not to colorize messages.
      *
      * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#colors
      */
    var colors: js.UndefOr[Boolean] = js.native
    
    /**
      * Which process should trigger `process.exit(1)`
      *
      * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#exiton
      */
    var exitOn: js.UndefOr[js.Array[ExceptionType]] = js.native
    
    /**
      * Which log level to use for different exceptions.
      *
      * https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
      */
    var level: js.UndefOr[PartialRecordExceptionTyp] = js.native
    
    /**
      * Override logger
      *
      * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
      */
    var log: js.UndefOr[
        js.Function2[/* error */ js.Error, /* level */ LogLevel, js.Promise[Unit] | Unit]
      ] = js.native
    
    /**
      * When running tests, makes them fail if there are any process errors.
      *
      * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#testing
      */
    var testing: js.UndefOr[ava | mocha | jasmine | tape | `node-tap`] = js.native
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
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setExitOn(value: js.Array[ExceptionType]): Self = StObject.set(x, "exitOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnUndefined: Self = StObject.set(x, "exitOn", js.undefined)
      
      @scala.inline
      def setExitOnVarargs(value: ExceptionType*): Self = StObject.set(x, "exitOn", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: PartialRecordExceptionTyp): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setLog(value: (/* error */ js.Error, /* level */ LogLevel) => js.Promise[Unit] | Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setTesting(value: ava | mocha | jasmine | tape | `node-tap`): Self = StObject.set(x, "testing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestingUndefined: Self = StObject.set(x, "testing", js.undefined)
    }
  }
}
