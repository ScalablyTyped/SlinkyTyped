package typingsSlinky.node

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.node.NodeJS.Dict
import typingsSlinky.node.NodeJS.Module
import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.node.anon.Debug
import typingsSlinky.node.anon.ReadStreamfd0
import typingsSlinky.node.anon.SwallowErrors
import typingsSlinky.node.anon.Targetdefaults
import typingsSlinky.node.anon.WriteStreamfd1
import typingsSlinky.node.anon.WriteStreamfd2
import typingsSlinky.node.domainMod.global.NodeJS.Domain
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import typingsSlinky.node.nodeBooleans.`true`
import typingsSlinky.node.nodeStrings.beforeExit
import typingsSlinky.node.nodeStrings.disconnect
import typingsSlinky.node.nodeStrings.exit
import typingsSlinky.node.nodeStrings.message
import typingsSlinky.node.nodeStrings.multipleResolves
import typingsSlinky.node.nodeStrings.newListener
import typingsSlinky.node.nodeStrings.rejectionHandled
import typingsSlinky.node.nodeStrings.removeListener
import typingsSlinky.node.nodeStrings.uncaughtException
import typingsSlinky.node.nodeStrings.uncaughtExceptionMonitor
import typingsSlinky.node.nodeStrings.unhandledRejection
import typingsSlinky.node.nodeStrings.warning
import typingsSlinky.node.processMod.global.NodeJS.Process
import typingsSlinky.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processMod extends Shortcut {
  
  @JSImport("process", JSImport.Namespace)
  @js.native
  val ^ : Process = js.native
  
  object global {
    
    @JSGlobal("process")
    @js.native
    def process: Process = js.native
    @scala.inline
    def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
    
    object NodeJS {
      
      type BeforeExitListener = js.Function1[/* code */ Double, Unit]
      
      @js.native
      trait CpuUsage extends StObject {
        
        var system: Double = js.native
        
        var user: Double = js.native
      }
      object CpuUsage {
        
        @scala.inline
        def apply(system: Double, user: Double): CpuUsage = {
          val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
          __obj.asInstanceOf[CpuUsage]
        }
        
        @scala.inline
        implicit class CpuUsageMutableBuilder[Self <: CpuUsage] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSystem(value: Double): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        }
      }
      
      type DisconnectListener = js.Function0[Unit]
      
      type ExitListener = js.Function1[/* code */ Double, Unit]
      
      @js.native
      trait Global extends StObject {
        
        var process: Process = js.native
      }
      object Global {
        
        @scala.inline
        def apply(process: Process): Global = {
          val __obj = js.Dynamic.literal(process = process.asInstanceOf[js.Any])
          __obj.asInstanceOf[Global]
        }
        
        @scala.inline
        implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setProcess(value: Process): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait HRTime extends StObject {
        
        def apply(): js.Tuple2[Double, Double] = js.native
        def apply(time: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
        
        def bigint(): js.BigInt = js.native
      }
      
      @js.native
      trait MemoryUsage extends StObject {
        
        var arrayBuffers: Double = js.native
        
        var external: Double = js.native
        
        var heapTotal: Double = js.native
        
        var heapUsed: Double = js.native
        
        var rss: Double = js.native
      }
      object MemoryUsage {
        
        @scala.inline
        def apply(arrayBuffers: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): MemoryUsage = {
          val __obj = js.Dynamic.literal(arrayBuffers = arrayBuffers.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
          __obj.asInstanceOf[MemoryUsage]
        }
        
        @scala.inline
        implicit class MemoryUsageMutableBuilder[Self <: MemoryUsage] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setArrayBuffers(value: Double): Self = StObject.set(x, "arrayBuffers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExternal(value: Double): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeapTotal(value: Double): Self = StObject.set(x, "heapTotal", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeapUsed(value: Double): Self = StObject.set(x, "heapUsed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
        }
      }
      
      type MessageListener = js.Function2[/* message */ js.Any, /* sendHandle */ js.Any, Unit]
      
      type MultipleResolveListener = js.Function3[
            /* type */ MultipleResolveType, 
            /* promise */ js.Promise[js.Any], 
            /* value */ js.Any, 
            Unit
          ]
      
      /* Rewritten from type alias, can be one of: 
        - typingsSlinky.node.nodeStrings.resolve
        - typingsSlinky.node.nodeStrings.reject
      */
      trait MultipleResolveType extends StObject
      object MultipleResolveType {
        
        @scala.inline
        def reject: typingsSlinky.node.nodeStrings.reject = "reject".asInstanceOf[typingsSlinky.node.nodeStrings.reject]
        
        @scala.inline
        def resolve: typingsSlinky.node.nodeStrings.resolve = "resolve".asInstanceOf[typingsSlinky.node.nodeStrings.resolve]
      }
      
      type NewListenerListener = js.Function2[
            /* type */ java.lang.String | js.Symbol, 
            /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
            Unit
          ]
      
      /* Rewritten from type alias, can be one of: 
        - typingsSlinky.node.nodeStrings.aix
        - typingsSlinky.node.nodeStrings.android
        - typingsSlinky.node.nodeStrings.darwin
        - typingsSlinky.node.nodeStrings.freebsd
        - typingsSlinky.node.nodeStrings.linux
        - typingsSlinky.node.nodeStrings.openbsd
        - typingsSlinky.node.nodeStrings.sunos
        - typingsSlinky.node.nodeStrings.win32
        - typingsSlinky.node.nodeStrings.cygwin
        - typingsSlinky.node.nodeStrings.netbsd
      */
      trait Platform extends StObject
      object Platform {
        
        @scala.inline
        def aix: typingsSlinky.node.nodeStrings.aix = "aix".asInstanceOf[typingsSlinky.node.nodeStrings.aix]
        
        @scala.inline
        def android: typingsSlinky.node.nodeStrings.android = "android".asInstanceOf[typingsSlinky.node.nodeStrings.android]
        
        @scala.inline
        def cygwin: typingsSlinky.node.nodeStrings.cygwin = "cygwin".asInstanceOf[typingsSlinky.node.nodeStrings.cygwin]
        
        @scala.inline
        def darwin: typingsSlinky.node.nodeStrings.darwin = "darwin".asInstanceOf[typingsSlinky.node.nodeStrings.darwin]
        
        @scala.inline
        def freebsd: typingsSlinky.node.nodeStrings.freebsd = "freebsd".asInstanceOf[typingsSlinky.node.nodeStrings.freebsd]
        
        @scala.inline
        def linux: typingsSlinky.node.nodeStrings.linux = "linux".asInstanceOf[typingsSlinky.node.nodeStrings.linux]
        
        @scala.inline
        def netbsd: typingsSlinky.node.nodeStrings.netbsd = "netbsd".asInstanceOf[typingsSlinky.node.nodeStrings.netbsd]
        
        @scala.inline
        def openbsd: typingsSlinky.node.nodeStrings.openbsd = "openbsd".asInstanceOf[typingsSlinky.node.nodeStrings.openbsd]
        
        @scala.inline
        def sunos: typingsSlinky.node.nodeStrings.sunos = "sunos".asInstanceOf[typingsSlinky.node.nodeStrings.sunos]
        
        @scala.inline
        def win32: typingsSlinky.node.nodeStrings.win32 = "win32".asInstanceOf[typingsSlinky.node.nodeStrings.win32]
      }
      
      @js.native
      trait Process extends EventEmitter {
        
        def abort(): scala.Nothing = js.native
        
        def addListener(event: Signals, listener: SignalsListener): this.type = js.native
        /* EventEmitter */
        @JSName("addListener")
        def addListener_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("addListener")
        def addListener_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("addListener")
        def addListener_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("addListener")
        def addListener_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("addListener")
        def addListener_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("addListener")
        def addListener_newListener(event: newListener, listener: NewListenerListener): this.type = js.native
        @JSName("addListener")
        def addListener_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("addListener")
        def addListener_removeListener(event: removeListener, listener: RemoveListenerListener): this.type = js.native
        @JSName("addListener")
        def addListener_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("addListener")
        def addListener_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("addListener")
        def addListener_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("addListener")
        def addListener_warning(event: warning, listener: WarningListener): this.type = js.native
        
        /**
          * The `process.allowedNodeEnvironmentFlags` property is a special,
          * read-only `Set` of flags allowable within the [`NODE_OPTIONS`][]
          * environment variable.
          */
        var allowedNodeEnvironmentFlags: ReadonlySet[java.lang.String] = js.native
        
        var arch: java.lang.String = js.native
        
        var argv: js.Array[java.lang.String] = js.native
        
        var argv0: java.lang.String = js.native
        
        def chdir(directory: java.lang.String): Unit = js.native
        
        var config: Targetdefaults = js.native
        
        var connected: Boolean = js.native
        
        def cpuUsage(): CpuUsage = js.native
        def cpuUsage(previousValue: CpuUsage): CpuUsage = js.native
        
        def cwd(): java.lang.String = js.native
        
        var debugPort: Double = js.native
        
        def disconnect(): Unit = js.native
        
        var domain: Domain = js.native
        
        def emit(event: Signals, signal: Signals): Boolean = js.native
        
        def emitWarning(warning: java.lang.String): Unit = js.native
        def emitWarning(warning: java.lang.String, name: js.UndefOr[scala.Nothing], ctor: js.Function): Unit = js.native
        def emitWarning(warning: java.lang.String, name: java.lang.String): Unit = js.native
        def emitWarning(warning: java.lang.String, name: java.lang.String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error): Unit = js.native
        def emitWarning(warning: js.Error, name: js.UndefOr[scala.Nothing], ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, name: java.lang.String): Unit = js.native
        def emitWarning(warning: js.Error, name: java.lang.String, ctor: js.Function): Unit = js.native
        
        @JSName("emit")
        def emit_beforeExit(event: beforeExit, code: Double): Boolean = js.native
        @JSName("emit")
        def emit_disconnect(event: disconnect): Boolean = js.native
        @JSName("emit")
        def emit_exit(event: exit, code: Double): Boolean = js.native
        @JSName("emit")
        def emit_message(event: message, message: js.Any, sendHandle: js.Any): this.type = js.native
        @JSName("emit")
        def emit_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("emit")
        def emit_newListener(
          event: newListener,
          eventName: java.lang.String,
          listener: js.Function1[/* repeated */ js.Any, Unit]
        ): this.type = js.native
        @JSName("emit")
        def emit_newListener(event: newListener, eventName: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        @JSName("emit")
        def emit_rejectionHandled(event: rejectionHandled, promise: js.Promise[_]): Boolean = js.native
        @JSName("emit")
        def emit_removeListener(
          event: removeListener,
          eventName: java.lang.String,
          listener: js.Function1[/* repeated */ js.Any, Unit]
        ): this.type = js.native
        @JSName("emit")
        def emit_uncaughtException(event: uncaughtException, error: js.Error): Boolean = js.native
        @JSName("emit")
        def emit_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, error: js.Error): Boolean = js.native
        @JSName("emit")
        def emit_unhandledRejection(event: unhandledRejection, reason: js.Any, promise: js.Promise[_]): Boolean = js.native
        @JSName("emit")
        def emit_warning(event: warning, warning: js.Error): Boolean = js.native
        
        var env: ProcessEnv = js.native
        
        var execArgv: js.Array[java.lang.String] = js.native
        
        var execPath: java.lang.String = js.native
        
        def exit(): scala.Nothing = js.native
        def exit(code: Double): scala.Nothing = js.native
        
        var exitCode: js.UndefOr[Double] = js.native
        
        var features: Debug = js.native
        
        def getegid(): Double = js.native
        
        def geteuid(): Double = js.native
        
        def getgid(): Double = js.native
        
        def getgroups(): js.Array[Double] = js.native
        
        def getuid(): Double = js.native
        
        def hasUncaughtExceptionCaptureCallback(): Boolean = js.native
        
        def hrtime(): js.Tuple2[Double, Double] = js.native
        def hrtime(time: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
        @JSName("hrtime")
        var hrtime_Original: HRTime = js.native
        
        def kill(pid: Double): `true` = js.native
        def kill(pid: Double, signal: java.lang.String): `true` = js.native
        def kill(pid: Double, signal: Double): `true` = js.native
        
        def listeners(event: Signals): js.Array[SignalsListener] = js.native
        @JSName("listeners")
        def listeners_beforeExit(event: beforeExit): js.Array[BeforeExitListener] = js.native
        @JSName("listeners")
        def listeners_disconnect(event: disconnect): js.Array[DisconnectListener] = js.native
        @JSName("listeners")
        def listeners_exit(event: exit): js.Array[ExitListener] = js.native
        @JSName("listeners")
        def listeners_message(event: message): js.Array[MessageListener] = js.native
        @JSName("listeners")
        def listeners_multipleResolves(event: multipleResolves): js.Array[MultipleResolveListener] = js.native
        @JSName("listeners")
        def listeners_newListener(event: newListener): js.Array[NewListenerListener] = js.native
        @JSName("listeners")
        def listeners_rejectionHandled(event: rejectionHandled): js.Array[RejectionHandledListener] = js.native
        @JSName("listeners")
        def listeners_removeListener(event: removeListener): js.Array[RemoveListenerListener] = js.native
        @JSName("listeners")
        def listeners_uncaughtException(event: uncaughtException): js.Array[UncaughtExceptionListener] = js.native
        @JSName("listeners")
        def listeners_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor): js.Array[UncaughtExceptionListener] = js.native
        @JSName("listeners")
        def listeners_unhandledRejection(event: unhandledRejection): js.Array[UnhandledRejectionListener] = js.native
        @JSName("listeners")
        def listeners_warning(event: warning): js.Array[WarningListener] = js.native
        
        /** @deprecated since v14.0.0 - use `require.main` instead. */
        var mainModule: js.UndefOr[Module] = js.native
        
        def memoryUsage(): MemoryUsage = js.native
        
        def nextTick(callback: js.Function, args: js.Any*): Unit = js.native
        
        def on(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("on")
        def on_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("on")
        def on_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("on")
        def on_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("on")
        def on_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("on")
        def on_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("on")
        def on_newListener(event: newListener, listener: NewListenerListener): this.type = js.native
        @JSName("on")
        def on_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("on")
        def on_removeListener(event: removeListener, listener: RemoveListenerListener): this.type = js.native
        @JSName("on")
        def on_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("on")
        def on_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("on")
        def on_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("on")
        def on_warning(event: warning, listener: WarningListener): this.type = js.native
        
        def once(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("once")
        def once_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("once")
        def once_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("once")
        def once_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("once")
        def once_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("once")
        def once_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("once")
        def once_newListener(event: newListener, listener: NewListenerListener): this.type = js.native
        @JSName("once")
        def once_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("once")
        def once_removeListener(event: removeListener, listener: RemoveListenerListener): this.type = js.native
        @JSName("once")
        def once_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("once")
        def once_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("once")
        def once_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("once")
        def once_warning(event: warning, listener: WarningListener): this.type = js.native
        
        def openStdin(): Socket = js.native
        
        var pid: Double = js.native
        
        var platform: Platform = js.native
        
        var ppid: Double = js.native
        
        def prependListener(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_newListener(event: newListener, listener: NewListenerListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_removeListener(event: removeListener, listener: RemoveListenerListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_warning(event: warning, listener: WarningListener): this.type = js.native
        
        def prependOnceListener(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_newListener(event: newListener, listener: NewListenerListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_removeListener(event: removeListener, listener: RemoveListenerListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_warning(event: warning, listener: WarningListener): this.type = js.native
        
        var release: ProcessRelease = js.native
        
        /**
          * Only available with `--experimental-report`
          */
        var report: js.UndefOr[ProcessReport] = js.native
        
        def resourceUsage(): ResourceUsage = js.native
        
        // Worker
        var send: js.UndefOr[
                js.Function4[
                  /* message */ js.Any, 
                  /* sendHandle */ js.UndefOr[js.Any], 
                  /* options */ js.UndefOr[SwallowErrors], 
                  /* callback */ js.UndefOr[js.Function1[/* error */ js.Error | Null, Unit]], 
                  Boolean
                ]
              ] = js.native
        
        def setUncaughtExceptionCaptureCallback(): Unit = js.native
        def setUncaughtExceptionCaptureCallback(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
        
        def setegid(id: java.lang.String): Unit = js.native
        def setegid(id: Double): Unit = js.native
        
        def seteuid(id: java.lang.String): Unit = js.native
        def seteuid(id: Double): Unit = js.native
        
        def setgid(id: java.lang.String): Unit = js.native
        def setgid(id: Double): Unit = js.native
        
        def setgroups(groups: js.Array[java.lang.String | Double]): Unit = js.native
        
        def setuid(id: java.lang.String): Unit = js.native
        def setuid(id: Double): Unit = js.native
        
        /**
          * Can also be a tty.WriteStream, not typed due to limitations.
          */
        var stderr: WriteStreamfd2 = js.native
        
        var stdin: ReadStreamfd0 = js.native
        
        /**
          * Can also be a tty.WriteStream, not typed due to limitations.
          */
        var stdout: WriteStreamfd1 = js.native
        
        var title: java.lang.String = js.native
        
        var traceDeprecation: Boolean = js.native
        
        /**
          * @deprecated since v14.0.0 - Calling process.umask() with no argument causes
          * the process-wide umask to be written twice. This introduces a race condition between threads,
          * and is a potential security vulnerability. There is no safe, cross-platform alternative API.
          */
        def umask(): Double = js.native
        /**
          * Can only be set if not in worker thread.
          */
        def umask(mask: java.lang.String): Double = js.native
        def umask(mask: Double): Double = js.native
        
        def uptime(): Double = js.native
        
        var version: java.lang.String = js.native
        
        var versions: ProcessVersions = js.native
      }
      
      // Alias for compatibility
      type ProcessEnv = Dict[java.lang.String]
      
      @js.native
      trait ProcessRelease extends StObject {
        
        var headersUrl: js.UndefOr[java.lang.String] = js.native
        
        var libUrl: js.UndefOr[java.lang.String] = js.native
        
        var lts: js.UndefOr[java.lang.String] = js.native
        
        var name: java.lang.String = js.native
        
        var sourceUrl: js.UndefOr[java.lang.String] = js.native
      }
      object ProcessRelease {
        
        @scala.inline
        def apply(name: java.lang.String): ProcessRelease = {
          val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProcessRelease]
        }
        
        @scala.inline
        implicit class ProcessReleaseMutableBuilder[Self <: ProcessRelease] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHeadersUrl(value: java.lang.String): Self = StObject.set(x, "headersUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeadersUrlUndefined: Self = StObject.set(x, "headersUrl", js.undefined)
          
          @scala.inline
          def setLibUrl(value: java.lang.String): Self = StObject.set(x, "libUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLibUrlUndefined: Self = StObject.set(x, "libUrl", js.undefined)
          
          @scala.inline
          def setLts(value: java.lang.String): Self = StObject.set(x, "lts", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLtsUndefined: Self = StObject.set(x, "lts", js.undefined)
          
          @scala.inline
          def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSourceUrl(value: java.lang.String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
        }
      }
      
      @js.native
      trait ProcessReport extends StObject {
        
        /**
          * Directory where the report is written.
          * working directory of the Node.js process.
          * @default '' indicating that reports are written to the current
          */
        var directory: java.lang.String = js.native
        
        /**
          * Filename where the report is written.
          * The default value is the empty string.
          * @default '' the output filename will be comprised of a timestamp,
          * PID, and sequence number.
          */
        var filename: java.lang.String = js.native
        
        /**
          * Returns a JSON-formatted diagnostic report for the running process.
          * The report's JavaScript stack trace is taken from err, if present.
          */
        def getReport(): java.lang.String = js.native
        def getReport(err: js.Error): java.lang.String = js.native
        
        /**
          * If true, a diagnostic report is generated on fatal errors,
          * such as out of memory errors or failed C++ assertions.
          * @default false
          */
        var reportOnFatalError: Boolean = js.native
        
        /**
          * If true, a diagnostic report is generated when the process
          * receives the signal specified by process.report.signal.
          * @defaul false
          */
        var reportOnSignal: Boolean = js.native
        
        /**
          * If true, a diagnostic report is generated on uncaught exception.
          * @default false
          */
        var reportOnUncaughtException: Boolean = js.native
        
        /**
          * The signal used to trigger the creation of a diagnostic report.
          * @default 'SIGUSR2'
          */
        var signal: Signals = js.native
        
        /**
          * Writes a diagnostic report to a file. If filename is not provided, the default filename
          * includes the date, time, PID, and a sequence number.
          * The report's JavaScript stack trace is taken from err, if present.
          *
          * @param fileName Name of the file where the report is written.
          * This should be a relative path, that will be appended to the directory specified in
          * `process.report.directory`, or the current working directory of the Node.js process,
          * if unspecified.
          * @param error A custom error used for reporting the JavaScript stack.
          * @return Filename of the generated report.
          */
        def writeReport(): java.lang.String = js.native
        def writeReport(error: js.Error): java.lang.String = js.native
        def writeReport(fileName: js.UndefOr[scala.Nothing], err: js.Error): java.lang.String = js.native
        def writeReport(fileName: java.lang.String): java.lang.String = js.native
        def writeReport(fileName: java.lang.String, err: js.Error): java.lang.String = js.native
      }
      
      @js.native
      trait ProcessVersions
        extends Dict[java.lang.String] {
        
        var ares: java.lang.String = js.native
        
        var http_parser: java.lang.String = js.native
        
        var modules: java.lang.String = js.native
        
        var node: java.lang.String = js.native
        
        var openssl: java.lang.String = js.native
        
        var uv: java.lang.String = js.native
        
        var v8: java.lang.String = js.native
        
        var zlib: java.lang.String = js.native
      }
      object ProcessVersions {
        
        @scala.inline
        def apply(
          ares: java.lang.String,
          http_parser: java.lang.String,
          modules: java.lang.String,
          node: java.lang.String,
          openssl: java.lang.String,
          uv: java.lang.String,
          v8: java.lang.String,
          zlib: java.lang.String
        ): ProcessVersions = {
          val __obj = js.Dynamic.literal(ares = ares.asInstanceOf[js.Any], http_parser = http_parser.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProcessVersions]
        }
        
        @scala.inline
        implicit class ProcessVersionsMutableBuilder[Self <: ProcessVersions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAres(value: java.lang.String): Self = StObject.set(x, "ares", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHttp_parser(value: java.lang.String): Self = StObject.set(x, "http_parser", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModules(value: java.lang.String): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNode(value: java.lang.String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOpenssl(value: java.lang.String): Self = StObject.set(x, "openssl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUv(value: java.lang.String): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setV8(value: java.lang.String): Self = StObject.set(x, "v8", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setZlib(value: java.lang.String): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
        }
      }
      
      // this namespace merge is here because these are specifically used
      // as the type for process.stdin, process.stdout, and process.stderr.
      // they can't live in tty.d.ts because we need to disambiguate the imported name.
      type ReadStream = typingsSlinky.node.ttyMod.ReadStream
      
      type RejectionHandledListener = js.Function1[/* promise */ js.Promise[js.Any], Unit]
      
      type RemoveListenerListener = js.Function2[
            /* type */ java.lang.String | js.Symbol, 
            /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
            Unit
          ]
      
      @js.native
      trait ResourceUsage extends StObject {
        
        var fsRead: Double = js.native
        
        var fsWrite: Double = js.native
        
        var involuntaryContextSwitches: Double = js.native
        
        var ipcReceived: Double = js.native
        
        var ipcSent: Double = js.native
        
        var majorPageFault: Double = js.native
        
        var maxRSS: Double = js.native
        
        var minorPageFault: Double = js.native
        
        var sharedMemorySize: Double = js.native
        
        var signalsCount: Double = js.native
        
        var swappedOut: Double = js.native
        
        var systemCPUTime: Double = js.native
        
        var unsharedDataSize: Double = js.native
        
        var unsharedStackSize: Double = js.native
        
        var userCPUTime: Double = js.native
        
        var voluntaryContextSwitches: Double = js.native
      }
      object ResourceUsage {
        
        @scala.inline
        def apply(
          fsRead: Double,
          fsWrite: Double,
          involuntaryContextSwitches: Double,
          ipcReceived: Double,
          ipcSent: Double,
          majorPageFault: Double,
          maxRSS: Double,
          minorPageFault: Double,
          sharedMemorySize: Double,
          signalsCount: Double,
          swappedOut: Double,
          systemCPUTime: Double,
          unsharedDataSize: Double,
          unsharedStackSize: Double,
          userCPUTime: Double,
          voluntaryContextSwitches: Double
        ): ResourceUsage = {
          val __obj = js.Dynamic.literal(fsRead = fsRead.asInstanceOf[js.Any], fsWrite = fsWrite.asInstanceOf[js.Any], involuntaryContextSwitches = involuntaryContextSwitches.asInstanceOf[js.Any], ipcReceived = ipcReceived.asInstanceOf[js.Any], ipcSent = ipcSent.asInstanceOf[js.Any], majorPageFault = majorPageFault.asInstanceOf[js.Any], maxRSS = maxRSS.asInstanceOf[js.Any], minorPageFault = minorPageFault.asInstanceOf[js.Any], sharedMemorySize = sharedMemorySize.asInstanceOf[js.Any], signalsCount = signalsCount.asInstanceOf[js.Any], swappedOut = swappedOut.asInstanceOf[js.Any], systemCPUTime = systemCPUTime.asInstanceOf[js.Any], unsharedDataSize = unsharedDataSize.asInstanceOf[js.Any], unsharedStackSize = unsharedStackSize.asInstanceOf[js.Any], userCPUTime = userCPUTime.asInstanceOf[js.Any], voluntaryContextSwitches = voluntaryContextSwitches.asInstanceOf[js.Any])
          __obj.asInstanceOf[ResourceUsage]
        }
        
        @scala.inline
        implicit class ResourceUsageMutableBuilder[Self <: ResourceUsage] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFsRead(value: Double): Self = StObject.set(x, "fsRead", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFsWrite(value: Double): Self = StObject.set(x, "fsWrite", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInvoluntaryContextSwitches(value: Double): Self = StObject.set(x, "involuntaryContextSwitches", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIpcReceived(value: Double): Self = StObject.set(x, "ipcReceived", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIpcSent(value: Double): Self = StObject.set(x, "ipcSent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMajorPageFault(value: Double): Self = StObject.set(x, "majorPageFault", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxRSS(value: Double): Self = StObject.set(x, "maxRSS", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinorPageFault(value: Double): Self = StObject.set(x, "minorPageFault", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSharedMemorySize(value: Double): Self = StObject.set(x, "sharedMemorySize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSignalsCount(value: Double): Self = StObject.set(x, "signalsCount", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSwappedOut(value: Double): Self = StObject.set(x, "swappedOut", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSystemCPUTime(value: Double): Self = StObject.set(x, "systemCPUTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUnsharedDataSize(value: Double): Self = StObject.set(x, "unsharedDataSize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUnsharedStackSize(value: Double): Self = StObject.set(x, "unsharedStackSize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUserCPUTime(value: Double): Self = StObject.set(x, "userCPUTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVoluntaryContextSwitches(value: Double): Self = StObject.set(x, "voluntaryContextSwitches", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsSlinky.node.nodeStrings.SIGABRT
        - typingsSlinky.node.nodeStrings.SIGALRM
        - typingsSlinky.node.nodeStrings.SIGBUS
        - typingsSlinky.node.nodeStrings.SIGCHLD
        - typingsSlinky.node.nodeStrings.SIGCONT
        - typingsSlinky.node.nodeStrings.SIGFPE
        - typingsSlinky.node.nodeStrings.SIGHUP
        - typingsSlinky.node.nodeStrings.SIGILL
        - typingsSlinky.node.nodeStrings.SIGINT
        - typingsSlinky.node.nodeStrings.SIGIO
        - typingsSlinky.node.nodeStrings.SIGIOT
        - typingsSlinky.node.nodeStrings.SIGKILL
        - typingsSlinky.node.nodeStrings.SIGPIPE
        - typingsSlinky.node.nodeStrings.SIGPOLL
        - typingsSlinky.node.nodeStrings.SIGPROF
        - typingsSlinky.node.nodeStrings.SIGPWR
        - typingsSlinky.node.nodeStrings.SIGQUIT
        - typingsSlinky.node.nodeStrings.SIGSEGV
        - typingsSlinky.node.nodeStrings.SIGSTKFLT
        - typingsSlinky.node.nodeStrings.SIGSTOP
        - typingsSlinky.node.nodeStrings.SIGSYS
        - typingsSlinky.node.nodeStrings.SIGTERM
        - typingsSlinky.node.nodeStrings.SIGTRAP
        - typingsSlinky.node.nodeStrings.SIGTSTP
        - typingsSlinky.node.nodeStrings.SIGTTIN
        - typingsSlinky.node.nodeStrings.SIGTTOU
        - typingsSlinky.node.nodeStrings.SIGUNUSED
        - typingsSlinky.node.nodeStrings.SIGURG
        - typingsSlinky.node.nodeStrings.SIGUSR1
        - typingsSlinky.node.nodeStrings.SIGUSR2
        - typingsSlinky.node.nodeStrings.SIGVTALRM
        - typingsSlinky.node.nodeStrings.SIGWINCH
        - typingsSlinky.node.nodeStrings.SIGXCPU
        - typingsSlinky.node.nodeStrings.SIGXFSZ
        - typingsSlinky.node.nodeStrings.SIGBREAK
        - typingsSlinky.node.nodeStrings.SIGLOST
        - typingsSlinky.node.nodeStrings.SIGINFO
      */
      trait Signals extends StObject
      object Signals {
        
        @scala.inline
        def SIGABRT: typingsSlinky.node.nodeStrings.SIGABRT = "SIGABRT".asInstanceOf[typingsSlinky.node.nodeStrings.SIGABRT]
        
        @scala.inline
        def SIGALRM: typingsSlinky.node.nodeStrings.SIGALRM = "SIGALRM".asInstanceOf[typingsSlinky.node.nodeStrings.SIGALRM]
        
        @scala.inline
        def SIGBREAK: typingsSlinky.node.nodeStrings.SIGBREAK = "SIGBREAK".asInstanceOf[typingsSlinky.node.nodeStrings.SIGBREAK]
        
        @scala.inline
        def SIGBUS: typingsSlinky.node.nodeStrings.SIGBUS = "SIGBUS".asInstanceOf[typingsSlinky.node.nodeStrings.SIGBUS]
        
        @scala.inline
        def SIGCHLD: typingsSlinky.node.nodeStrings.SIGCHLD = "SIGCHLD".asInstanceOf[typingsSlinky.node.nodeStrings.SIGCHLD]
        
        @scala.inline
        def SIGCONT: typingsSlinky.node.nodeStrings.SIGCONT = "SIGCONT".asInstanceOf[typingsSlinky.node.nodeStrings.SIGCONT]
        
        @scala.inline
        def SIGFPE: typingsSlinky.node.nodeStrings.SIGFPE = "SIGFPE".asInstanceOf[typingsSlinky.node.nodeStrings.SIGFPE]
        
        @scala.inline
        def SIGHUP: typingsSlinky.node.nodeStrings.SIGHUP = "SIGHUP".asInstanceOf[typingsSlinky.node.nodeStrings.SIGHUP]
        
        @scala.inline
        def SIGILL: typingsSlinky.node.nodeStrings.SIGILL = "SIGILL".asInstanceOf[typingsSlinky.node.nodeStrings.SIGILL]
        
        @scala.inline
        def SIGINFO: typingsSlinky.node.nodeStrings.SIGINFO = "SIGINFO".asInstanceOf[typingsSlinky.node.nodeStrings.SIGINFO]
        
        @scala.inline
        def SIGINT: typingsSlinky.node.nodeStrings.SIGINT = "SIGINT".asInstanceOf[typingsSlinky.node.nodeStrings.SIGINT]
        
        @scala.inline
        def SIGIO: typingsSlinky.node.nodeStrings.SIGIO = "SIGIO".asInstanceOf[typingsSlinky.node.nodeStrings.SIGIO]
        
        @scala.inline
        def SIGIOT: typingsSlinky.node.nodeStrings.SIGIOT = "SIGIOT".asInstanceOf[typingsSlinky.node.nodeStrings.SIGIOT]
        
        @scala.inline
        def SIGKILL: typingsSlinky.node.nodeStrings.SIGKILL = "SIGKILL".asInstanceOf[typingsSlinky.node.nodeStrings.SIGKILL]
        
        @scala.inline
        def SIGLOST: typingsSlinky.node.nodeStrings.SIGLOST = "SIGLOST".asInstanceOf[typingsSlinky.node.nodeStrings.SIGLOST]
        
        @scala.inline
        def SIGPIPE: typingsSlinky.node.nodeStrings.SIGPIPE = "SIGPIPE".asInstanceOf[typingsSlinky.node.nodeStrings.SIGPIPE]
        
        @scala.inline
        def SIGPOLL: typingsSlinky.node.nodeStrings.SIGPOLL = "SIGPOLL".asInstanceOf[typingsSlinky.node.nodeStrings.SIGPOLL]
        
        @scala.inline
        def SIGPROF: typingsSlinky.node.nodeStrings.SIGPROF = "SIGPROF".asInstanceOf[typingsSlinky.node.nodeStrings.SIGPROF]
        
        @scala.inline
        def SIGPWR: typingsSlinky.node.nodeStrings.SIGPWR = "SIGPWR".asInstanceOf[typingsSlinky.node.nodeStrings.SIGPWR]
        
        @scala.inline
        def SIGQUIT: typingsSlinky.node.nodeStrings.SIGQUIT = "SIGQUIT".asInstanceOf[typingsSlinky.node.nodeStrings.SIGQUIT]
        
        @scala.inline
        def SIGSEGV: typingsSlinky.node.nodeStrings.SIGSEGV = "SIGSEGV".asInstanceOf[typingsSlinky.node.nodeStrings.SIGSEGV]
        
        @scala.inline
        def SIGSTKFLT: typingsSlinky.node.nodeStrings.SIGSTKFLT = "SIGSTKFLT".asInstanceOf[typingsSlinky.node.nodeStrings.SIGSTKFLT]
        
        @scala.inline
        def SIGSTOP: typingsSlinky.node.nodeStrings.SIGSTOP = "SIGSTOP".asInstanceOf[typingsSlinky.node.nodeStrings.SIGSTOP]
        
        @scala.inline
        def SIGSYS: typingsSlinky.node.nodeStrings.SIGSYS = "SIGSYS".asInstanceOf[typingsSlinky.node.nodeStrings.SIGSYS]
        
        @scala.inline
        def SIGTERM: typingsSlinky.node.nodeStrings.SIGTERM = "SIGTERM".asInstanceOf[typingsSlinky.node.nodeStrings.SIGTERM]
        
        @scala.inline
        def SIGTRAP: typingsSlinky.node.nodeStrings.SIGTRAP = "SIGTRAP".asInstanceOf[typingsSlinky.node.nodeStrings.SIGTRAP]
        
        @scala.inline
        def SIGTSTP: typingsSlinky.node.nodeStrings.SIGTSTP = "SIGTSTP".asInstanceOf[typingsSlinky.node.nodeStrings.SIGTSTP]
        
        @scala.inline
        def SIGTTIN: typingsSlinky.node.nodeStrings.SIGTTIN = "SIGTTIN".asInstanceOf[typingsSlinky.node.nodeStrings.SIGTTIN]
        
        @scala.inline
        def SIGTTOU: typingsSlinky.node.nodeStrings.SIGTTOU = "SIGTTOU".asInstanceOf[typingsSlinky.node.nodeStrings.SIGTTOU]
        
        @scala.inline
        def SIGUNUSED: typingsSlinky.node.nodeStrings.SIGUNUSED = "SIGUNUSED".asInstanceOf[typingsSlinky.node.nodeStrings.SIGUNUSED]
        
        @scala.inline
        def SIGURG: typingsSlinky.node.nodeStrings.SIGURG = "SIGURG".asInstanceOf[typingsSlinky.node.nodeStrings.SIGURG]
        
        @scala.inline
        def SIGUSR1: typingsSlinky.node.nodeStrings.SIGUSR1 = "SIGUSR1".asInstanceOf[typingsSlinky.node.nodeStrings.SIGUSR1]
        
        @scala.inline
        def SIGUSR2: typingsSlinky.node.nodeStrings.SIGUSR2 = "SIGUSR2".asInstanceOf[typingsSlinky.node.nodeStrings.SIGUSR2]
        
        @scala.inline
        def SIGVTALRM: typingsSlinky.node.nodeStrings.SIGVTALRM = "SIGVTALRM".asInstanceOf[typingsSlinky.node.nodeStrings.SIGVTALRM]
        
        @scala.inline
        def SIGWINCH: typingsSlinky.node.nodeStrings.SIGWINCH = "SIGWINCH".asInstanceOf[typingsSlinky.node.nodeStrings.SIGWINCH]
        
        @scala.inline
        def SIGXCPU: typingsSlinky.node.nodeStrings.SIGXCPU = "SIGXCPU".asInstanceOf[typingsSlinky.node.nodeStrings.SIGXCPU]
        
        @scala.inline
        def SIGXFSZ: typingsSlinky.node.nodeStrings.SIGXFSZ = "SIGXFSZ".asInstanceOf[typingsSlinky.node.nodeStrings.SIGXFSZ]
      }
      
      type SignalsListener = js.Function1[/* signal */ Signals, Unit]
      
      @js.native
      trait Socket extends ReadWriteStream {
        
        var isTTY: js.UndefOr[`true`] = js.native
      }
      
      type UncaughtExceptionListener = js.Function1[/* error */ js.Error, Unit]
      
      type UnhandledRejectionListener = js.Function2[/* reason */ js.UndefOr[js.Object | Null], /* promise */ js.Promise[js.Any], Unit]
      
      type WarningListener = js.Function1[/* warning */ js.Error, Unit]
      
      type WriteStream = typingsSlinky.node.ttyMod.WriteStream
    }
  }
  
  type _To = Process
  
  /* This means you don't have to write `^`, but can instead just say `processMod.foo` */
  override def _to: Process = ^
}
