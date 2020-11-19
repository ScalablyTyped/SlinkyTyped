package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.WeakRefCallback
import typingsSlinky.fridaGum.WeakRefId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Monitors the lifetime of a heap-allocated JavaScript value.
  *
  * Useful when you're building a language-binding where you need to free
  * native resources when a JS value is no longer needed.
  */
@JSGlobal("WeakRef")
@js.native
object WeakRef extends js.Object {
  
  /**
    * Starts monitoring the lifetime of `target`. Calls `callback` as soon as
    * value has been garbage-collected, or the script is about to get
    * unloaded.
    *
    * Be careful so `callback` is not a closure that accidentally captures
    * `target` and keeps it alive beyond its intended lifetime.
    *
    * @param target Heap-allocated JavaScript value to monitor lifetime of.
    * @param callback Function to call when `target` gets GCed.
    */
  def bind(target: js.Any, callback: WeakRefCallback): WeakRefId = js.native
  
  /**
    * Stops monitoring the value passed to `WeakRef.bind()` and calls the
    * callback immediately.
    *
    * @param id ID returned by a previous call to `WeakRef.bind()`.
    */
  def unbind(id: WeakRefId): Unit = js.native
}
