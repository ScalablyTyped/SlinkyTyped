package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixAppserviceBridge.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unstable {
  
  /**
    * An unexpected internal error occured while the bridge handled the event.
    */
  @JSImport("matrix-appservice-bridge", "unstable.BridgeInternalError")
  @js.native
  class BridgeInternalError ()
    extends typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.BridgeInternalError {
    def this(message: String) = this()
  }
  
  /**
    * Base Error for when the bride can not handle the event.
    */
  @JSImport("matrix-appservice-bridge", "unstable.EventNotHandledError")
  @js.native
  class EventNotHandledError ()
    extends typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError {
    def this(message: String) = this()
  }
  
  /**
    * The bridge decides that the event is too old to be sent.
    */
  @JSImport("matrix-appservice-bridge", "unstable.EventTooOldError")
  @js.native
  class EventTooOldError ()
    extends typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventTooOldError {
    def this(message: String) = this()
  }
  
  /**
    * The event is not understood by the bridge.
    */
  @JSImport("matrix-appservice-bridge", "unstable.EventUnknownError")
  @js.native
  class EventUnknownError ()
    extends typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventUnknownError {
    def this(message: String) = this()
  }
  
  /**
    * The foreign network errored and the event couldn't be delivered.
    */
  @JSImport("matrix-appservice-bridge", "unstable.ForeignNetworkError")
  @js.native
  class ForeignNetworkError ()
    extends typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.ForeignNetworkError {
    def this(message: String) = this()
  }
  
  @JSImport("matrix-appservice-bridge", "unstable.wrap")
  @js.native
  def wrap[T /* <: typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError */](oldError: String, newErrorType: Instantiable[T]): typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError = js.native
  @JSImport("matrix-appservice-bridge", "unstable.wrap")
  @js.native
  def wrap[T /* <: typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError */](oldError: String, newErrorType: Instantiable[T], message: String): typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError = js.native
  /**
    * @deprecated Use {@link wrapError}
    */
  @JSImport("matrix-appservice-bridge", "unstable.wrap")
  @js.native
  def wrap[T /* <: typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T]): typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError = js.native
  @JSImport("matrix-appservice-bridge", "unstable.wrap")
  @js.native
  def wrap[T /* <: typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T], message: String): typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError = js.native
  
  @JSImport("matrix-appservice-bridge", "unstable.wrapError")
  @js.native
  def wrapError[T /* <: typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError */](oldError: String, newErrorType: Instantiable[T]): typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError = js.native
  @JSImport("matrix-appservice-bridge", "unstable.wrapError")
  @js.native
  def wrapError[T /* <: typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError */](oldError: String, newErrorType: Instantiable[T], message: String): typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError = js.native
  /**
    * Append the old error message to the new one and keep its stack trace.
    * Example:
    *     throw wrapError(e, HighLevelError, "This error is more specific");
    */
  @JSImport("matrix-appservice-bridge", "unstable.wrapError")
  @js.native
  def wrapError[T /* <: typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T]): typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError = js.native
  @JSImport("matrix-appservice-bridge", "unstable.wrapError")
  @js.native
  def wrapError[T /* <: typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T], message: String): typingsSlinky.matrixAppserviceBridge.errorsMod.unstable.EventNotHandledError = js.native
}
