package typingsSlinky.azdata.mod.window

import typingsSlinky.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button extends js.Object {
  
  /**
    * Whether the button is enabled
    */
  var enabled: Boolean = js.native
  
  /**
    * Whether the button is focused
    */
  var focused: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the button is hidden
    */
  var hidden: Boolean = js.native
  
  /**
    * The label displayed on the button
    */
  var label: String = js.native
  
  /**
    * Raised when the button is clicked
    */
  def onClick(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
  def onClick(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onClick(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
  def onClick(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Position of the button on the dialog footer
    */
  var position: js.UndefOr[DialogButtonPosition] = js.native
}
