package typingsSlinky.electron.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof imported_events.EventEmitter` */
@JSImport("electron", "NodeEventEmitter")
@js.native
class NodeEventEmitter () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
}
/* was `typeof imported_events.EventEmitter` */
object NodeEventEmitter {
  
  @JSImport("electron", "NodeEventEmitter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("electron", "NodeEventEmitter.defaultMaxListeners")
  @js.native
  def defaultMaxListeners: Double = js.native
  @scala.inline
  def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
  
  /**
    * This symbol shall be used to install a listener for only monitoring `'error'`
    * events. Listeners installed using this symbol are called before the regular
    * `'error'` listeners are called.
    *
    * Installing a listener using this symbol does not change the behavior once an
    * `'error'` event is emitted, therefore the process will still crash if no
    * regular `'error'` listener is installed.
    */
  /* static member */
  @JSImport("electron", "NodeEventEmitter.errorMonitor")
  @js.native
  val errorMonitor: js.Symbol = js.native
  
  /** @deprecated since v4.0.0 */
  /* static member */
  @JSImport("electron", "NodeEventEmitter.listenerCount")
  @js.native
  def listenerCount(emitter: EventEmitter, event: String): Double = js.native
  @JSImport("electron", "NodeEventEmitter.listenerCount")
  @js.native
  def listenerCount(emitter: EventEmitter, event: js.Symbol): Double = js.native
}
