package typingsSlinky.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancellationToken extends js.Object {
  
  val isCancellationRequested: Boolean = js.native
  
  /**
    * An event emitted when cancellation is requested
    * @event
    */
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _]): IDisposable = js.native
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _], thisArg: js.Any): IDisposable = js.native
}
