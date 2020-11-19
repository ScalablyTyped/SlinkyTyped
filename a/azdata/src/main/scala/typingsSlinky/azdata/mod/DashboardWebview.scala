package typingsSlinky.azdata.mod

import typingsSlinky.azdata.mod.connection.Connection
import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardWebview extends js.Object {
  
  /**
    * The connection info for the dashboard the webview exists on
    */
  val connection: Connection = js.native
  
  /**
    * Contents of the dialog body.
    */
  var html: String = js.native
  
  /**
    * Raised when the webview closed.
    */
  def onClosed(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onClosed(
    listener: js.Function1[/* e */ js.Any, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onClosed(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onClosed(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Raised when the webview posts a message.
    */
  def onMessage(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onMessage(
    listener: js.Function1[/* e */ js.Any, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Post a message to the webview.
    *
    * @param message Body of the message.
    */
  def postMessage(message: js.Any): Thenable[_] = js.native
  
  /**
    * The info on the server for the webview dashboard
    */
  val serverInfo: ServerInfo = js.native
}
