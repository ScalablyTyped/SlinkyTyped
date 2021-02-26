package typingsSlinky.recluster

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recluster", JSImport.Namespace)
  @js.native
  def apply(file: String): Balancer = js.native
  @JSImport("recluster", JSImport.Namespace)
  @js.native
  def apply(file: String, options: BalancerOptions): Balancer = js.native
  
  @JSImport("recluster", "Balancer")
  @js.native
  class Balancer protected () extends EventEmitter {
    def this(file: String, options: BalancerOptions) = this()
    
    def activeWorkers(): js.Array[ChildProcess] = js.native
    
    def reload(): Unit = js.native
    def reload(cb: js.Function0[Unit]): Unit = js.native
    
    def run(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def workers(): js.Array[ChildProcess] = js.native
  }
  
  @js.native
  trait BalancerOptions extends StObject {
    
    /** arguments to pass to the worker (default: []) */
    var args: js.UndefOr[js.Array[String]] = js.native
    
    /** max time between respawns when workers die */
    var backoff: js.UndefOr[Double] = js.native
    
    /** what to log to stdout (default: {respawns: true}) */
    var log: js.UndefOr[LogOptions] = js.native
    
    /** logger to use, needs `log` method (default: console) */
    var logger: js.UndefOr[Logger] = js.native
    
    /** when does the worker become ready? 'listening' or 'started' */
    var readyWhen: js.UndefOr[String] = js.native
    
    /** min time between respawns when workers die */
    var respawn: js.UndefOr[Double] = js.native
    
    /** kill timeout for old workers after reload (sec) */
    var timeout: js.UndefOr[Double] = js.native
    
    /** number of active workers */
    var workers: js.UndefOr[Double] = js.native
  }
  object BalancerOptions {
    
    @scala.inline
    def apply(): BalancerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BalancerOptions]
    }
    
    @scala.inline
    implicit class BalancerOptionsMutableBuilder[Self <: BalancerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      @scala.inline
      def setLog(value: LogOptions): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setReadyWhen(value: String): Self = StObject.set(x, "readyWhen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadyWhenUndefined: Self = StObject.set(x, "readyWhen", js.undefined)
      
      @scala.inline
      def setRespawn(value: Double): Self = StObject.set(x, "respawn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRespawnUndefined: Self = StObject.set(x, "respawn", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  @js.native
  trait LogOptions extends StObject {
    
    var respawns: js.UndefOr[Boolean] = js.native
  }
  object LogOptions {
    
    @scala.inline
    def apply(): LogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogOptions]
    }
    
    @scala.inline
    implicit class LogOptionsMutableBuilder[Self <: LogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRespawns(value: Boolean): Self = StObject.set(x, "respawns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRespawnsUndefined: Self = StObject.set(x, "respawns", js.undefined)
    }
  }
  
  @js.native
  trait Logger extends StObject {
    
    def log(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  }
}
