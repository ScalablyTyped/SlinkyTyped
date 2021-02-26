package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.Architecture
import typingsSlinky.fridaGum.CodeSigningPolicy
import typingsSlinky.fridaGum.EnumerateRangesSpecifier
import typingsSlinky.fridaGum.ExceptionHandlerCallback
import typingsSlinky.fridaGum.NativePointerValue
import typingsSlinky.fridaGum.PageProtection
import typingsSlinky.fridaGum.Platform
import typingsSlinky.fridaGum.RangeDetails
import typingsSlinky.fridaGum.ThreadDetails
import typingsSlinky.fridaGum.ThreadId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Process {
  
  /**
    * Architecture of the current process.
    */
  @JSGlobal("Process.arch")
  @js.native
  val arch: Architecture = js.native
  
  /**
    * Whether Frida will avoid modifying existing code in memory and will not try to run unsigned code.
    * Currently this property will always be set to Optional unless you are using Gadget and have configured
    * it to assume that code-signing is required. This property allows you to determine whether the Interceptor
    * API is off limits, and whether it is safe to modify code or run unsigned code.
    */
  @JSGlobal("Process.codeSigningPolicy")
  @js.native
  val codeSigningPolicy: CodeSigningPolicy = js.native
  
  /**
    * Just like `enumerateRanges()`, but for individual memory allocations known to the system heap.
    */
  @JSGlobal("Process.enumerateMallocRanges")
  @js.native
  def enumerateMallocRanges(): js.Array[RangeDetails] = js.native
  
  /**
    * Enumerates modules loaded right now.
    */
  @JSGlobal("Process.enumerateModules")
  @js.native
  def enumerateModules(): js.Array[typingsSlinky.fridaGum.Module] = js.native
  
  @JSGlobal("Process.enumerateRanges")
  @js.native
  def enumerateRanges(specifier: EnumerateRangesSpecifier): js.Array[RangeDetails] = js.native
  /**
    * Enumerates memory ranges satisfying `specifier`.
    *
    * @param specifier The kind of ranges to include.
    */
  @JSGlobal("Process.enumerateRanges")
  @js.native
  def enumerateRanges(specifier: PageProtection): js.Array[RangeDetails] = js.native
  
  /**
    * Enumerates all threads.
    */
  @JSGlobal("Process.enumerateThreads")
  @js.native
  def enumerateThreads(): js.Array[ThreadDetails] = js.native
  
  /**
    * Looks up a module by address. Returns null if not found.
    */
  @JSGlobal("Process.findModuleByAddress")
  @js.native
  def findModuleByAddress(address: NativePointerValue): typingsSlinky.fridaGum.Module | Null = js.native
  
  /**
    * Looks up a module by name. Returns null if not found.
    */
  @JSGlobal("Process.findModuleByName")
  @js.native
  def findModuleByName(name: String): typingsSlinky.fridaGum.Module | Null = js.native
  
  /**
    * Looks up a memory range by address. Returns null if not found.
    */
  @JSGlobal("Process.findRangeByAddress")
  @js.native
  def findRangeByAddress(address: NativePointerValue): RangeDetails | Null = js.native
  
  /**
    * Gets this thread’s OS-specific id.
    */
  @JSGlobal("Process.getCurrentThreadId")
  @js.native
  def getCurrentThreadId(): ThreadId = js.native
  
  /**
    * Looks up a module by address. Throws an exception if not found.
    */
  @JSGlobal("Process.getModuleByAddress")
  @js.native
  def getModuleByAddress(address: NativePointerValue): typingsSlinky.fridaGum.Module = js.native
  
  /**
    * Looks up a module by name. Throws an exception if not found.
    */
  @JSGlobal("Process.getModuleByName")
  @js.native
  def getModuleByName(name: String): typingsSlinky.fridaGum.Module = js.native
  
  /**
    * Looks up a memory range by address. Throws an exception if not found.
    */
  @JSGlobal("Process.getRangeByAddress")
  @js.native
  def getRangeByAddress(address: NativePointerValue): RangeDetails = js.native
  
  /**
    * PID of the current process.
    */
  @JSGlobal("Process.id")
  @js.native
  val id: Double = js.native
  
  /**
    * Determines whether a debugger is currently attached.
    */
  @JSGlobal("Process.isDebuggerAttached")
  @js.native
  def isDebuggerAttached(): Boolean = js.native
  
  /**
    * Size of a virtual memory page in bytes. This is used to make your scripts more portable.
    */
  @JSGlobal("Process.pageSize")
  @js.native
  val pageSize: Double = js.native
  
  /**
    * Platform of the current process.
    */
  @JSGlobal("Process.platform")
  @js.native
  val platform: Platform = js.native
  
  /**
    * Size of a pointer in bytes. This is used to make your scripts more portable.
    */
  @JSGlobal("Process.pointerSize")
  @js.native
  val pointerSize: Double = js.native
  
  /**
    * Installs a process-wide exception handler callback that gets a chance to
    * handle native exceptions before the hosting process itself does.
    *
    * It is up to your callback to decide what to do with the exception.
    * It could for example:
    * - Log the issue.
    * - Notify your application through a `send()` followed by a blocking `recv()` for acknowledgement of the sent data
    *   being received.
    * - Modify registers and memory to recover from the exception.
    *
    * You should return `true` if you did handle the exception, in which case
    * Frida will resume the thread immediately. If you do not return `true`,
    * Frida will forward the exception to the hosting process' exception
    * handler, if it has one, or let the OS terminate the process.
    */
  @JSGlobal("Process.setExceptionHandler")
  @js.native
  def setExceptionHandler(callback: ExceptionHandlerCallback): Unit = js.native
}
