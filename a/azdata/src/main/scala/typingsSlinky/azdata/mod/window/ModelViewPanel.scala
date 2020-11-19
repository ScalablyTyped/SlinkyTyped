package typingsSlinky.azdata.mod.window

import typingsSlinky.azdata.mod.ModelView
import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelViewPanel extends js.Object {
  
  /**
    * Returns the model view content if registered. Returns undefined if model review is not registered
    */
  val modelView: ModelView = js.native
  
  /**
    * Fired whenever the panel's valid property changes
    */
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, _]): Disposable = js.native
  def onValidityChanged(
    listener: js.Function1[/* e */ Boolean, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, _], thisArgs: js.Any): Disposable = js.native
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Register model view content for the dialog.
    * Doesn't do anything if model view is already registered
    */
  def registerContent(handler: js.Function1[/* view */ ModelView, Thenable[Unit]]): Unit = js.native
  
  /**
    * Whether the panel's content is valid
    */
  val valid: Boolean = js.native
}
