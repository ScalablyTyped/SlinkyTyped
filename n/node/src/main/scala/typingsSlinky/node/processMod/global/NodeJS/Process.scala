package typingsSlinky.node.processMod.global.NodeJS

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
import typingsSlinky.std.ReadonlySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Process extends EventEmitter {
  
  def abort(): Unit = js.native
  
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
  var allowedNodeEnvironmentFlags: ReadonlySet[String] = js.native
  
  var arch: String = js.native
  
  var argv: js.Array[String] = js.native
  
  var argv0: String = js.native
  
  def chdir(directory: String): Unit = js.native
  
  var config: Targetdefaults = js.native
  
  var connected: Boolean = js.native
  
  def cpuUsage(): CpuUsage = js.native
  def cpuUsage(previousValue: CpuUsage): CpuUsage = js.native
  
  def cwd(): String = js.native
  
  var debugPort: Double = js.native
  
  def disconnect(): Unit = js.native
  
  var domain: Domain = js.native
  
  def emit(event: Signals, signal: Signals): Boolean = js.native
  
  def emitWarning(warning: String): Unit = js.native
  def emitWarning(warning: String, name: js.UndefOr[scala.Nothing], ctor: js.Function): Unit = js.native
  def emitWarning(warning: String, name: String): Unit = js.native
  def emitWarning(warning: String, name: String, ctor: js.Function): Unit = js.native
  def emitWarning(warning: js.Error): Unit = js.native
  def emitWarning(warning: js.Error, name: js.UndefOr[scala.Nothing], ctor: js.Function): Unit = js.native
  def emitWarning(warning: js.Error, name: String): Unit = js.native
  def emitWarning(warning: js.Error, name: String, ctor: js.Function): Unit = js.native
  
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
  def emit_newListener(event: newListener, eventName: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("emit")
  def emit_newListener(event: newListener, eventName: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("emit")
  def emit_rejectionHandled(event: rejectionHandled, promise: js.Promise[_]): Boolean = js.native
  @JSName("emit")
  def emit_removeListener(event: removeListener, eventName: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("emit")
  def emit_uncaughtException(event: uncaughtException, error: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, error: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_unhandledRejection(event: unhandledRejection, reason: js.Any, promise: js.Promise[_]): Boolean = js.native
  @JSName("emit")
  def emit_warning(event: warning, warning: js.Error): Boolean = js.native
  
  var env: ProcessEnv = js.native
  
  var execArgv: js.Array[String] = js.native
  
  var execPath: String = js.native
  
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
  def kill(pid: Double, signal: String): `true` = js.native
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
  
  def setegid(id: String): Unit = js.native
  def setegid(id: Double): Unit = js.native
  
  def seteuid(id: String): Unit = js.native
  def seteuid(id: Double): Unit = js.native
  
  def setgid(id: String): Unit = js.native
  def setgid(id: Double): Unit = js.native
  
  def setgroups(groups: js.Array[String | Double]): Unit = js.native
  
  def setuid(id: String): Unit = js.native
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
  
  var title: String = js.native
  
  /**
    * Can only be set if not in worker thread.
    */
  def umask(mask: Double): Double = js.native
  
  def uptime(): Double = js.native
  
  var version: String = js.native
  
  var versions: ProcessVersions = js.native
}
