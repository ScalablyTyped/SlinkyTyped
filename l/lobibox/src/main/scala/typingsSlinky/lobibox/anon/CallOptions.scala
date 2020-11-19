package typingsSlinky.lobibox.anon

import typingsSlinky.lobibox.LobiboxModule.ConfirmOptions
import typingsSlinky.lobibox.LobiboxModule.MessageBoxesDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallOptions extends js.Object {
  
  def apply[T /* <: MessageBoxesDefault */](): T = js.native
  def apply[T /* <: MessageBoxesDefault */](options: ConfirmOptions): T = js.native
  
  var DEFAULTS: ConfirmOptions = js.native
}
