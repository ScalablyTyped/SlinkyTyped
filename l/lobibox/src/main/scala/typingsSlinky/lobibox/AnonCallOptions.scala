package typingsSlinky.lobibox

import typingsSlinky.lobibox.LobiboxModule.ConfirmOptions
import typingsSlinky.lobibox.LobiboxModule.MessageBoxesDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallOptions extends js.Object {
  var DEFAULTS: ConfirmOptions = js.native
  def apply[T /* <: MessageBoxesDefault */](): T = js.native
  def apply[T /* <: MessageBoxesDefault */](options: ConfirmOptions): T = js.native
}

