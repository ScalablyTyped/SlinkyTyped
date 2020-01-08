package typingsSlinky.offscreencanvas

import org.scalajs.dom.raw.IDBFactory
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.std.EventTarget
import typingsSlinky.std.GlobalEventHandlers
import typingsSlinky.std.IDBEnvironment
import typingsSlinky.std.Transferable
import typingsSlinky.std.WindowBase64
import typingsSlinky.std.WindowConsole
import typingsSlinky.std.WindowEventHandlers
import typingsSlinky.std.WindowLocalStorage
import typingsSlinky.std.WindowOrWorkerGlobalScope
import typingsSlinky.std.WindowSessionStorage
import typingsSlinky.std.WindowTimers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window
  extends EventTarget
     with WindowTimers
     with WindowSessionStorage
     with WindowLocalStorage
     with WindowConsole
     with GlobalEventHandlers
     with IDBEnvironment
     with WindowBase64
     with WindowOrWorkerGlobalScope
     with WindowEventHandlers {
  /* InferMemberOverrides */
  override val indexedDB: IDBFactory = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def atob(data: String): String = js.native
  /* InferMemberOverrides */
  override def btoa(data: String): String = js.native
  def postMessage(message: js.Any, targetOrigin: String): Unit = js.native
  def postMessage(message: js.Any, targetOrigin: String, transfer: js.Array[Transferable | OffscreenCanvas]): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
}

