package typingsSlinky.koaLog4

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaLog4.koaLog4Strings.auto
import typingsSlinky.log4js.anon.Context
import typingsSlinky.log4js.mod.Configuration
import typingsSlinky.log4js.mod.Level
import typingsSlinky.log4js.mod.Levels_
import typingsSlinky.log4js.mod.Log4js
import typingsSlinky.log4js.mod.LoggingEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-log4", "Logger")
  @js.native
  class Logger ()
    extends typingsSlinky.log4js.mod.Logger
  
  @JSImport("koa-log4", "addLayout")
  @js.native
  def addLayout(name: String, config: js.Function1[/* a */ js.Any, js.Function1[/* logEvent */ LoggingEvent, _]]): Unit = js.native
  
  @JSImport("koa-log4", "configure")
  @js.native
  def configure(config: Configuration): Log4js = js.native
  @JSImport("koa-log4", "configure")
  @js.native
  def configure(filename: String): Log4js = js.native
  
  @JSImport("koa-log4", "connectLogger")
  @js.native
  def connectLogger(logger: typingsSlinky.log4js.mod.Logger, options: Context): js.Any = js.native
  
  @JSImport("koa-log4", "getLogger")
  @js.native
  def getLogger(): typingsSlinky.log4js.mod.Logger = js.native
  @JSImport("koa-log4", "getLogger")
  @js.native
  def getLogger(category: String): typingsSlinky.log4js.mod.Logger = js.native
  
  @JSImport("koa-log4", "koaLogger")
  @js.native
  def koaLogger(logger4js: typingsSlinky.log4js.mod.Logger): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-log4", "koaLogger")
  @js.native
  def koaLogger(logger4js: typingsSlinky.log4js.mod.Logger, optionsOrFormat: String): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-log4", "koaLogger")
  @js.native
  def koaLogger(logger4js: typingsSlinky.log4js.mod.Logger, optionsOrFormat: Options): Middleware[DefaultState, DefaultContext] = js.native
  
  @JSImport("koa-log4", "levels")
  @js.native
  val levels: Levels_ = js.native
  
  @JSImport("koa-log4", "shutdown")
  @js.native
  def shutdown(): Unit | Null = js.native
  @JSImport("koa-log4", "shutdown")
  @js.native
  def shutdown(cb: js.Function1[/* error */ js.Error, Unit]): Unit | Null = js.native
  
  @js.native
  trait Options extends StObject {
    
    var format: js.UndefOr[String] = js.native
    
    var level: js.UndefOr[Level | auto] = js.native
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
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLevel(value: Level | auto): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
}
