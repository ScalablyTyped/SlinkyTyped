package typingsSlinky.prex.cancellationMod

import typingsSlinky.esfxCancelable.distMod.Cancelable
import typingsSlinky.esfxCancelable.distMod.CancelableSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prex/out/lib/cancellation", "CancellationTokenSource")
@js.native
/**
  * Initializes a new instance of a CancellationTokenSource.
  *
  * @param linkedTokens An optional iterable of tokens to which to link this source.
  */
class CancellationTokenSource () extends CancelableSource {
  def this(linkedTokens: js.Iterable[CancellationToken | Cancelable]) = this()
  
  /**
    * Executes the provided callback.
    *
    * @param callback The callback to execute.
    */
  var _executeCallback: js.Any = js.native
  
  var _linkingRegistrations: js.Any = js.native
  
  var _registrations: js.Any = js.native
  
  var _state: js.Any = js.native
  
  var _token: js.Any = js.native
  
  /**
    * Unlinks the source from any linked tokens.
    */
  var _unlink: js.Any = js.native
  
  /**
    * Cancels the source, evaluating any registered callbacks. If any callback raises an exception,
    * the exception is propagated to a host specific unhanedle exception mechanism.
    */
  def cancel(): Unit = js.native
  
  /**
    * Closes the source, preventing the possibility of future cancellation.
    */
  def close(): Unit = js.native
  
  /**
    * Gets a CancellationToken linked to this source.
    */
  def token: CancellationToken = js.native
}
